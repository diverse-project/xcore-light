/**
 */
package lcore;

import org.eclipse.emf.common.util.EList;

import org.eclipse.xtext.xbase.XBlockExpression;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>XOperation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link lcore.XOperation#getTypeParameters <em>Type Parameters</em>}</li>
 *   <li>{@link lcore.XOperation#getParameters <em>Parameters</em>}</li>
 *   <li>{@link lcore.XOperation#getExceptions <em>Exceptions</em>}</li>
 *   <li>{@link lcore.XOperation#getBody <em>Body</em>}</li>
 * </ul>
 *
 * @see lcore.LcorePackage#getXOperation()
 * @model
 * @generated
 */
public interface XOperation extends XMember {
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
	 * @see lcore.LcorePackage#getXOperation_TypeParameters()
	 * @model containment="true"
	 * @generated
	 */
	EList<XTypeParameter> getTypeParameters();

	/**
	 * Returns the value of the '<em><b>Parameters</b></em>' containment reference list.
	 * The list contents are of type {@link lcore.XParameter}.
	 * It is bidirectional and its opposite is '{@link lcore.XParameter#getOperation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parameters</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameters</em>' containment reference list.
	 * @see lcore.LcorePackage#getXOperation_Parameters()
	 * @see lcore.XParameter#getOperation
	 * @model opposite="operation" containment="true"
	 * @generated
	 */
	EList<XParameter> getParameters();

	/**
	 * Returns the value of the '<em><b>Exceptions</b></em>' containment reference list.
	 * The list contents are of type {@link lcore.XGenericType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Exceptions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exceptions</em>' containment reference list.
	 * @see lcore.LcorePackage#getXOperation_Exceptions()
	 * @model containment="true" unsettable="true" suppressedIsSetVisibility="true" suppressedUnsetVisibility="true"
	 * @generated
	 */
	EList<XGenericType> getExceptions();

	/**
	 * Returns the value of the '<em><b>Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Body</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Body</em>' containment reference.
	 * @see #setBody(XBlockExpression)
	 * @see lcore.LcorePackage#getXOperation_Body()
	 * @model containment="true"
	 * @generated
	 */
	XBlockExpression getBody();

	/**
	 * Sets the value of the '{@link lcore.XOperation#getBody <em>Body</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Body</em>' containment reference.
	 * @see #getBody()
	 * @generated
	 */
	void setBody(XBlockExpression value);

} // XOperation
