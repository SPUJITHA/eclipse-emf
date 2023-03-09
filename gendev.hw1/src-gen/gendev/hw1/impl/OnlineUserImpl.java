/**
 */
package gendev.hw1.impl;

import gendev.hw1.FoodItem;
import gendev.hw1.Hw1Package;
import gendev.hw1.Hw1Tables;
import gendev.hw1.OnlineUser;

import gendev.hw1.Order;
import java.lang.reflect.InvocationTargetException;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.ocl.pivot.evaluation.Executor;
import org.eclipse.ocl.pivot.ids.IdResolver;
import org.eclipse.ocl.pivot.ids.TypeId;
import org.eclipse.ocl.pivot.library.collection.CollectionSizeOperation;
import org.eclipse.ocl.pivot.library.oclany.OclComparableGreaterThanEqualOperation;
import org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation;
import org.eclipse.ocl.pivot.library.string.CGStringGetSeverityOperation;
import org.eclipse.ocl.pivot.library.string.CGStringLogDiagnosticOperation;
import org.eclipse.ocl.pivot.utilities.PivotUtil;
import org.eclipse.ocl.pivot.utilities.ValueUtil;
import org.eclipse.ocl.pivot.values.IntegerValue;
import org.eclipse.ocl.pivot.values.OrderedSetValue;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Online User</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gendev.hw1.impl.OnlineUserImpl#getUserId <em>User Id</em>}</li>
 *   <li>{@link gendev.hw1.impl.OnlineUserImpl#getName <em>Name</em>}</li>
 *   <li>{@link gendev.hw1.impl.OnlineUserImpl#getEmail <em>Email</em>}</li>
 *   <li>{@link gendev.hw1.impl.OnlineUserImpl#getPlaces <em>Places</em>}</li>
 *   <li>{@link gendev.hw1.impl.OnlineUserImpl#getAdds <em>Adds</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OnlineUserImpl extends MinimalEObjectImpl.Container implements OnlineUser {
	/**
	 * The default value of the '{@link #getUserId() <em>User Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUserId()
	 * @generated
	 * @ordered
	 */
	protected static final String USER_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUserId() <em>User Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUserId()
	 * @generated
	 * @ordered
	 */
	protected String userId = USER_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getEmail() <em>Email</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmail()
	 * @generated
	 * @ordered
	 */
	protected static final String EMAIL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEmail() <em>Email</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmail()
	 * @generated
	 * @ordered
	 */
	protected String email = EMAIL_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPlaces() <em>Places</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlaces()
	 * @generated
	 * @ordered
	 */
	protected EList<Order> places;

	/**
	 * The cached value of the '{@link #getAdds() <em>Adds</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdds()
	 * @generated
	 * @ordered
	 */
	protected EList<FoodItem> adds;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OnlineUserImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Hw1Package.Literals.ONLINE_USER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUserId() {
		return userId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUserId(String newUserId) {
		String oldUserId = userId;
		userId = newUserId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Hw1Package.ONLINE_USER__USER_ID, oldUserId, userId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Hw1Package.ONLINE_USER__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEmail(String newEmail) {
		String oldEmail = email;
		email = newEmail;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Hw1Package.ONLINE_USER__EMAIL, oldEmail, email));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Order> getPlaces() {
		if (places == null) {
			places = new EObjectContainmentEList<Order>(Order.class, this, Hw1Package.ONLINE_USER__PLACES);
		}
		return places;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FoodItem> getAdds() {
		if (adds == null) {
			adds = new EObjectContainmentEList<FoodItem>(FoodItem.class, this, Hw1Package.ONLINE_USER__ADDS);
		}
		return adds;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void signUp(final String name, final String email) {
		throw new UnsupportedOperationException(); // FIXME Unimplemented http://www.example.org/hw1!OnlineUser!signUp(String,String)
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void searchItems() {
		throw new UnsupportedOperationException(); // FIXME Unimplemented http://www.example.org/hw1!OnlineUser!searchItems()
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addItemsToCart(final FoodItem item) {
		throw new UnsupportedOperationException(); // FIXME Unimplemented http://www.example.org/hw1!OnlineUser!addItemsToCart(http://www.example.org/hw1!FoodItem)
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void placeOrder() {
		throw new UnsupportedOperationException(); // FIXME Unimplemented http://www.example.org/hw1!OnlineUser!placeOrder()
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean inv2FoodItemCheck(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "OnlineUser::inv2FoodItemCheck";
		try {
			/**
			 *
			 * inv inv2FoodItemCheck:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let result : Boolean[?] = adds->size() >= 1 and adds->size() <= 6
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this);
			final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor,
					Hw1Package.Literals.ONLINE_USER___INV2_FOOD_ITEM_CHECK__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE
					.evaluate(executor, severity_0, Hw1Tables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean IF_le;
			if (le) {
				IF_le = true;
			} else {
				final /*@NonInvalid*/ List<FoodItem> adds_0 = this.getAdds();
				final /*@NonInvalid*/ OrderedSetValue BOXED_adds_0 = idResolver
						.createOrderedSetOfAll(Hw1Tables.ORD_CLSSid_FoodItem, adds_0);
				final /*@NonInvalid*/ IntegerValue size_0 = CollectionSizeOperation.INSTANCE.evaluate(BOXED_adds_0);
				final /*@NonInvalid*/ boolean ge = OclComparableGreaterThanEqualOperation.INSTANCE
						.evaluate(executor, size_0, Hw1Tables.INT_1).booleanValue();
				final /*@NonInvalid*/ Boolean result;
				if (!ge) {
					result = ValueUtil.FALSE_VALUE;
				} else {
					final /*@NonInvalid*/ boolean le_0 = OclComparableLessThanEqualOperation.INSTANCE
							.evaluate(executor, size_0, Hw1Tables.INT_6).booleanValue();
					if (!le_0) {
						result = ValueUtil.FALSE_VALUE;
					} else {
						result = ValueUtil.TRUE_VALUE;
					}
				}
				final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE
						.evaluate(executor, TypeId.BOOLEAN, constraintName, this, (Object) null, diagnostics, context,
								(Object) null, severity_0, result, Hw1Tables.INT_0)
						.booleanValue();
				IF_le = logDiagnostic;
			}
			return IF_le;
		} catch (Throwable e) {
			return ValueUtil.validationFailedDiagnostic(constraintName, this, diagnostics, context, e);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case Hw1Package.ONLINE_USER__PLACES:
			return ((InternalEList<?>) getPlaces()).basicRemove(otherEnd, msgs);
		case Hw1Package.ONLINE_USER__ADDS:
			return ((InternalEList<?>) getAdds()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case Hw1Package.ONLINE_USER__USER_ID:
			return getUserId();
		case Hw1Package.ONLINE_USER__NAME:
			return getName();
		case Hw1Package.ONLINE_USER__EMAIL:
			return getEmail();
		case Hw1Package.ONLINE_USER__PLACES:
			return getPlaces();
		case Hw1Package.ONLINE_USER__ADDS:
			return getAdds();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case Hw1Package.ONLINE_USER__USER_ID:
			setUserId((String) newValue);
			return;
		case Hw1Package.ONLINE_USER__NAME:
			setName((String) newValue);
			return;
		case Hw1Package.ONLINE_USER__EMAIL:
			setEmail((String) newValue);
			return;
		case Hw1Package.ONLINE_USER__PLACES:
			getPlaces().clear();
			getPlaces().addAll((Collection<? extends Order>) newValue);
			return;
		case Hw1Package.ONLINE_USER__ADDS:
			getAdds().clear();
			getAdds().addAll((Collection<? extends FoodItem>) newValue);
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
		case Hw1Package.ONLINE_USER__USER_ID:
			setUserId(USER_ID_EDEFAULT);
			return;
		case Hw1Package.ONLINE_USER__NAME:
			setName(NAME_EDEFAULT);
			return;
		case Hw1Package.ONLINE_USER__EMAIL:
			setEmail(EMAIL_EDEFAULT);
			return;
		case Hw1Package.ONLINE_USER__PLACES:
			getPlaces().clear();
			return;
		case Hw1Package.ONLINE_USER__ADDS:
			getAdds().clear();
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
		case Hw1Package.ONLINE_USER__USER_ID:
			return USER_ID_EDEFAULT == null ? userId != null : !USER_ID_EDEFAULT.equals(userId);
		case Hw1Package.ONLINE_USER__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case Hw1Package.ONLINE_USER__EMAIL:
			return EMAIL_EDEFAULT == null ? email != null : !EMAIL_EDEFAULT.equals(email);
		case Hw1Package.ONLINE_USER__PLACES:
			return places != null && !places.isEmpty();
		case Hw1Package.ONLINE_USER__ADDS:
			return adds != null && !adds.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	@SuppressWarnings("unchecked")
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
		case Hw1Package.ONLINE_USER___SIGN_UP__STRING_STRING:
			signUp((String) arguments.get(0), (String) arguments.get(1));
			return null;
		case Hw1Package.ONLINE_USER___SEARCH_ITEMS:
			searchItems();
			return null;
		case Hw1Package.ONLINE_USER___ADD_ITEMS_TO_CART__FOODITEM:
			addItemsToCart((FoodItem) arguments.get(0));
			return null;
		case Hw1Package.ONLINE_USER___PLACE_ORDER:
			placeOrder();
			return null;
		case Hw1Package.ONLINE_USER___INV2_FOOD_ITEM_CHECK__DIAGNOSTICCHAIN_MAP:
			return inv2FoodItemCheck((DiagnosticChain) arguments.get(0), (Map<Object, Object>) arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
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
		result.append(" (userId: ");
		result.append(userId);
		result.append(", name: ");
		result.append(name);
		result.append(", email: ");
		result.append(email);
		result.append(')');
		return result.toString();
	}

} //OnlineUserImpl
