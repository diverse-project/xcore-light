/**
 */
package lcore;

import org.eclipse.emf.codegen.ecore.genmodel.GenBase;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>XGeneric Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link lcore.XGenericType#getUpperBound <em>Upper Bound</em>}</li>
 *   <li>{@link lcore.XGenericType#getTypeArguments <em>Type Arguments</em>}</li>
 *   <li>{@link lcore.XGenericType#getLowerBound <em>Lower Bound</em>}</li>
 *   <li>{@link lcore.XGenericType#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see lcore.LcorePackage#getXGenericType()
 * @model
 * @generated
 */
public interface XGenericType extends EObject {
	/**
	 * Returns the value of the '<em><b>Upper Bound</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Upper Bound</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Upper Bound</em>' containment reference.
	 * @see #setUpperBound(XGenericType)
	 * @see lcore.LcorePackage#getXGenericType_UpperBound()
	 * @model containment="true"
	 * @generated
	 */
	XGenericType getUpperBound();

	/**
	 * Sets the value of the '{@link lcore.XGenericType#getUpperBound <em>Upper Bound</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Upper Bound</em>' containment reference.
	 * @see #getUpperBound()
	 * @generated
	 */
	void setUpperBound(XGenericType value);

	/**
	 * Returns the value of the '<em><b>Type Arguments</b></em>' containment reference list.
	 * The list contents are of type {@link lcore.XGenericType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type Arguments</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Arguments</em>' containment reference list.
	 * @see lcore.LcorePackage#getXGenericType_TypeArguments()
	 * @model containment="true"
	 * @generated
	 */
	EList<XGenericType> getTypeArguments();

	/**
	 * Returns the value of the '<em><b>Lower Bound</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lower Bound</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lower Bound</em>' containment reference.
	 * @see #setLowerBound(XGenericType)
	 * @see lcore.LcorePackage#getXGenericType_LowerBound()
	 * @model containment="true"
	 * @generated
	 */
	XGenericType getLowerBound();

	/**
	 * Sets the value of the '{@link lcore.XGenericType#getLowerBound <em>Lower Bound</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lower Bound</em>' containment reference.
	 * @see #getLowerBound()
	 * @generated
	 */
	void setLowerBound(XGenericType value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' reference.
	 * @see #setType(GenBase)
	 * @see lcore.LcorePackage#getXGenericType_Type()
	 * @model
	 * @generated
	 */
	GenBase getType();

	/**
	 * Sets the value of the '{@link lcore.XGenericType#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(GenBase value);

} // XGenericType
