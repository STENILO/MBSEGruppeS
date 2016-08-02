/**
 */
package yawl;

import org.pnml.tools.epnk.datatypes.pnmldatatypes.PositiveInteger;

import org.pnml.tools.epnk.pnmlcoremodel.Label;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Net Arc Annotation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link yawl.YawlNetArcAnnotation#getText <em>Text</em>}</li>
 * </ul>
 *
 * @see yawl.YawlPackage#getYawlNetArcAnnotation()
 * @model
 * @generated
 */
public interface YawlNetArcAnnotation extends Label {
	/**
	 * Returns the value of the '<em><b>Text</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Text</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Text</em>' attribute.
	 * @see #setText(PositiveInteger)
	 * @see yawl.YawlPackage#getYawlNetArcAnnotation_Text()
	 * @model default="1" dataType="org.pnml.tools.epnk.datatypes.pnmldatatypes.PositiveInteger" required="true"
	 * @generated
	 */
	PositiveInteger getText();

	/**
	 * Sets the value of the '{@link yawl.YawlNetArcAnnotation#getText <em>Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text</em>' attribute.
	 * @see #getText()
	 * @generated
	 */
	void setText(PositiveInteger value);

} // YawlNetArcAnnotation
