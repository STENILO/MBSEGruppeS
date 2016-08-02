/**
 */
package yawl;

import org.pnml.tools.epnk.pnmlcoremodel.Attribute;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Of Transition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link yawl.TypeOfTransition#getText <em>Text</em>}</li>
 * </ul>
 *
 * @see yawl.YawlPackage#getTypeOfTransition()
 * @model
 * @generated
 */
public interface TypeOfTransition extends Attribute {
	/**
	 * Returns the value of the '<em><b>Text</b></em>' attribute.
	 * The literals are from the enumeration {@link yawl.TypeOfT}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Text</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Text</em>' attribute.
	 * @see yawl.TypeOfT
	 * @see #setText(TypeOfT)
	 * @see yawl.YawlPackage#getTypeOfTransition_Text()
	 * @model required="true"
	 * @generated
	 */
	TypeOfT getText();

	/**
	 * Sets the value of the '{@link yawl.TypeOfTransition#getText <em>Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text</em>' attribute.
	 * @see yawl.TypeOfT
	 * @see #getText()
	 * @generated
	 */
	void setText(TypeOfT value);

} // TypeOfTransition
