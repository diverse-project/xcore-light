/**
 */
package lcore;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>XPackage</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link lcore.XPackage#getImportDirectives <em>Import Directives</em>}</li>
 *   <li>{@link lcore.XPackage#getClassifiers <em>Classifiers</em>}</li>
 * </ul>
 *
 * @see lcore.LcorePackage#getXPackage()
 * @model
 * @generated
 */
public interface XPackage extends XNamedElement {
	/**
	 * Returns the value of the '<em><b>Import Directives</b></em>' containment reference list.
	 * The list contents are of type {@link lcore.XImportDirective}.
	 * It is bidirectional and its opposite is '{@link lcore.XImportDirective#getPackage <em>Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Import Directives</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Import Directives</em>' containment reference list.
	 * @see lcore.LcorePackage#getXPackage_ImportDirectives()
	 * @see lcore.XImportDirective#getPackage
	 * @model opposite="package" containment="true"
	 * @generated
	 */
	EList<XImportDirective> getImportDirectives();

	/**
	 * Returns the value of the '<em><b>Classifiers</b></em>' containment reference list.
	 * The list contents are of type {@link lcore.XClassifier}.
	 * It is bidirectional and its opposite is '{@link lcore.XClassifier#getPackage <em>Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Classifiers</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Classifiers</em>' containment reference list.
	 * @see lcore.LcorePackage#getXPackage_Classifiers()
	 * @see lcore.XClassifier#getPackage
	 * @model opposite="package" containment="true"
	 * @generated
	 */
	EList<XClassifier> getClassifiers();

} // XPackage
