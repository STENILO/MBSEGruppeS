/**
 */
package yawl.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import yawl.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class YawlFactoryImpl extends EFactoryImpl implements YawlFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static YawlFactory init() {
		try {
			YawlFactory theYawlFactory = (YawlFactory)EPackage.Registry.INSTANCE.getEFactory(YawlPackage.eNS_URI);
			if (theYawlFactory != null) {
				return theYawlFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new YawlFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public YawlFactoryImpl() {
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
			case YawlPackage.YAWL_NET: return createYAWLNet();
			case YawlPackage.PLACE: return createPlace();
			case YawlPackage.TRANSITION: return createTransition();
			case YawlPackage.TYPE_OF_CONDITION: return createTypeOfCondition();
			case YawlPackage.TYPE_OF_TRANSITION: return createTypeOfTransition();
			case YawlPackage.ARC: return createArc();
			case YawlPackage.TYPE_OF_ARC: return createTypeOfArc();
			case YawlPackage.YAWL_NET_ARC_ANNOTATION: return createYawlNetArcAnnotation();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case YawlPackage.TYPE_OF_C:
				return createTypeOfCFromString(eDataType, initialValue);
			case YawlPackage.TYPE_OF_T:
				return createTypeOfTFromString(eDataType, initialValue);
			case YawlPackage.TYPE_OF_A:
				return createTypeOfAFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case YawlPackage.TYPE_OF_C:
				return convertTypeOfCToString(eDataType, instanceValue);
			case YawlPackage.TYPE_OF_T:
				return convertTypeOfTToString(eDataType, instanceValue);
			case YawlPackage.TYPE_OF_A:
				return convertTypeOfAToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public YAWLNet createYAWLNet() {
		YAWLNetImpl yawlNet = new YAWLNetImpl();
		return yawlNet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Place createPlace() {
		PlaceImpl place = new PlaceImpl();
		return place;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Transition createTransition() {
		TransitionImpl transition = new TransitionImpl();
		return transition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeOfCondition createTypeOfCondition() {
		TypeOfConditionImpl typeOfCondition = new TypeOfConditionImpl();
		return typeOfCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeOfTransition createTypeOfTransition() {
		TypeOfTransitionImpl typeOfTransition = new TypeOfTransitionImpl();
		return typeOfTransition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Arc createArc() {
		ArcImpl arc = new ArcImpl();
		return arc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeOfArc createTypeOfArc() {
		TypeOfArcImpl typeOfArc = new TypeOfArcImpl();
		return typeOfArc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public YawlNetArcAnnotation createYawlNetArcAnnotation() {
		YawlNetArcAnnotationImpl yawlNetArcAnnotation = new YawlNetArcAnnotationImpl();
		return yawlNetArcAnnotation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeOfC createTypeOfCFromString(EDataType eDataType, String initialValue) {
		TypeOfC result = TypeOfC.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTypeOfCToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeOfT createTypeOfTFromString(EDataType eDataType, String initialValue) {
		TypeOfT result = TypeOfT.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTypeOfTToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeOfA createTypeOfAFromString(EDataType eDataType, String initialValue) {
		TypeOfA result = TypeOfA.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTypeOfAToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public YawlPackage getYawlPackage() {
		return (YawlPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static YawlPackage getPackage() {
		return YawlPackage.eINSTANCE;
	}

} //YawlFactoryImpl
