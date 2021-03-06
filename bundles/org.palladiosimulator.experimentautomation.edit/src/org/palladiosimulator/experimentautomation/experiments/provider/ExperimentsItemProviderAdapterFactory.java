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
 * This is the factory that is used to provide the interfaces needed to support Viewers. The
 * adapters generated by this factory convert EMF adapter notifications into calls to
 * {@link #fireNotifyChanged fireNotifyChanged}. The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances. <!-- begin-user-doc --> <!--
 * end-user-doc -->
 *
 * @generated
 */
public class ExperimentsItemProviderAdapterFactory extends ExperimentsAdapterFactory
        implements ComposeableAdapterFactory, IChangeNotifier, IDisposable, IChildCreationExtender {

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
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
     * This helps manage the child creation extenders. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected ChildCreationExtenderManager childCreationExtenderManager = new ChildCreationExtenderManager(
            ExperimentAutomationEditPlugin.INSTANCE, ExperimentsPackage.eNS_URI);

    /**
     * This keeps track of all the supported types checked by {@link #isFactoryForType
     * isFactoryForType}. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected Collection<Object> supportedTypes = new ArrayList<Object>();

    /**
     * This constructs an instance. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public ExperimentsItemProviderAdapterFactory() {
        this.supportedTypes.add(IEditingDomainItemProvider.class);
        this.supportedTypes.add(IStructuredItemContentProvider.class);
        this.supportedTypes.add(ITreeItemContentProvider.class);
        this.supportedTypes.add(IItemLabelProvider.class);
        this.supportedTypes.add(IItemPropertySource.class);
    }

    /**
     * This keeps track of the one adapter used for all
     * {@link org.palladiosimulator.experimentautomation.experiments.ExperimentRepository}
     * instances. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
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
        if (this.experimentRepositoryItemProvider == null) {
            this.experimentRepositoryItemProvider = new ExperimentRepositoryItemProvider(this);
        }

        return this.experimentRepositoryItemProvider;
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
        if (this.experimentItemProvider == null) {
            this.experimentItemProvider = new ExperimentItemProvider(this);
        }

        return this.experimentItemProvider;
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
     * This creates an adapter for a
     * {@link org.palladiosimulator.experimentautomation.experiments.Variation}. <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Adapter createVariationAdapter() {
        if (this.variationItemProvider == null) {
            this.variationItemProvider = new VariationItemProvider(this);
        }

        return this.variationItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all
     * {@link org.palladiosimulator.experimentautomation.experiments.PolynomialValueProvider}
     * instances. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
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
        if (this.polynomialValueProviderItemProvider == null) {
            this.polynomialValueProviderItemProvider = new PolynomialValueProviderItemProvider(this);
        }

        return this.polynomialValueProviderItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all
     * {@link org.palladiosimulator.experimentautomation.experiments.ExponentialValueProvider}
     * instances. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
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
        if (this.exponentialValueProviderItemProvider == null) {
            this.exponentialValueProviderItemProvider = new ExponentialValueProviderItemProvider(this);
        }

        return this.exponentialValueProviderItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all
     * {@link org.palladiosimulator.experimentautomation.experiments.SetValueProvider} instances.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
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
        if (this.setValueProviderItemProvider == null) {
            this.setValueProviderItemProvider = new SetValueProviderItemProvider(this);
        }

        return this.setValueProviderItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all
     * {@link org.palladiosimulator.experimentautomation.experiments.PlacketBurmanDesign} instances.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
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
        if (this.placketBurmanDesignItemProvider == null) {
            this.placketBurmanDesignItemProvider = new PlacketBurmanDesignItemProvider(this);
        }

        return this.placketBurmanDesignItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all
     * {@link org.palladiosimulator.experimentautomation.experiments.FullFactorialDesign} instances.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
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
        if (this.fullFactorialDesignItemProvider == null) {
            this.fullFactorialDesignItemProvider = new FullFactorialDesignItemProvider(this);
        }

        return this.fullFactorialDesignItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all
     * {@link org.palladiosimulator.experimentautomation.experiments.FractionalFactorialDesign}
     * instances. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected FractionalFactorialDesignItemProvider fractionalFactorialDesignItemProvider;

    /**
     * This creates an adapter for a
     * {@link org.palladiosimulator.experimentautomation.experiments.FractionalFactorialDesign}.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Adapter createFractionalFactorialDesignAdapter() {
        if (this.fractionalFactorialDesignItemProvider == null) {
            this.fractionalFactorialDesignItemProvider = new FractionalFactorialDesignItemProvider(this);
        }

        return this.fractionalFactorialDesignItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all
     * {@link org.palladiosimulator.experimentautomation.experiments.OneFactorAtATime} instances.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
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
        if (this.oneFactorAtATimeItemProvider == null) {
            this.oneFactorAtATimeItemProvider = new OneFactorAtATimeItemProvider(this);
        }

        return this.oneFactorAtATimeItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all
     * {@link org.palladiosimulator.experimentautomation.experiments.SimulationDurationMeasurement}
     * instances. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected SimulationDurationMeasurementItemProvider simulationDurationMeasurementItemProvider;

    /**
     * This creates an adapter for a
     * {@link org.palladiosimulator.experimentautomation.experiments.SimulationDurationMeasurement}.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Adapter createSimulationDurationMeasurementAdapter() {
        if (this.simulationDurationMeasurementItemProvider == null) {
            this.simulationDurationMeasurementItemProvider = new SimulationDurationMeasurementItemProvider(this);
        }

        return this.simulationDurationMeasurementItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all
     * {@link org.palladiosimulator.experimentautomation.experiments.ProfilingMeasurement}
     * instances. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
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
        if (this.profilingMeasurementItemProvider == null) {
            this.profilingMeasurementItemProvider = new ProfilingMeasurementItemProvider(this);
        }

        return this.profilingMeasurementItemProvider;
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
        if (this.jmxMeasurementItemProvider == null) {
            this.jmxMeasurementItemProvider = new JMXMeasurementItemProvider(this);
        }

        return this.jmxMeasurementItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all
     * {@link org.palladiosimulator.experimentautomation.experiments.LinearValueProvider} instances.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
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
        if (this.linearValueProviderItemProvider == null) {
            this.linearValueProviderItemProvider = new LinearValueProviderItemProvider(this);
        }

        return this.linearValueProviderItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all
     * {@link org.palladiosimulator.experimentautomation.experiments.ObjectModification} instances.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
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
        if (this.objectModificationItemProvider == null) {
            this.objectModificationItemProvider = new ObjectModificationItemProvider(this);
        }

        return this.objectModificationItemProvider;
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
        if (this.initialModelItemProvider == null) {
            this.initialModelItemProvider = new InitialModelItemProvider(this);
        }

        return this.initialModelItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all
     * {@link org.palladiosimulator.experimentautomation.experiments.ReconfigurationRulesFolder}
     * instances. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected ReconfigurationRulesFolderItemProvider reconfigurationRulesFolderItemProvider;

    /**
     * This creates an adapter for a
     * {@link org.palladiosimulator.experimentautomation.experiments.ReconfigurationRulesFolder}.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Adapter createReconfigurationRulesFolderAdapter() {
        if (this.reconfigurationRulesFolderItemProvider == null) {
            this.reconfigurationRulesFolderItemProvider = new ReconfigurationRulesFolderItemProvider(this);
        }

        return this.reconfigurationRulesFolderItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all
     * {@link org.palladiosimulator.experimentautomation.experiments.NestedIntervalsDoubleValueProvider}
     * instances. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected NestedIntervalsDoubleValueProviderItemProvider nestedIntervalsDoubleValueProviderItemProvider;

    /**
     * This creates an adapter for a
     * {@link org.palladiosimulator.experimentautomation.experiments.NestedIntervalsDoubleValueProvider}.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Adapter createNestedIntervalsDoubleValueProviderAdapter() {
        if (this.nestedIntervalsDoubleValueProviderItemProvider == null) {
            this.nestedIntervalsDoubleValueProviderItemProvider = new NestedIntervalsDoubleValueProviderItemProvider(
                    this);
        }

        return this.nestedIntervalsDoubleValueProviderItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all
     * {@link org.palladiosimulator.experimentautomation.experiments.NestedIntervalsLongValueProvider}
     * instances. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected NestedIntervalsLongValueProviderItemProvider nestedIntervalsLongValueProviderItemProvider;

    /**
     * This creates an adapter for a
     * {@link org.palladiosimulator.experimentautomation.experiments.NestedIntervalsLongValueProvider}.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Adapter createNestedIntervalsLongValueProviderAdapter() {
        if (this.nestedIntervalsLongValueProviderItemProvider == null) {
            this.nestedIntervalsLongValueProviderItemProvider = new NestedIntervalsLongValueProviderItemProvider(this);
        }

        return this.nestedIntervalsLongValueProviderItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all
     * {@link org.palladiosimulator.experimentautomation.experiments.SchedulingPolicy2DelayModification}
     * instances. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected SchedulingPolicy2DelayModificationItemProvider schedulingPolicy2DelayModificationItemProvider;

    /**
     * This creates an adapter for a
     * {@link org.palladiosimulator.experimentautomation.experiments.SchedulingPolicy2DelayModification}.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Adapter createSchedulingPolicy2DelayModificationAdapter() {
        if (this.schedulingPolicy2DelayModificationItemProvider == null) {
            this.schedulingPolicy2DelayModificationItemProvider = new SchedulingPolicy2DelayModificationItemProvider(
                    this);
        }

        return this.schedulingPolicy2DelayModificationItemProvider;
    }

    /**
     * This returns the root adapter factory that contains this factory. <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public ComposeableAdapterFactory getRootAdapterFactory() {
        return this.parentAdapterFactory == null ? this : this.parentAdapterFactory.getRootAdapterFactory();
    }

    /**
     * This sets the composed adapter factory that contains this factory. <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setParentAdapterFactory(final ComposedAdapterFactory parentAdapterFactory) {
        this.parentAdapterFactory = parentAdapterFactory;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public boolean isFactoryForType(final Object type) {
        return this.supportedTypes.contains(type) || super.isFactoryForType(type);
    }

    /**
     * This implementation substitutes the factory itself as the key for the adapter. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Adapter adapt(final Notifier notifier, final Object type) {
        return super.adapt(notifier, this);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Object adapt(final Object object, final Object type) {
        if (this.isFactoryForType(type)) {
            final Object adapter = super.adapt(object, type);
            if (!(type instanceof Class<?>) || (((Class<?>) type).isInstance(adapter))) {
                return adapter;
            }
        }

        return null;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public List<IChildCreationExtender> getChildCreationExtenders() {
        return this.childCreationExtenderManager.getChildCreationExtenders();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Collection<?> getNewChildDescriptors(final Object object, final EditingDomain editingDomain) {
        return this.childCreationExtenderManager.getNewChildDescriptors(object, editingDomain);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public ResourceLocator getResourceLocator() {
        return this.childCreationExtenderManager;
    }

    /**
     * This adds a listener. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void addListener(final INotifyChangedListener notifyChangedListener) {
        this.changeNotifier.addListener(notifyChangedListener);
    }

    /**
     * This removes a listener. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void removeListener(final INotifyChangedListener notifyChangedListener) {
        this.changeNotifier.removeListener(notifyChangedListener);
    }

    /**
     * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void fireNotifyChanged(final Notification notification) {
        this.changeNotifier.fireNotifyChanged(notification);

        if (this.parentAdapterFactory != null) {
            this.parentAdapterFactory.fireNotifyChanged(notification);
        }
    }

    /**
     * This disposes all of the item providers created by this factory. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @generated
     */
    @Override
    public void dispose() {
        if (this.experimentRepositoryItemProvider != null) {
            this.experimentRepositoryItemProvider.dispose();
        }
        if (this.experimentItemProvider != null) {
            this.experimentItemProvider.dispose();
        }
        if (this.variationItemProvider != null) {
            this.variationItemProvider.dispose();
        }
        if (this.polynomialValueProviderItemProvider != null) {
            this.polynomialValueProviderItemProvider.dispose();
        }
        if (this.exponentialValueProviderItemProvider != null) {
            this.exponentialValueProviderItemProvider.dispose();
        }
        if (this.setValueProviderItemProvider != null) {
            this.setValueProviderItemProvider.dispose();
        }
        if (this.placketBurmanDesignItemProvider != null) {
            this.placketBurmanDesignItemProvider.dispose();
        }
        if (this.fullFactorialDesignItemProvider != null) {
            this.fullFactorialDesignItemProvider.dispose();
        }
        if (this.fractionalFactorialDesignItemProvider != null) {
            this.fractionalFactorialDesignItemProvider.dispose();
        }
        if (this.oneFactorAtATimeItemProvider != null) {
            this.oneFactorAtATimeItemProvider.dispose();
        }
        if (this.simulationDurationMeasurementItemProvider != null) {
            this.simulationDurationMeasurementItemProvider.dispose();
        }
        if (this.profilingMeasurementItemProvider != null) {
            this.profilingMeasurementItemProvider.dispose();
        }
        if (this.jmxMeasurementItemProvider != null) {
            this.jmxMeasurementItemProvider.dispose();
        }
        if (this.linearValueProviderItemProvider != null) {
            this.linearValueProviderItemProvider.dispose();
        }
        if (this.objectModificationItemProvider != null) {
            this.objectModificationItemProvider.dispose();
        }
        if (this.initialModelItemProvider != null) {
            this.initialModelItemProvider.dispose();
        }
        if (this.reconfigurationRulesFolderItemProvider != null) {
            this.reconfigurationRulesFolderItemProvider.dispose();
        }
        if (this.nestedIntervalsDoubleValueProviderItemProvider != null) {
            this.nestedIntervalsDoubleValueProviderItemProvider.dispose();
        }
        if (this.nestedIntervalsLongValueProviderItemProvider != null) {
            this.nestedIntervalsLongValueProviderItemProvider.dispose();
        }
        if (this.schedulingPolicy2DelayModificationItemProvider != null) {
            this.schedulingPolicy2DelayModificationItemProvider.dispose();
        }
    }

}
