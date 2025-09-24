package com.example.customer.model;

import lombok.*;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.validation.annotation.Validated;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Document
@Validated
public class Address {

    private String street;
    private String houseNumber;
    private String zipCode;
}
