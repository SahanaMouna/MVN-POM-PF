package Registration; //page object model

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Register {
	ChromeDriver driver;
	 private By sign_username=By.xpath("//input[@id=\"sign-username\"]");
	 private By sign_pwd= By.xpath("//input[@id=\"sign-password\"]");
	 private By sign_up= By.xpath("//button[text()=\"Sign up\"]");
	 private By handle = By.xpath("(//button[@class=\"btn btn-secondary\"])[2]");
	
	 public Register(ChromeDriver driver) {
			this.driver=driver;
		}
	 public WebElement sign_user() {
			return driver.findElement(sign_username);
		}
		public WebElement password() {
			return driver.findElement(sign_pwd);
	}
		public WebElement Sign_up() {
			return driver.findElement(sign_up);
			
	}
		public WebElement Handle() {
			return driver.findElement(handle);
	}
}
