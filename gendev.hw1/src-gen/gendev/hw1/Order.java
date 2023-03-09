/**
 */
package gendev.hw1;

import java.util.Calendar;
import java.util.Map;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Order</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gendev.hw1.Order#getOrderId <em>Order Id</em>}</li>
 *   <li>{@link gendev.hw1.Order#getStatus <em>Status</em>}</li>
 *   <li>{@link gendev.hw1.Order#getDate <em>Date</em>}</li>
 *   <li>{@link gendev.hw1.Order#getPay <em>Pay</em>}</li>
 *   <li>{@link gendev.hw1.Order#getPrice <em>Price</em>}</li>
 *   <li>{@link gendev.hw1.Order#getReceives <em>Receives</em>}</li>
 *   <li>{@link gendev.hw1.Order#getUserId <em>User Id</em>}</li>
 * </ul>
 *
 * @see gendev.hw1.Hw1Package#getOrder()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='inv3PriceCheck'"
 * @generated
 */
public interface Order extends EObject {
	/**
	 * Returns the value of the '<em><b>Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Price</em>' attribute.
	 * @see #setPrice(float)
	 * @see gendev.hw1.Hw1Package#getOrder_Price()
	 * @model required="true"
	 * @generated
	 */
	float getPrice();

	/**
	 * Sets the value of the '{@link gendev.hw1.Order#getPrice <em>Price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Price</em>' attribute.
	 * @see #getPrice()
	 * @generated
	 */
	void setPrice(float value);

	/**
	 * Returns the value of the '<em><b>Order Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Order Id</em>' attribute.
	 * @see #setOrderId(String)
	 * @see gendev.hw1.Hw1Package#getOrder_OrderId()
	 * @model
	 * @generated
	 */
	String getOrderId();

	/**
	 * Sets the value of the '{@link gendev.hw1.Order#getOrderId <em>Order Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Order Id</em>' attribute.
	 * @see #getOrderId()
	 * @generated
	 */
	void setOrderId(String value);

	/**
	 * Returns the value of the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status</em>' attribute.
	 * @see #setStatus(String)
	 * @see gendev.hw1.Hw1Package#getOrder_Status()
	 * @model
	 * @generated
	 */
	String getStatus();

	/**
	 * Sets the value of the '{@link gendev.hw1.Order#getStatus <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' attribute.
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(String value);

	/**
	 * Returns the value of the '<em><b>Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date</em>' attribute.
	 * @see #setDate(Calendar)
	 * @see gendev.hw1.Hw1Package#getOrder_Date()
	 * @model dataType="gendev.hw1.Calendar"
	 * @generated
	 */
	Calendar getDate();

	/**
	 * Sets the value of the '{@link gendev.hw1.Order#getDate <em>Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date</em>' attribute.
	 * @see #getDate()
	 * @generated
	 */
	void setDate(Calendar value);

	/**
	 * Returns the value of the '<em><b>Pay</b></em>' containment reference list.
	 * The list contents are of type {@link gendev.hw1.Payment}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pay</em>' containment reference list.
	 * @see gendev.hw1.Hw1Package#getOrder_Pay()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Payment> getPay();

	/**
	 * Returns the value of the '<em><b>Receives</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Receives</em>' reference.
	 * @see #setReceives(Restaurant)
	 * @see gendev.hw1.Hw1Package#getOrder_Receives()
	 * @model
	 * @generated
	 */
	Restaurant getReceives();

	/**
	 * Sets the value of the '{@link gendev.hw1.Order#getReceives <em>Receives</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Receives</em>' reference.
	 * @see #getReceives()
	 * @generated
	 */
	void setReceives(Restaurant value);

	/**
	 * Returns the value of the '<em><b>User Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>User Id</em>' attribute.
	 * @see #setUserId(String)
	 * @see gendev.hw1.Hw1Package#getOrder_UserId()
	 * @model
	 * @generated
	 */
	String getUserId();

	/**
	 * Sets the value of the '{@link gendev.hw1.Order#getUserId <em>User Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>User Id</em>' attribute.
	 * @see #getUserId()
	 * @generated
	 */
	void setUserId(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void fetchOrderDetails(String orderId);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='price &gt; 0'"
	 * @generated
	 */
	boolean inv3PriceCheck(DiagnosticChain diagnostics, Map<Object, Object> context);

} // Order
