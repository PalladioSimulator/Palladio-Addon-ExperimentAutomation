package de.uka.ipd.sdq.experimentautomation.application.tooladapter.eventsim;

import java.util.HashMap;
import java.util.Map;

import de.uka.ipd.sdq.experimentautomation.application.tooladapter.abstractsimulation.AbstractSimulationWorkflowConfigurationFactory;
import de.uka.ipd.sdq.experimentautomation.experiments.PCMModelFiles;
import de.uka.ipd.sdq.experimentautomation.experiments.eventsim.EventSimConfiguration;
import de.uka.ipd.sdq.simulation.AbstractSimulationConfig;
import edu.kit.ipd.sdq.eventsim.EventSimConfig;
import edu.kit.ipd.sdq.eventsim.controller.runconfig.EventSimWorkflowConfiguration;

public class EventSimWorkflowConfigurationFactory {

    public static EventSimWorkflowConfiguration createWorkflowConfiguration(final EventSimConfiguration configuration,
            final PCMModelFiles pcm, final AbstractSimulationConfig simConfig) {
        final Map<String, Object> attributesMap = new HashMap<String, Object>();
        final EventSimWorkflowConfiguration workflowConfig = new EventSimWorkflowConfiguration(attributesMap);
        workflowConfig.setSimulationConfiguration((EventSimConfig) simConfig);

        AbstractSimulationWorkflowConfigurationFactory.fillWorkflowConfiguration(workflowConfig, configuration, pcm,
                simConfig);

        return workflowConfig;
    }

}
