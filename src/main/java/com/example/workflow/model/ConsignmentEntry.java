package com.example.workflow.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
@AllArgsConstructor
public class ConsignmentEntry implements Serializable {

    private String department;
    private List<OrderEntry> orderEntries;
}
