/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.claro.compensaciones.listener;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.core.BatchStatus;
import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.JobExecutionListener;
import org.springframework.stereotype.Component;

/**
 *
 * @author Administrador
 */
@Component
public class JobListener implements JobExecutionListener {

    private static final Logger LOG = LoggerFactory.getLogger(JobListener.class);

    public JobListener() {
        super();

    }

    @Override
    public void beforeJob(JobExecution je) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void afterJob(JobExecution je) {
        if (je.getStatus() == BatchStatus.COMPLETED) {
            LOG.info("FINALIZO EL JOB!!");
        }

    }

}
