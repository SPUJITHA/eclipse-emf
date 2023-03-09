/**
 */
package gendev.hw1;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>UPI Payment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gendev.hw1.UPIPayment#getUpiNumber <em>Upi Number</em>}</li>
 * </ul>
 *
 * @see gendev.hw1.Hw1Package#getUPIPayment()
 * @model
 * @generated
 */
public interface UPIPayment extends Payment {
	/**
	 * Returns the value of the '<em><b>Upi Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Upi Number</em>' attribute.
	 * @see #setUpiNumber(String)
	 * @see gendev.hw1.Hw1Package#getUPIPayment_UpiNumber()
	 * @model
	 * @generated
	 */
	String getUpiNumber();

	/**
	 * Sets the value of the '{@link gendev.hw1.UPIPayment#getUpiNumber <em>Upi Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Upi Number</em>' attribute.
	 * @see #getUpiNumber()
	 * @generated
	 */
	void setUpiNumber(String value);

} // UPIPayment
