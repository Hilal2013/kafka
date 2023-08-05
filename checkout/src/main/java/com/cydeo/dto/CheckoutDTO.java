package com.cydeo.dto;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class CheckoutDTO {
    private String cardNumber;
    private BigDecimal amount;
    private String item;
}