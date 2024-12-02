package com.discover.config;

import com.discover.model.Customer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.core.BatchStatus;
import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.JobExecutionListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;

@Component
public class JobCompletionNotificationListener implements JobExecutionListener {

    private JdbcTemplate jdbcTemplate;
    @Autowired
    public JobCompletionNotificationListener(DataSource dataSource){
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }

    Logger LOGGER = LoggerFactory.getLogger(JobCompletionNotificationListener.class);

    @Override
    public void afterJob(JobExecution jobExecution) {

        if (jobExecution.getStatus() == BatchStatus.COMPLETED) {
            LOGGER.info("!!! JOB FINISHED! Time to verify the results");

            String query = "SELECT first_name, last_name, email FROM customer";
            jdbcTemplate.query(query, (rs, row) -> new Customer(rs.getString(1), rs.getString(2), rs.getString(3)))
                    .forEach(customer -> LOGGER.info("Found < {} > in the database.", customer));
        }
    }
}
