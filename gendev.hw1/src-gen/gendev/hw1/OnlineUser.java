/**
 */
package gendev.hw1;

import java.util.Map;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Online User</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gendev.hw1.OnlineUser#getUserId <em>User Id</em>}</li>
 *   <li>{@link gendev.hw1.OnlineUser#getName <em>Name</em>}</li>
 *   <li>{@link gendev.hw1.OnlineUser#getEmail <em>Email</em>}</li>
 *   <li>{@link gendev.hw1.OnlineUser#getPlaces <em>Places</em>}</li>
 *   <li>{@link gendev.hw1.OnlineUser#getAdds <em>Adds</em>}</li>
 * </ul>
 *
 * @see gendev.hw1.Hw1Package#getOnlineUser()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='inv2FoodItemCheck'"
 * @generated
 */
public interface OnlineUser extends EObject {
	/**
	 * Returns the value of the '<em><b>User Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>User Id</em>' attribute.
	 * @see #setUserId(String)
	 * @see gendev.hw1.Hw1Package#getOnlineUser_UserId()
	 * @model id="true"
	 * @generated
	 */
	String getUserId();

	/**
	 * Sets the value of the '{@link gendev.hw1.OnlineUser#getUserId <em>User Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>User Id</em>' attribute.
	 * @see #getUserId()
	 * @generated
	 */
	void setUserId(String value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see gendev.hw1.Hw1Package#getOnlineUser_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link gendev.hw1.OnlineUser#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Email</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Email</em>' attribute.
	 * @see #setEmail(String)
	 * @see gendev.hw1.Hw1Package#getOnlineUser_Email()
	 * @model
	 * @generated
	 */
	String getEmail();

	/**
	 * Sets the value of the '{@link gendev.hw1.OnlineUser#getEmail <em>Email</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Email</em>' attribute.
	 * @see #getEmail()
	 * @generated
	 */
	void setEmail(String value);

	/**
	 * Returns the value of the '<em><b>Places</b></em>' containment reference list.
	 * The list contents are of type {@link gendev.hw1.Order}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Places</em>' containment reference list.
	 * @see gendev.hw1.Hw1Package#getOnlineUser_Places()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Order> getPlaces();

	/**
	 * Returns the value of the '<em><b>Adds</b></em>' containment reference list.
	 * The list contents are of type {@link gendev.hw1.FoodItem}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Adds</em>' containment reference list.
	 * @see gendev.hw1.Hw1Package#getOnlineUser_Adds()
	 * @model containment="true" required="true" upper="6"
	 * @generated
	 */
	EList<FoodItem> getAdds();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void signUp(String name, String email);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void searchItems();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void addItemsToCart(FoodItem item);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void placeOrder();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='adds-&gt;size() &gt;= 1 and adds-&gt;size() &lt;=6'"
	 * @generated
	 */
	boolean inv2FoodItemCheck(DiagnosticChain diagnostics, Map<Object, Object> context);

} // OnlineUser
