package de.uka.ipd.sdq.experimentautomation.application.tooladapter.simucom;

import java.util.List;

import org.eclipse.core.runtime.CoreException;
import org.palladiosimulator.simucom.simucomtooladapter.SimuComConfiguration;
import org.palladiosimulator.simucom.simucomtooladapter.SimucomtooladapterPackage;

import de.uka.ipd.sdq.codegen.simucontroller.runconfig.SimuComWorkflowConfiguration;
import de.uka.ipd.sdq.codegen.simucontroller.workflow.jobs.SimuComJob;
import de.uka.ipd.sdq.experimentautomation.abstractsimulation.AbstractsimulationPackage;
import de.uka.ipd.sdq.experimentautomation.abstractsimulation.PersistenceFramework;
import de.uka.ipd.sdq.experimentautomation.abstractsimulation.SensorFramework;
import de.uka.ipd.sdq.experimentautomation.abstractsimulation.SensorFrameworkDatasource;
import de.uka.ipd.sdq.experimentautomation.abstractsimulation.StopCondition;
import de.uka.ipd.sdq.experimentautomation.application.tooladapter.IToolAdapter;
import de.uka.ipd.sdq.experimentautomation.application.tooladapter.abstractsimulation.sensorframework.SensorFrameworkFactory;
import de.uka.ipd.sdq.experimentautomation.experiments.InitialModel;
import de.uka.ipd.sdq.experimentautomation.experiments.ToolConfiguration;
import de.uka.ipd.sdq.simucomframework.SimuComConfig;
import de.uka.ipd.sdq.workflow.BlackboardBasedWorkflow;
import de.uka.ipd.sdq.workflow.jobs.SequentialBlackboardInteractingJob;
import de.uka.ipd.sdq.workflow.mdsd.blackboard.MDSDBlackboard;
import de.uka.ipd.sdq.workflow.pcm.jobs.LoadPCMModelsJob;
import de.uka.ipd.sdq.workflow.pcm.jobs.PreparePCMBlackboardPartionJob;

/**
 * TODO Extract this class (and potentially also calling classes) into separate workflow jobs.
 * 
 * @author Sebastian Lehrig
 */
public class SimuComToolAdapter implements IToolAdapter {

    @Override
    public void runExperiment(final String experimentName, final InitialModel initialModel,
            final ToolConfiguration configuration, final List<StopCondition> stopConditions) throws CoreException {
        final SimuComConfiguration simuComConfiguration = (SimuComConfiguration) configuration;

        // create simulation configuration
        final SimuComConfig simuComConfig = SimuComConfigFactory.createConfig(simuComConfiguration, stopConditions,
                experimentName);

        // create workflow configuration
        final SimuComWorkflowConfiguration workflowConfig = SimuComWorkflowConfigurationFactory
                .createWorkflowConfiguration(simuComConfiguration, simuComConfig);

        // run simulation FIXME use blackboard
        final SequentialBlackboardInteractingJob<MDSDBlackboard> loadPCMResourcesToBlackboardJob = new SequentialBlackboardInteractingJob<MDSDBlackboard>();
        final PreparePCMBlackboardPartionJob preparePCMBlackboardPartionJob = new PreparePCMBlackboardPartionJob();
        final LoadPCMModelsJob loadPCMModelsJob = new LoadPCMModelsJob(workflowConfig);
        final SimuComJob simuComJob = new SimuComJob(workflowConfig, null, false);

        loadPCMResourcesToBlackboardJob.add(preparePCMBlackboardPartionJob);
        loadPCMResourcesToBlackboardJob.add(loadPCMModelsJob);
        loadPCMResourcesToBlackboardJob.add(simuComJob);

        final MDSDBlackboard blackboard = new MDSDBlackboard();
        final BlackboardBasedWorkflow<MDSDBlackboard> workflow = new BlackboardBasedWorkflow<MDSDBlackboard>(
                loadPCMResourcesToBlackboardJob, blackboard);
        workflow.run();

        // clean up
        final PersistenceFramework persistenceFramework = simuComConfiguration.getPersistenceFramework();
        if (AbstractsimulationPackage.eINSTANCE.getSensorFramework().isInstance(persistenceFramework)) {
            final SensorFramework sensorFramework = (SensorFramework) persistenceFramework;
            final SensorFrameworkDatasource datasource = sensorFramework.getDatasource();

            SensorFrameworkFactory.closeDatasource(datasource);
        } else if (AbstractsimulationPackage.eINSTANCE.getEDP2().isInstance(persistenceFramework)) {
            // For EDP2, nothing to do!

            // final EDP2 edp2 = (EDP2) persistenceFramework;
            // final Repository repository = edp2.getRepository();
            //
            // try {
            // MeasurementsUtility.ensureClosedRepository(repository);
            // } catch (DataNotAccessibleException e) {
            // throw new RuntimeException("Unable to write to EDP2 repository: " + e);
            // }
        } else {
            throw new IllegalArgumentException("Tried to clean up unknown persistency framework");
        }
    }

    @Override
    public boolean hasSupportFor(ToolConfiguration configuration) {
        return SimucomtooladapterPackage.eINSTANCE.getSimuComConfiguration().isInstance(configuration);
    }

}
