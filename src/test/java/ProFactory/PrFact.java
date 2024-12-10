package ProFactory;   // page factory

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PrFact {
	ChromeDriver driver;
	public PrFact(ChromeDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	 @FindBy(xpath="//input[@id='sign-username']")
	 WebElement sign_username;
	 @FindBy(xpath="//input[@id=\'sign-password\']")
	 WebElement sign_pwd;
	 @FindBy(xpath="//button[text()=\'Sign up\']")
	 WebElement sign_up;
	 @FindBy(xpath="(//button[@class=\'btn btn-secondary\'])[2]")
	 WebElement handle;
	 public WebElement sign_user() {
			return sign_username;
		}
		public WebElement password() {
			return sign_pwd;
	}
		public WebElement Sign_up() {
			return sign_up;
			
	}
		public WebElement Handle() {
			return handle;
	}
}
