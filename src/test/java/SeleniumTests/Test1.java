package SeleniumTests;

import org.testng.annotations.Test;

public class Test1 {

	@Test(groups="Smoke")
	public void add() {
		System.out.println("addition is" + 10+10);
	}
}
