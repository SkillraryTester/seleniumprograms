package testng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo {
	@Test
	public void login()
	{
		Reporter.log("login",true);
	}

	@Test
	public void deleteaccount()
	{
		Reporter.log("deleteaccount",true);
	}

	@Test(groups="createaccount")
	public void createaccount()
	{
		Reporter.log("createaccount",true);
	}

	@Test
	public void logout()
	{
		Reporter.log("logout",true);
	}

}
