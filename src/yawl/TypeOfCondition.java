/**
 */
package yawl;

import org.pnml.tools.epnk.pnmlcoremodel.Attribute;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Of Condition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link yawl.TypeOfCondition#getText <em>Text</em>}</li>
 * </ul>
 *
 * @see yawl.YawlPackage#getTypeOfCondition()
 * @model
 * @generated
 */
public interface TypeOfCondition extends Attribute {
	/**
	 * Returns the value of the '<em><b>Text</b></em>' attribute.
	 * The literals are from the enumeration {@link yawl.TypeOfC}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Text</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Text</em>' attribute.
	 * @see yawl.TypeOfC
	 * @see #setText(TypeOfC)
	 * @see yawl.YawlPackage#getTypeOfCondition_Text()
	 * @model required="true"
	 * @generated
	 */
	TypeOfC getText();

	/**
	 * Sets the value of the '{@link yawl.TypeOfCondition#getText <em>Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text</em>' attribute.
	 * @see yawl.TypeOfC
	 * @see #getText()
	 * @generated
	 */
	void setText(TypeOfC value);

} // TypeOfCondition
