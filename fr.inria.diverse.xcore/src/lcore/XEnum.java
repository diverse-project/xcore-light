/**
 */
package lcore;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>XEnum</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link lcore.XEnum#getLiterals <em>Literals</em>}</li>
 * </ul>
 *
 * @see lcore.LcorePackage#getXEnum()
 * @model
 * @generated
 */
public interface XEnum extends XDataType {
	/**
	 * Returns the value of the '<em><b>Literals</b></em>' containment reference list.
	 * The list contents are of type {@link lcore.XEnumLiteral}.
	 * It is bidirectional and its opposite is '{@link lcore.XEnumLiteral#getEnum <em>Enum</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Literals</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Literals</em>' containment reference list.
	 * @see lcore.LcorePackage#getXEnum_Literals()
	 * @see lcore.XEnumLiteral#getEnum
	 * @model opposite="enum" containment="true"
	 * @generated
	 */
	EList<XEnumLiteral> getLiterals();

} // XEnum
