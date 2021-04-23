package hackthone.hackthone;

import org.testng.annotations.Test;
import java.net.URL;
import java.util.List;

import javax.net.ssl.HttpsURLConnection;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import resources.base;



public class ValidateURL extends base {
	WebDriver driver;
	@Test
	public void borkenlinks() throws Exception{
		driver=initialize();
		driver.get("https://www.flipcart.com/");
		verifyURL url = new verifyURL(driver);
		
		WebElement actualMsg=url.getcount();
				String errorMsg= "Invlaid url";

				if(actualMsg.equals(errorMsg)) {
				        System.out.println("valid url");
				    }else{
				        System.out.println("Invalid url");
				    };
	}
	}
