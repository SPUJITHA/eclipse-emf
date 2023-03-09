/*******************************************************************************
 *************************************************************************
 * This code is 100% auto-generated
 * from:
 *   /gendev.hw1/model/hw1.ecore
 * using:
 *   /gendev.hw1/model/hw1.genmodel
 *   org.eclipse.ocl.examples.codegen.oclinecore.OCLinEcoreTables
 *
 * Do not edit it.
 *******************************************************************************/
package gendev.hw1;

// import gendev.hw1.Hw1Package;
// import gendev.hw1.Hw1Tables;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.ocl.pivot.ParameterTypes;
import org.eclipse.ocl.pivot.TemplateParameters;
import org.eclipse.ocl.pivot.ids.ClassId;
import org.eclipse.ocl.pivot.ids.CollectionTypeId;
import org.eclipse.ocl.pivot.ids.DataTypeId;
import org.eclipse.ocl.pivot.ids.IdManager;
import org.eclipse.ocl.pivot.ids.NsURIPackageId;
import org.eclipse.ocl.pivot.ids.TypeId;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorPackage;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorProperty;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorType;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreLibraryOppositeProperty;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorFragment;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorOperation;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorProperty;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorPropertyWithImplementation;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorStandardLibrary;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorType;
import org.eclipse.ocl.pivot.oclstdlib.OCLstdlibTables;
import org.eclipse.ocl.pivot.utilities.AbstractTables;
import org.eclipse.ocl.pivot.utilities.TypeUtil;
import org.eclipse.ocl.pivot.utilities.ValueUtil;
import org.eclipse.ocl.pivot.values.IntegerValue;

/**
 * Hw1Tables provides the dispatch tables for the hw1 for use by the OCL dispatcher.
 *
 * In order to ensure correct static initialization, a top level class element must be accessed
 * before any nested class element. Therefore an access to PACKAGE.getClass() is recommended.
 */
public class Hw1Tables extends AbstractTables
{
	static {
		Init.initStart();
	}

	/**
	 *	The package descriptor for the package.
	 */
	public static final EcoreExecutorPackage PACKAGE = new EcoreExecutorPackage(Hw1Package.eINSTANCE);

	/**
	 *	The library of all packages and types.
	 */
	public static final ExecutorStandardLibrary LIBRARY = OCLstdlibTables.LIBRARY;

	/**
	 *	Constants used by auto-generated code.
	 */
	public static final /*@NonInvalid*/ NsURIPackageId PACKid_http_c_s_s_www_eclipse_org_s_emf_s_2002_s_Ecore = IdManager.getNsURIPackageId("http://www.eclipse.org/emf/2002/Ecore", null, EcorePackage.eINSTANCE);
	public static final /*@NonInvalid*/ NsURIPackageId PACKid_http_c_s_s_www_example_org_s_hw1 = IdManager.getNsURIPackageId("http://www.example.org/hw1", null, Hw1Package.eINSTANCE);
	public static final /*@NonInvalid*/ ClassId CLSSid_FoodItem = Hw1Tables.PACKid_http_c_s_s_www_example_org_s_hw1.getClassId("FoodItem", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_OnlineUser = Hw1Tables.PACKid_http_c_s_s_www_example_org_s_hw1.getClassId("OnlineUser", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Order = Hw1Tables.PACKid_http_c_s_s_www_example_org_s_hw1.getClassId("Order", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Payment = Hw1Tables.PACKid_http_c_s_s_www_example_org_s_hw1.getClassId("Payment", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Restaurant = Hw1Tables.PACKid_http_c_s_s_www_example_org_s_hw1.getClassId("Restaurant", 0);
	public static final /*@NonInvalid*/ DataTypeId DATAid_Calendar = Hw1Tables.PACKid_http_c_s_s_www_example_org_s_hw1.getDataTypeId("Calendar", 0);
	public static final /*@NonInvalid*/ DataTypeId DATAid_EFloat = Hw1Tables.PACKid_http_c_s_s_www_eclipse_org_s_emf_s_2002_s_Ecore.getDataTypeId("EFloat", 0);
	public static final /*@NonInvalid*/ DataTypeId DATAid_ELong = Hw1Tables.PACKid_http_c_s_s_www_eclipse_org_s_emf_s_2002_s_Ecore.getDataTypeId("ELong", 0);
	public static final /*@NonInvalid*/ IntegerValue INT_0 = ValueUtil.integerValueOf("0");
	public static final /*@NonInvalid*/ IntegerValue INT_1 = ValueUtil.integerValueOf("1");
	public static final /*@NonInvalid*/ IntegerValue INT_10000 = ValueUtil.integerValueOf("10000");
	public static final /*@NonInvalid*/ IntegerValue INT_6 = ValueUtil.integerValueOf("6");
	public static final /*@NonInvalid*/ CollectionTypeId BAG_CLSSid_Order = TypeId.BAG.getSpecializedId(Hw1Tables.CLSSid_Order, false, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_FoodItem = TypeId.ORDERED_SET.getSpecializedId(Hw1Tables.CLSSid_FoodItem, true, ValueUtil.ONE_VALUE, ValueUtil.integerValueOf(6));
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_Order = TypeId.ORDERED_SET.getSpecializedId(Hw1Tables.CLSSid_Order, true, ValueUtil.ONE_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_Payment = TypeId.ORDERED_SET.getSpecializedId(Hw1Tables.CLSSid_Payment, true, ValueUtil.ONE_VALUE, ValueUtil.UNLIMITED_VALUE);

	/**
	 *	The type parameters for templated types and operations.
	 */
	public static class TypeParameters {
		static {
			Init.initStart();
			Hw1Tables.init();
		}

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of Hw1Tables::TypeParameters and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The type descriptors for each type.
	 */
	public static class Types {
		static {
			Init.initStart();
			TypeParameters.init();
		}

		public static final EcoreExecutorType _Calendar = new EcoreExecutorType("Calendar", PACKAGE, 0);
		public static final EcoreExecutorType _CardPayment = new EcoreExecutorType(Hw1Package.Literals.CARD_PAYMENT, PACKAGE, 0);
		public static final EcoreExecutorType _ContinentalCuisine = new EcoreExecutorType(Hw1Package.Literals.CONTINENTAL_CUISINE, PACKAGE, 0);
		public static final EcoreExecutorType _FoodItem = new EcoreExecutorType(Hw1Package.Literals.FOOD_ITEM, PACKAGE, 0 | ExecutorType.ABSTRACT);
		public static final EcoreExecutorType _ItalianCuisine = new EcoreExecutorType(Hw1Package.Literals.ITALIAN_CUISINE, PACKAGE, 0);
		public static final EcoreExecutorType _OnlineUser = new EcoreExecutorType(Hw1Package.Literals.ONLINE_USER, PACKAGE, 0);
		public static final EcoreExecutorType _Order = new EcoreExecutorType(Hw1Package.Literals.ORDER, PACKAGE, 0);
		public static final EcoreExecutorType _Payment = new EcoreExecutorType(Hw1Package.Literals.PAYMENT, PACKAGE, 0);
		public static final EcoreExecutorType _Restaurant = new EcoreExecutorType(Hw1Package.Literals.RESTAURANT, PACKAGE, 0);
		public static final EcoreExecutorType _UPIPayment = new EcoreExecutorType(Hw1Package.Literals.UPI_PAYMENT, PACKAGE, 0);

		private static final EcoreExecutorType /*@NonNull*/ [] types = {
			_Calendar,
			_CardPayment,
			_ContinentalCuisine,
			_FoodItem,
			_ItalianCuisine,
			_OnlineUser,
			_Order,
			_Payment,
			_Restaurant,
			_UPIPayment
		};

		/*
		 *	Install the type descriptors in the package descriptor.
		 */
		static {
			PACKAGE.init(LIBRARY, types);
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of Hw1Tables::Types and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The fragment descriptors for the local elements of each type and its supertypes.
	 */
	public static class Fragments {
		static {
			Init.initStart();
			Types.init();
		}

		private static final ExecutorFragment _Calendar__Calendar = new ExecutorFragment(Types._Calendar, Hw1Tables.Types._Calendar);
		private static final ExecutorFragment _Calendar__OclAny = new ExecutorFragment(Types._Calendar, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Calendar__OclComparable = new ExecutorFragment(Types._Calendar, OCLstdlibTables.Types._OclComparable);

		private static final ExecutorFragment _CardPayment__CardPayment = new ExecutorFragment(Types._CardPayment, Hw1Tables.Types._CardPayment);
		private static final ExecutorFragment _CardPayment__OclAny = new ExecutorFragment(Types._CardPayment, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _CardPayment__OclElement = new ExecutorFragment(Types._CardPayment, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _CardPayment__Payment = new ExecutorFragment(Types._CardPayment, Hw1Tables.Types._Payment);

		private static final ExecutorFragment _ContinentalCuisine__ContinentalCuisine = new ExecutorFragment(Types._ContinentalCuisine, Hw1Tables.Types._ContinentalCuisine);
		private static final ExecutorFragment _ContinentalCuisine__FoodItem = new ExecutorFragment(Types._ContinentalCuisine, Hw1Tables.Types._FoodItem);
		private static final ExecutorFragment _ContinentalCuisine__OclAny = new ExecutorFragment(Types._ContinentalCuisine, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _ContinentalCuisine__OclElement = new ExecutorFragment(Types._ContinentalCuisine, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _FoodItem__FoodItem = new ExecutorFragment(Types._FoodItem, Hw1Tables.Types._FoodItem);
		private static final ExecutorFragment _FoodItem__OclAny = new ExecutorFragment(Types._FoodItem, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _FoodItem__OclElement = new ExecutorFragment(Types._FoodItem, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _ItalianCuisine__FoodItem = new ExecutorFragment(Types._ItalianCuisine, Hw1Tables.Types._FoodItem);
		private static final ExecutorFragment _ItalianCuisine__ItalianCuisine = new ExecutorFragment(Types._ItalianCuisine, Hw1Tables.Types._ItalianCuisine);
		private static final ExecutorFragment _ItalianCuisine__OclAny = new ExecutorFragment(Types._ItalianCuisine, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _ItalianCuisine__OclElement = new ExecutorFragment(Types._ItalianCuisine, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _OnlineUser__OclAny = new ExecutorFragment(Types._OnlineUser, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _OnlineUser__OclElement = new ExecutorFragment(Types._OnlineUser, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _OnlineUser__OnlineUser = new ExecutorFragment(Types._OnlineUser, Hw1Tables.Types._OnlineUser);

		private static final ExecutorFragment _Order__OclAny = new ExecutorFragment(Types._Order, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Order__OclElement = new ExecutorFragment(Types._Order, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _Order__Order = new ExecutorFragment(Types._Order, Hw1Tables.Types._Order);

		private static final ExecutorFragment _Payment__OclAny = new ExecutorFragment(Types._Payment, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Payment__OclElement = new ExecutorFragment(Types._Payment, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _Payment__Payment = new ExecutorFragment(Types._Payment, Hw1Tables.Types._Payment);

		private static final ExecutorFragment _Restaurant__OclAny = new ExecutorFragment(Types._Restaurant, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Restaurant__OclElement = new ExecutorFragment(Types._Restaurant, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _Restaurant__Restaurant = new ExecutorFragment(Types._Restaurant, Hw1Tables.Types._Restaurant);

		private static final ExecutorFragment _UPIPayment__OclAny = new ExecutorFragment(Types._UPIPayment, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _UPIPayment__OclElement = new ExecutorFragment(Types._UPIPayment, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _UPIPayment__Payment = new ExecutorFragment(Types._UPIPayment, Hw1Tables.Types._Payment);
		private static final ExecutorFragment _UPIPayment__UPIPayment = new ExecutorFragment(Types._UPIPayment, Hw1Tables.Types._UPIPayment);

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of Hw1Tables::Fragments and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The parameter lists shared by operations.
	 *
	 * @noextend This class is not intended to be subclassed by clients.
	 * @noinstantiate This class is not intended to be instantiated by clients.
	 * @noreference This class is not intended to be referenced by clients.
	 */
	public static class Parameters {
		static {
			Init.initStart();
			Fragments.init();
		}

		public static final ParameterTypes _FoodItem = TypeUtil.createParameterTypes(Hw1Tables.Types._FoodItem);
		public static final ParameterTypes _OclSelf = TypeUtil.createParameterTypes(OCLstdlibTables.Types._OclSelf);
		public static final ParameterTypes _String = TypeUtil.createParameterTypes(OCLstdlibTables.Types._String);
		public static final ParameterTypes _String___String = TypeUtil.createParameterTypes(OCLstdlibTables.Types._String, OCLstdlibTables.Types._String);

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of Hw1Tables::Parameters and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The operation descriptors for each operation of each type.
	 *
	 * @noextend This class is not intended to be subclassed by clients.
	 * @noinstantiate This class is not intended to be instantiated by clients.
	 * @noreference This class is not intended to be referenced by clients.
	 */
	public static class Operations {
		static {
			Init.initStart();
			Parameters.init();
		}

		public static final ExecutorOperation _Calendar__compareTo = new ExecutorOperation("compareTo", Parameters._OclSelf, Types._Calendar,
			0, TemplateParameters.EMPTY_LIST, null);

		public static final ExecutorOperation _OnlineUser__addItemsToCart = new ExecutorOperation("addItemsToCart", Parameters._FoodItem, Types._OnlineUser,
			0, TemplateParameters.EMPTY_LIST, null);
		public static final ExecutorOperation _OnlineUser__placeOrder = new ExecutorOperation("placeOrder", TypeUtil.EMPTY_PARAMETER_TYPES, Types._OnlineUser,
			1, TemplateParameters.EMPTY_LIST, null);
		public static final ExecutorOperation _OnlineUser__searchItems = new ExecutorOperation("searchItems", TypeUtil.EMPTY_PARAMETER_TYPES, Types._OnlineUser,
			2, TemplateParameters.EMPTY_LIST, null);
		public static final ExecutorOperation _OnlineUser__signUp = new ExecutorOperation("signUp", Parameters._String___String, Types._OnlineUser,
			3, TemplateParameters.EMPTY_LIST, null);

		public static final ExecutorOperation _Order__fetchOrderDetails = new ExecutorOperation("fetchOrderDetails", Parameters._String, Types._Order,
			0, TemplateParameters.EMPTY_LIST, null);

		public static final ExecutorOperation _Payment__performPayment = new ExecutorOperation("performPayment", TypeUtil.EMPTY_PARAMETER_TYPES, Types._Payment,
			0, TemplateParameters.EMPTY_LIST, null);

		public static final ExecutorOperation _Restaurant__packItems = new ExecutorOperation("packItems", Parameters._String, Types._Restaurant,
			0, TemplateParameters.EMPTY_LIST, null);
		public static final ExecutorOperation _Restaurant__receiveOrder = new ExecutorOperation("receiveOrder", Parameters._String, Types._Restaurant,
			1, TemplateParameters.EMPTY_LIST, null);

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of Hw1Tables::Operations and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The property descriptors for each property of each type.
	 *
	 * @noextend This class is not intended to be subclassed by clients.
	 * @noinstantiate This class is not intended to be instantiated by clients.
	 * @noreference This class is not intended to be referenced by clients.
	 */
	public static class Properties {
		static {
			Init.initStart();
			Operations.init();
		}


		public static final ExecutorProperty _CardPayment__cardNumber = new EcoreExecutorProperty(Hw1Package.Literals.CARD_PAYMENT__CARD_NUMBER, Types._CardPayment, 0);
		public static final ExecutorProperty _CardPayment__cardType = new EcoreExecutorProperty(Hw1Package.Literals.CARD_PAYMENT__CARD_TYPE, Types._CardPayment, 1);

		public static final ExecutorProperty _ContinentalCuisine__description = new EcoreExecutorProperty(Hw1Package.Literals.CONTINENTAL_CUISINE__DESCRIPTION, Types._ContinentalCuisine, 0);

		public static final ExecutorProperty _FoodItem__name = new EcoreExecutorProperty(Hw1Package.Literals.FOOD_ITEM__NAME, Types._FoodItem, 0);
		public static final ExecutorProperty _FoodItem__price = new EcoreExecutorProperty(Hw1Package.Literals.FOOD_ITEM__PRICE, Types._FoodItem, 1);
		public static final ExecutorProperty _FoodItem__OnlineUser__adds = new ExecutorPropertyWithImplementation("OnlineUser", Types._FoodItem, 2, new EcoreLibraryOppositeProperty(Hw1Package.Literals.ONLINE_USER__ADDS));

		public static final ExecutorProperty _ItalianCuisine__description = new EcoreExecutorProperty(Hw1Package.Literals.ITALIAN_CUISINE__DESCRIPTION, Types._ItalianCuisine, 0);

		public static final ExecutorProperty _OnlineUser__adds = new EcoreExecutorProperty(Hw1Package.Literals.ONLINE_USER__ADDS, Types._OnlineUser, 0);
		public static final ExecutorProperty _OnlineUser__email = new EcoreExecutorProperty(Hw1Package.Literals.ONLINE_USER__EMAIL, Types._OnlineUser, 1);
		public static final ExecutorProperty _OnlineUser__name = new EcoreExecutorProperty(Hw1Package.Literals.ONLINE_USER__NAME, Types._OnlineUser, 2);
		public static final ExecutorProperty _OnlineUser__places = new EcoreExecutorProperty(Hw1Package.Literals.ONLINE_USER__PLACES, Types._OnlineUser, 3);
		public static final ExecutorProperty _OnlineUser__userId = new EcoreExecutorProperty(Hw1Package.Literals.ONLINE_USER__USER_ID, Types._OnlineUser, 4);

		public static final ExecutorProperty _Order__date = new EcoreExecutorProperty(Hw1Package.Literals.ORDER__DATE, Types._Order, 0);
		public static final ExecutorProperty _Order__orderId = new EcoreExecutorProperty(Hw1Package.Literals.ORDER__ORDER_ID, Types._Order, 1);
		public static final ExecutorProperty _Order__pay = new EcoreExecutorProperty(Hw1Package.Literals.ORDER__PAY, Types._Order, 2);
		public static final ExecutorProperty _Order__price = new EcoreExecutorProperty(Hw1Package.Literals.ORDER__PRICE, Types._Order, 3);
		public static final ExecutorProperty _Order__receives = new EcoreExecutorProperty(Hw1Package.Literals.ORDER__RECEIVES, Types._Order, 4);
		public static final ExecutorProperty _Order__status = new EcoreExecutorProperty(Hw1Package.Literals.ORDER__STATUS, Types._Order, 5);
		public static final ExecutorProperty _Order__userId = new EcoreExecutorProperty(Hw1Package.Literals.ORDER__USER_ID, Types._Order, 6);
		public static final ExecutorProperty _Order__OnlineUser__places = new ExecutorPropertyWithImplementation("OnlineUser", Types._Order, 7, new EcoreLibraryOppositeProperty(Hw1Package.Literals.ONLINE_USER__PLACES));

		public static final ExecutorProperty _Payment__date = new EcoreExecutorProperty(Hw1Package.Literals.PAYMENT__DATE, Types._Payment, 0);
		public static final ExecutorProperty _Payment__orderId = new EcoreExecutorProperty(Hw1Package.Literals.PAYMENT__ORDER_ID, Types._Payment, 1);
		public static final ExecutorProperty _Payment__price = new EcoreExecutorProperty(Hw1Package.Literals.PAYMENT__PRICE, Types._Payment, 2);
		public static final ExecutorProperty _Payment__Order__pay = new ExecutorPropertyWithImplementation("Order", Types._Payment, 3, new EcoreLibraryOppositeProperty(Hw1Package.Literals.ORDER__PAY));

		public static final ExecutorProperty _Restaurant__location = new EcoreExecutorProperty(Hw1Package.Literals.RESTAURANT__LOCATION, Types._Restaurant, 0);
		public static final ExecutorProperty _Restaurant__name = new EcoreExecutorProperty(Hw1Package.Literals.RESTAURANT__NAME, Types._Restaurant, 1);
		public static final ExecutorProperty _Restaurant__orderId = new EcoreExecutorProperty(Hw1Package.Literals.RESTAURANT__ORDER_ID, Types._Restaurant, 2);
		public static final ExecutorProperty _Restaurant__Order__receives = new ExecutorPropertyWithImplementation("Order", Types._Restaurant, 3, new EcoreLibraryOppositeProperty(Hw1Package.Literals.ORDER__RECEIVES));

		public static final ExecutorProperty _UPIPayment__upiNumber = new EcoreExecutorProperty(Hw1Package.Literals.UPI_PAYMENT__UPI_NUMBER, Types._UPIPayment, 0);
		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of Hw1Tables::Properties and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The fragments for all base types in depth order: OclAny first, OclSelf last.
	 */
	public static class TypeFragments {
		static {
			Init.initStart();
			Properties.init();
		}

		private static final ExecutorFragment /*@NonNull*/ [] _Calendar =
			{
				Fragments._Calendar__OclAny /* 0 */,
				Fragments._Calendar__OclComparable /* 1 */,
				Fragments._Calendar__Calendar /* 2 */
			};
		private static final int /*@NonNull*/ [] __Calendar = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _CardPayment =
			{
				Fragments._CardPayment__OclAny /* 0 */,
				Fragments._CardPayment__OclElement /* 1 */,
				Fragments._CardPayment__Payment /* 2 */,
				Fragments._CardPayment__CardPayment /* 3 */
			};
		private static final int /*@NonNull*/ [] __CardPayment = { 1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _ContinentalCuisine =
			{
				Fragments._ContinentalCuisine__OclAny /* 0 */,
				Fragments._ContinentalCuisine__OclElement /* 1 */,
				Fragments._ContinentalCuisine__FoodItem /* 2 */,
				Fragments._ContinentalCuisine__ContinentalCuisine /* 3 */
			};
		private static final int /*@NonNull*/ [] __ContinentalCuisine = { 1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _FoodItem =
			{
				Fragments._FoodItem__OclAny /* 0 */,
				Fragments._FoodItem__OclElement /* 1 */,
				Fragments._FoodItem__FoodItem /* 2 */
			};
		private static final int /*@NonNull*/ [] __FoodItem = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _ItalianCuisine =
			{
				Fragments._ItalianCuisine__OclAny /* 0 */,
				Fragments._ItalianCuisine__OclElement /* 1 */,
				Fragments._ItalianCuisine__FoodItem /* 2 */,
				Fragments._ItalianCuisine__ItalianCuisine /* 3 */
			};
		private static final int /*@NonNull*/ [] __ItalianCuisine = { 1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _OnlineUser =
			{
				Fragments._OnlineUser__OclAny /* 0 */,
				Fragments._OnlineUser__OclElement /* 1 */,
				Fragments._OnlineUser__OnlineUser /* 2 */
			};
		private static final int /*@NonNull*/ [] __OnlineUser = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Order =
			{
				Fragments._Order__OclAny /* 0 */,
				Fragments._Order__OclElement /* 1 */,
				Fragments._Order__Order /* 2 */
			};
		private static final int /*@NonNull*/ [] __Order = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Payment =
			{
				Fragments._Payment__OclAny /* 0 */,
				Fragments._Payment__OclElement /* 1 */,
				Fragments._Payment__Payment /* 2 */
			};
		private static final int /*@NonNull*/ [] __Payment = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Restaurant =
			{
				Fragments._Restaurant__OclAny /* 0 */,
				Fragments._Restaurant__OclElement /* 1 */,
				Fragments._Restaurant__Restaurant /* 2 */
			};
		private static final int /*@NonNull*/ [] __Restaurant = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _UPIPayment =
			{
				Fragments._UPIPayment__OclAny /* 0 */,
				Fragments._UPIPayment__OclElement /* 1 */,
				Fragments._UPIPayment__Payment /* 2 */,
				Fragments._UPIPayment__UPIPayment /* 3 */
			};
		private static final int /*@NonNull*/ [] __UPIPayment = { 1,1,1,1 };

		/**
		 *	Install the fragment descriptors in the class descriptors.
		 */
		static {
			Types._Calendar.initFragments(_Calendar, __Calendar);
			Types._CardPayment.initFragments(_CardPayment, __CardPayment);
			Types._ContinentalCuisine.initFragments(_ContinentalCuisine, __ContinentalCuisine);
			Types._FoodItem.initFragments(_FoodItem, __FoodItem);
			Types._ItalianCuisine.initFragments(_ItalianCuisine, __ItalianCuisine);
			Types._OnlineUser.initFragments(_OnlineUser, __OnlineUser);
			Types._Order.initFragments(_Order, __Order);
			Types._Payment.initFragments(_Payment, __Payment);
			Types._Restaurant.initFragments(_Restaurant, __Restaurant);
			Types._UPIPayment.initFragments(_UPIPayment, __UPIPayment);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of Hw1Tables::TypeFragments and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The lists of local operations or local operation overrides for each fragment of each type.
	 */
	public static class FragmentOperations {
		static {
			Init.initStart();
			TypeFragments.init();
		}

		private static final ExecutorOperation /*@NonNull*/ [] _Calendar__Calendar = {
			Hw1Tables.Operations._Calendar__compareTo /* compareTo(OclSelf[1]) */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Calendar__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Calendar__OclComparable = {
			OCLstdlibTables.Operations._OclComparable___lt_ /* _'<'(OclSelf[1]) */,
			OCLstdlibTables.Operations._OclComparable___lt__eq_ /* _'<='(OclSelf[1]) */,
			OCLstdlibTables.Operations._OclComparable___gt_ /* _'>'(OclSelf[1]) */,
			OCLstdlibTables.Operations._OclComparable___gt__eq_ /* _'>='(OclSelf[1]) */,
			Hw1Tables.Operations._Calendar__compareTo /* compareTo(OclSelf[1]) */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _CardPayment__CardPayment = {};
		private static final ExecutorOperation /*@NonNull*/ [] _CardPayment__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _CardPayment__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _CardPayment__Payment = {
			Hw1Tables.Operations._Payment__performPayment /* performPayment() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _ContinentalCuisine__ContinentalCuisine = {};
		private static final ExecutorOperation /*@NonNull*/ [] _ContinentalCuisine__FoodItem = {};
		private static final ExecutorOperation /*@NonNull*/ [] _ContinentalCuisine__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _ContinentalCuisine__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _FoodItem__FoodItem = {};
		private static final ExecutorOperation /*@NonNull*/ [] _FoodItem__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _FoodItem__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _ItalianCuisine__ItalianCuisine = {};
		private static final ExecutorOperation /*@NonNull*/ [] _ItalianCuisine__FoodItem = {};
		private static final ExecutorOperation /*@NonNull*/ [] _ItalianCuisine__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _ItalianCuisine__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _OnlineUser__OnlineUser = {
			Hw1Tables.Operations._OnlineUser__addItemsToCart /* addItemsToCart(FoodItem[?]) */,
			Hw1Tables.Operations._OnlineUser__placeOrder /* placeOrder() */,
			Hw1Tables.Operations._OnlineUser__searchItems /* searchItems() */,
			Hw1Tables.Operations._OnlineUser__signUp /* signUp(String[?],String[?]) */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _OnlineUser__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _OnlineUser__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Order__Order = {
			Hw1Tables.Operations._Order__fetchOrderDetails /* fetchOrderDetails(String[?]) */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Order__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Order__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Payment__Payment = {
			Hw1Tables.Operations._Payment__performPayment /* performPayment() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Payment__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Payment__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Restaurant__Restaurant = {
			Hw1Tables.Operations._Restaurant__packItems /* packItems(String[?]) */,
			Hw1Tables.Operations._Restaurant__receiveOrder /* receiveOrder(String[?]) */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Restaurant__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Restaurant__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _UPIPayment__UPIPayment = {};
		private static final ExecutorOperation /*@NonNull*/ [] _UPIPayment__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _UPIPayment__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _UPIPayment__Payment = {
			Hw1Tables.Operations._Payment__performPayment /* performPayment() */
		};

		/*
		 *	Install the operation descriptors in the fragment descriptors.
		 */
		static {
			Fragments._Calendar__Calendar.initOperations(_Calendar__Calendar);
			Fragments._Calendar__OclAny.initOperations(_Calendar__OclAny);
			Fragments._Calendar__OclComparable.initOperations(_Calendar__OclComparable);

			Fragments._CardPayment__CardPayment.initOperations(_CardPayment__CardPayment);
			Fragments._CardPayment__OclAny.initOperations(_CardPayment__OclAny);
			Fragments._CardPayment__OclElement.initOperations(_CardPayment__OclElement);
			Fragments._CardPayment__Payment.initOperations(_CardPayment__Payment);

			Fragments._ContinentalCuisine__ContinentalCuisine.initOperations(_ContinentalCuisine__ContinentalCuisine);
			Fragments._ContinentalCuisine__FoodItem.initOperations(_ContinentalCuisine__FoodItem);
			Fragments._ContinentalCuisine__OclAny.initOperations(_ContinentalCuisine__OclAny);
			Fragments._ContinentalCuisine__OclElement.initOperations(_ContinentalCuisine__OclElement);

			Fragments._FoodItem__FoodItem.initOperations(_FoodItem__FoodItem);
			Fragments._FoodItem__OclAny.initOperations(_FoodItem__OclAny);
			Fragments._FoodItem__OclElement.initOperations(_FoodItem__OclElement);

			Fragments._ItalianCuisine__FoodItem.initOperations(_ItalianCuisine__FoodItem);
			Fragments._ItalianCuisine__ItalianCuisine.initOperations(_ItalianCuisine__ItalianCuisine);
			Fragments._ItalianCuisine__OclAny.initOperations(_ItalianCuisine__OclAny);
			Fragments._ItalianCuisine__OclElement.initOperations(_ItalianCuisine__OclElement);

			Fragments._OnlineUser__OclAny.initOperations(_OnlineUser__OclAny);
			Fragments._OnlineUser__OclElement.initOperations(_OnlineUser__OclElement);
			Fragments._OnlineUser__OnlineUser.initOperations(_OnlineUser__OnlineUser);

			Fragments._Order__OclAny.initOperations(_Order__OclAny);
			Fragments._Order__OclElement.initOperations(_Order__OclElement);
			Fragments._Order__Order.initOperations(_Order__Order);

			Fragments._Payment__OclAny.initOperations(_Payment__OclAny);
			Fragments._Payment__OclElement.initOperations(_Payment__OclElement);
			Fragments._Payment__Payment.initOperations(_Payment__Payment);

			Fragments._Restaurant__OclAny.initOperations(_Restaurant__OclAny);
			Fragments._Restaurant__OclElement.initOperations(_Restaurant__OclElement);
			Fragments._Restaurant__Restaurant.initOperations(_Restaurant__Restaurant);

			Fragments._UPIPayment__OclAny.initOperations(_UPIPayment__OclAny);
			Fragments._UPIPayment__OclElement.initOperations(_UPIPayment__OclElement);
			Fragments._UPIPayment__Payment.initOperations(_UPIPayment__Payment);
			Fragments._UPIPayment__UPIPayment.initOperations(_UPIPayment__UPIPayment);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of Hw1Tables::FragmentOperations and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The lists of local properties for the local fragment of each type.
	 */
	public static class FragmentProperties {
		static {
			Init.initStart();
			FragmentOperations.init();
		}

		private static final ExecutorProperty /*@NonNull*/ [] _Calendar = {};

		private static final ExecutorProperty /*@NonNull*/ [] _CardPayment = {
			Hw1Tables.Properties._CardPayment__cardNumber,
			Hw1Tables.Properties._CardPayment__cardType,
			Hw1Tables.Properties._Payment__date,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			Hw1Tables.Properties._Payment__orderId,
			Hw1Tables.Properties._Payment__price
		};

		private static final ExecutorProperty /*@NonNull*/ [] _ContinentalCuisine = {
			Hw1Tables.Properties._ContinentalCuisine__description,
			Hw1Tables.Properties._FoodItem__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			Hw1Tables.Properties._FoodItem__price
		};

		private static final ExecutorProperty /*@NonNull*/ [] _FoodItem = {
			Hw1Tables.Properties._FoodItem__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			Hw1Tables.Properties._FoodItem__price
		};

		private static final ExecutorProperty /*@NonNull*/ [] _ItalianCuisine = {
			Hw1Tables.Properties._ItalianCuisine__description,
			Hw1Tables.Properties._FoodItem__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			Hw1Tables.Properties._FoodItem__price
		};

		private static final ExecutorProperty /*@NonNull*/ [] _OnlineUser = {
			Hw1Tables.Properties._OnlineUser__adds,
			Hw1Tables.Properties._OnlineUser__email,
			Hw1Tables.Properties._OnlineUser__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			Hw1Tables.Properties._OnlineUser__places,
			Hw1Tables.Properties._OnlineUser__userId
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Order = {
			Hw1Tables.Properties._Order__date,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			Hw1Tables.Properties._Order__orderId,
			Hw1Tables.Properties._Order__pay,
			Hw1Tables.Properties._Order__price,
			Hw1Tables.Properties._Order__receives,
			Hw1Tables.Properties._Order__status,
			Hw1Tables.Properties._Order__userId
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Payment = {
			Hw1Tables.Properties._Payment__date,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			Hw1Tables.Properties._Payment__orderId,
			Hw1Tables.Properties._Payment__price
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Restaurant = {
			Hw1Tables.Properties._Restaurant__location,
			Hw1Tables.Properties._Restaurant__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			Hw1Tables.Properties._Restaurant__orderId
		};

		private static final ExecutorProperty /*@NonNull*/ [] _UPIPayment = {
			Hw1Tables.Properties._Payment__date,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			Hw1Tables.Properties._Payment__orderId,
			Hw1Tables.Properties._Payment__price,
			Hw1Tables.Properties._UPIPayment__upiNumber
		};

		/**
		 *	Install the property descriptors in the fragment descriptors.
		 */
		static {
			Fragments._Calendar__Calendar.initProperties(_Calendar);
			Fragments._CardPayment__CardPayment.initProperties(_CardPayment);
			Fragments._ContinentalCuisine__ContinentalCuisine.initProperties(_ContinentalCuisine);
			Fragments._FoodItem__FoodItem.initProperties(_FoodItem);
			Fragments._ItalianCuisine__ItalianCuisine.initProperties(_ItalianCuisine);
			Fragments._OnlineUser__OnlineUser.initProperties(_OnlineUser);
			Fragments._Order__Order.initProperties(_Order);
			Fragments._Payment__Payment.initProperties(_Payment);
			Fragments._Restaurant__Restaurant.initProperties(_Restaurant);
			Fragments._UPIPayment__UPIPayment.initProperties(_UPIPayment);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of Hw1Tables::FragmentProperties and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The lists of enumeration literals for each enumeration.
	 */
	public static class EnumerationLiterals {
		static {
			Init.initStart();
			FragmentProperties.init();
		}

		/**
		 *	Install the enumeration literals in the enumerations.
		 */
		static {

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of Hw1Tables::EnumerationLiterals and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 * The multiple packages above avoid problems with the Java 65536 byte limit but introduce a difficulty in ensuring that
	 * static construction occurs in the disciplined order of the packages when construction may start in any of the packages.
	 * The problem is resolved by ensuring that the static construction of each package first initializes its immediate predecessor.
	 * On completion of predecessor initialization, the residual packages are initialized by starting an initialization in the last package.
	 * This class maintains a count so that the various predecessors can distinguish whether they are the starting point and so
	 * ensure that residual construction occurs just once after all predecessors.
	 */
	private static class Init {
		/**
		 * Counter of nested static constructions. On return to zero residual construction starts. -ve once residual construction started.
		 */
		private static int initCount = 0;

		/**
		 * Invoked at the start of a static construction to defer residual construction until primary constructions complete.
		 */
		private static void initStart() {
			if (initCount >= 0) {
				initCount++;
			}
		}

		/**
		 * Invoked at the end of a static construction to activate residual construction once primary constructions complete.
		 */
		private static void initEnd() {
			if (initCount > 0) {
				if (--initCount == 0) {
					initCount = -1;
					EnumerationLiterals.init();
				}
			}
		}
	}

	static {
		Init.initEnd();
	}

	/*
	 * Force initialization of outer fields. Inner fields are lazily initialized.
	 */
	public static void init() {
		new Hw1Tables();
	}

	private Hw1Tables() {
		super(Hw1Package.eNS_URI);
	}
}
