import org.junit.jupiter.api.Assertions;

import bank.*;

public class balanceTest {

	public void testChecBalance() {
		// TODO Auto-generated constructor stub
		
		// customer side		
		Customer x = new Customer();
		String cust_id = x.autoId();
		x.setTxtuser(cust_id , "test","test", "Take Ionescu", "Timisoara", "123456", "test@gmail.com", "test123", "123");
		x.addCustomer(true);
		
		
		
		
		
		
		// account side
		Account a = new Account(cust_id, "test test");
		String acc_id = a.autoId();
		a.setAccount(acc_id, "2400");
		a.addAccount(true);
		
		System.out.println(acc_id);
		
		// balance side
		Balance b = new Balance("user", cust_id, "test test");
		b.setAccountNumber(acc_id);
		Assertions.assertEquals("2400.0", b.checkBalance());

		a.deleteAccount(acc_id);
		x.deleteCustomer(cust_id);
	}
}

