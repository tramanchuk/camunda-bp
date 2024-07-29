package com.example.workflow;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Arrays;
import java.util.List;

public class SplitForConsignmentService  implements JavaDelegate {

    private static final Logger LOG = LoggerFactory.getLogger(Task1Service.class);
    @Override
    public void execute(DelegateExecution delegateExecution) throws Exception {
        LOG.info("!!!!!!!!!!!!!!!!!!!!SplitForConsignmentService executed!!!!!!!!!!!x");
        List<String> list = Arrays.asList("qwe1", "qwe2", "qwe3", "qwe4");
        delegateExecution.setVariable("consignmentEntities", list);
    }
}