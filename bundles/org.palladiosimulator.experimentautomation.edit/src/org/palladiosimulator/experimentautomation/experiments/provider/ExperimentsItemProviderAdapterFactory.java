/**
 */
package org.palladiosimulator.experimentautomation.experiments.provider;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ChildCreationExtenderManager;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IChildCreationExtender;
import org.eclipse.emf.edit.provider.IDisposable;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.palladiosimulator.experimentautomation.experiments.ExperimentsPackage;
import org.palladiosimulator.experimentautomation.experiments.util.ExperimentsAdapterFactory;
import org.palladiosimulator.experimentautomation.variation.provider.ExperimentAutomationEditPlugin;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc --> <!--
 * end-user-doc -->
 * @generated
 */
public class ExperimentsItemProviderAdapterFactory extends ExperimentsAdapterFactory
		implements ComposeableAdapterFactory, IChangeNotifier, IDisposable, IChildCreationExtender {

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Palladiosimulator.org 2008-2017";

	/**
	 * This keeps track of the root adapter factory that delegates to this adapter factory. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	protected ComposedAdapterFactory parentAdapterFactory;

	/**
	 * This is used to implement {@link org.eclipse.emf.edit.provider.IChangeNotifier}. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	protected IChangeNotifier changeNotifier = new ChangeNotifier();

	/**
	 * This helps manage the child creation extenders.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected ChildCreationExtenderManager childCreationExtenderManager = new ChildCreationExtenderManager(
			ExperimentAutomationEditPlugin.INSTANCE, ExperimentsPackage.eNS_URI);

	/**
	 * This keeps track of all the supported types checked by {@link #isFactoryForType isFactoryForType}.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected Collection<Object> supportedTypes = new ArrayList<Object>();

	/**
	 * This constructs an instance.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public ExperimentsItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.palladiosimulator.experimentautomation.experiments.ExperimentRepository} instances.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected ExperimentRepositoryItemProvider experimentRepositoryItemProvider;

	/**
	 * This creates an adapter for a
	 * {@link org.palladiosimulator.experimentautomation.experiments.ExperimentRepository}. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public Adapter createExperimentRepositoryAdapter() {
		if (experimentRepositoryItemProvider == null) {
			experimentRepositoryItemProvider = new ExperimentRepositoryItemProvider(this);
		}

		return experimentRepositoryItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all
	 * {@link org.palladiosimulator.experimentautomation.experiments.Experiment} instances. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	protected ExperimentItemProvider experimentItemProvider;

	/**
	 * This creates an adapter for a
	 * {@link org.palladiosimulator.experimentautomation.experiments.Experiment}. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public Adapter createExperimentAdapter() {
		if (experimentItemProvider == null) {
			experimentItemProvider = new ExperimentItemProvider(this);
		}

		return experimentItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all
	 * {@link org.palladiosimulator.experimentautomation.experiments.Variation} instances. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	protected VariationItemProvider variationItemProvider;

	/**
	 * This creates an adapter for a {@link org.palladiosimulator.experimentautomation.experiments.Variation}.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createVariationAdapter() {
		if (variationItemProvider == null) {
			variationItemProvider = new VariationItemProvider(this);
		}

		return variationItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.palladiosimulator.experimentautomation.experiments.PolynomialValueProvider} instances.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected PolynomialValueProviderItemProvider polynomialValueProviderItemProvider;

	/**
	 * This creates an adapter for a
	 * {@link org.palladiosimulator.experimentautomation.experiments.PolynomialValueProvider}. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public Adapter createPolynomialValueProviderAdapter() {
		if (polynomialValueProviderItemProvider == null) {
			polynomialValueProviderItemProvider = new PolynomialValueProviderItemProvider(this);
		}

		return polynomialValueProviderItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.palladiosimulator.experimentautomation.experiments.ExponentialValueProvider} instances.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected ExponentialValueProviderItemProvider exponentialValueProviderItemProvider;

	/**
	 * This creates an adapter for a
	 * {@link org.palladiosimulator.experimentautomation.experiments.ExponentialValueProvider}. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public Adapter createExponentialValueProviderAdapter() {
		if (exponentialValueProviderItemProvider == null) {
			exponentialValueProviderItemProvider = new ExponentialValueProviderItemProvider(this);
		}

		return exponentialValueProviderItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.palladiosimulator.experimentautomation.experiments.SetValueProvider} instances.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected SetValueProviderItemProvider setValueProviderItemProvider;

	/**
	 * This creates an adapter for a
	 * {@link org.palladiosimulator.experimentautomation.experiments.SetValueProvider}. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public Adapter createSetValueProviderAdapter() {
		if (setValueProviderItemProvider == null) {
			setValueProviderItemProvider = new SetValueProviderItemProvider(this);
		}

		return setValueProviderItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.palladiosimulator.experimentautomation.experiments.PlacketBurmanDesign} instances.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected PlacketBurmanDesignItemProvider placketBurmanDesignItemProvider;

	/**
	 * This creates an adapter for a
	 * {@link org.palladiosimulator.experimentautomation.experiments.PlacketBurmanDesign}. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public Adapter createPlacketBurmanDesignAdapter() {
		if (placketBurmanDesignItemProvider == null) {
			placketBurmanDesignItemProvider = new PlacketBurmanDesignItemProvider(this);
		}

		return placketBurmanDesignItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.palladiosimulator.experimentautomation.experiments.FullFactorialDesign} instances.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected FullFactorialDesignItemProvider fullFactorialDesignItemProvider;

	/**
	 * This creates an adapter for a
	 * {@link org.palladiosimulator.experimentautomation.experiments.FullFactorialDesign}. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public Adapter createFullFactorialDesignAdapter() {
		if (fullFactorialDesignItemProvider == null) {
			fullFactorialDesignItemProvider = new FullFactorialDesignItemProvider(this);
		}

		return fullFactorialDesignItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.palladiosimulator.experimentautomation.experiments.FractionalFactorialDesign} instances.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected FractionalFactorialDesignItemProvider fractionalFactorialDesignItemProvider;

	/**
	 * This creates an adapter for a {@link org.palladiosimulator.experimentautomation.experiments.FractionalFactorialDesign}.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createFractionalFactorialDesignAdapter() {
		if (fractionalFactorialDesignItemProvider == null) {
			fractionalFactorialDesignItemProvider = new FractionalFactorialDesignItemProvider(this);
		}

		return fractionalFactorialDesignItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.palladiosimulator.experimentautomation.experiments.OneFactorAtATime} instances.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected OneFactorAtATimeItemProvider oneFactorAtATimeItemProvider;

	/**
	 * This creates an adapter for a
	 * {@link org.palladiosimulator.experimentautomation.experiments.OneFactorAtATime}. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public Adapter createOneFactorAtATimeAdapter() {
		if (oneFactorAtATimeItemProvider == null) {
			oneFactorAtATimeItemProvider = new OneFactorAtATimeItemProvider(this);
		}

		return oneFactorAtATimeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.palladiosimulator.experimentautomation.experiments.SimulationDurationMeasurement} instances.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected SimulationDurationMeasurementItemProvider simulationDurationMeasurementItemProvider;

	/**
	 * This creates an adapter for a {@link org.palladiosimulator.experimentautomation.experiments.SimulationDurationMeasurement}.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSimulationDurationMeasurementAdapter() {
		if (simulationDurationMeasurementItemProvider == null) {
			simulationDurationMeasurementItemProvider = new SimulationDurationMeasurementItemProvider(this);
		}

		return simulationDurationMeasurementItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.palladiosimulator.experimentautomation.experiments.ProfilingMeasurement} instances.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected ProfilingMeasurementItemProvider profilingMeasurementItemProvider;

	/**
	 * This creates an adapter for a
	 * {@link org.palladiosimulator.experimentautomation.experiments.ProfilingMeasurement}. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public Adapter createProfilingMeasurementAdapter() {
		if (profilingMeasurementItemProvider == null) {
			profilingMeasurementItemProvider = new ProfilingMeasurementItemProvider(this);
		}

		return profilingMeasurementItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all
	 * {@link org.palladiosimulator.experimentautomation.experiments.JMXMeasurement} instances. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	protected JMXMeasurementItemProvider jmxMeasurementItemProvider;

	/**
	 * This creates an adapter for a
	 * {@link org.palladiosimulator.experimentautomation.experiments.JMXMeasurement}. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public Adapter createJMXMeasurementAdapter() {
		if (jmxMeasurementItemProvider == null) {
			jmxMeasurementItemProvider = new JMXMeasurementItemProvider(this);
		}

		return jmxMeasurementItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.palladiosimulator.experimentautomation.experiments.LinearValueProvider} instances.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected LinearValueProviderItemProvider linearValueProviderItemProvider;

	/**
	 * This creates an adapter for a
	 * {@link org.palladiosimulator.experimentautomation.experiments.LinearValueProvider}. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public Adapter createLinearValueProviderAdapter() {
		if (linearValueProviderItemProvider == null) {
			linearValueProviderItemProvider = new LinearValueProviderItemProvider(this);
		}

		return linearValueProviderItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.palladiosimulator.experimentautomation.experiments.ObjectModification} instances.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected ObjectModificationItemProvider objectModificationItemProvider;

	/**
	 * This creates an adapter for a
	 * {@link org.palladiosimulator.experimentautomation.experiments.ObjectModification}. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public Adapter createObjectModificationAdapter() {
		if (objectModificationItemProvider == null) {
			objectModificationItemProvider = new ObjectModificationItemProvider(this);
		}

		return objectModificationItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all
	 * {@link org.palladiosimulator.experimentautomation.experiments.InitialModel} instances. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	protected InitialModelItemProvider initialModelItemProvider;

	/**
	 * This creates an adapter for a
	 * {@link org.palladiosimulator.experimentautomation.experiments.InitialModel}. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public Adapter createInitialModelAdapter() {
		if (initialModelItemProvider == null) {
			initialModelItemProvider = new InitialModelItemProvider(this);
		}

		return initialModelItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.palladiosimulator.experimentautomation.experiments.ReconfigurationRulesFolder} instances.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected ReconfigurationRulesFolderItemProvider reconfigurationRulesFolderItemProvider;

	/**
	 * This creates an adapter for a {@link org.palladiosimulator.experimentautomation.experiments.ReconfigurationRulesFolder}.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createReconfigurationRulesFolderAdapter() {
		if (reconfigurationRulesFolderItemProvider == null) {
			reconfigurationRulesFolderItemProvider = new ReconfigurationRulesFolderItemProvider(this);
		}

		return reconfigurationRulesFolderItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.palladiosimulator.experimentautomation.experiments.NestedIntervalsDoubleValueProvider} instances.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected NestedIntervalsDoubleValueProviderItemProvider nestedIntervalsDoubleValueProviderItemProvider;

	/**
	 * This creates an adapter for a {@link org.palladiosimulator.experimentautomation.experiments.NestedIntervalsDoubleValueProvider}.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createNestedIntervalsDoubleValueProviderAdapter() {
		if (nestedIntervalsDoubleValueProviderItemProvider == null) {
			nestedIntervalsDoubleValueProviderItemProvider = new NestedIntervalsDoubleValueProviderItemProvider(this);
		}

		return nestedIntervalsDoubleValueProviderItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.palladiosimulator.experimentautomation.experiments.NestedIntervalsLongValueProvider} instances.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected NestedIntervalsLongValueProviderItemProvider nestedIntervalsLongValueProviderItemProvider;

	/**
	 * This creates an adapter for a {@link org.palladiosimulator.experimentautomation.experiments.NestedIntervalsLongValueProvider}.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createNestedIntervalsLongValueProviderAdapter() {
		if (nestedIntervalsLongValueProviderItemProvider == null) {
			nestedIntervalsLongValueProviderItemProvider = new NestedIntervalsLongValueProviderItemProvider(this);
		}

		return nestedIntervalsLongValueProviderItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.palladiosimulator.experimentautomation.experiments.SchedulingPolicy2DelayModification} instances.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected SchedulingPolicy2DelayModificationItemProvider schedulingPolicy2DelayModificationItemProvider;

	/**
	 * This creates an adapter for a {@link org.palladiosimulator.experimentautomation.experiments.SchedulingPolicy2DelayModification}.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSchedulingPolicy2DelayModificationAdapter() {
		if (schedulingPolicy2DelayModificationItemProvider == null) {
			schedulingPolicy2DelayModificationItemProvider = new SchedulingPolicy2DelayModificationItemProvider(this);
		}

		return schedulingPolicy2DelayModificationItemProvider;
	}

	/**
	 * This returns the root adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ComposeableAdapterFactory getRootAdapterFactory() {
		return parentAdapterFactory == null ? this : parentAdapterFactory.getRootAdapterFactory();
	}

	/**
	 * This sets the composed adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setParentAdapterFactory(ComposedAdapterFactory parentAdapterFactory) {
		this.parentAdapterFactory = parentAdapterFactory;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object type) {
		return supportedTypes.contains(type) || super.isFactoryForType(type);
	}

	/**
	 * This implementation substitutes the factory itself as the key for the adapter. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public Adapter adapt(Notifier notifier, Object type) {
		return super.adapt(notifier, this);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object adapt(Object object, Object type) {
		if (isFactoryForType(type)) {
			Object adapter = super.adapt(object, type);
			if (!(type instanceof Class<?>) || (((Class<?>) type).isInstance(adapter))) {
				return adapter;
			}
		}

		return null;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public List<IChildCreationExtender> getChildCreationExtenders() {
		return childCreationExtenderManager.getChildCreationExtenders();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<?> getNewChildDescriptors(Object object, EditingDomain editingDomain) {
		return childCreationExtenderManager.getNewChildDescriptors(object, editingDomain);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return childCreationExtenderManager;
	}

	/**
	 * This adds a listener.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void addListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.addListener(notifyChangedListener);
	}

	/**
	 * This removes a listener.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void removeListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.removeListener(notifyChangedListener);
	}

	/**
	 * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public void fireNotifyChanged(Notification notification) {
		changeNotifier.fireNotifyChanged(notification);

		if (parentAdapterFactory != null) {
			parentAdapterFactory.fireNotifyChanged(notification);
		}
	}

	/**
	 * This disposes all of the item providers created by this factory. 
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	@Override
	public void dispose() {
		if (experimentRepositoryItemProvider != null)
			experimentRepositoryItemProvider.dispose();
		if (experimentItemProvider != null)
			experimentItemProvider.dispose();
		if (variationItemProvider != null)
			variationItemProvider.dispose();
		if (polynomialValueProviderItemProvider != null)
			polynomialValueProviderItemProvider.dispose();
		if (exponentialValueProviderItemProvider != null)
			exponentialValueProviderItemProvider.dispose();
		if (setValueProviderItemProvider != null)
			setValueProviderItemProvider.dispose();
		if (placketBurmanDesignItemProvider != null)
			placketBurmanDesignItemProvider.dispose();
		if (fullFactorialDesignItemProvider != null)
			fullFactorialDesignItemProvider.dispose();
		if (fractionalFactorialDesignItemProvider != null)
			fractionalFactorialDesignItemProvider.dispose();
		if (oneFactorAtATimeItemProvider != null)
			oneFactorAtATimeItemProvider.dispose();
		if (simulationDurationMeasurementItemProvider != null)
			simulationDurationMeasurementItemProvider.dispose();
		if (profilingMeasurementItemProvider != null)
			profilingMeasurementItemProvider.dispose();
		if (jmxMeasurementItemProvider != null)
			jmxMeasurementItemProvider.dispose();
		if (linearValueProviderItemProvider != null)
			linearValueProviderItemProvider.dispose();
		if (objectModificationItemProvider != null)
			objectModificationItemProvider.dispose();
		if (initialModelItemProvider != null)
			initialModelItemProvider.dispose();
		if (reconfigurationRulesFolderItemProvider != null)
			reconfigurationRulesFolderItemProvider.dispose();
		if (nestedIntervalsDoubleValueProviderItemProvider != null)
			nestedIntervalsDoubleValueProviderItemProvider.dispose();
		if (nestedIntervalsLongValueProviderItemProvider != null)
			nestedIntervalsLongValueProviderItemProvider.dispose();
		if (schedulingPolicy2DelayModificationItemProvider != null)
			schedulingPolicy2DelayModificationItemProvider.dispose();
	}

}
