package hackthone.hackthone;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class navigatetocategoryurl {
	public WebDriver driver;

	By name = By.xpath("//input[@class='_2IX_2- VJZDxU']");
	By pass = By.xpath("//input[@type='password']");
	By click_link = By.xpath("//button[@type='submit']//span[contains(text(),'Login')]");

	//Click on electronics
	By click_electroics=By.xpath("//p[normalize-space()='Electronics']");

	//Dispplay list
	By electronic_item=By.xpath("//span[@class='_2I9KP_ _2WDRax']");
	
	public navigatetocategoryurl(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement getname() {
		return driver.findElement(name);
	}

	public WebElement getpass() {
		return driver.findElement(pass);
	}

	public WebElement getlogin() {
		return driver.findElement(click_link);
	}
	
	public WebElement getelectronics() {
		return driver.findElement(click_electroics);
	}
	
	public List<WebElement> getelectronics_itemlist() {
		return driver.findElements(electronic_item);
	}
	
}
