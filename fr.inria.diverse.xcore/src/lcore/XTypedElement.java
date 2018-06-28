/**
 */
package lcore;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>XTyped Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link lcore.XTypedElement#isUnordered <em>Unordered</em>}</li>
 *   <li>{@link lcore.XTypedElement#isUnique <em>Unique</em>}</li>
 *   <li>{@link lcore.XTypedElement#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see lcore.LcorePackage#getXTypedElement()
 * @model abstract="true"
 * @generated
 */
public interface XTypedElement extends XNamedElement {
	/**
	 * Returns the value of the '<em><b>Unordered</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Unordered</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unordered</em>' attribute.
	 * @see #setUnordered(boolean)
	 * @see lcore.LcorePackage#getXTypedElement_Unordered()
	 * @model required="true"
	 * @generated
	 */
	boolean isUnordered();

	/**
	 * Sets the value of the '{@link lcore.XTypedElement#isUnordered <em>Unordered</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unordered</em>' attribute.
	 * @see #isUnordered()
	 * @generated
	 */
	void setUnordered(boolean value);

	/**
	 * Returns the value of the '<em><b>Unique</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Unique</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unique</em>' attribute.
	 * @see #setUnique(boolean)
	 * @see lcore.LcorePackage#getXTypedElement_Unique()
	 * @model required="true"
	 * @generated
	 */
	boolean isUnique();

	/**
	 * Sets the value of the '{@link lcore.XTypedElement#isUnique <em>Unique</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unique</em>' attribute.
	 * @see #isUnique()
	 * @generated
	 */
	void setUnique(boolean value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' containment reference.
	 * @see #setType(XGenericType)
	 * @see lcore.LcorePackage#getXTypedElement_Type()
	 * @model containment="true" unsettable="true" suppressedIsSetVisibility="true" suppressedUnsetVisibility="true"
	 * @generated
	 */
	XGenericType getType();

	/**
	 * Sets the value of the '{@link lcore.XTypedElement#getType <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' containment reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(XGenericType value);

} // XTypedElement
