package Base_Classes;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass1 {

	private WebDriver driver;
	String URL = "http://trti.mahamining.com/designationRegister";

	@Parameters("browser")
	@BeforeTest
	public void launchapp(String browser) {

		if (browser.equalsIgnoreCase("firefox")) {
			System.out.println("Launching on FireFox");
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			driver.get(URL);
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.manage().window().maximize();
		} else if (browser.equalsIgnoreCase("chrome")) {
			System.out.println("Launching on CHROME");
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.get(URL);
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.manage().window().maximize();
		} else if (browser.equalsIgnoreCase("ie")) {
			System.out.println("Launching on IE");
			WebDriverManager.iedriver().setup();
			driver = new InternetExplorerDriver();
			driver.get(URL);
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.manage().window().maximize();
		} else if (browser.equalsIgnoreCase("safari")) {
			System.out.println("Launching on mirosoftEdge");
			WebDriverManager.safaridriver().setup();
			driver = new EdgeDriver();
			driver.get(URL);
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.manage().window().maximize();
		}

		else {
		}
		throw new IllegalArgumentException("The Browser Type is Undefined");
	}
}
