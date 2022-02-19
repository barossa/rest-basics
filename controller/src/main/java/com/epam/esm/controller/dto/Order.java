package com.epam.esm.controller.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.hateoas.RepresentationModel;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Order extends RepresentationModel<Order> {
    private int id;
    private LocalDateTime orderDate;
    private BigDecimal cost;
}