package mainPackage;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

public class accountTest {

	@Test
	public void test() {
		Account a = new Account(1122,20000);
		a.withdraw(2500);
		a.deposit(3000);
		System.out.println("Balance is" + a.getBalance() + "Interest rate is" + a.getMonthlyInterestrate() + "Date created is " + a.getDateCreated());
	}

}
