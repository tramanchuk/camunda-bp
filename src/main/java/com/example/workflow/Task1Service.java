package com.example.workflow;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Task1Service implements JavaDelegate {

    private static final Logger LOG = LoggerFactory.getLogger(Task1Service.class);
    @Override
    public void execute(DelegateExecution delegateExecution) throws Exception {
        LOG.info("!!!!!!!!!!!!!!!!!!!!Task1Service executed!!!!!!!!!!!x");
    }
}
