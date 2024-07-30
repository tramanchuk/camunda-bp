package com.example.workflow.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serializable;

@Data
@AllArgsConstructor
public class OrderEntry implements Serializable {
    private String productCode;
    private Integer amount;
    private Double pricePerItem;
}
