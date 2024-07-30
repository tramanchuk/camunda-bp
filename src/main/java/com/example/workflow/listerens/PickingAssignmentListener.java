package com.example.workflow.listerens;

import com.example.workflow.model.ConsignmentEntry;
import org.camunda.bpm.engine.delegate.DelegateTask;
import org.camunda.bpm.engine.delegate.TaskListener;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PickingAssignmentListener implements TaskListener {
    Logger LOG = LoggerFactory.getLogger(PickingAssignmentListener.class);
    @Override
    public void notify(DelegateTask delegateTask) {
        LOG.info("----------------PickingAssignmentListener-------------------");
        ConsignmentEntry entry = (ConsignmentEntry) delegateTask.getVariable("consignmentEntity");
        switch (entry.getDepartment()){
            case "forzen_dep":
                delegateTask.addCandidateGroup("forzenDepGroup");
                break;
            case "fresh_dep":
                delegateTask.addCandidateGroup("freshDepGroup");
                break;
        }
    }
}
