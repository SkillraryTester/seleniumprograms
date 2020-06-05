import org.testng.Reporter;
import org.testng.annotations.Test;

public class Whatsup {
	@Test(invocationCount = 3)
	public void calls()
	{
		Reporter.log("calling",true);
	}
	
	@Test(priority = 2,invocationCount =5)
	public void settings()
	{
		Reporter.log("settings",true);
	}

	@Test(priority = -1,enabled = false)
	public void chats()
	{
		Reporter.log("chatting",true);
	}

}
