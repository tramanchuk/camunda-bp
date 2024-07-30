package com.example.workflow;

import com.example.workflow.model.ConsignmentEntry;
import com.example.workflow.model.OrderEntry;
import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SplitForConsignmentService  implements JavaDelegate {

    private static final Logger LOG = LoggerFactory.getLogger(Task1Service.class);
    @Override
    public void execute(DelegateExecution delegateExecution) throws Exception {
        LOG.info("!!!!!!!!!!!!!!!!!!!!SplitForConsignmentService executed!!!!!!!!!!!x");
        List<ConsignmentEntry> list = new ArrayList<>();
        list.add(new ConsignmentEntry("forzen_dep", Arrays.asList(
                new OrderEntry("product1", 2, 100d),
                new OrderEntry("product2", 1, 50d)
        )));
        list.add(new ConsignmentEntry("fresh_dep", List.of(
                new OrderEntry("product3", 10, 5d)
        )));
        delegateExecution.setVariable("consignmentEntities", list);
    }
}