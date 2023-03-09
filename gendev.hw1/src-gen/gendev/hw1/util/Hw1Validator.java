/**
 */
package gendev.hw1.util;

import gendev.hw1.*;

import java.util.Calendar;
import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see gendev.hw1.Hw1Package
 * @generated
 */
public class Hw1Validator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final Hw1Validator INSTANCE = new Hw1Validator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "gendev.hw1";

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Inv2 Food Item Check' of 'Online User'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ONLINE_USER__INV2_FOOD_ITEM_CHECK = 1;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Inv3 Price Check' of 'Order'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ORDER__INV3_PRICE_CHECK = 2;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Payment Check' of 'Payment'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PAYMENT__PAYMENT_CHECK = 3;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 3;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Hw1Validator() {
		super();
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
		return Hw1Package.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		switch (classifierID) {
		case Hw1Package.ONLINE_USER:
			return validateOnlineUser((OnlineUser) value, diagnostics, context);
		case Hw1Package.RESTAURANT:
			return validateRestaurant((Restaurant) value, diagnostics, context);
		case Hw1Package.FOOD_ITEM:
			return validateFoodItem((FoodItem) value, diagnostics, context);
		case Hw1Package.CONTINENTAL_CUISINE:
			return validateContinentalCuisine((ContinentalCuisine) value, diagnostics, context);
		case Hw1Package.ITALIAN_CUISINE:
			return validateItalianCuisine((ItalianCuisine) value, diagnostics, context);
		case Hw1Package.ORDER:
			return validateOrder((Order) value, diagnostics, context);
		case Hw1Package.PAYMENT:
			return validatePayment((Payment) value, diagnostics, context);
		case Hw1Package.CARD_PAYMENT:
			return validateCardPayment((CardPayment) value, diagnostics, context);
		case Hw1Package.UPI_PAYMENT:
			return validateUPIPayment((UPIPayment) value, diagnostics, context);
		case Hw1Package.CALENDAR:
			return validateCalendar((Calendar) value, diagnostics, context);
		default:
			return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOnlineUser(OnlineUser onlineUser, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(onlineUser, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(onlineUser, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(onlineUser, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(onlineUser, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(onlineUser, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(onlineUser, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(onlineUser, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(onlineUser, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(onlineUser, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateOnlineUser_inv2FoodItemCheck(onlineUser, diagnostics, context);
		return result;
	}

	/**
	 * Validates the inv2FoodItemCheck constraint of '<em>Online User</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOnlineUser_inv2FoodItemCheck(OnlineUser onlineUser, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return onlineUser.inv2FoodItemCheck(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRestaurant(Restaurant restaurant, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(restaurant, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFoodItem(FoodItem foodItem, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(foodItem, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContinentalCuisine(ContinentalCuisine continentalCuisine, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(continentalCuisine, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateItalianCuisine(ItalianCuisine italianCuisine, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(italianCuisine, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOrder(Order order, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(order, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(order, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(order, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(order, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(order, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(order, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(order, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(order, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(order, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateOrder_inv3PriceCheck(order, diagnostics, context);
		return result;
	}

	/**
	 * Validates the inv3PriceCheck constraint of '<em>Order</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOrder_inv3PriceCheck(Order order, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return order.inv3PriceCheck(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePayment(Payment payment, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(payment, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(payment, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(payment, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(payment, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(payment, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(payment, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(payment, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(payment, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(payment, diagnostics, context);
		if (result || diagnostics != null)
			result &= validatePayment_PaymentCheck(payment, diagnostics, context);
		return result;
	}

	/**
	 * Validates the PaymentCheck constraint of '<em>Payment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePayment_PaymentCheck(Payment payment, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return payment.PaymentCheck(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCardPayment(CardPayment cardPayment, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (!validate_NoCircularContainment(cardPayment, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(cardPayment, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(cardPayment, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(cardPayment, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(cardPayment, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(cardPayment, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(cardPayment, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(cardPayment, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(cardPayment, diagnostics, context);
		if (result || diagnostics != null)
			result &= validatePayment_PaymentCheck(cardPayment, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUPIPayment(UPIPayment upiPayment, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(upiPayment, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(upiPayment, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(upiPayment, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(upiPayment, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(upiPayment, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(upiPayment, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(upiPayment, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(upiPayment, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(upiPayment, diagnostics, context);
		if (result || diagnostics != null)
			result &= validatePayment_PaymentCheck(upiPayment, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCalendar(Calendar calendar, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //Hw1Validator
