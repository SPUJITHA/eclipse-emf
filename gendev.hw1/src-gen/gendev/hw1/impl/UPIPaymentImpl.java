/**
 */
package gendev.hw1.impl;

import gendev.hw1.Hw1Package;
import gendev.hw1.UPIPayment;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>UPI Payment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gendev.hw1.impl.UPIPaymentImpl#getUpiNumber <em>Upi Number</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UPIPaymentImpl extends PaymentImpl implements UPIPayment {
	/**
	 * The default value of the '{@link #getUpiNumber() <em>Upi Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpiNumber()
	 * @generated
	 * @ordered
	 */
	protected static final String UPI_NUMBER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUpiNumber() <em>Upi Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpiNumber()
	 * @generated
	 * @ordered
	 */
	protected String upiNumber = UPI_NUMBER_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UPIPaymentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Hw1Package.Literals.UPI_PAYMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUpiNumber() {
		return upiNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUpiNumber(String newUpiNumber) {
		String oldUpiNumber = upiNumber;
		upiNumber = newUpiNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Hw1Package.UPI_PAYMENT__UPI_NUMBER, oldUpiNumber,
					upiNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case Hw1Package.UPI_PAYMENT__UPI_NUMBER:
			return getUpiNumber();
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
		case Hw1Package.UPI_PAYMENT__UPI_NUMBER:
			setUpiNumber((String) newValue);
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
		case Hw1Package.UPI_PAYMENT__UPI_NUMBER:
			setUpiNumber(UPI_NUMBER_EDEFAULT);
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
		case Hw1Package.UPI_PAYMENT__UPI_NUMBER:
			return UPI_NUMBER_EDEFAULT == null ? upiNumber != null : !UPI_NUMBER_EDEFAULT.equals(upiNumber);
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
		result.append(" (upiNumber: ");
		result.append(upiNumber);
		result.append(')');
		return result.toString();
	}

} //UPIPaymentImpl
