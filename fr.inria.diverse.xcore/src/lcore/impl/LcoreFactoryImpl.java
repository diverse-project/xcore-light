/**
 */
package lcore.impl;

import lcore.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class LcoreFactoryImpl extends EFactoryImpl implements LcoreFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static LcoreFactory init() {
		try {
			LcoreFactory theLcoreFactory = (LcoreFactory)EPackage.Registry.INSTANCE.getEFactory(LcorePackage.eNS_URI);
			if (theLcoreFactory != null) {
				return theLcoreFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new LcoreFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LcoreFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case LcorePackage.XATTRIBUTE: return createXAttribute();
			case LcorePackage.XCLASS: return createXClass();
			case LcorePackage.XDATA_TYPE: return createXDataType();
			case LcorePackage.XENUM: return createXEnum();
			case LcorePackage.XENUM_LITERAL: return createXEnumLiteral();
			case LcorePackage.XGENERIC_TYPE: return createXGenericType();
			case LcorePackage.XIMPORT_DIRECTIVE: return createXImportDirective();
			case LcorePackage.XOPERATION: return createXOperation();
			case LcorePackage.XPACKAGE: return createXPackage();
			case LcorePackage.XPARAMETER: return createXParameter();
			case LcorePackage.XREFERENCE: return createXReference();
			case LcorePackage.XTYPE_PARAMETER: return createXTypeParameter();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XAttribute createXAttribute() {
		XAttributeImpl xAttribute = new XAttributeImpl();
		return xAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XClass createXClass() {
		XClassImpl xClass = new XClassImpl();
		return xClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XDataType createXDataType() {
		XDataTypeImpl xDataType = new XDataTypeImpl();
		return xDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XEnum createXEnum() {
		XEnumImpl xEnum = new XEnumImpl();
		return xEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XEnumLiteral createXEnumLiteral() {
		XEnumLiteralImpl xEnumLiteral = new XEnumLiteralImpl();
		return xEnumLiteral;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XGenericType createXGenericType() {
		XGenericTypeImpl xGenericType = new XGenericTypeImpl();
		return xGenericType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XImportDirective createXImportDirective() {
		XImportDirectiveImpl xImportDirective = new XImportDirectiveImpl();
		return xImportDirective;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XOperation createXOperation() {
		XOperationImpl xOperation = new XOperationImpl();
		return xOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XPackage createXPackage() {
		XPackageImpl xPackage = new XPackageImpl();
		return xPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XParameter createXParameter() {
		XParameterImpl xParameter = new XParameterImpl();
		return xParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XReference createXReference() {
		XReferenceImpl xReference = new XReferenceImpl();
		return xReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XTypeParameter createXTypeParameter() {
		XTypeParameterImpl xTypeParameter = new XTypeParameterImpl();
		return xTypeParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LcorePackage getLcorePackage() {
		return (LcorePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static LcorePackage getPackage() {
		return LcorePackage.eINSTANCE;
	}

} //LcoreFactoryImpl
