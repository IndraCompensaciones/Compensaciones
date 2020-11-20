/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.claro.compensaciones.causas.batch;

import java.util.logging.Level;
import java.util.logging.Logger;
import org.springframework.batch.core.BatchStatus;
import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.JobParametersBuilder;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

/**
 *
 * @author Administrador
 */
@SpringBootApplication
public class DemoSpringBatchApplication {

    public static void main(String[] args) {
        try {
            SpringApplication.run(DemoSpringBatchApplication.class, args);
           // run(args, "djkdjasdfjashdf");
        } catch (Exception ex) {
            Logger.getLogger(DemoSpringBatchApplication.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static BatchStatus run(String[] args, String file) throws Exception {
        SpringApplication app = new SpringApplication(DemoSpringBatchApplication.class);
        ConfigurableApplicationContext ctx = app.run(args);
        JobLauncher jobLauncher = ctx.getBean(JobLauncher.class);
        Job job = ctx.getBean("importCompCausaJob", Job.class);

        JobParametersBuilder paramsBuilder = new JobParametersBuilder();
        paramsBuilder.addString("File", file);

        JobExecution jobExecution = jobLauncher.run(job, paramsBuilder.toJobParameters());
        BatchStatus batchStatus = jobExecution.getStatus();
        return batchStatus;
    }
}
