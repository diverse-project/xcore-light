/**
 */
package lcore;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>XParameter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link lcore.XParameter#getOperation <em>Operation</em>}</li>
 * </ul>
 *
 * @see lcore.LcorePackage#getXParameter()
 * @model
 * @generated
 */
public interface XParameter extends XTypedElement {
	/**
	 * Returns the value of the '<em><b>Operation</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link lcore.XOperation#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operation</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operation</em>' container reference.
	 * @see lcore.LcorePackage#getXParameter_Operation()
	 * @see lcore.XOperation#getParameters
	 * @model opposite="parameters" resolveProxies="false" changeable="false"
	 * @generated
	 */
	XOperation getOperation();

} // XParameter
