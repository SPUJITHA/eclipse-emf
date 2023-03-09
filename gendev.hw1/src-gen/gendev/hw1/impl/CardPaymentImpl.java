/**
 */
package gendev.hw1.impl;

import gendev.hw1.CardPayment;
import gendev.hw1.Hw1Package;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Card Payment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gendev.hw1.impl.CardPaymentImpl#getCardType <em>Card Type</em>}</li>
 *   <li>{@link gendev.hw1.impl.CardPaymentImpl#getCardNumber <em>Card Number</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CardPaymentImpl extends PaymentImpl implements CardPayment {
	/**
	 * The default value of the '{@link #getCardType() <em>Card Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCardType()
	 * @generated
	 * @ordered
	 */
	protected static final String CARD_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCardType() <em>Card Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCardType()
	 * @generated
	 * @ordered
	 */
	protected String cardType = CARD_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getCardNumber() <em>Card Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCardNumber()
	 * @generated
	 * @ordered
	 */
	protected static final long CARD_NUMBER_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getCardNumber() <em>Card Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCardNumber()
	 * @generated
	 * @ordered
	 */
	protected long cardNumber = CARD_NUMBER_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CardPaymentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Hw1Package.Literals.CARD_PAYMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCardType() {
		return cardType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCardType(String newCardType) {
		String oldCardType = cardType;
		cardType = newCardType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Hw1Package.CARD_PAYMENT__CARD_TYPE, oldCardType,
					cardType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getCardNumber() {
		return cardNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCardNumber(long newCardNumber) {
		long oldCardNumber = cardNumber;
		cardNumber = newCardNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Hw1Package.CARD_PAYMENT__CARD_NUMBER, oldCardNumber,
					cardNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case Hw1Package.CARD_PAYMENT__CARD_TYPE:
			return getCardType();
		case Hw1Package.CARD_PAYMENT__CARD_NUMBER:
			return getCardNumber();
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
		case Hw1Package.CARD_PAYMENT__CARD_TYPE:
			setCardType((String) newValue);
			return;
		case Hw1Package.CARD_PAYMENT__CARD_NUMBER:
			setCardNumber((Long) newValue);
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
		case Hw1Package.CARD_PAYMENT__CARD_TYPE:
			setCardType(CARD_TYPE_EDEFAULT);
			return;
		case Hw1Package.CARD_PAYMENT__CARD_NUMBER:
			setCardNumber(CARD_NUMBER_EDEFAULT);
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
		case Hw1Package.CARD_PAYMENT__CARD_TYPE:
			return CARD_TYPE_EDEFAULT == null ? cardType != null : !CARD_TYPE_EDEFAULT.equals(cardType);
		case Hw1Package.CARD_PAYMENT__CARD_NUMBER:
			return cardNumber != CARD_NUMBER_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (cardType: ");
		result.append(cardType);
		result.append(", cardNumber: ");
		result.append(cardNumber);
		result.append(')');
		return result.toString();
	}

} //CardPaymentImpl
