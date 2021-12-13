import org.junit.jupiter.api.Assertions;

import bank.Account;
import bank.Customer;

public class accountTest {

	public void testCreatingAccount() {
		// TODO Auto-generated constructor stub
		Customer x = new Customer();
		String cust_id = x.autoId();
		Account a = new Account(cust_id, "test test");
		String acc_id = a.autoId();
		a.setAccount(acc_id, "2400");
		Assertions.assertEquals("done", a.addAccount(true));
		a.deleteAccount(acc_id);

	}

}
