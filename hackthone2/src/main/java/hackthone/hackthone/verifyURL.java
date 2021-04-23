package hackthone.hackthone;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class verifyURL {

public WebDriver driver;
	
	By name=By.xpath("//input[@class='_2IX_2- VJZDxU']");
	By pass=By.xpath("//input[@type='password']");
	By click_link=By.xpath("//button[@type='submit']//span[contains(text(),'Login')]");
	By links=By.tagName("a");
	
	public verifyURL(WebDriver driver) {
		this.driver=driver;	}

	

	public WebElement getname(){
		return driver.findElement(name);
	}
	
	public WebElement getpass(){
		return driver.findElement(pass);
	}
	
	public WebElement getlogin(){
		return driver.findElement(click_link);
	}
	public WebElement getcount(){
		return driver.findElement(links);
	}
}
	

