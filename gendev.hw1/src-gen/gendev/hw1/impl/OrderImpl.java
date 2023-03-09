/**
 */
package gendev.hw1.impl;

import gendev.hw1.Hw1Package;
import gendev.hw1.Hw1Tables;
import gendev.hw1.Order;
import gendev.hw1.Payment;
import gendev.hw1.Restaurant;
import java.lang.reflect.InvocationTargetException;

import java.util.Calendar;
import java.util.Collection;
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
import org.eclipse.ocl.pivot.ids.TypeId;
import org.eclipse.ocl.pivot.library.oclany.OclComparableGreaterThanOperation;
import org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation;
import org.eclipse.ocl.pivot.library.string.CGStringGetSeverityOperation;
import org.eclipse.ocl.pivot.library.string.CGStringLogDiagnosticOperation;
import org.eclipse.ocl.pivot.utilities.PivotUtil;
import org.eclipse.ocl.pivot.utilities.ValueUtil;
import org.eclipse.ocl.pivot.values.IntegerValue;
import org.eclipse.ocl.pivot.values.RealValue;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Order</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gendev.hw1.impl.OrderImpl#getOrderId <em>Order Id</em>}</li>
 *   <li>{@link gendev.hw1.impl.OrderImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link gendev.hw1.impl.OrderImpl#getDate <em>Date</em>}</li>
 *   <li>{@link gendev.hw1.impl.OrderImpl#getPay <em>Pay</em>}</li>
 *   <li>{@link gendev.hw1.impl.OrderImpl#getPrice <em>Price</em>}</li>
 *   <li>{@link gendev.hw1.impl.OrderImpl#getReceives <em>Receives</em>}</li>
 *   <li>{@link gendev.hw1.impl.OrderImpl#getUserId <em>User Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OrderImpl extends MinimalEObjectImpl.Container implements Order {
	/**
	 * The default value of the '{@link #getOrderId() <em>Order Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrderId()
	 * @generated
	 * @ordered
	 */
	protected static final String ORDER_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOrderId() <em>Order Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrderId()
	 * @generated
	 * @ordered
	 */
	protected String orderId = ORDER_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getStatus() <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected static final String STATUS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStatus() <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected String status = STATUS_EDEFAULT;

	/**
	 * The default value of the '{@link #getDate() <em>Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDate()
	 * @generated
	 * @ordered
	 */
	protected static final Calendar DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDate() <em>Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDate()
	 * @generated
	 * @ordered
	 */
	protected Calendar date = DATE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPay() <em>Pay</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPay()
	 * @generated
	 * @ordered
	 */
	protected EList<Payment> pay;

	/**
	 * The default value of the '{@link #getPrice() <em>Price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrice()
	 * @generated
	 * @ordered
	 */
	protected static final float PRICE_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getPrice() <em>Price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrice()
	 * @generated
	 * @ordered
	 */
	protected float price = PRICE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getReceives() <em>Receives</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReceives()
	 * @generated
	 * @ordered
	 */
	protected Restaurant receives;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OrderImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Hw1Package.Literals.ORDER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getPrice() {
		return price;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrice(float newPrice) {
		float oldPrice = price;
		price = newPrice;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Hw1Package.ORDER__PRICE, oldPrice, price));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOrderId() {
		return orderId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOrderId(String newOrderId) {
		String oldOrderId = orderId;
		orderId = newOrderId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Hw1Package.ORDER__ORDER_ID, oldOrderId, orderId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStatus(String newStatus) {
		String oldStatus = status;
		status = newStatus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Hw1Package.ORDER__STATUS, oldStatus, status));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Calendar getDate() {
		return date;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDate(Calendar newDate) {
		Calendar oldDate = date;
		date = newDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Hw1Package.ORDER__DATE, oldDate, date));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Payment> getPay() {
		if (pay == null) {
			pay = new EObjectContainmentEList<Payment>(Payment.class, this, Hw1Package.ORDER__PAY);
		}
		return pay;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Restaurant getReceives() {
		if (receives != null && receives.eIsProxy()) {
			InternalEObject oldReceives = (InternalEObject) receives;
			receives = (Restaurant) eResolveProxy(oldReceives);
			if (receives != oldReceives) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Hw1Package.ORDER__RECEIVES, oldReceives,
							receives));
			}
		}
		return receives;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Restaurant basicGetReceives() {
		return receives;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReceives(Restaurant newReceives) {
		Restaurant oldReceives = receives;
		receives = newReceives;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Hw1Package.ORDER__RECEIVES, oldReceives, receives));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Hw1Package.ORDER__USER_ID, oldUserId, userId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void fetchOrderDetails(final String orderId) {
		throw new UnsupportedOperationException(); // FIXME Unimplemented http://www.example.org/hw1!Order!fetchOrderDetails(String)
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean inv3PriceCheck(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "Order::inv3PriceCheck";
		try {
			/**
			 *
			 * inv inv3PriceCheck:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let result : Boolean[1] = price > 0
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this);
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor,
					Hw1Package.Literals.ORDER___INV3_PRICE_CHECK__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE
					.evaluate(executor, severity_0, Hw1Tables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean IF_le;
			if (le) {
				IF_le = true;
			} else {
				final /*@NonInvalid*/ float price = this.getPrice();
				final /*@NonInvalid*/ RealValue BOXED_price = ValueUtil.realValueOf(price);
				final /*@NonInvalid*/ boolean result = OclComparableGreaterThanOperation.INSTANCE
						.evaluate(executor, BOXED_price, Hw1Tables.INT_0).booleanValue();
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
		case Hw1Package.ORDER__PAY:
			return ((InternalEList<?>) getPay()).basicRemove(otherEnd, msgs);
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
		case Hw1Package.ORDER__ORDER_ID:
			return getOrderId();
		case Hw1Package.ORDER__STATUS:
			return getStatus();
		case Hw1Package.ORDER__DATE:
			return getDate();
		case Hw1Package.ORDER__PAY:
			return getPay();
		case Hw1Package.ORDER__PRICE:
			return getPrice();
		case Hw1Package.ORDER__RECEIVES:
			if (resolve)
				return getReceives();
			return basicGetReceives();
		case Hw1Package.ORDER__USER_ID:
			return getUserId();
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
		case Hw1Package.ORDER__ORDER_ID:
			setOrderId((String) newValue);
			return;
		case Hw1Package.ORDER__STATUS:
			setStatus((String) newValue);
			return;
		case Hw1Package.ORDER__DATE:
			setDate((Calendar) newValue);
			return;
		case Hw1Package.ORDER__PAY:
			getPay().clear();
			getPay().addAll((Collection<? extends Payment>) newValue);
			return;
		case Hw1Package.ORDER__PRICE:
			setPrice((Float) newValue);
			return;
		case Hw1Package.ORDER__RECEIVES:
			setReceives((Restaurant) newValue);
			return;
		case Hw1Package.ORDER__USER_ID:
			setUserId((String) newValue);
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
		case Hw1Package.ORDER__ORDER_ID:
			setOrderId(ORDER_ID_EDEFAULT);
			return;
		case Hw1Package.ORDER__STATUS:
			setStatus(STATUS_EDEFAULT);
			return;
		case Hw1Package.ORDER__DATE:
			setDate(DATE_EDEFAULT);
			return;
		case Hw1Package.ORDER__PAY:
			getPay().clear();
			return;
		case Hw1Package.ORDER__PRICE:
			setPrice(PRICE_EDEFAULT);
			return;
		case Hw1Package.ORDER__RECEIVES:
			setReceives((Restaurant) null);
			return;
		case Hw1Package.ORDER__USER_ID:
			setUserId(USER_ID_EDEFAULT);
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
		case Hw1Package.ORDER__ORDER_ID:
			return ORDER_ID_EDEFAULT == null ? orderId != null : !ORDER_ID_EDEFAULT.equals(orderId);
		case Hw1Package.ORDER__STATUS:
			return STATUS_EDEFAULT == null ? status != null : !STATUS_EDEFAULT.equals(status);
		case Hw1Package.ORDER__DATE:
			return DATE_EDEFAULT == null ? date != null : !DATE_EDEFAULT.equals(date);
		case Hw1Package.ORDER__PAY:
			return pay != null && !pay.isEmpty();
		case Hw1Package.ORDER__PRICE:
			return price != PRICE_EDEFAULT;
		case Hw1Package.ORDER__RECEIVES:
			return receives != null;
		case Hw1Package.ORDER__USER_ID:
			return USER_ID_EDEFAULT == null ? userId != null : !USER_ID_EDEFAULT.equals(userId);
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
		case Hw1Package.ORDER___FETCH_ORDER_DETAILS__STRING:
			fetchOrderDetails((String) arguments.get(0));
			return null;
		case Hw1Package.ORDER___INV3_PRICE_CHECK__DIAGNOSTICCHAIN_MAP:
			return inv3PriceCheck((DiagnosticChain) arguments.get(0), (Map<Object, Object>) arguments.get(1));
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
		result.append(" (orderId: ");
		result.append(orderId);
		result.append(", status: ");
		result.append(status);
		result.append(", date: ");
		result.append(date);
		result.append(", price: ");
		result.append(price);
		result.append(", userId: ");
		result.append(userId);
		result.append(')');
		return result.toString();
	}

} //OrderImpl
