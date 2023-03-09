/**
 */
package gendev.hw1;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Restaurant</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gendev.hw1.Restaurant#getName <em>Name</em>}</li>
 *   <li>{@link gendev.hw1.Restaurant#getLocation <em>Location</em>}</li>
 *   <li>{@link gendev.hw1.Restaurant#getOrderId <em>Order Id</em>}</li>
 * </ul>
 *
 * @see gendev.hw1.Hw1Package#getRestaurant()
 * @model
 * @generated
 */
public interface Restaurant extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see gendev.hw1.Hw1Package#getRestaurant_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link gendev.hw1.Restaurant#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Location</em>' attribute.
	 * @see #setLocation(String)
	 * @see gendev.hw1.Hw1Package#getRestaurant_Location()
	 * @model
	 * @generated
	 */
	String getLocation();

	/**
	 * Sets the value of the '{@link gendev.hw1.Restaurant#getLocation <em>Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Location</em>' attribute.
	 * @see #getLocation()
	 * @generated
	 */
	void setLocation(String value);

	/**
	 * Returns the value of the '<em><b>Order Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Order Id</em>' attribute.
	 * @see #setOrderId(String)
	 * @see gendev.hw1.Hw1Package#getRestaurant_OrderId()
	 * @model
	 * @generated
	 */
	String getOrderId();

	/**
	 * Sets the value of the '{@link gendev.hw1.Restaurant#getOrderId <em>Order Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Order Id</em>' attribute.
	 * @see #getOrderId()
	 * @generated
	 */
	void setOrderId(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void receiveOrder(String orderId);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void packItems(String orderId);

} // Restaurant
