package hackthone.hackthone;

import org.testng.annotations.Test;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import resources.base;

public class windowhandle extends base {
	WebDriver driver;

	@Test
	public void login() throws Exception {
		driver = initialize();
		driver.get("https://www.flipkart.com/");
		navigation homepage = new navigation(driver);
		homepage.getname().sendKeys("7387701985");
		homepage.getpass().sendKeys("Priyanka@22");
		homepage.getlogin().click();

		// 10.back to home page
		Thread.sleep(3000);
		homepage.getfilghtlink().click();
		Thread.sleep(3000);
		driver.navigate().back();

		// 9.search result
		homepage.getsearch().sendKeys("laptop" + Keys.ENTER);

	}
}