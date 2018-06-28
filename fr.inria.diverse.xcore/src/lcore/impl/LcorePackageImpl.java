/**
 */
package lcore.impl;

import lcore.LcoreFactory;
import lcore.LcorePackage;
import lcore.XAttribute;
import lcore.XClass;
import lcore.XClassifier;
import lcore.XDataType;
import lcore.XEnum;
import lcore.XEnumLiteral;
import lcore.XGenericType;
import lcore.XImportDirective;
import lcore.XMember;
import lcore.XModelElement;
import lcore.XNamedElement;
import lcore.XOperation;
import lcore.XPackage;
import lcore.XParameter;
import lcore.XReference;
import lcore.XStructuralFeature;
import lcore.XTypeParameter;
import lcore.XTypedElement;

import org.eclipse.emf.codegen.ecore.genmodel.GenModelPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.xtext.common.types.TypesPackage;

import org.eclipse.xtext.xbase.XbasePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class LcorePackageImpl extends EPackageImpl implements LcorePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass xAttributeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass xClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass xClassifierEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass xDataTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass xEnumEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass xEnumLiteralEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass xGenericTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass xImportDirectiveEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass xMemberEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass xModelElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass xNamedElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass xOperationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass xPackageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass xParameterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass xReferenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass xStructuralFeatureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass xTypedElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass xTypeParameterEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see lcore.LcorePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private LcorePackageImpl() {
		super(eNS_URI, LcoreFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link LcorePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static LcorePackage init() {
		if (isInited) return (LcorePackage)EPackage.Registry.INSTANCE.getEPackage(LcorePackage.eNS_URI);

		// Obtain or create and register package
		LcorePackageImpl theLcorePackage = (LcorePackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof LcorePackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new LcorePackageImpl());

		isInited = true;

		// Initialize simple dependencies
		EcorePackage.eINSTANCE.eClass();
		GenModelPackage.eINSTANCE.eClass();
		TypesPackage.eINSTANCE.eClass();
		XbasePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theLcorePackage.createPackageContents();

		// Initialize created meta-data
		theLcorePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theLcorePackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(LcorePackage.eNS_URI, theLcorePackage);
		return theLcorePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getXAttribute() {
		return xAttributeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getXAttribute_DefaultValueLiteral() {
		return (EAttribute)xAttributeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getXAttribute_ID() {
		return (EAttribute)xAttributeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getXClass() {
		return xClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getXClass_Abstract() {
		return (EAttribute)xClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getXClass_Interface() {
		return (EAttribute)xClassEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getXClass_Members() {
		return (EReference)xClassEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getXClass_SuperTypes() {
		return (EReference)xClassEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getXClassifier() {
		return xClassifierEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getXClassifier_InstanceType() {
		return (EReference)xClassifierEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getXClassifier_Package() {
		return (EReference)xClassifierEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getXClassifier_TypeParameters() {
		return (EReference)xClassifierEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getXDataType() {
		return xDataTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getXDataType_Serializable() {
		return (EAttribute)xDataTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getXDataType_CreateBody() {
		return (EReference)xDataTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getXDataType_ConvertBody() {
		return (EReference)xDataTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getXEnum() {
		return xEnumEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getXEnum_Literals() {
		return (EReference)xEnumEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getXEnumLiteral() {
		return xEnumLiteralEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getXEnumLiteral_Value() {
		return (EAttribute)xEnumLiteralEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getXEnumLiteral_Literal() {
		return (EAttribute)xEnumLiteralEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getXEnumLiteral_Enum() {
		return (EReference)xEnumLiteralEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getXGenericType() {
		return xGenericTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getXGenericType_UpperBound() {
		return (EReference)xGenericTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getXGenericType_TypeArguments() {
		return (EReference)xGenericTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getXGenericType_LowerBound() {
		return (EReference)xGenericTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getXGenericType_Type() {
		return (EReference)xGenericTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getXImportDirective() {
		return xImportDirectiveEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getXImportDirective_ImportedNamespace() {
		return (EAttribute)xImportDirectiveEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getXImportDirective_ImportedObject() {
		return (EReference)xImportDirectiveEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getXImportDirective_Package() {
		return (EReference)xImportDirectiveEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getXMember() {
		return xMemberEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getXMember_ContainingClass() {
		return (EReference)xMemberEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getXModelElement() {
		return xModelElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getXNamedElement() {
		return xNamedElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getXNamedElement_Name() {
		return (EAttribute)xNamedElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getXOperation() {
		return xOperationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getXOperation_TypeParameters() {
		return (EReference)xOperationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getXOperation_Parameters() {
		return (EReference)xOperationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getXOperation_Exceptions() {
		return (EReference)xOperationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getXOperation_Body() {
		return (EReference)xOperationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getXPackage() {
		return xPackageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getXPackage_ImportDirectives() {
		return (EReference)xPackageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getXPackage_Classifiers() {
		return (EReference)xPackageEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getXParameter() {
		return xParameterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getXParameter_Operation() {
		return (EReference)xParameterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getXReference() {
		return xReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getXReference_Container() {
		return (EAttribute)xReferenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getXReference_Containment() {
		return (EAttribute)xReferenceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getXReference_ResolveProxies() {
		return (EAttribute)xReferenceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getXReference_Local() {
		return (EAttribute)xReferenceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getXStructuralFeature() {
		return xStructuralFeatureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getXStructuralFeature_Readonly() {
		return (EAttribute)xStructuralFeatureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getXStructuralFeature_Volatile() {
		return (EAttribute)xStructuralFeatureEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getXStructuralFeature_Transient() {
		return (EAttribute)xStructuralFeatureEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getXStructuralFeature_Unsettable() {
		return (EAttribute)xStructuralFeatureEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getXStructuralFeature_Derived() {
		return (EAttribute)xStructuralFeatureEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getXStructuralFeature_GetBody() {
		return (EReference)xStructuralFeatureEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getXStructuralFeature_SetBody() {
		return (EReference)xStructuralFeatureEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getXStructuralFeature_IsSetBody() {
		return (EReference)xStructuralFeatureEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getXStructuralFeature_UnsetBody() {
		return (EReference)xStructuralFeatureEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getXTypedElement() {
		return xTypedElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getXTypedElement_Unordered() {
		return (EAttribute)xTypedElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getXTypedElement_Unique() {
		return (EAttribute)xTypedElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getXTypedElement_Type() {
		return (EReference)xTypedElementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getXTypeParameter() {
		return xTypeParameterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getXTypeParameter_Bounds() {
		return (EReference)xTypeParameterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LcoreFactory getLcoreFactory() {
		return (LcoreFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		xAttributeEClass = createEClass(XATTRIBUTE);
		createEAttribute(xAttributeEClass, XATTRIBUTE__DEFAULT_VALUE_LITERAL);
		createEAttribute(xAttributeEClass, XATTRIBUTE__ID);

		xClassEClass = createEClass(XCLASS);
		createEAttribute(xClassEClass, XCLASS__ABSTRACT);
		createEAttribute(xClassEClass, XCLASS__INTERFACE);
		createEReference(xClassEClass, XCLASS__MEMBERS);
		createEReference(xClassEClass, XCLASS__SUPER_TYPES);

		xClassifierEClass = createEClass(XCLASSIFIER);
		createEReference(xClassifierEClass, XCLASSIFIER__INSTANCE_TYPE);
		createEReference(xClassifierEClass, XCLASSIFIER__PACKAGE);
		createEReference(xClassifierEClass, XCLASSIFIER__TYPE_PARAMETERS);

		xDataTypeEClass = createEClass(XDATA_TYPE);
		createEAttribute(xDataTypeEClass, XDATA_TYPE__SERIALIZABLE);
		createEReference(xDataTypeEClass, XDATA_TYPE__CREATE_BODY);
		createEReference(xDataTypeEClass, XDATA_TYPE__CONVERT_BODY);

		xEnumEClass = createEClass(XENUM);
		createEReference(xEnumEClass, XENUM__LITERALS);

		xEnumLiteralEClass = createEClass(XENUM_LITERAL);
		createEAttribute(xEnumLiteralEClass, XENUM_LITERAL__VALUE);
		createEAttribute(xEnumLiteralEClass, XENUM_LITERAL__LITERAL);
		createEReference(xEnumLiteralEClass, XENUM_LITERAL__ENUM);

		xGenericTypeEClass = createEClass(XGENERIC_TYPE);
		createEReference(xGenericTypeEClass, XGENERIC_TYPE__UPPER_BOUND);
		createEReference(xGenericTypeEClass, XGENERIC_TYPE__TYPE_ARGUMENTS);
		createEReference(xGenericTypeEClass, XGENERIC_TYPE__LOWER_BOUND);
		createEReference(xGenericTypeEClass, XGENERIC_TYPE__TYPE);

		xImportDirectiveEClass = createEClass(XIMPORT_DIRECTIVE);
		createEAttribute(xImportDirectiveEClass, XIMPORT_DIRECTIVE__IMPORTED_NAMESPACE);
		createEReference(xImportDirectiveEClass, XIMPORT_DIRECTIVE__IMPORTED_OBJECT);
		createEReference(xImportDirectiveEClass, XIMPORT_DIRECTIVE__PACKAGE);

		xMemberEClass = createEClass(XMEMBER);
		createEReference(xMemberEClass, XMEMBER__CONTAINING_CLASS);

		xModelElementEClass = createEClass(XMODEL_ELEMENT);

		xNamedElementEClass = createEClass(XNAMED_ELEMENT);
		createEAttribute(xNamedElementEClass, XNAMED_ELEMENT__NAME);

		xOperationEClass = createEClass(XOPERATION);
		createEReference(xOperationEClass, XOPERATION__TYPE_PARAMETERS);
		createEReference(xOperationEClass, XOPERATION__PARAMETERS);
		createEReference(xOperationEClass, XOPERATION__EXCEPTIONS);
		createEReference(xOperationEClass, XOPERATION__BODY);

		xPackageEClass = createEClass(XPACKAGE);
		createEReference(xPackageEClass, XPACKAGE__IMPORT_DIRECTIVES);
		createEReference(xPackageEClass, XPACKAGE__CLASSIFIERS);

		xParameterEClass = createEClass(XPARAMETER);
		createEReference(xParameterEClass, XPARAMETER__OPERATION);

		xReferenceEClass = createEClass(XREFERENCE);
		createEAttribute(xReferenceEClass, XREFERENCE__CONTAINER);
		createEAttribute(xReferenceEClass, XREFERENCE__CONTAINMENT);
		createEAttribute(xReferenceEClass, XREFERENCE__RESOLVE_PROXIES);
		createEAttribute(xReferenceEClass, XREFERENCE__LOCAL);

		xStructuralFeatureEClass = createEClass(XSTRUCTURAL_FEATURE);
		createEAttribute(xStructuralFeatureEClass, XSTRUCTURAL_FEATURE__READONLY);
		createEAttribute(xStructuralFeatureEClass, XSTRUCTURAL_FEATURE__VOLATILE);
		createEAttribute(xStructuralFeatureEClass, XSTRUCTURAL_FEATURE__TRANSIENT);
		createEAttribute(xStructuralFeatureEClass, XSTRUCTURAL_FEATURE__UNSETTABLE);
		createEAttribute(xStructuralFeatureEClass, XSTRUCTURAL_FEATURE__DERIVED);
		createEReference(xStructuralFeatureEClass, XSTRUCTURAL_FEATURE__GET_BODY);
		createEReference(xStructuralFeatureEClass, XSTRUCTURAL_FEATURE__SET_BODY);
		createEReference(xStructuralFeatureEClass, XSTRUCTURAL_FEATURE__IS_SET_BODY);
		createEReference(xStructuralFeatureEClass, XSTRUCTURAL_FEATURE__UNSET_BODY);

		xTypedElementEClass = createEClass(XTYPED_ELEMENT);
		createEAttribute(xTypedElementEClass, XTYPED_ELEMENT__UNORDERED);
		createEAttribute(xTypedElementEClass, XTYPED_ELEMENT__UNIQUE);
		createEReference(xTypedElementEClass, XTYPED_ELEMENT__TYPE);

		xTypeParameterEClass = createEClass(XTYPE_PARAMETER);
		createEReference(xTypeParameterEClass, XTYPE_PARAMETER__BOUNDS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		TypesPackage theTypesPackage = (TypesPackage)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI);
		XbasePackage theXbasePackage = (XbasePackage)EPackage.Registry.INSTANCE.getEPackage(XbasePackage.eNS_URI);
		GenModelPackage theGenModelPackage = (GenModelPackage)EPackage.Registry.INSTANCE.getEPackage(GenModelPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		xAttributeEClass.getESuperTypes().add(this.getXStructuralFeature());
		xClassEClass.getESuperTypes().add(this.getXClassifier());
		xClassifierEClass.getESuperTypes().add(this.getXNamedElement());
		xDataTypeEClass.getESuperTypes().add(this.getXClassifier());
		xEnumEClass.getESuperTypes().add(this.getXDataType());
		xEnumLiteralEClass.getESuperTypes().add(this.getXNamedElement());
		xImportDirectiveEClass.getESuperTypes().add(this.getXModelElement());
		xMemberEClass.getESuperTypes().add(this.getXTypedElement());
		xNamedElementEClass.getESuperTypes().add(this.getXModelElement());
		xOperationEClass.getESuperTypes().add(this.getXMember());
		xPackageEClass.getESuperTypes().add(this.getXNamedElement());
		xParameterEClass.getESuperTypes().add(this.getXTypedElement());
		xReferenceEClass.getESuperTypes().add(this.getXStructuralFeature());
		xStructuralFeatureEClass.getESuperTypes().add(this.getXMember());
		xTypedElementEClass.getESuperTypes().add(this.getXNamedElement());
		xTypeParameterEClass.getESuperTypes().add(this.getXNamedElement());

		// Initialize classes, features, and operations; add parameters
		initEClass(xAttributeEClass, XAttribute.class, "XAttribute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getXAttribute_DefaultValueLiteral(), ecorePackage.getEString(), "defaultValueLiteral", null, 0, 1, XAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getXAttribute_ID(), ecorePackage.getEBoolean(), "iD", null, 1, 1, XAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(xClassEClass, XClass.class, "XClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getXClass_Abstract(), ecorePackage.getEBoolean(), "abstract", null, 1, 1, XClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getXClass_Interface(), ecorePackage.getEBoolean(), "interface", null, 1, 1, XClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getXClass_Members(), this.getXMember(), this.getXMember_ContainingClass(), "members", null, 0, -1, XClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getXClass_SuperTypes(), this.getXGenericType(), null, "superTypes", null, 0, -1, XClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(xClassifierEClass, XClassifier.class, "XClassifier", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getXClassifier_InstanceType(), theTypesPackage.getJvmTypeReference(), null, "instanceType", null, 0, 1, XClassifier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getXClassifier_Package(), this.getXPackage(), this.getXPackage_Classifiers(), "package", null, 0, 1, XClassifier.class, IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getXClassifier_TypeParameters(), this.getXTypeParameter(), null, "typeParameters", null, 0, -1, XClassifier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(xDataTypeEClass, XDataType.class, "XDataType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getXDataType_Serializable(), ecorePackage.getEBoolean(), "serializable", "true", 1, 1, XDataType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getXDataType_CreateBody(), theXbasePackage.getXBlockExpression(), null, "createBody", null, 0, 1, XDataType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getXDataType_ConvertBody(), theXbasePackage.getXBlockExpression(), null, "convertBody", null, 0, 1, XDataType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(xEnumEClass, XEnum.class, "XEnum", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getXEnum_Literals(), this.getXEnumLiteral(), this.getXEnumLiteral_Enum(), "literals", null, 0, -1, XEnum.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(xEnumLiteralEClass, XEnumLiteral.class, "XEnumLiteral", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getXEnumLiteral_Value(), ecorePackage.getEInt(), "value", null, 1, 1, XEnumLiteral.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getXEnumLiteral_Literal(), ecorePackage.getEString(), "literal", null, 0, 1, XEnumLiteral.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getXEnumLiteral_Enum(), this.getXEnum(), this.getXEnum_Literals(), "enum", null, 0, 1, XEnumLiteral.class, IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(xGenericTypeEClass, XGenericType.class, "XGenericType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getXGenericType_UpperBound(), this.getXGenericType(), null, "upperBound", null, 0, 1, XGenericType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getXGenericType_TypeArguments(), this.getXGenericType(), null, "typeArguments", null, 0, -1, XGenericType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getXGenericType_LowerBound(), this.getXGenericType(), null, "lowerBound", null, 0, 1, XGenericType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getXGenericType_Type(), theGenModelPackage.getGenBase(), null, "type", null, 0, 1, XGenericType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(xImportDirectiveEClass, XImportDirective.class, "XImportDirective", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getXImportDirective_ImportedNamespace(), ecorePackage.getEString(), "importedNamespace", null, 0, 1, XImportDirective.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getXImportDirective_ImportedObject(), ecorePackage.getEObject(), null, "importedObject", null, 0, 1, XImportDirective.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getXImportDirective_Package(), this.getXPackage(), this.getXPackage_ImportDirectives(), "package", null, 0, 1, XImportDirective.class, IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(xMemberEClass, XMember.class, "XMember", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getXMember_ContainingClass(), this.getXClass(), this.getXClass_Members(), "containingClass", null, 0, 1, XMember.class, IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(xModelElementEClass, XModelElement.class, "XModelElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(xNamedElementEClass, XNamedElement.class, "XNamedElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getXNamedElement_Name(), ecorePackage.getEString(), "name", null, 0, 1, XNamedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(xOperationEClass, XOperation.class, "XOperation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getXOperation_TypeParameters(), this.getXTypeParameter(), null, "typeParameters", null, 0, -1, XOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getXOperation_Parameters(), this.getXParameter(), this.getXParameter_Operation(), "parameters", null, 0, -1, XOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getXOperation_Exceptions(), this.getXGenericType(), null, "exceptions", null, 0, -1, XOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getXOperation_Body(), theXbasePackage.getXBlockExpression(), null, "body", null, 0, 1, XOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(xPackageEClass, XPackage.class, "XPackage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getXPackage_ImportDirectives(), this.getXImportDirective(), this.getXImportDirective_Package(), "importDirectives", null, 0, -1, XPackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getXPackage_Classifiers(), this.getXClassifier(), this.getXClassifier_Package(), "classifiers", null, 0, -1, XPackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(xParameterEClass, XParameter.class, "XParameter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getXParameter_Operation(), this.getXOperation(), this.getXOperation_Parameters(), "operation", null, 0, 1, XParameter.class, IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(xReferenceEClass, XReference.class, "XReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getXReference_Container(), ecorePackage.getEBoolean(), "container", null, 1, 1, XReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getXReference_Containment(), ecorePackage.getEBoolean(), "containment", null, 1, 1, XReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getXReference_ResolveProxies(), ecorePackage.getEBoolean(), "resolveProxies", null, 1, 1, XReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getXReference_Local(), ecorePackage.getEBoolean(), "local", null, 1, 1, XReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(xStructuralFeatureEClass, XStructuralFeature.class, "XStructuralFeature", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getXStructuralFeature_Readonly(), ecorePackage.getEBoolean(), "readonly", null, 1, 1, XStructuralFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getXStructuralFeature_Volatile(), ecorePackage.getEBoolean(), "volatile", null, 1, 1, XStructuralFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getXStructuralFeature_Transient(), ecorePackage.getEBoolean(), "transient", null, 1, 1, XStructuralFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getXStructuralFeature_Unsettable(), ecorePackage.getEBoolean(), "unsettable", null, 1, 1, XStructuralFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getXStructuralFeature_Derived(), ecorePackage.getEBoolean(), "derived", null, 1, 1, XStructuralFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getXStructuralFeature_GetBody(), theXbasePackage.getXBlockExpression(), null, "getBody", null, 0, 1, XStructuralFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getXStructuralFeature_SetBody(), theXbasePackage.getXBlockExpression(), null, "setBody", null, 0, 1, XStructuralFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getXStructuralFeature_IsSetBody(), theXbasePackage.getXBlockExpression(), null, "isSetBody", null, 0, 1, XStructuralFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getXStructuralFeature_UnsetBody(), theXbasePackage.getXBlockExpression(), null, "unsetBody", null, 0, 1, XStructuralFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(xTypedElementEClass, XTypedElement.class, "XTypedElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getXTypedElement_Unordered(), ecorePackage.getEBoolean(), "unordered", null, 1, 1, XTypedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getXTypedElement_Unique(), ecorePackage.getEBoolean(), "unique", null, 1, 1, XTypedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getXTypedElement_Type(), this.getXGenericType(), null, "type", null, 0, 1, XTypedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(xTypeParameterEClass, XTypeParameter.class, "XTypeParameter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getXTypeParameter_Bounds(), this.getXGenericType(), null, "bounds", null, 0, -1, XTypeParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/OCL/Import
		createImportAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/OCL/Import</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createImportAnnotations() {
		String source = "http://www.eclipse.org/OCL/Import";	
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "ecore", "http://www.eclipse.org/emf/2002/Ecore",
			 "types", "../../org.eclipse.xtext.common.types/model/JavaVMTypes.ecore#/",
			 "xbase", "../../org.eclipse.xtext.xbase/model/Xbase.ecore#/"
		   });
	}

} //LcorePackageImpl
