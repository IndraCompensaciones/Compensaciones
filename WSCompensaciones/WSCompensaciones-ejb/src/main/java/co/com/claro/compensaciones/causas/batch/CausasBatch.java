/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.claro.compensaciones.causas.batch;

import co.com.claro.compensaciones.entity.CompCausas;
import co.com.claro.compensaciones.listener.JobListener;
import co.com.claro.compensaciones.procesador.CausasItemProcesador;
import co.com.claro.compensaciones.procesador.CausasItemProcesadorValidador;
import co.com.claro.compensaciones.dto.CompCausasCargueDto;
import javax.sql.DataSource;
import org.springframework.batch.core.BatchStatus;
import org.springframework.batch.core.Job;
import org.springframework.batch.core.Step;
import org.springframework.context.annotation.Configuration;
import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.batch.core.configuration.annotation.JobBuilderFactory;
import org.springframework.batch.core.configuration.annotation.StepBuilderFactory;
import org.springframework.batch.core.launch.support.RunIdIncrementer;
import org.springframework.batch.item.database.BeanPropertyItemSqlParameterSourceProvider;
import org.springframework.batch.item.database.JdbcBatchItemWriter;

import org.springframework.batch.item.database.builder.JdbcBatchItemWriterBuilder;
import org.springframework.batch.item.file.FlatFileItemReader;
import org.springframework.batch.item.file.builder.FlatFileItemReaderBuilder;
import org.springframework.batch.item.file.mapping.BeanWrapperFieldSetMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.core.io.FileSystemResource;

/**
 *
 * @author Administrador
 */
@Configuration
@EnableBatchProcessing
public class CausasBatch {

    @Autowired
    public JobBuilderFactory jobBuilderFactory;
    @Autowired
    public StepBuilderFactory stepBuilderFactory;

    /**
     *
     * @param file
     * @return
     */
    @Bean
    public FlatFileItemReader<CompCausasCargueDto> reader(@Value("#{jobParameters[File]}") String file) {
        return new FlatFileItemReaderBuilder<CompCausasCargueDto>()
                .name("CausasItemProcesador")
                .resource(new FileSystemResource(file))
                .delimited()
                .names(new String[]{"codigoAnomalia", "DescripcionAnomalia", "codigoProblema",
            "descripcionProblema", "codigoCausa", "DescripcionCausa", "origen",
            "estado", "tipo", "internet", "tv", "telefonia"})
                .fieldSetMapper(new BeanWrapperFieldSetMapper<CompCausasCargueDto>() {
                    {
                        setTargetType(CompCausasCargueDto.class);
                    }
                })
                .build();

    }

    @Bean
    public CausasItemProcesador procesador() {
        return new CausasItemProcesador();
    }

    @Bean
    public CausasItemProcesadorValidador validador() {
        return new CausasItemProcesadorValidador();
    }

//    @Bean
//    public JpaItemWriter writer
    @Bean
    public JdbcBatchItemWriter<CompCausas> write(DataSource dataSource) {
        return new JdbcBatchItemWriterBuilder<CompCausas>()
                .itemSqlParameterSourceProvider(new BeanPropertyItemSqlParameterSourceProvider<CompCausas>())
                .sql("INSERT INTO COMP_ESTADO (ID_ESTADOS, DESCRIPCION, PROCESO, FECHA_CREACION) VALUES (:idEstados, :descripcion, :proceso, :fechaCreacion,)")
                .dataSource(dataSource).build();
    }

    @Bean
    public Job importCompCausaJob(JobListener listener, Step step1, Step stepValidador) {
        return jobBuilderFactory.get("importCompEstadoJob")
                .incrementer(new RunIdIncrementer())
                .listener(listener)
                .start(stepValidador)
                .next(step1).on(BatchStatus.FAILED.name()).fail()
                .end()
                .build();
    }

    @Bean
    public Step step1(JdbcBatchItemWriter<CompCausas> write) {
        return stepBuilderFactory.get("step1")
                .<CompCausasCargueDto, CompCausas>chunk(10)
                .reader(reader(null))
                .processor(procesador())
                .writer(write)
                .build();
    }

    @Bean
    public Step stepValidador() {
        return stepBuilderFactory.get("stepValidador")
                .<CompCausasCargueDto, CompCausas>chunk(10)
                .reader(reader(null))
                .processor(validador())
                .build();
    }

}
