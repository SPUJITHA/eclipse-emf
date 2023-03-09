/**
 */
package gendev.hw1.impl;

import gendev.hw1.CardPayment;
import gendev.hw1.ContinentalCuisine;
import gendev.hw1.FoodItem;
import gendev.hw1.Hw1Factory;
import gendev.hw1.Hw1Package;
import gendev.hw1.ItalianCuisine;
import gendev.hw1.OnlineUser;
import gendev.hw1.Order;
import gendev.hw1.Payment;
import gendev.hw1.Restaurant;
import gendev.hw1.UPIPayment;
import gendev.hw1.util.Hw1Validator;
import java.util.Calendar;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;
import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Hw1PackageImpl extends EPackageImpl implements Hw1Package {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass onlineUserEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass restaurantEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass foodItemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass continentalCuisineEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass italianCuisineEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass orderEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass paymentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cardPaymentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass upiPaymentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType calendarEDataType = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see gendev.hw1.Hw1Package#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private Hw1PackageImpl() {
		super(eNS_URI, Hw1Factory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link Hw1Package#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static Hw1Package init() {
		if (isInited)
			return (Hw1Package) EPackage.Registry.INSTANCE.getEPackage(Hw1Package.eNS_URI);

		// Obtain or create and register package
		Object registeredHw1Package = EPackage.Registry.INSTANCE.get(eNS_URI);
		Hw1PackageImpl theHw1Package = registeredHw1Package instanceof Hw1PackageImpl
				? (Hw1PackageImpl) registeredHw1Package
				: new Hw1PackageImpl();

		isInited = true;

		// Create package meta-data objects
		theHw1Package.createPackageContents();

		// Initialize created meta-data
		theHw1Package.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put(theHw1Package, new EValidator.Descriptor() {
			public EValidator getEValidator() {
				return Hw1Validator.INSTANCE;
			}
		});

		// Mark meta-data to indicate it can't be changed
		theHw1Package.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(Hw1Package.eNS_URI, theHw1Package);
		return theHw1Package;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOnlineUser() {
		return onlineUserEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOnlineUser_UserId() {
		return (EAttribute) onlineUserEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOnlineUser_Name() {
		return (EAttribute) onlineUserEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOnlineUser_Email() {
		return (EAttribute) onlineUserEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOnlineUser_Places() {
		return (EReference) onlineUserEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOnlineUser_Adds() {
		return (EReference) onlineUserEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getOnlineUser__SignUp__String_String() {
		return onlineUserEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getOnlineUser__SearchItems() {
		return onlineUserEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getOnlineUser__AddItemsToCart__FoodItem() {
		return onlineUserEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getOnlineUser__PlaceOrder() {
		return onlineUserEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getOnlineUser__Inv2FoodItemCheck__DiagnosticChain_Map() {
		return onlineUserEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRestaurant() {
		return restaurantEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRestaurant_Name() {
		return (EAttribute) restaurantEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRestaurant_Location() {
		return (EAttribute) restaurantEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRestaurant_OrderId() {
		return (EAttribute) restaurantEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRestaurant__ReceiveOrder__String() {
		return restaurantEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRestaurant__PackItems__String() {
		return restaurantEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFoodItem() {
		return foodItemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFoodItem_Name() {
		return (EAttribute) foodItemEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFoodItem_Price() {
		return (EAttribute) foodItemEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getContinentalCuisine() {
		return continentalCuisineEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContinentalCuisine_Description() {
		return (EAttribute) continentalCuisineEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getItalianCuisine() {
		return italianCuisineEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getItalianCuisine_Description() {
		return (EAttribute) italianCuisineEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOrder() {
		return orderEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOrder_Price() {
		return (EAttribute) orderEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOrder_OrderId() {
		return (EAttribute) orderEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOrder_Status() {
		return (EAttribute) orderEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOrder_Date() {
		return (EAttribute) orderEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOrder_Pay() {
		return (EReference) orderEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOrder_Receives() {
		return (EReference) orderEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOrder_UserId() {
		return (EAttribute) orderEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getOrder__FetchOrderDetails__String() {
		return orderEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getOrder__Inv3PriceCheck__DiagnosticChain_Map() {
		return orderEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPayment() {
		return paymentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPayment_OrderId() {
		return (EAttribute) paymentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPayment_Date() {
		return (EAttribute) paymentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPayment_Price() {
		return (EAttribute) paymentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPayment__PerformPayment() {
		return paymentEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPayment__PaymentCheck__DiagnosticChain_Map() {
		return paymentEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCardPayment() {
		return cardPaymentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCardPayment_CardType() {
		return (EAttribute) cardPaymentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCardPayment_CardNumber() {
		return (EAttribute) cardPaymentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUPIPayment() {
		return upiPaymentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUPIPayment_UpiNumber() {
		return (EAttribute) upiPaymentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getCalendar() {
		return calendarEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Hw1Factory getHw1Factory() {
		return (Hw1Factory) getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		onlineUserEClass = createEClass(ONLINE_USER);
		createEAttribute(onlineUserEClass, ONLINE_USER__USER_ID);
		createEAttribute(onlineUserEClass, ONLINE_USER__NAME);
		createEAttribute(onlineUserEClass, ONLINE_USER__EMAIL);
		createEReference(onlineUserEClass, ONLINE_USER__PLACES);
		createEReference(onlineUserEClass, ONLINE_USER__ADDS);
		createEOperation(onlineUserEClass, ONLINE_USER___SIGN_UP__STRING_STRING);
		createEOperation(onlineUserEClass, ONLINE_USER___SEARCH_ITEMS);
		createEOperation(onlineUserEClass, ONLINE_USER___ADD_ITEMS_TO_CART__FOODITEM);
		createEOperation(onlineUserEClass, ONLINE_USER___PLACE_ORDER);
		createEOperation(onlineUserEClass, ONLINE_USER___INV2_FOOD_ITEM_CHECK__DIAGNOSTICCHAIN_MAP);

		restaurantEClass = createEClass(RESTAURANT);
		createEAttribute(restaurantEClass, RESTAURANT__NAME);
		createEAttribute(restaurantEClass, RESTAURANT__LOCATION);
		createEAttribute(restaurantEClass, RESTAURANT__ORDER_ID);
		createEOperation(restaurantEClass, RESTAURANT___RECEIVE_ORDER__STRING);
		createEOperation(restaurantEClass, RESTAURANT___PACK_ITEMS__STRING);

		foodItemEClass = createEClass(FOOD_ITEM);
		createEAttribute(foodItemEClass, FOOD_ITEM__NAME);
		createEAttribute(foodItemEClass, FOOD_ITEM__PRICE);

		continentalCuisineEClass = createEClass(CONTINENTAL_CUISINE);
		createEAttribute(continentalCuisineEClass, CONTINENTAL_CUISINE__DESCRIPTION);

		italianCuisineEClass = createEClass(ITALIAN_CUISINE);
		createEAttribute(italianCuisineEClass, ITALIAN_CUISINE__DESCRIPTION);

		orderEClass = createEClass(ORDER);
		createEAttribute(orderEClass, ORDER__ORDER_ID);
		createEAttribute(orderEClass, ORDER__STATUS);
		createEAttribute(orderEClass, ORDER__DATE);
		createEReference(orderEClass, ORDER__PAY);
		createEAttribute(orderEClass, ORDER__PRICE);
		createEReference(orderEClass, ORDER__RECEIVES);
		createEAttribute(orderEClass, ORDER__USER_ID);
		createEOperation(orderEClass, ORDER___FETCH_ORDER_DETAILS__STRING);
		createEOperation(orderEClass, ORDER___INV3_PRICE_CHECK__DIAGNOSTICCHAIN_MAP);

		paymentEClass = createEClass(PAYMENT);
		createEAttribute(paymentEClass, PAYMENT__ORDER_ID);
		createEAttribute(paymentEClass, PAYMENT__DATE);
		createEAttribute(paymentEClass, PAYMENT__PRICE);
		createEOperation(paymentEClass, PAYMENT___PERFORM_PAYMENT);
		createEOperation(paymentEClass, PAYMENT___PAYMENT_CHECK__DIAGNOSTICCHAIN_MAP);

		cardPaymentEClass = createEClass(CARD_PAYMENT);
		createEAttribute(cardPaymentEClass, CARD_PAYMENT__CARD_TYPE);
		createEAttribute(cardPaymentEClass, CARD_PAYMENT__CARD_NUMBER);

		upiPaymentEClass = createEClass(UPI_PAYMENT);
		createEAttribute(upiPaymentEClass, UPI_PAYMENT__UPI_NUMBER);

		// Create data types
		calendarEDataType = createEDataType(CALENDAR);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		continentalCuisineEClass.getESuperTypes().add(this.getFoodItem());
		italianCuisineEClass.getESuperTypes().add(this.getFoodItem());
		cardPaymentEClass.getESuperTypes().add(this.getPayment());
		upiPaymentEClass.getESuperTypes().add(this.getPayment());

		// Initialize classes, features, and operations; add parameters
		initEClass(onlineUserEClass, OnlineUser.class, "OnlineUser", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOnlineUser_UserId(), ecorePackage.getEString(), "userId", null, 0, 1, OnlineUser.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOnlineUser_Name(), ecorePackage.getEString(), "name", null, 0, 1, OnlineUser.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOnlineUser_Email(), ecorePackage.getEString(), "email", null, 0, 1, OnlineUser.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOnlineUser_Places(), this.getOrder(), null, "places", null, 1, -1, OnlineUser.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOnlineUser_Adds(), this.getFoodItem(), null, "adds", null, 1, 6, OnlineUser.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		EOperation op = initEOperation(getOnlineUser__SignUp__String_String(), null, "signUp", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "name", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "email", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getOnlineUser__SearchItems(), null, "searchItems", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getOnlineUser__AddItemsToCart__FoodItem(), null, "addItemsToCart", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		addEParameter(op, this.getFoodItem(), "item", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getOnlineUser__PlaceOrder(), null, "placeOrder", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getOnlineUser__Inv2FoodItemCheck__DiagnosticChain_Map(), ecorePackage.getEBoolean(),
				"inv2FoodItemCheck", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		EGenericType g1 = createEGenericType(ecorePackage.getEMap());
		EGenericType g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(restaurantEClass, Restaurant.class, "Restaurant", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRestaurant_Name(), ecorePackage.getEString(), "name", null, 0, 1, Restaurant.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRestaurant_Location(), ecorePackage.getEString(), "location", null, 0, 1, Restaurant.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRestaurant_OrderId(), ecorePackage.getEString(), "orderId", null, 0, 1, Restaurant.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getRestaurant__ReceiveOrder__String(), null, "receiveOrder", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "orderId", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getRestaurant__PackItems__String(), null, "packItems", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "orderId", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(foodItemEClass, FoodItem.class, "FoodItem", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFoodItem_Name(), ecorePackage.getEString(), "name", null, 0, 1, FoodItem.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFoodItem_Price(), ecorePackage.getEFloat(), "price", null, 1, 1, FoodItem.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(continentalCuisineEClass, ContinentalCuisine.class, "ContinentalCuisine", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getContinentalCuisine_Description(), ecorePackage.getEString(), "description", null, 0, 1,
				ContinentalCuisine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(italianCuisineEClass, ItalianCuisine.class, "ItalianCuisine", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getItalianCuisine_Description(), ecorePackage.getEString(), "description", null, 0, 1,
				ItalianCuisine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(orderEClass, Order.class, "Order", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOrder_OrderId(), ecorePackage.getEString(), "orderId", null, 0, 1, Order.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrder_Status(), ecorePackage.getEString(), "status", null, 0, 1, Order.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrder_Date(), this.getCalendar(), "date", null, 0, 1, Order.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOrder_Pay(), this.getPayment(), null, "pay", null, 1, -1, Order.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getOrder_Price(), ecorePackage.getEFloat(), "price", null, 1, 1, Order.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOrder_Receives(), this.getRestaurant(), null, "receives", null, 0, 1, Order.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrder_UserId(), ecorePackage.getEString(), "userId", null, 0, 1, Order.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getOrder__FetchOrderDetails__String(), null, "fetchOrderDetails", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "orderId", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getOrder__Inv3PriceCheck__DiagnosticChain_Map(), ecorePackage.getEBoolean(),
				"inv3PriceCheck", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(paymentEClass, Payment.class, "Payment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPayment_OrderId(), ecorePackage.getEString(), "orderId", null, 0, 1, Payment.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPayment_Date(), this.getCalendar(), "date", null, 0, 1, Payment.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPayment_Price(), ecorePackage.getEFloat(), "price", null, 1, 1, Payment.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getPayment__PerformPayment(), null, "performPayment", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getPayment__PaymentCheck__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "PaymentCheck",
				0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(cardPaymentEClass, CardPayment.class, "CardPayment", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCardPayment_CardType(), ecorePackage.getEString(), "cardType", null, 0, 1, CardPayment.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCardPayment_CardNumber(), ecorePackage.getELong(), "cardNumber", null, 1, 1,
				CardPayment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(upiPaymentEClass, UPIPayment.class, "UPIPayment", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUPIPayment_UpiNumber(), ecorePackage.getEString(), "upiNumber", null, 0, 1, UPIPayment.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize data types
		initEDataType(calendarEDataType, Calendar.class, "Calendar", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/emf/2002/Ecore
		createEcoreAnnotations();
		// http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot
		createPivotAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createEcoreAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore";
		addAnnotation(this, source, new String[] {});
		addAnnotation(onlineUserEClass, source, new String[] { "constraints", "inv2FoodItemCheck" });
		addAnnotation(orderEClass, source, new String[] { "constraints", "inv3PriceCheck" });
		addAnnotation(paymentEClass, source, new String[] { "constraints", "PaymentCheck" });
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createPivotAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot";
		addAnnotation(getOnlineUser__Inv2FoodItemCheck__DiagnosticChain_Map(), source,
				new String[] { "body", "adds->size() >= 1 and adds->size() <=6" });
		addAnnotation(getOrder__Inv3PriceCheck__DiagnosticChain_Map(), source, new String[] { "body", "price > 0" });
		addAnnotation(getPayment__PaymentCheck__DiagnosticChain_Map(), source,
				new String[] { "body", "self.price > 0 and self.price <= 10000" });
	}

} //Hw1PackageImpl
