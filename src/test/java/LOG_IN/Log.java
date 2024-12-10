package LOG_IN;     // page objectmodel

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import ProFactory.PrFact;
import Registration.Register;
import object.Login;

public class Log {
	ChromeDriver driver;
@Test
public void begin() throws InterruptedException {

	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.demoblaze.com/");
	 driver.findElement(By.linkText("Sign up")).click();
	 
//	 Register reg=new Register(driver);
//	 Thread.sleep(3000);
//	reg.sign_user().sendKeys("mouna56");
//    reg.password().sendKeys("mouna56@123");
//     reg.Sign_up().click();
//     reg.Handle().click(); 
	 
     Thread.sleep(3000);
     
//     Alert alert = driver.switchTo().alert();
//    
//		alert.accept();
//     Thread.sleep(3000);
//		reg.Handle().click();
//	driver.findElement(By.linkText("Log in")).click();

//	Login login=new Login(driver);
//	Thread.sleep(3000);
//	login.user().sendKeys("mouna56");
//	login.pwd().sendKeys("mouna56@123");
//	login.log_in().click();
	PrFact P_fact=new PrFact(driver);
	Thread.sleep(3000);
	P_fact.sign_user().sendKeys("mouna56");
	P_fact. password().sendKeys("mouna56@123");
	P_fact.Sign_up().click();
	Thread.sleep(3000);
    
	 Alert alert = driver.switchTo().alert();
	 alert.accept();
	P_fact.Handle().click();
	driver.findElement(By.linkText("Log in")).click();

	Login login=new Login(driver);
	Thread.sleep(3000);
	login.user().sendKeys("mouna56");
	login.pwd().sendKeys("mouna56@123");
	Thread.sleep(3000);
    
	login.log_in().click();
	login.handle().click();
}
}