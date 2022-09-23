package Register;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import POM_Classes.Login;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class UserLogin {

	WebDriver driver;

	@BeforeClass
	public void LaunchedWeb() throws InterruptedException {
		WebDriverManager.chromiumdriver().setup();
		driver = new ChromeDriver();
		driver.get("http://trti.mahamining.com/designationRegister");
		driver.manage().window().maximize();
		Thread.sleep(2000);
	}
		
	@Test
	public void  Login() throws InterruptedException {
	Login l=new Login(driver);
	l.clickOnAdhikariLoginButton();	
	l.enterUserName();
	l.enterPassword();
	l.enterCaptcha();
	Thread.sleep(1000);
	l.LoginButton();
	Thread.sleep(2000);
	//String dashboardURL=driver.getCurrentUrl();
	//Assert.assertEquals( dashboardURL, "http://trti.mahamining.com/mprDashboard");
	
	WebElement ele=driver.findElement(By.xpath("//div[text()=' Login successfully ']"));
	String s=ele.getText();
	System.out.println( s);

	}
	

}