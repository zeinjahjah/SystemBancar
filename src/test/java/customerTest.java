import org.junit.jupiter.api.Assertions;

import bank.*;

public class customerTest {

	public void testSignup() {
		// TODO Auto-generated constructor stub
		Customer x = new Customer();
		String id = x.autoId();
		x.setTxtuser(id , "zen","jah", "Take Ionescu", "Timisoara", "123456", "test@gmail.com", "test123", "123");
		Assertions.assertEquals("done", x.addCustomer(true));
		// delete test user
		x.deleteCustomer(id);
	}
	

}
