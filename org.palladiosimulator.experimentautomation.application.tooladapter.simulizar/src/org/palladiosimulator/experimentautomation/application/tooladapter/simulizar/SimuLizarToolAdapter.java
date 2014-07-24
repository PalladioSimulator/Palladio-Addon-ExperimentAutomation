package org.palladiosimulator.experimentautomation.application.tooladapter.simulizar;

import java.util.List;

import org.palladiosimulator.experimentautomation.application.jobs.CleanUpRecorderJob;
import org.palladiosimulator.experimentautomation.application.jobs.LogExperimentInformationJob;
import org.palladiosimulator.experimentautomation.application.tooladapter.IToolAdapter;
import org.palladiosimulator.experimentautomation.application.tooladapter.simulizar.model.SimuLizarConfiguration;
import org.palladiosimulator.experimentautomation.application.tooladapter.simulizar.model.SimulizartooladapterPackage;
import org.palladiosimulator.experimentautomation.experiments.Experiment;
import org.palladiosimulator.experimentautomation.experiments.ReconfigurationRulesFolder;
import org.palladiosimulator.experimentautomation.experiments.ToolConfiguration;
import org.palladiosimulator.experimentautomation.experiments.Variation;
import org.palladiosimulator.simulizar.launcher.jobs.PCMStartInterpretationJob;
import org.palladiosimulator.simulizar.runconfig.SimuLizarWorkflowConfiguration;

import de.uka.ipd.sdq.simucomframework.SimuComConfig;
import de.uka.ipd.sdq.workflow.jobs.SequentialBlackboardInteractingJob;
import de.uka.ipd.sdq.workflow.mdsd.blackboard.MDSDBlackboard;

/**
 * @author Sebastian Lehrig
 */
public class SimuLizarToolAdapter implements IToolAdapter {

    @Override
    public SequentialBlackboardInteractingJob<MDSDBlackboard> createRunAnalysisJob(final Experiment experiment,
            final ToolConfiguration toolConfig, final List<Variation> variations, final List<Long> factorLevels,
            final int repetition) {
        final SimuLizarConfiguration simuLizarConfiguration = (SimuLizarConfiguration) toolConfig;

        // create simulation configuration
        final SimuComConfig simucomConfig = SimuComConfigFactory.createConfig(experiment, simuLizarConfiguration,
                factorLevels, repetition);

        // create workflow configuration
        final SimuLizarWorkflowConfiguration workflowConfig = SimuLizarWorkflowConfigurationFactory
                .createWorkflowConfiguration(simuLizarConfiguration, simucomConfig);

//        final PMSModel pmsModel = experiment.getInitialModel().getPlatformMonitoringSpecification();
//        if(pmsModel == null) {
//            workflowConfig.setPmsFile("");
//        } else {
//            workflowConfig.setPmsFile(pmsModel.eResource().getURI().toString());
//        }
        
        final ReconfigurationRulesFolder reconfigurationRulesFolder = experiment.getInitialModel().getReconfigurationRules();
        if(reconfigurationRulesFolder == null) {
            workflowConfig.setReconfigurationRulesFolder("");
        } else {
            workflowConfig.setReconfigurationRulesFolder(reconfigurationRulesFolder.getFolderUri());
        }
        
        SequentialBlackboardInteractingJob<MDSDBlackboard> result = new SequentialBlackboardInteractingJob<MDSDBlackboard>();
        result.addJob(new LogExperimentInformationJob(experiment, simucomConfig, variations, factorLevels,
                repetition));            
        result.addJob(new PCMStartInterpretationJob(workflowConfig));
        result.addJob(new CleanUpRecorderJob(simuLizarConfiguration.getPersistenceFramework()));

        return result;
    }

    @Override
    public boolean hasSupportFor(ToolConfiguration configuration) {
        return SimulizartooladapterPackage.eINSTANCE.getSimuLizarConfiguration().isInstance(configuration);
    }
}
