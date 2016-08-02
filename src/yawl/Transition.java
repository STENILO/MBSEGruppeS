/**
 */
package yawl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link yawl.Transition#getTypeOfJoin <em>Type Of Join</em>}</li>
 *   <li>{@link yawl.Transition#getTypeOfSplit <em>Type Of Split</em>}</li>
 * </ul>
 *
 * @see yawl.YawlPackage#getTransition()
 * @model
 * @generated
 */
public interface Transition extends org.pnml.tools.epnk.pnmlcoremodel.Transition {
	/**
	 * Returns the value of the '<em><b>Type Of Join</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type Of Join</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Of Join</em>' containment reference.
	 * @see #setTypeOfJoin(TypeOfTransition)
	 * @see yawl.YawlPackage#getTransition_TypeOfJoin()
	 * @model containment="true"
	 * @generated
	 */
	TypeOfTransition getTypeOfJoin();

	/**
	 * Sets the value of the '{@link yawl.Transition#getTypeOfJoin <em>Type Of Join</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type Of Join</em>' containment reference.
	 * @see #getTypeOfJoin()
	 * @generated
	 */
	void setTypeOfJoin(TypeOfTransition value);

	/**
	 * Returns the value of the '<em><b>Type Of Split</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type Of Split</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Of Split</em>' containment reference.
	 * @see #setTypeOfSplit(TypeOfTransition)
	 * @see yawl.YawlPackage#getTransition_TypeOfSplit()
	 * @model containment="true"
	 * @generated
	 */
	TypeOfTransition getTypeOfSplit();

	/**
	 * Sets the value of the '{@link yawl.Transition#getTypeOfSplit <em>Type Of Split</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type Of Split</em>' containment reference.
	 * @see #getTypeOfSplit()
	 * @generated
	 */
	void setTypeOfSplit(TypeOfTransition value);

} // Transition
