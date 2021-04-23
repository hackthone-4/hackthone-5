package hackthone.hackthone;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import resources.base;

public class validateinvalidecredentials extends base {
	WebDriver driver;

	@Test
	public void login() throws Exception {
		driver = initialize();
		driver.get("https://www.flipkart.com/");
	
	invalideuserpassword launchinvalide=new invalideuserpassword(driver);
	launchinvalide.getname().sendKeys("7387985");
	launchinvalide.getpass().sendKeys("Priyan2");
	launchinvalide.getlogin().click();
	String actmsg=launchinvalide.geterror().getText();
	String expctedmsg="Please enter valid Email ID/Mobile number";
	if(actmsg.equals(expctedmsg)) {
        System.out.println("invalid user");
    }else{
        System.out.println("valid user");
    };

	
}
}
