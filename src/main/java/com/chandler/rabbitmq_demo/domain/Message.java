package com.chandler.rabbitmq_demo.domain;

import lombok.Data;
import org.joda.money.Money;

import java.time.LocalDate;

@Data
public class Message {
    private final LocalDate timestamp;
    private final String value;
    private final Money amount;
}
