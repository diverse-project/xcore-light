/**
 */
package lcore;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>XReference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link lcore.XReference#isContainer <em>Container</em>}</li>
 *   <li>{@link lcore.XReference#isContainment <em>Containment</em>}</li>
 *   <li>{@link lcore.XReference#isResolveProxies <em>Resolve Proxies</em>}</li>
 *   <li>{@link lcore.XReference#isLocal <em>Local</em>}</li>
 * </ul>
 *
 * @see lcore.LcorePackage#getXReference()
 * @model
 * @generated
 */
public interface XReference extends XStructuralFeature {
	/**
	 * Returns the value of the '<em><b>Container</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Container</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Container</em>' attribute.
	 * @see #setContainer(boolean)
	 * @see lcore.LcorePackage#getXReference_Container()
	 * @model required="true"
	 * @generated
	 */
	boolean isContainer();

	/**
	 * Sets the value of the '{@link lcore.XReference#isContainer <em>Container</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Container</em>' attribute.
	 * @see #isContainer()
	 * @generated
	 */
	void setContainer(boolean value);

	/**
	 * Returns the value of the '<em><b>Containment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Containment</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Containment</em>' attribute.
	 * @see #setContainment(boolean)
	 * @see lcore.LcorePackage#getXReference_Containment()
	 * @model required="true"
	 * @generated
	 */
	boolean isContainment();

	/**
	 * Sets the value of the '{@link lcore.XReference#isContainment <em>Containment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Containment</em>' attribute.
	 * @see #isContainment()
	 * @generated
	 */
	void setContainment(boolean value);

	/**
	 * Returns the value of the '<em><b>Resolve Proxies</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resolve Proxies</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resolve Proxies</em>' attribute.
	 * @see #setResolveProxies(boolean)
	 * @see lcore.LcorePackage#getXReference_ResolveProxies()
	 * @model required="true"
	 * @generated
	 */
	boolean isResolveProxies();

	/**
	 * Sets the value of the '{@link lcore.XReference#isResolveProxies <em>Resolve Proxies</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resolve Proxies</em>' attribute.
	 * @see #isResolveProxies()
	 * @generated
	 */
	void setResolveProxies(boolean value);

	/**
	 * Returns the value of the '<em><b>Local</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Local</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Local</em>' attribute.
	 * @see #setLocal(boolean)
	 * @see lcore.LcorePackage#getXReference_Local()
	 * @model required="true"
	 * @generated
	 */
	boolean isLocal();

	/**
	 * Sets the value of the '{@link lcore.XReference#isLocal <em>Local</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Local</em>' attribute.
	 * @see #isLocal()
	 * @generated
	 */
	void setLocal(boolean value);

} // XReference
