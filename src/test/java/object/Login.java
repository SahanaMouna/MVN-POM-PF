package object; //page factory model

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {
	ChromeDriver driver;
//	private By username=By.xpath("//input[@id=\"loginusername\"]");
//	private By password=By.xpath("//input[@id=\"loginpassword\"]");
//	private By login=By.xpath("//button[text()=\"Log in\"]");
	public Login(ChromeDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//input[@id='loginusername']")
	WebElement username;
	@FindBy(id="loginpassword")
	WebElement password ;
	@FindBy(xpath="//button[text()='Log in']")
	WebElement login;
	@FindBy(xpath="(//button[text()='Close'])[2]")
	WebElement Close;
	public WebElement user() {
		return username;
	}
	public WebElement pwd() {
		return password;
}
	public WebElement log_in() {
		return login;
}
	public WebElement handle() {
		return Close;
}
}