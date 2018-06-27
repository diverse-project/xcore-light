/**
 * generated by Xtext 2.12.0
 */
package fr.inria.diverse.xcore_light.lcore;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>XMember</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.inria.diverse.xcore_light.lcore.XMember#getContainingClass <em>Containing Class</em>}</li>
 * </ul>
 *
 * @see fr.inria.diverse.xcore_light.lcore.LcorePackage#getXMember()
 * @model abstract="true"
 * @generated
 */
public interface XMember extends XTypedElement {
	/**
	 * Returns the value of the '<em><b>Containing Class</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link fr.inria.diverse.xcore_light.lcore.XClass#getMembers <em>Members</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Containing Class</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Containing Class</em>' container reference.
	 * @see fr.inria.diverse.xcore_light.lcore.LcorePackage#getXMember_ContainingClass()
	 * @see fr.inria.diverse.xcore_light.lcore.XClass#getMembers
	 * @model opposite="members" resolveProxies="false" changeable="false"
	 * @generated
	 */
	XClass getContainingClass();

} // XMember
