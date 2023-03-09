/**
 */
package gendev.hw1;

import java.util.Calendar;

import java.util.Map;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Payment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gendev.hw1.Payment#getOrderId <em>Order Id</em>}</li>
 *   <li>{@link gendev.hw1.Payment#getDate <em>Date</em>}</li>
 *   <li>{@link gendev.hw1.Payment#getPrice <em>Price</em>}</li>
 * </ul>
 *
 * @see gendev.hw1.Hw1Package#getPayment()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='PaymentCheck'"
 * @generated
 */
public interface Payment extends EObject {
	/**
	 * Returns the value of the '<em><b>Order Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Order Id</em>' attribute.
	 * @see #setOrderId(String)
	 * @see gendev.hw1.Hw1Package#getPayment_OrderId()
	 * @model
	 * @generated
	 */
	String getOrderId();

	/**
	 * Sets the value of the '{@link gendev.hw1.Payment#getOrderId <em>Order Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Order Id</em>' attribute.
	 * @see #getOrderId()
	 * @generated
	 */
	void setOrderId(String value);

	/**
	 * Returns the value of the '<em><b>Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date</em>' attribute.
	 * @see #setDate(Calendar)
	 * @see gendev.hw1.Hw1Package#getPayment_Date()
	 * @model dataType="gendev.hw1.Calendar"
	 * @generated
	 */
	Calendar getDate();

	/**
	 * Sets the value of the '{@link gendev.hw1.Payment#getDate <em>Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date</em>' attribute.
	 * @see #getDate()
	 * @generated
	 */
	void setDate(Calendar value);

	/**
	 * Returns the value of the '<em><b>Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Price</em>' attribute.
	 * @see #setPrice(float)
	 * @see gendev.hw1.Hw1Package#getPayment_Price()
	 * @model required="true"
	 * @generated
	 */
	float getPrice();

	/**
	 * Sets the value of the '{@link gendev.hw1.Payment#getPrice <em>Price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Price</em>' attribute.
	 * @see #getPrice()
	 * @generated
	 */
	void setPrice(float value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void performPayment();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='self.price &gt; 0 and self.price &lt;= 10000'"
	 * @generated
	 */
	boolean PaymentCheck(DiagnosticChain diagnostics, Map<Object, Object> context);

} // Payment
