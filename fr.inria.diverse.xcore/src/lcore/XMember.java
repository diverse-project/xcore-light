/**
 */
package lcore;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>XMember</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link lcore.XMember#getContainingClass <em>Containing Class</em>}</li>
 * </ul>
 *
 * @see lcore.LcorePackage#getXMember()
 * @model abstract="true"
 * @generated
 */
public interface XMember extends XTypedElement {
	/**
	 * Returns the value of the '<em><b>Containing Class</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link lcore.XClass#getMembers <em>Members</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Containing Class</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Containing Class</em>' container reference.
	 * @see lcore.LcorePackage#getXMember_ContainingClass()
	 * @see lcore.XClass#getMembers
	 * @model opposite="members" resolveProxies="false" changeable="false"
	 * @generated
	 */
	XClass getContainingClass();

} // XMember
