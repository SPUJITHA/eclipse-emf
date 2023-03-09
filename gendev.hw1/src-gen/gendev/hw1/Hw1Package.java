/**
 */
package gendev.hw1;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see gendev.hw1.Hw1Factory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore"
 * @generated
 */
public interface Hw1Package extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "hw1";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/hw1";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "hw1";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Hw1Package eINSTANCE = gendev.hw1.impl.Hw1PackageImpl.init();

	/**
	 * The meta object id for the '{@link gendev.hw1.impl.OnlineUserImpl <em>Online User</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gendev.hw1.impl.OnlineUserImpl
	 * @see gendev.hw1.impl.Hw1PackageImpl#getOnlineUser()
	 * @generated
	 */
	int ONLINE_USER = 0;

	/**
	 * The feature id for the '<em><b>User Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONLINE_USER__USER_ID = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONLINE_USER__NAME = 1;

	/**
	 * The feature id for the '<em><b>Email</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONLINE_USER__EMAIL = 2;

	/**
	 * The feature id for the '<em><b>Places</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONLINE_USER__PLACES = 3;

	/**
	 * The feature id for the '<em><b>Adds</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONLINE_USER__ADDS = 4;

	/**
	 * The number of structural features of the '<em>Online User</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONLINE_USER_FEATURE_COUNT = 5;

	/**
	 * The operation id for the '<em>Sign Up</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONLINE_USER___SIGN_UP__STRING_STRING = 0;

	/**
	 * The operation id for the '<em>Search Items</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONLINE_USER___SEARCH_ITEMS = 1;

	/**
	 * The operation id for the '<em>Add Items To Cart</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONLINE_USER___ADD_ITEMS_TO_CART__FOODITEM = 2;

	/**
	 * The operation id for the '<em>Place Order</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONLINE_USER___PLACE_ORDER = 3;

	/**
	 * The operation id for the '<em>Inv2 Food Item Check</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONLINE_USER___INV2_FOOD_ITEM_CHECK__DIAGNOSTICCHAIN_MAP = 4;

	/**
	 * The number of operations of the '<em>Online User</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONLINE_USER_OPERATION_COUNT = 5;

	/**
	 * The meta object id for the '{@link gendev.hw1.impl.RestaurantImpl <em>Restaurant</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gendev.hw1.impl.RestaurantImpl
	 * @see gendev.hw1.impl.Hw1PackageImpl#getRestaurant()
	 * @generated
	 */
	int RESTAURANT = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESTAURANT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESTAURANT__LOCATION = 1;

	/**
	 * The feature id for the '<em><b>Order Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESTAURANT__ORDER_ID = 2;

	/**
	 * The number of structural features of the '<em>Restaurant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESTAURANT_FEATURE_COUNT = 3;

	/**
	 * The operation id for the '<em>Receive Order</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESTAURANT___RECEIVE_ORDER__STRING = 0;

	/**
	 * The operation id for the '<em>Pack Items</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESTAURANT___PACK_ITEMS__STRING = 1;

	/**
	 * The number of operations of the '<em>Restaurant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESTAURANT_OPERATION_COUNT = 2;

	/**
	 * The meta object id for the '{@link gendev.hw1.impl.FoodItemImpl <em>Food Item</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gendev.hw1.impl.FoodItemImpl
	 * @see gendev.hw1.impl.Hw1PackageImpl#getFoodItem()
	 * @generated
	 */
	int FOOD_ITEM = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOOD_ITEM__NAME = 0;

	/**
	 * The feature id for the '<em><b>Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOOD_ITEM__PRICE = 1;

	/**
	 * The number of structural features of the '<em>Food Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOOD_ITEM_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Food Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOOD_ITEM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gendev.hw1.impl.ContinentalCuisineImpl <em>Continental Cuisine</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gendev.hw1.impl.ContinentalCuisineImpl
	 * @see gendev.hw1.impl.Hw1PackageImpl#getContinentalCuisine()
	 * @generated
	 */
	int CONTINENTAL_CUISINE = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTINENTAL_CUISINE__NAME = FOOD_ITEM__NAME;

	/**
	 * The feature id for the '<em><b>Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTINENTAL_CUISINE__PRICE = FOOD_ITEM__PRICE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTINENTAL_CUISINE__DESCRIPTION = FOOD_ITEM_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Continental Cuisine</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTINENTAL_CUISINE_FEATURE_COUNT = FOOD_ITEM_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Continental Cuisine</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTINENTAL_CUISINE_OPERATION_COUNT = FOOD_ITEM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gendev.hw1.impl.ItalianCuisineImpl <em>Italian Cuisine</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gendev.hw1.impl.ItalianCuisineImpl
	 * @see gendev.hw1.impl.Hw1PackageImpl#getItalianCuisine()
	 * @generated
	 */
	int ITALIAN_CUISINE = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITALIAN_CUISINE__NAME = FOOD_ITEM__NAME;

	/**
	 * The feature id for the '<em><b>Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITALIAN_CUISINE__PRICE = FOOD_ITEM__PRICE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITALIAN_CUISINE__DESCRIPTION = FOOD_ITEM_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Italian Cuisine</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITALIAN_CUISINE_FEATURE_COUNT = FOOD_ITEM_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Italian Cuisine</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITALIAN_CUISINE_OPERATION_COUNT = FOOD_ITEM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gendev.hw1.impl.OrderImpl <em>Order</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gendev.hw1.impl.OrderImpl
	 * @see gendev.hw1.impl.Hw1PackageImpl#getOrder()
	 * @generated
	 */
	int ORDER = 5;

	/**
	 * The feature id for the '<em><b>Order Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER__ORDER_ID = 0;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER__STATUS = 1;

	/**
	 * The feature id for the '<em><b>Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER__DATE = 2;

	/**
	 * The feature id for the '<em><b>Pay</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER__PAY = 3;

	/**
	 * The feature id for the '<em><b>Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER__PRICE = 4;

	/**
	 * The feature id for the '<em><b>Receives</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER__RECEIVES = 5;

	/**
	 * The feature id for the '<em><b>User Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER__USER_ID = 6;

	/**
	 * The number of structural features of the '<em>Order</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_FEATURE_COUNT = 7;

	/**
	 * The operation id for the '<em>Fetch Order Details</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER___FETCH_ORDER_DETAILS__STRING = 0;

	/**
	 * The operation id for the '<em>Inv3 Price Check</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER___INV3_PRICE_CHECK__DIAGNOSTICCHAIN_MAP = 1;

	/**
	 * The number of operations of the '<em>Order</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_OPERATION_COUNT = 2;

	/**
	 * The meta object id for the '{@link gendev.hw1.impl.PaymentImpl <em>Payment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gendev.hw1.impl.PaymentImpl
	 * @see gendev.hw1.impl.Hw1PackageImpl#getPayment()
	 * @generated
	 */
	int PAYMENT = 6;

	/**
	 * The feature id for the '<em><b>Order Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT__ORDER_ID = 0;

	/**
	 * The feature id for the '<em><b>Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT__DATE = 1;

	/**
	 * The feature id for the '<em><b>Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT__PRICE = 2;

	/**
	 * The number of structural features of the '<em>Payment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_FEATURE_COUNT = 3;

	/**
	 * The operation id for the '<em>Perform Payment</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT___PERFORM_PAYMENT = 0;

	/**
	 * The operation id for the '<em>Payment Check</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT___PAYMENT_CHECK__DIAGNOSTICCHAIN_MAP = 1;

	/**
	 * The number of operations of the '<em>Payment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_OPERATION_COUNT = 2;

	/**
	 * The meta object id for the '{@link gendev.hw1.impl.CardPaymentImpl <em>Card Payment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gendev.hw1.impl.CardPaymentImpl
	 * @see gendev.hw1.impl.Hw1PackageImpl#getCardPayment()
	 * @generated
	 */
	int CARD_PAYMENT = 7;

	/**
	 * The feature id for the '<em><b>Order Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARD_PAYMENT__ORDER_ID = PAYMENT__ORDER_ID;

	/**
	 * The feature id for the '<em><b>Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARD_PAYMENT__DATE = PAYMENT__DATE;

	/**
	 * The feature id for the '<em><b>Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARD_PAYMENT__PRICE = PAYMENT__PRICE;

	/**
	 * The feature id for the '<em><b>Card Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARD_PAYMENT__CARD_TYPE = PAYMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Card Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARD_PAYMENT__CARD_NUMBER = PAYMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Card Payment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARD_PAYMENT_FEATURE_COUNT = PAYMENT_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Perform Payment</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARD_PAYMENT___PERFORM_PAYMENT = PAYMENT___PERFORM_PAYMENT;

	/**
	 * The operation id for the '<em>Payment Check</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARD_PAYMENT___PAYMENT_CHECK__DIAGNOSTICCHAIN_MAP = PAYMENT___PAYMENT_CHECK__DIAGNOSTICCHAIN_MAP;

	/**
	 * The number of operations of the '<em>Card Payment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARD_PAYMENT_OPERATION_COUNT = PAYMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gendev.hw1.impl.UPIPaymentImpl <em>UPI Payment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gendev.hw1.impl.UPIPaymentImpl
	 * @see gendev.hw1.impl.Hw1PackageImpl#getUPIPayment()
	 * @generated
	 */
	int UPI_PAYMENT = 8;

	/**
	 * The feature id for the '<em><b>Order Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPI_PAYMENT__ORDER_ID = PAYMENT__ORDER_ID;

	/**
	 * The feature id for the '<em><b>Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPI_PAYMENT__DATE = PAYMENT__DATE;

	/**
	 * The feature id for the '<em><b>Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPI_PAYMENT__PRICE = PAYMENT__PRICE;

	/**
	 * The feature id for the '<em><b>Upi Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPI_PAYMENT__UPI_NUMBER = PAYMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>UPI Payment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPI_PAYMENT_FEATURE_COUNT = PAYMENT_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Perform Payment</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPI_PAYMENT___PERFORM_PAYMENT = PAYMENT___PERFORM_PAYMENT;

	/**
	 * The operation id for the '<em>Payment Check</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPI_PAYMENT___PAYMENT_CHECK__DIAGNOSTICCHAIN_MAP = PAYMENT___PAYMENT_CHECK__DIAGNOSTICCHAIN_MAP;

	/**
	 * The number of operations of the '<em>UPI Payment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPI_PAYMENT_OPERATION_COUNT = PAYMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '<em>Calendar</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.util.Calendar
	 * @see gendev.hw1.impl.Hw1PackageImpl#getCalendar()
	 * @generated
	 */
	int CALENDAR = 9;

	/**
	 * Returns the meta object for class '{@link gendev.hw1.OnlineUser <em>Online User</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Online User</em>'.
	 * @see gendev.hw1.OnlineUser
	 * @generated
	 */
	EClass getOnlineUser();

	/**
	 * Returns the meta object for the attribute '{@link gendev.hw1.OnlineUser#getUserId <em>User Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>User Id</em>'.
	 * @see gendev.hw1.OnlineUser#getUserId()
	 * @see #getOnlineUser()
	 * @generated
	 */
	EAttribute getOnlineUser_UserId();

	/**
	 * Returns the meta object for the attribute '{@link gendev.hw1.OnlineUser#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see gendev.hw1.OnlineUser#getName()
	 * @see #getOnlineUser()
	 * @generated
	 */
	EAttribute getOnlineUser_Name();

	/**
	 * Returns the meta object for the attribute '{@link gendev.hw1.OnlineUser#getEmail <em>Email</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Email</em>'.
	 * @see gendev.hw1.OnlineUser#getEmail()
	 * @see #getOnlineUser()
	 * @generated
	 */
	EAttribute getOnlineUser_Email();

	/**
	 * Returns the meta object for the containment reference list '{@link gendev.hw1.OnlineUser#getPlaces <em>Places</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Places</em>'.
	 * @see gendev.hw1.OnlineUser#getPlaces()
	 * @see #getOnlineUser()
	 * @generated
	 */
	EReference getOnlineUser_Places();

	/**
	 * Returns the meta object for the containment reference list '{@link gendev.hw1.OnlineUser#getAdds <em>Adds</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Adds</em>'.
	 * @see gendev.hw1.OnlineUser#getAdds()
	 * @see #getOnlineUser()
	 * @generated
	 */
	EReference getOnlineUser_Adds();

	/**
	 * Returns the meta object for the '{@link gendev.hw1.OnlineUser#signUp(java.lang.String, java.lang.String) <em>Sign Up</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Sign Up</em>' operation.
	 * @see gendev.hw1.OnlineUser#signUp(java.lang.String, java.lang.String)
	 * @generated
	 */
	EOperation getOnlineUser__SignUp__String_String();

	/**
	 * Returns the meta object for the '{@link gendev.hw1.OnlineUser#searchItems() <em>Search Items</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Search Items</em>' operation.
	 * @see gendev.hw1.OnlineUser#searchItems()
	 * @generated
	 */
	EOperation getOnlineUser__SearchItems();

	/**
	 * Returns the meta object for the '{@link gendev.hw1.OnlineUser#addItemsToCart(gendev.hw1.FoodItem) <em>Add Items To Cart</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Items To Cart</em>' operation.
	 * @see gendev.hw1.OnlineUser#addItemsToCart(gendev.hw1.FoodItem)
	 * @generated
	 */
	EOperation getOnlineUser__AddItemsToCart__FoodItem();

	/**
	 * Returns the meta object for the '{@link gendev.hw1.OnlineUser#placeOrder() <em>Place Order</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Place Order</em>' operation.
	 * @see gendev.hw1.OnlineUser#placeOrder()
	 * @generated
	 */
	EOperation getOnlineUser__PlaceOrder();

	/**
	 * Returns the meta object for the '{@link gendev.hw1.OnlineUser#inv2FoodItemCheck(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Inv2 Food Item Check</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Inv2 Food Item Check</em>' operation.
	 * @see gendev.hw1.OnlineUser#inv2FoodItemCheck(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getOnlineUser__Inv2FoodItemCheck__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link gendev.hw1.Restaurant <em>Restaurant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Restaurant</em>'.
	 * @see gendev.hw1.Restaurant
	 * @generated
	 */
	EClass getRestaurant();

	/**
	 * Returns the meta object for the attribute '{@link gendev.hw1.Restaurant#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see gendev.hw1.Restaurant#getName()
	 * @see #getRestaurant()
	 * @generated
	 */
	EAttribute getRestaurant_Name();

	/**
	 * Returns the meta object for the attribute '{@link gendev.hw1.Restaurant#getLocation <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Location</em>'.
	 * @see gendev.hw1.Restaurant#getLocation()
	 * @see #getRestaurant()
	 * @generated
	 */
	EAttribute getRestaurant_Location();

	/**
	 * Returns the meta object for the attribute '{@link gendev.hw1.Restaurant#getOrderId <em>Order Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Order Id</em>'.
	 * @see gendev.hw1.Restaurant#getOrderId()
	 * @see #getRestaurant()
	 * @generated
	 */
	EAttribute getRestaurant_OrderId();

	/**
	 * Returns the meta object for the '{@link gendev.hw1.Restaurant#receiveOrder(java.lang.String) <em>Receive Order</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Receive Order</em>' operation.
	 * @see gendev.hw1.Restaurant#receiveOrder(java.lang.String)
	 * @generated
	 */
	EOperation getRestaurant__ReceiveOrder__String();

	/**
	 * Returns the meta object for the '{@link gendev.hw1.Restaurant#packItems(java.lang.String) <em>Pack Items</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Pack Items</em>' operation.
	 * @see gendev.hw1.Restaurant#packItems(java.lang.String)
	 * @generated
	 */
	EOperation getRestaurant__PackItems__String();

	/**
	 * Returns the meta object for class '{@link gendev.hw1.FoodItem <em>Food Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Food Item</em>'.
	 * @see gendev.hw1.FoodItem
	 * @generated
	 */
	EClass getFoodItem();

	/**
	 * Returns the meta object for the attribute '{@link gendev.hw1.FoodItem#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see gendev.hw1.FoodItem#getName()
	 * @see #getFoodItem()
	 * @generated
	 */
	EAttribute getFoodItem_Name();

	/**
	 * Returns the meta object for the attribute '{@link gendev.hw1.FoodItem#getPrice <em>Price</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Price</em>'.
	 * @see gendev.hw1.FoodItem#getPrice()
	 * @see #getFoodItem()
	 * @generated
	 */
	EAttribute getFoodItem_Price();

	/**
	 * Returns the meta object for class '{@link gendev.hw1.ContinentalCuisine <em>Continental Cuisine</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Continental Cuisine</em>'.
	 * @see gendev.hw1.ContinentalCuisine
	 * @generated
	 */
	EClass getContinentalCuisine();

	/**
	 * Returns the meta object for the attribute '{@link gendev.hw1.ContinentalCuisine#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see gendev.hw1.ContinentalCuisine#getDescription()
	 * @see #getContinentalCuisine()
	 * @generated
	 */
	EAttribute getContinentalCuisine_Description();

	/**
	 * Returns the meta object for class '{@link gendev.hw1.ItalianCuisine <em>Italian Cuisine</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Italian Cuisine</em>'.
	 * @see gendev.hw1.ItalianCuisine
	 * @generated
	 */
	EClass getItalianCuisine();

	/**
	 * Returns the meta object for the attribute '{@link gendev.hw1.ItalianCuisine#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see gendev.hw1.ItalianCuisine#getDescription()
	 * @see #getItalianCuisine()
	 * @generated
	 */
	EAttribute getItalianCuisine_Description();

	/**
	 * Returns the meta object for class '{@link gendev.hw1.Order <em>Order</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Order</em>'.
	 * @see gendev.hw1.Order
	 * @generated
	 */
	EClass getOrder();

	/**
	 * Returns the meta object for the attribute '{@link gendev.hw1.Order#getPrice <em>Price</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Price</em>'.
	 * @see gendev.hw1.Order#getPrice()
	 * @see #getOrder()
	 * @generated
	 */
	EAttribute getOrder_Price();

	/**
	 * Returns the meta object for the attribute '{@link gendev.hw1.Order#getOrderId <em>Order Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Order Id</em>'.
	 * @see gendev.hw1.Order#getOrderId()
	 * @see #getOrder()
	 * @generated
	 */
	EAttribute getOrder_OrderId();

	/**
	 * Returns the meta object for the attribute '{@link gendev.hw1.Order#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Status</em>'.
	 * @see gendev.hw1.Order#getStatus()
	 * @see #getOrder()
	 * @generated
	 */
	EAttribute getOrder_Status();

	/**
	 * Returns the meta object for the attribute '{@link gendev.hw1.Order#getDate <em>Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Date</em>'.
	 * @see gendev.hw1.Order#getDate()
	 * @see #getOrder()
	 * @generated
	 */
	EAttribute getOrder_Date();

	/**
	 * Returns the meta object for the containment reference list '{@link gendev.hw1.Order#getPay <em>Pay</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Pay</em>'.
	 * @see gendev.hw1.Order#getPay()
	 * @see #getOrder()
	 * @generated
	 */
	EReference getOrder_Pay();

	/**
	 * Returns the meta object for the reference '{@link gendev.hw1.Order#getReceives <em>Receives</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Receives</em>'.
	 * @see gendev.hw1.Order#getReceives()
	 * @see #getOrder()
	 * @generated
	 */
	EReference getOrder_Receives();

	/**
	 * Returns the meta object for the attribute '{@link gendev.hw1.Order#getUserId <em>User Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>User Id</em>'.
	 * @see gendev.hw1.Order#getUserId()
	 * @see #getOrder()
	 * @generated
	 */
	EAttribute getOrder_UserId();

	/**
	 * Returns the meta object for the '{@link gendev.hw1.Order#fetchOrderDetails(java.lang.String) <em>Fetch Order Details</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Fetch Order Details</em>' operation.
	 * @see gendev.hw1.Order#fetchOrderDetails(java.lang.String)
	 * @generated
	 */
	EOperation getOrder__FetchOrderDetails__String();

	/**
	 * Returns the meta object for the '{@link gendev.hw1.Order#inv3PriceCheck(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Inv3 Price Check</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Inv3 Price Check</em>' operation.
	 * @see gendev.hw1.Order#inv3PriceCheck(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getOrder__Inv3PriceCheck__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link gendev.hw1.Payment <em>Payment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Payment</em>'.
	 * @see gendev.hw1.Payment
	 * @generated
	 */
	EClass getPayment();

	/**
	 * Returns the meta object for the attribute '{@link gendev.hw1.Payment#getOrderId <em>Order Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Order Id</em>'.
	 * @see gendev.hw1.Payment#getOrderId()
	 * @see #getPayment()
	 * @generated
	 */
	EAttribute getPayment_OrderId();

	/**
	 * Returns the meta object for the attribute '{@link gendev.hw1.Payment#getDate <em>Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Date</em>'.
	 * @see gendev.hw1.Payment#getDate()
	 * @see #getPayment()
	 * @generated
	 */
	EAttribute getPayment_Date();

	/**
	 * Returns the meta object for the attribute '{@link gendev.hw1.Payment#getPrice <em>Price</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Price</em>'.
	 * @see gendev.hw1.Payment#getPrice()
	 * @see #getPayment()
	 * @generated
	 */
	EAttribute getPayment_Price();

	/**
	 * Returns the meta object for the '{@link gendev.hw1.Payment#performPayment() <em>Perform Payment</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Perform Payment</em>' operation.
	 * @see gendev.hw1.Payment#performPayment()
	 * @generated
	 */
	EOperation getPayment__PerformPayment();

	/**
	 * Returns the meta object for the '{@link gendev.hw1.Payment#PaymentCheck(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Payment Check</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Payment Check</em>' operation.
	 * @see gendev.hw1.Payment#PaymentCheck(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getPayment__PaymentCheck__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link gendev.hw1.CardPayment <em>Card Payment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Card Payment</em>'.
	 * @see gendev.hw1.CardPayment
	 * @generated
	 */
	EClass getCardPayment();

	/**
	 * Returns the meta object for the attribute '{@link gendev.hw1.CardPayment#getCardType <em>Card Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Card Type</em>'.
	 * @see gendev.hw1.CardPayment#getCardType()
	 * @see #getCardPayment()
	 * @generated
	 */
	EAttribute getCardPayment_CardType();

	/**
	 * Returns the meta object for the attribute '{@link gendev.hw1.CardPayment#getCardNumber <em>Card Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Card Number</em>'.
	 * @see gendev.hw1.CardPayment#getCardNumber()
	 * @see #getCardPayment()
	 * @generated
	 */
	EAttribute getCardPayment_CardNumber();

	/**
	 * Returns the meta object for class '{@link gendev.hw1.UPIPayment <em>UPI Payment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>UPI Payment</em>'.
	 * @see gendev.hw1.UPIPayment
	 * @generated
	 */
	EClass getUPIPayment();

	/**
	 * Returns the meta object for the attribute '{@link gendev.hw1.UPIPayment#getUpiNumber <em>Upi Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Upi Number</em>'.
	 * @see gendev.hw1.UPIPayment#getUpiNumber()
	 * @see #getUPIPayment()
	 * @generated
	 */
	EAttribute getUPIPayment_UpiNumber();

	/**
	 * Returns the meta object for data type '{@link java.util.Calendar <em>Calendar</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Calendar</em>'.
	 * @see java.util.Calendar
	 * @model instanceClass="java.util.Calendar"
	 * @generated
	 */
	EDataType getCalendar();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	Hw1Factory getHw1Factory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link gendev.hw1.impl.OnlineUserImpl <em>Online User</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gendev.hw1.impl.OnlineUserImpl
		 * @see gendev.hw1.impl.Hw1PackageImpl#getOnlineUser()
		 * @generated
		 */
		EClass ONLINE_USER = eINSTANCE.getOnlineUser();

		/**
		 * The meta object literal for the '<em><b>User Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ONLINE_USER__USER_ID = eINSTANCE.getOnlineUser_UserId();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ONLINE_USER__NAME = eINSTANCE.getOnlineUser_Name();

		/**
		 * The meta object literal for the '<em><b>Email</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ONLINE_USER__EMAIL = eINSTANCE.getOnlineUser_Email();

		/**
		 * The meta object literal for the '<em><b>Places</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ONLINE_USER__PLACES = eINSTANCE.getOnlineUser_Places();

		/**
		 * The meta object literal for the '<em><b>Adds</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ONLINE_USER__ADDS = eINSTANCE.getOnlineUser_Adds();

		/**
		 * The meta object literal for the '<em><b>Sign Up</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ONLINE_USER___SIGN_UP__STRING_STRING = eINSTANCE.getOnlineUser__SignUp__String_String();

		/**
		 * The meta object literal for the '<em><b>Search Items</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ONLINE_USER___SEARCH_ITEMS = eINSTANCE.getOnlineUser__SearchItems();

		/**
		 * The meta object literal for the '<em><b>Add Items To Cart</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ONLINE_USER___ADD_ITEMS_TO_CART__FOODITEM = eINSTANCE.getOnlineUser__AddItemsToCart__FoodItem();

		/**
		 * The meta object literal for the '<em><b>Place Order</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ONLINE_USER___PLACE_ORDER = eINSTANCE.getOnlineUser__PlaceOrder();

		/**
		 * The meta object literal for the '<em><b>Inv2 Food Item Check</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ONLINE_USER___INV2_FOOD_ITEM_CHECK__DIAGNOSTICCHAIN_MAP = eINSTANCE
				.getOnlineUser__Inv2FoodItemCheck__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link gendev.hw1.impl.RestaurantImpl <em>Restaurant</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gendev.hw1.impl.RestaurantImpl
		 * @see gendev.hw1.impl.Hw1PackageImpl#getRestaurant()
		 * @generated
		 */
		EClass RESTAURANT = eINSTANCE.getRestaurant();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESTAURANT__NAME = eINSTANCE.getRestaurant_Name();

		/**
		 * The meta object literal for the '<em><b>Location</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESTAURANT__LOCATION = eINSTANCE.getRestaurant_Location();

		/**
		 * The meta object literal for the '<em><b>Order Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESTAURANT__ORDER_ID = eINSTANCE.getRestaurant_OrderId();

		/**
		 * The meta object literal for the '<em><b>Receive Order</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RESTAURANT___RECEIVE_ORDER__STRING = eINSTANCE.getRestaurant__ReceiveOrder__String();

		/**
		 * The meta object literal for the '<em><b>Pack Items</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RESTAURANT___PACK_ITEMS__STRING = eINSTANCE.getRestaurant__PackItems__String();

		/**
		 * The meta object literal for the '{@link gendev.hw1.impl.FoodItemImpl <em>Food Item</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gendev.hw1.impl.FoodItemImpl
		 * @see gendev.hw1.impl.Hw1PackageImpl#getFoodItem()
		 * @generated
		 */
		EClass FOOD_ITEM = eINSTANCE.getFoodItem();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FOOD_ITEM__NAME = eINSTANCE.getFoodItem_Name();

		/**
		 * The meta object literal for the '<em><b>Price</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FOOD_ITEM__PRICE = eINSTANCE.getFoodItem_Price();

		/**
		 * The meta object literal for the '{@link gendev.hw1.impl.ContinentalCuisineImpl <em>Continental Cuisine</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gendev.hw1.impl.ContinentalCuisineImpl
		 * @see gendev.hw1.impl.Hw1PackageImpl#getContinentalCuisine()
		 * @generated
		 */
		EClass CONTINENTAL_CUISINE = eINSTANCE.getContinentalCuisine();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTINENTAL_CUISINE__DESCRIPTION = eINSTANCE.getContinentalCuisine_Description();

		/**
		 * The meta object literal for the '{@link gendev.hw1.impl.ItalianCuisineImpl <em>Italian Cuisine</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gendev.hw1.impl.ItalianCuisineImpl
		 * @see gendev.hw1.impl.Hw1PackageImpl#getItalianCuisine()
		 * @generated
		 */
		EClass ITALIAN_CUISINE = eINSTANCE.getItalianCuisine();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ITALIAN_CUISINE__DESCRIPTION = eINSTANCE.getItalianCuisine_Description();

		/**
		 * The meta object literal for the '{@link gendev.hw1.impl.OrderImpl <em>Order</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gendev.hw1.impl.OrderImpl
		 * @see gendev.hw1.impl.Hw1PackageImpl#getOrder()
		 * @generated
		 */
		EClass ORDER = eINSTANCE.getOrder();

		/**
		 * The meta object literal for the '<em><b>Price</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORDER__PRICE = eINSTANCE.getOrder_Price();

		/**
		 * The meta object literal for the '<em><b>Order Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORDER__ORDER_ID = eINSTANCE.getOrder_OrderId();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORDER__STATUS = eINSTANCE.getOrder_Status();

		/**
		 * The meta object literal for the '<em><b>Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORDER__DATE = eINSTANCE.getOrder_Date();

		/**
		 * The meta object literal for the '<em><b>Pay</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORDER__PAY = eINSTANCE.getOrder_Pay();

		/**
		 * The meta object literal for the '<em><b>Receives</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORDER__RECEIVES = eINSTANCE.getOrder_Receives();

		/**
		 * The meta object literal for the '<em><b>User Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORDER__USER_ID = eINSTANCE.getOrder_UserId();

		/**
		 * The meta object literal for the '<em><b>Fetch Order Details</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ORDER___FETCH_ORDER_DETAILS__STRING = eINSTANCE.getOrder__FetchOrderDetails__String();

		/**
		 * The meta object literal for the '<em><b>Inv3 Price Check</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ORDER___INV3_PRICE_CHECK__DIAGNOSTICCHAIN_MAP = eINSTANCE
				.getOrder__Inv3PriceCheck__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link gendev.hw1.impl.PaymentImpl <em>Payment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gendev.hw1.impl.PaymentImpl
		 * @see gendev.hw1.impl.Hw1PackageImpl#getPayment()
		 * @generated
		 */
		EClass PAYMENT = eINSTANCE.getPayment();

		/**
		 * The meta object literal for the '<em><b>Order Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAYMENT__ORDER_ID = eINSTANCE.getPayment_OrderId();

		/**
		 * The meta object literal for the '<em><b>Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAYMENT__DATE = eINSTANCE.getPayment_Date();

		/**
		 * The meta object literal for the '<em><b>Price</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAYMENT__PRICE = eINSTANCE.getPayment_Price();

		/**
		 * The meta object literal for the '<em><b>Perform Payment</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PAYMENT___PERFORM_PAYMENT = eINSTANCE.getPayment__PerformPayment();

		/**
		 * The meta object literal for the '<em><b>Payment Check</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PAYMENT___PAYMENT_CHECK__DIAGNOSTICCHAIN_MAP = eINSTANCE
				.getPayment__PaymentCheck__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link gendev.hw1.impl.CardPaymentImpl <em>Card Payment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gendev.hw1.impl.CardPaymentImpl
		 * @see gendev.hw1.impl.Hw1PackageImpl#getCardPayment()
		 * @generated
		 */
		EClass CARD_PAYMENT = eINSTANCE.getCardPayment();

		/**
		 * The meta object literal for the '<em><b>Card Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CARD_PAYMENT__CARD_TYPE = eINSTANCE.getCardPayment_CardType();

		/**
		 * The meta object literal for the '<em><b>Card Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CARD_PAYMENT__CARD_NUMBER = eINSTANCE.getCardPayment_CardNumber();

		/**
		 * The meta object literal for the '{@link gendev.hw1.impl.UPIPaymentImpl <em>UPI Payment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gendev.hw1.impl.UPIPaymentImpl
		 * @see gendev.hw1.impl.Hw1PackageImpl#getUPIPayment()
		 * @generated
		 */
		EClass UPI_PAYMENT = eINSTANCE.getUPIPayment();

		/**
		 * The meta object literal for the '<em><b>Upi Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UPI_PAYMENT__UPI_NUMBER = eINSTANCE.getUPIPayment_UpiNumber();

		/**
		 * The meta object literal for the '<em>Calendar</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.util.Calendar
		 * @see gendev.hw1.impl.Hw1PackageImpl#getCalendar()
		 * @generated
		 */
		EDataType CALENDAR = eINSTANCE.getCalendar();

	}

} //Hw1Package
