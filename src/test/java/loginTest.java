import org.junit.jupiter.api.Assertions;

import bank.Login;

public class loginTest {

	public void testValidLogin() {
		// TODO Auto-generated constructor stub
		Login x = new Login();
		x.setTxtuser("zen","123");
		Assertions.assertEquals("done", x.tryLogin(true));

	}
	
	public void testInvalidLogin() {
		// TODO Auto-generated constructor stub
		Login x = new Login();
		x.setTxtuser("invalid","invalid");
		Assertions.assertEquals("fail", x.tryLogin(true));

	}
	
	
	public void BalanceTest() {
		// TODO Auto-generated constructor stub
	
	}
	
	
	public void TransferTest() {
		// TODO Auto-generated constructor stub
	
	}
	
	
	public void DespositTest() {
		// TODO Auto-generated constructor stub
	
//		x.setTxtuser("abc");		//fasle
		
//		System.out.println(x.load());
	}
	
	
	
	
}

