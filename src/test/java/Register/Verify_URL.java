package Register;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Verify_URL {

	WebDriver driver;
	SoftAssert soft = new SoftAssert();

	@Test
	public void LaunchedWeb() throws InterruptedException {
		WebDriverManager.chromiumdriver().setup();
		driver = new ChromeDriver();
		Thread.sleep(1000);
		driver.get("http://trti.mahamining.com/AccessDenied");
		driver.manage().window().maximize();
	}

	@Test
	public void verifyURL() throws InterruptedException {
		Thread.sleep(2000);
		String URL = driver.getCurrentUrl();
		Assert.assertEquals(URL, "http://trti.mahamining.com/AccessDenied");
		System.out.println("URL is correct / Test Pass");
	}
}
