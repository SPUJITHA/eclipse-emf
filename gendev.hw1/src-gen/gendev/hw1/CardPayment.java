/**
 */
package gendev.hw1;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Card Payment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gendev.hw1.CardPayment#getCardType <em>Card Type</em>}</li>
 *   <li>{@link gendev.hw1.CardPayment#getCardNumber <em>Card Number</em>}</li>
 * </ul>
 *
 * @see gendev.hw1.Hw1Package#getCardPayment()
 * @model
 * @generated
 */
public interface CardPayment extends Payment {
	/**
	 * Returns the value of the '<em><b>Card Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Card Type</em>' attribute.
	 * @see #setCardType(String)
	 * @see gendev.hw1.Hw1Package#getCardPayment_CardType()
	 * @model
	 * @generated
	 */
	String getCardType();

	/**
	 * Sets the value of the '{@link gendev.hw1.CardPayment#getCardType <em>Card Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Card Type</em>' attribute.
	 * @see #getCardType()
	 * @generated
	 */
	void setCardType(String value);

	/**
	 * Returns the value of the '<em><b>Card Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Card Number</em>' attribute.
	 * @see #setCardNumber(long)
	 * @see gendev.hw1.Hw1Package#getCardPayment_CardNumber()
	 * @model required="true"
	 * @generated
	 */
	long getCardNumber();

	/**
	 * Sets the value of the '{@link gendev.hw1.CardPayment#getCardNumber <em>Card Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Card Number</em>' attribute.
	 * @see #getCardNumber()
	 * @generated
	 */
	void setCardNumber(long value);

} // CardPayment
