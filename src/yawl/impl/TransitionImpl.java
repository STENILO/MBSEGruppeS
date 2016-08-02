/**
 */
package yawl.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import yawl.Transition;
import yawl.TypeOfTransition;
import yawl.YawlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Transition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link yawl.impl.TransitionImpl#getTypeOfJoin <em>Type Of Join</em>}</li>
 *   <li>{@link yawl.impl.TransitionImpl#getTypeOfSplit <em>Type Of Split</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TransitionImpl extends org.pnml.tools.epnk.pnmlcoremodel.impl.TransitionImpl implements Transition {
	/**
	 * The cached value of the '{@link #getTypeOfJoin() <em>Type Of Join</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeOfJoin()
	 * @generated
	 * @ordered
	 */
	protected TypeOfTransition typeOfJoin;

	/**
	 * The cached value of the '{@link #getTypeOfSplit() <em>Type Of Split</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeOfSplit()
	 * @generated
	 * @ordered
	 */
	protected TypeOfTransition typeOfSplit;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TransitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return YawlPackage.Literals.TRANSITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeOfTransition getTypeOfJoin() {
		return typeOfJoin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTypeOfJoin(TypeOfTransition newTypeOfJoin, NotificationChain msgs) {
		TypeOfTransition oldTypeOfJoin = typeOfJoin;
		typeOfJoin = newTypeOfJoin;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, YawlPackage.TRANSITION__TYPE_OF_JOIN, oldTypeOfJoin, newTypeOfJoin);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTypeOfJoin(TypeOfTransition newTypeOfJoin) {
		if (newTypeOfJoin != typeOfJoin) {
			NotificationChain msgs = null;
			if (typeOfJoin != null)
				msgs = ((InternalEObject)typeOfJoin).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - YawlPackage.TRANSITION__TYPE_OF_JOIN, null, msgs);
			if (newTypeOfJoin != null)
				msgs = ((InternalEObject)newTypeOfJoin).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - YawlPackage.TRANSITION__TYPE_OF_JOIN, null, msgs);
			msgs = basicSetTypeOfJoin(newTypeOfJoin, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, YawlPackage.TRANSITION__TYPE_OF_JOIN, newTypeOfJoin, newTypeOfJoin));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeOfTransition getTypeOfSplit() {
		return typeOfSplit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTypeOfSplit(TypeOfTransition newTypeOfSplit, NotificationChain msgs) {
		TypeOfTransition oldTypeOfSplit = typeOfSplit;
		typeOfSplit = newTypeOfSplit;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, YawlPackage.TRANSITION__TYPE_OF_SPLIT, oldTypeOfSplit, newTypeOfSplit);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTypeOfSplit(TypeOfTransition newTypeOfSplit) {
		if (newTypeOfSplit != typeOfSplit) {
			NotificationChain msgs = null;
			if (typeOfSplit != null)
				msgs = ((InternalEObject)typeOfSplit).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - YawlPackage.TRANSITION__TYPE_OF_SPLIT, null, msgs);
			if (newTypeOfSplit != null)
				msgs = ((InternalEObject)newTypeOfSplit).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - YawlPackage.TRANSITION__TYPE_OF_SPLIT, null, msgs);
			msgs = basicSetTypeOfSplit(newTypeOfSplit, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, YawlPackage.TRANSITION__TYPE_OF_SPLIT, newTypeOfSplit, newTypeOfSplit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case YawlPackage.TRANSITION__TYPE_OF_JOIN:
				return basicSetTypeOfJoin(null, msgs);
			case YawlPackage.TRANSITION__TYPE_OF_SPLIT:
				return basicSetTypeOfSplit(null, msgs);
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
			case YawlPackage.TRANSITION__TYPE_OF_JOIN:
				return getTypeOfJoin();
			case YawlPackage.TRANSITION__TYPE_OF_SPLIT:
				return getTypeOfSplit();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case YawlPackage.TRANSITION__TYPE_OF_JOIN:
				setTypeOfJoin((TypeOfTransition)newValue);
				return;
			case YawlPackage.TRANSITION__TYPE_OF_SPLIT:
				setTypeOfSplit((TypeOfTransition)newValue);
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
			case YawlPackage.TRANSITION__TYPE_OF_JOIN:
				setTypeOfJoin((TypeOfTransition)null);
				return;
			case YawlPackage.TRANSITION__TYPE_OF_SPLIT:
				setTypeOfSplit((TypeOfTransition)null);
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
			case YawlPackage.TRANSITION__TYPE_OF_JOIN:
				return typeOfJoin != null;
			case YawlPackage.TRANSITION__TYPE_OF_SPLIT:
				return typeOfSplit != null;
		}
		return super.eIsSet(featureID);
	}

} //TransitionImpl
