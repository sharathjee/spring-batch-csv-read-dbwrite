package com.discover.config;

import com.discover.mapper.CustomerMapper;
import com.discover.model.Customer;
import com.discover.model.CustomerDto;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.item.ItemProcessor;
import java.time.LocalDate;

public class CustomerItemProcessor implements ItemProcessor<Customer, CustomerDto> {
    private static final Logger LOGGER = LoggerFactory.getLogger(CustomerItemProcessor.class);

    @Override
    public CustomerDto process(final Customer customer) throws Exception {

        CustomerDto transformedCustomer = CustomerMapper.INSTANCE.CustomerToCusterDto(customer);
        LOGGER.info("Converting ( {} ) into ( {} )", customer, transformedCustomer);
        return transformedCustomer;
    }
}