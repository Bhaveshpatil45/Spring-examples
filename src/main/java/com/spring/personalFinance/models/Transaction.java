package com.spring.personalFinance.models;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class Transaction {

    private Long id;
    private Date date;
    private double amount;
    private String description;
    private User user;
}

