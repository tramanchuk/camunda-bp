package com.example.workflow.listerens;

import com.example.workflow.model.ConsignmentEntry;
import org.camunda.bpm.engine.delegate.DelegateTask;
import org.camunda.bpm.engine.delegate.TaskListener;
import org.camunda.bpm.engine.task.IdentityLink;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Set;

public class UserAssignmentVerificationListener implements TaskListener {
    Logger LOG = LoggerFactory.getLogger(UserAssignmentVerificationListener.class);
    @Override
    public void notify(DelegateTask delegateTask) {
        LOG.info("----------------UserAssignmentVerificationListener-------------------");
        String assignee = delegateTask.getAssignee();
        LOG.info("Assignee = " + assignee);
        Set<IdentityLink> candidates = delegateTask.getCandidates();
        LOG.info("candidates:");
        candidates.forEach(candidate -> LOG.info(candidate.getGroupId()));
    }
}
