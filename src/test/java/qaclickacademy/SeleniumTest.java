package qaclickacademy;

import org.testng.Assert;
import org.testng.annotations.Test;


public class SeleniumTest {

	//testng xml file from Maven
	// how to execute all test cases from Test folder  - mvn test
	@Test
	public void BrowserAUtomation()
	{
		System.out.println("BrowserAUtomation");	
		Assert.assertTrue(true);
	}
	@Test
	public void elementsUi()
	{
		System.out.println("elementsUi");	
	}
	
	
}
