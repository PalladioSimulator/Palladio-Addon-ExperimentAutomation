/**
 */
package de.uka.ipd.sdq.experimentautomation.experiments;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Reconfiguration Rules Folder</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 * <li>
 * {@link de.uka.ipd.sdq.experimentautomation.experiments.ReconfigurationRulesFolder#getFolderUri
 * <em>Folder Uri</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uka.ipd.sdq.experimentautomation.experiments.ExperimentsPackage#getReconfigurationRulesFolder()
 * @model
 * @generated
 */
public interface ReconfigurationRulesFolder extends EObject {
    /**
     * Returns the value of the '<em><b>Folder Uri</b></em>' attribute. <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Folder Uri</em>' attribute isn't clear, there really should be
     * more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * 
     * @return the value of the '<em>Folder Uri</em>' attribute.
     * @see #setFolderUri(String)
     * @see de.uka.ipd.sdq.experimentautomation.experiments.ExperimentsPackage#getReconfigurationRulesFolder_FolderUri()
     * @model required="true"
     * @generated
     */
    String getFolderUri();

    /**
     * Sets the value of the '
     * {@link de.uka.ipd.sdq.experimentautomation.experiments.ReconfigurationRulesFolder#getFolderUri
     * <em>Folder Uri</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @param value
     *            the new value of the '<em>Folder Uri</em>' attribute.
     * @see #getFolderUri()
     * @generated
     */
    void setFolderUri(String value);

} // ReconfigurationRulesFolder
