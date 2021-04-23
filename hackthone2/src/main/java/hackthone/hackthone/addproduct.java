package hackthone.hackthone;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class addproduct {
	public WebDriver driver;

	By name = By.xpath("//input[@class='_2IX_2- VJZDxU']");
	By pass = By.xpath("//input[@type='password']");
	By click_link = By.xpath("//button[@type='submit']//span[contains(text(),'Login')]");
	
	By search=By.xpath("//*[@id='container']/div/div[1]/div[1]/div[2]/div[2]/form/div/div/input");
	//Select item
	By item=By.xpath("//body/div[@id='container']/div/div[@class='_36fx1h _6t1WkM _3HqJxg']/div[@class='_1YokD2 _2GoDe3']/div[@class='_1YokD2 _3Mn1Gg']/div[2]/div[1]/div[1]/div[1]/a[1]/div[2]/div[1]/div[1]");
			
	//Add to cart
	
	By addcart=By.xpath("//button[normalize-space()='ADD TO CART']");
	public addproduct(WebDriver driver) {
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
			
			public WebElement getsearch() {
				return driver.findElement(search);
			}
			public WebElement getitem() {
				return driver.findElement(item);
			}
			public WebElement getcart() {
				return driver.findElement(addcart);
			}
			
			
}
