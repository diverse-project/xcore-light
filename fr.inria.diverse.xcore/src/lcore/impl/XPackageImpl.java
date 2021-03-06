/**
 */
package lcore.impl;

import java.util.Collection;

import lcore.LcorePackage;
import lcore.XClassifier;
import lcore.XImportDirective;
import lcore.XPackage;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>XPackage</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link lcore.impl.XPackageImpl#getImportDirectives <em>Import Directives</em>}</li>
 *   <li>{@link lcore.impl.XPackageImpl#getClassifiers <em>Classifiers</em>}</li>
 * </ul>
 *
 * @generated
 */
public class XPackageImpl extends XNamedElementImpl implements XPackage {
	/**
	 * The cached value of the '{@link #getImportDirectives() <em>Import Directives</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImportDirectives()
	 * @generated
	 * @ordered
	 */
	protected EList<XImportDirective> importDirectives;

	/**
	 * The cached value of the '{@link #getClassifiers() <em>Classifiers</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassifiers()
	 * @generated
	 * @ordered
	 */
	protected EList<XClassifier> classifiers;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected XPackageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LcorePackage.Literals.XPACKAGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<XImportDirective> getImportDirectives() {
		if (importDirectives == null) {
			importDirectives = new EObjectContainmentWithInverseEList<XImportDirective>(XImportDirective.class, this, LcorePackage.XPACKAGE__IMPORT_DIRECTIVES, LcorePackage.XIMPORT_DIRECTIVE__PACKAGE);
		}
		return importDirectives;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<XClassifier> getClassifiers() {
		if (classifiers == null) {
			classifiers = new EObjectContainmentWithInverseEList<XClassifier>(XClassifier.class, this, LcorePackage.XPACKAGE__CLASSIFIERS, LcorePackage.XCLASSIFIER__PACKAGE);
		}
		return classifiers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case LcorePackage.XPACKAGE__IMPORT_DIRECTIVES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getImportDirectives()).basicAdd(otherEnd, msgs);
			case LcorePackage.XPACKAGE__CLASSIFIERS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getClassifiers()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case LcorePackage.XPACKAGE__IMPORT_DIRECTIVES:
				return ((InternalEList<?>)getImportDirectives()).basicRemove(otherEnd, msgs);
			case LcorePackage.XPACKAGE__CLASSIFIERS:
				return ((InternalEList<?>)getClassifiers()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case LcorePackage.XPACKAGE__IMPORT_DIRECTIVES:
				return getImportDirectives();
			case LcorePackage.XPACKAGE__CLASSIFIERS:
				return getClassifiers();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case LcorePackage.XPACKAGE__IMPORT_DIRECTIVES:
				getImportDirectives().clear();
				getImportDirectives().addAll((Collection<? extends XImportDirective>)newValue);
				return;
			case LcorePackage.XPACKAGE__CLASSIFIERS:
				getClassifiers().clear();
				getClassifiers().addAll((Collection<? extends XClassifier>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case LcorePackage.XPACKAGE__IMPORT_DIRECTIVES:
				getImportDirectives().clear();
				return;
			case LcorePackage.XPACKAGE__CLASSIFIERS:
				getClassifiers().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case LcorePackage.XPACKAGE__IMPORT_DIRECTIVES:
				return importDirectives != null && !importDirectives.isEmpty();
			case LcorePackage.XPACKAGE__CLASSIFIERS:
				return classifiers != null && !classifiers.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //XPackageImpl
