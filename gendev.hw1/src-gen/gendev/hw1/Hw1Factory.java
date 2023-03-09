/**
 */
package gendev.hw1;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see gendev.hw1.Hw1Package
 * @generated
 */
public interface Hw1Factory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Hw1Factory eINSTANCE = gendev.hw1.impl.Hw1FactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Online User</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Online User</em>'.
	 * @generated
	 */
	OnlineUser createOnlineUser();

	/**
	 * Returns a new object of class '<em>Restaurant</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Restaurant</em>'.
	 * @generated
	 */
	Restaurant createRestaurant();

	/**
	 * Returns a new object of class '<em>Continental Cuisine</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Continental Cuisine</em>'.
	 * @generated
	 */
	ContinentalCuisine createContinentalCuisine();

	/**
	 * Returns a new object of class '<em>Italian Cuisine</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Italian Cuisine</em>'.
	 * @generated
	 */
	ItalianCuisine createItalianCuisine();

	/**
	 * Returns a new object of class '<em>Order</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Order</em>'.
	 * @generated
	 */
	Order createOrder();

	/**
	 * Returns a new object of class '<em>Payment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Payment</em>'.
	 * @generated
	 */
	Payment createPayment();

	/**
	 * Returns a new object of class '<em>Card Payment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Card Payment</em>'.
	 * @generated
	 */
	CardPayment createCardPayment();

	/**
	 * Returns a new object of class '<em>UPI Payment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>UPI Payment</em>'.
	 * @generated
	 */
	UPIPayment createUPIPayment();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	Hw1Package getHw1Package();

} //Hw1Factory
