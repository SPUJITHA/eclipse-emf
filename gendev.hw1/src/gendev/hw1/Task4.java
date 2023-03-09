package gendev.hw1;


import java.io.IOException;
import java.util.Collections;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

public class Task4 {
	public static String instance = "task4_instance/instance.xmi";

	public static void main(String[] args) {
		System.out.println("Creating and saving instance to file " + instance);

		// TODO implement your code here
		// Retrieve the default factory singleton

        Hw1Factory factory = Hw1Factory.eINSTANCE;

        // create the content of the model via this program
        //Online User object
        OnlineUser user = factory.createOnlineUser();
        ContinentalCuisine cont = factory.createContinentalCuisine();
        cont.setDescription("Apple pie chocolate");
        cont.setName("Pie");
        cont.setPrice(35f);
       
      //Payment  object
       Payment payment = factory.createPayment();
       payment.setOrderId("ORDER01");
       payment.setPrice(35f);
       payment.setDate(null);
       
     //Restaurant object
       Restaurant restaurant = factory.createRestaurant();
       restaurant.setLocation("Leicester");
       restaurant.setName("TinyBakery");
       restaurant.setOrderId("ORDER01");
      
       //Order object
       Order order = factory.createOrder();
       order.setOrderId("ORDER01");
       order.setPrice(35f);
       order.setStatus("PAID");
       order.getPay().add(payment);
      
       //user object
       user.setEmail("pujitha.s97@gmail.com");
       user.setName("Pujitha");
       user.setUserId("12345");
      
       user.getAdds().add(cont);
       user.getPlaces().add(order);
       

      
        
        // Register the XMI resource factory for the .instance xmi extension in task4 folder

        Resource.Factory.Registry registry = Resource.Factory.Registry.INSTANCE;

        Map<String, Object> m = registry.getExtensionToFactoryMap();

        m.put("xmi", new XMIResourceFactoryImpl());

        // Obtain a new resource set

        ResourceSet resSet = new ResourceSetImpl();

        // create a resource
        Resource resource = resSet.createResource(URI

                .createURI(instance));

        resource.getContents().add(user);

        resource.getContents().add(order);

        resource.getContents().add(restaurant);

        resource.getContents().add(payment);

        resource.getContents().add(cont);

        //  Save the resource content.

        try {

            resource.save(Collections.EMPTY_MAP);

        } catch (IOException e) {

            // TODO Auto-generated catch block

            e.printStackTrace();

        }
  }
}


