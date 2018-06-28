/**
 */
package lcore;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>XType Parameter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link lcore.XTypeParameter#getBounds <em>Bounds</em>}</li>
 * </ul>
 *
 * @see lcore.LcorePackage#getXTypeParameter()
 * @model
 * @generated
 */
public interface XTypeParameter extends XNamedElement {
	/**
	 * Returns the value of the '<em><b>Bounds</b></em>' containment reference list.
	 * The list contents are of type {@link lcore.XGenericType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bounds</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bounds</em>' containment reference list.
	 * @see lcore.LcorePackage#getXTypeParameter_Bounds()
	 * @model containment="true"
	 * @generated
	 */
	EList<XGenericType> getBounds();

} // XTypeParameter
