package Register;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import POM_Classes.Login;
import POM_Classes.MasterPage;
import POM_Classes.Update_Master;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Register_Master {
	WebDriver driver;
	SoftAssert soft = new SoftAssert();

	@BeforeClass
	public void LaunchedURL() throws InterruptedException {
		WebDriverManager.chromiumdriver().setup();
		driver = new ChromeDriver();
		driver.get("http://trti.mahamining.com/AccessDenied");
		driver.manage().window().maximize();
		Thread.sleep(2000);
	}

	@Test(priority=0)
	public void userLogin() throws InterruptedException {
		Thread.sleep(2000);
		Login l=new Login(driver);
		l.clickOnAdhikariLoginButton();	
		l.enterUserName();
		l.enterPassword();
		l.enterCaptcha();
		Thread.sleep(1000);
		l.LoginButton();
	}
	
	@Test(priority=1)
	public void registerMaster() throws InterruptedException {
		MasterPage m=new MasterPage(driver);
		Thread.sleep(1000);
	    m.clickOnMasterAndPostButton();
	    Thread.sleep(2000);
	    m.selectTaluka();
	    Thread.sleep(2000);
	    m.enterPostnames();
	    m.clickOnSave();
	}
	
	@Test(priority=2, dependsOnMethods="registerMaster")
	public void update() throws InterruptedException {
		Thread.sleep(1000);
		Update_Master u=new Update_Master (driver);
		u.clickOnUpdate();
		u.updatePosts();
		Thread.sleep(2000);
		u.clickOnSave();
	}
}
