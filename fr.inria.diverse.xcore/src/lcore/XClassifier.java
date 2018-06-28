/**
 */
package lcore;

import org.eclipse.emf.common.util.EList;

import org.eclipse.xtext.common.types.JvmTypeReference;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>XClassifier</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link lcore.XClassifier#getInstanceType <em>Instance Type</em>}</li>
 *   <li>{@link lcore.XClassifier#getPackage <em>Package</em>}</li>
 *   <li>{@link lcore.XClassifier#getTypeParameters <em>Type Parameters</em>}</li>
 * </ul>
 *
 * @see lcore.LcorePackage#getXClassifier()
 * @model abstract="true"
 * @generated
 */
public interface XClassifier extends XNamedElement {
	/**
	 * Returns the value of the '<em><b>Instance Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Instance Type</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Instance Type</em>' containment reference.
	 * @see #setInstanceType(JvmTypeReference)
	 * @see lcore.LcorePackage#getXClassifier_InstanceType()
	 * @model containment="true"
	 * @generated
	 */
	JvmTypeReference getInstanceType();

	/**
	 * Sets the value of the '{@link lcore.XClassifier#getInstanceType <em>Instance Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Instance Type</em>' containment reference.
	 * @see #getInstanceType()
	 * @generated
	 */
	void setInstanceType(JvmTypeReference value);

	/**
	 * Returns the value of the '<em><b>Package</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link lcore.XPackage#getClassifiers <em>Classifiers</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Package</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Package</em>' container reference.
	 * @see lcore.LcorePackage#getXClassifier_Package()
	 * @see lcore.XPackage#getClassifiers
	 * @model opposite="classifiers" changeable="false"
	 * @generated
	 */
	XPackage getPackage();

	/**
	 * Returns the value of the '<em><b>Type Parameters</b></em>' containment reference list.
	 * The list contents are of type {@link lcore.XTypeParameter}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type Parameters</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Parameters</em>' containment reference list.
	 * @see lcore.LcorePackage#getXClassifier_TypeParameters()
	 * @model containment="true"
	 * @generated
	 */
	EList<XTypeParameter> getTypeParameters();

} // XClassifier
