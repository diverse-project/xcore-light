/**
 * generated by Xtext 2.12.0
 */
package fr.inria.diverse.xcore_light.lcore;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>XClass</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.inria.diverse.xcore_light.lcore.XClass#isAbstract <em>Abstract</em>}</li>
 *   <li>{@link fr.inria.diverse.xcore_light.lcore.XClass#isInterface <em>Interface</em>}</li>
 *   <li>{@link fr.inria.diverse.xcore_light.lcore.XClass#getMembers <em>Members</em>}</li>
 *   <li>{@link fr.inria.diverse.xcore_light.lcore.XClass#getSuperTypes <em>Super Types</em>}</li>
 * </ul>
 *
 * @see fr.inria.diverse.xcore_light.lcore.LcorePackage#getXClass()
 * @model
 * @generated
 */
public interface XClass extends XClassifier {
	/**
	 * Returns the value of the '<em><b>Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Abstract</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Abstract</em>' attribute.
	 * @see #setAbstract(boolean)
	 * @see fr.inria.diverse.xcore_light.lcore.LcorePackage#getXClass_Abstract()
	 * @model required="true"
	 * @generated
	 */
	boolean isAbstract();

	/**
	 * Sets the value of the '{@link fr.inria.diverse.xcore_light.lcore.XClass#isAbstract <em>Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Abstract</em>' attribute.
	 * @see #isAbstract()
	 * @generated
	 */
	void setAbstract(boolean value);

	/**
	 * Returns the value of the '<em><b>Interface</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Interface</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interface</em>' attribute.
	 * @see #setInterface(boolean)
	 * @see fr.inria.diverse.xcore_light.lcore.LcorePackage#getXClass_Interface()
	 * @model required="true"
	 * @generated
	 */
	boolean isInterface();

	/**
	 * Sets the value of the '{@link fr.inria.diverse.xcore_light.lcore.XClass#isInterface <em>Interface</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Interface</em>' attribute.
	 * @see #isInterface()
	 * @generated
	 */
	void setInterface(boolean value);

	/**
	 * Returns the value of the '<em><b>Members</b></em>' containment reference list.
	 * The list contents are of type {@link fr.inria.diverse.xcore_light.lcore.XMember}.
	 * It is bidirectional and its opposite is '{@link fr.inria.diverse.xcore_light.lcore.XMember#getContainingClass <em>Containing Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Members</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Members</em>' containment reference list.
	 * @see fr.inria.diverse.xcore_light.lcore.LcorePackage#getXClass_Members()
	 * @see fr.inria.diverse.xcore_light.lcore.XMember#getContainingClass
	 * @model opposite="containingClass" containment="true"
	 * @generated
	 */
	EList<XMember> getMembers();

	/**
	 * Returns the value of the '<em><b>Super Types</b></em>' containment reference list.
	 * The list contents are of type {@link fr.inria.diverse.xcore_light.lcore.XGenericType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Super Types</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Super Types</em>' containment reference list.
	 * @see fr.inria.diverse.xcore_light.lcore.LcorePackage#getXClass_SuperTypes()
	 * @model containment="true" unsettable="true" suppressedIsSetVisibility="true" suppressedUnsetVisibility="true"
	 * @generated
	 */
	EList<XGenericType> getSuperTypes();

} // XClass