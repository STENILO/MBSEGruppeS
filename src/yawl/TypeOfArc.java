/**
 */
package yawl;

import org.pnml.tools.epnk.pnmlcoremodel.Attribute;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Of Arc</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link yawl.TypeOfArc#getText <em>Text</em>}</li>
 * </ul>
 *
 * @see yawl.YawlPackage#getTypeOfArc()
 * @model
 * @generated
 */
public interface TypeOfArc extends Attribute {
	/**
	 * Returns the value of the '<em><b>Text</b></em>' attribute.
	 * The literals are from the enumeration {@link yawl.TypeOfA}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Text</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Text</em>' attribute.
	 * @see yawl.TypeOfA
	 * @see #setText(TypeOfA)
	 * @see yawl.YawlPackage#getTypeOfArc_Text()
	 * @model required="true"
	 * @generated
	 */
	TypeOfA getText();

	/**
	 * Sets the value of the '{@link yawl.TypeOfArc#getText <em>Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text</em>' attribute.
	 * @see yawl.TypeOfA
	 * @see #getText()
	 * @generated
	 */
	void setText(TypeOfA value);

} // TypeOfArc
