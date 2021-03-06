/**
 */
package lcore;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>XEnum Literal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link lcore.XEnumLiteral#getValue <em>Value</em>}</li>
 *   <li>{@link lcore.XEnumLiteral#getLiteral <em>Literal</em>}</li>
 *   <li>{@link lcore.XEnumLiteral#getEnum <em>Enum</em>}</li>
 * </ul>
 *
 * @see lcore.LcorePackage#getXEnumLiteral()
 * @model
 * @generated
 */
public interface XEnumLiteral extends XNamedElement {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(int)
	 * @see lcore.LcorePackage#getXEnumLiteral_Value()
	 * @model required="true"
	 * @generated
	 */
	int getValue();

	/**
	 * Sets the value of the '{@link lcore.XEnumLiteral#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(int value);

	/**
	 * Returns the value of the '<em><b>Literal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Literal</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Literal</em>' attribute.
	 * @see #setLiteral(String)
	 * @see lcore.LcorePackage#getXEnumLiteral_Literal()
	 * @model
	 * @generated
	 */
	String getLiteral();

	/**
	 * Sets the value of the '{@link lcore.XEnumLiteral#getLiteral <em>Literal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Literal</em>' attribute.
	 * @see #getLiteral()
	 * @generated
	 */
	void setLiteral(String value);

	/**
	 * Returns the value of the '<em><b>Enum</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link lcore.XEnum#getLiterals <em>Literals</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Enum</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enum</em>' container reference.
	 * @see lcore.LcorePackage#getXEnumLiteral_Enum()
	 * @see lcore.XEnum#getLiterals
	 * @model opposite="literals" resolveProxies="false" changeable="false"
	 * @generated
	 */
	XEnum getEnum();

} // XEnumLiteral
