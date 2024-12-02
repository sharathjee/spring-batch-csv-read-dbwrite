package com.discover.mapper;

import com.discover.model.Customer;
import com.discover.model.CustomerDto;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface CustomerMapper {

    CustomerMapper INSTANCE = Mappers.getMapper(CustomerMapper.class);

    @Mapping(source="age", target="intAge")
    @Mapping(source="registered", target="dateRegistered")
    @Mapping(source="orders", target="intOrders")
    @Mapping(source="spent", target="floatSpent")
    @Mapping(source="is_married", target="married")
    CustomerDto CustomerToCusterDto(Customer customer);

    @InheritInverseConfiguration
    Customer CustomerDtoToCustomer(CustomerDto customerDto);
}
