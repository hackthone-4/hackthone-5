package hackthone.hackthone;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class verifylogo {
	public WebDriver driver;

	By logo = By.xpath("");
	public verifylogo(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement getlogo() {
		return driver.findElement(logo);
	}
}
