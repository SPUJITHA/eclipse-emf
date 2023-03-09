/**
 */
package gendev.hw1.util;

import gendev.hw1.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see gendev.hw1.Hw1Package
 * @generated
 */
public class Hw1Switch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static Hw1Package modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Hw1Switch() {
		if (modelPackage == null) {
			modelPackage = Hw1Package.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
		case Hw1Package.ONLINE_USER: {
			OnlineUser onlineUser = (OnlineUser) theEObject;
			T result = caseOnlineUser(onlineUser);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Hw1Package.RESTAURANT: {
			Restaurant restaurant = (Restaurant) theEObject;
			T result = caseRestaurant(restaurant);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Hw1Package.FOOD_ITEM: {
			FoodItem foodItem = (FoodItem) theEObject;
			T result = caseFoodItem(foodItem);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Hw1Package.CONTINENTAL_CUISINE: {
			ContinentalCuisine continentalCuisine = (ContinentalCuisine) theEObject;
			T result = caseContinentalCuisine(continentalCuisine);
			if (result == null)
				result = caseFoodItem(continentalCuisine);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Hw1Package.ITALIAN_CUISINE: {
			ItalianCuisine italianCuisine = (ItalianCuisine) theEObject;
			T result = caseItalianCuisine(italianCuisine);
			if (result == null)
				result = caseFoodItem(italianCuisine);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Hw1Package.ORDER: {
			Order order = (Order) theEObject;
			T result = caseOrder(order);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Hw1Package.PAYMENT: {
			Payment payment = (Payment) theEObject;
			T result = casePayment(payment);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Hw1Package.CARD_PAYMENT: {
			CardPayment cardPayment = (CardPayment) theEObject;
			T result = caseCardPayment(cardPayment);
			if (result == null)
				result = casePayment(cardPayment);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Hw1Package.UPI_PAYMENT: {
			UPIPayment upiPayment = (UPIPayment) theEObject;
			T result = caseUPIPayment(upiPayment);
			if (result == null)
				result = casePayment(upiPayment);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		default:
			return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Online User</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Online User</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOnlineUser(OnlineUser object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Restaurant</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Restaurant</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRestaurant(Restaurant object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Food Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Food Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFoodItem(FoodItem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Continental Cuisine</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Continental Cuisine</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContinentalCuisine(ContinentalCuisine object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Italian Cuisine</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Italian Cuisine</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseItalianCuisine(ItalianCuisine object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Order</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Order</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOrder(Order object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Payment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Payment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePayment(Payment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Card Payment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Card Payment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCardPayment(CardPayment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>UPI Payment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>UPI Payment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUPIPayment(UPIPayment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //Hw1Switch
