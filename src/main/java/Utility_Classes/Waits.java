package Utility_Classes;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Waits {

	WebDriver driver;
	
	public static WebElement expliciteWait(WebDriver driver, WebElement element)
	{
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(60));
		WebElement element1=wait.until(ExpectedConditions.visibilityOf(element));
		return element1;
	}
	
//	public static WebElement impliciteWait(WebDriver driver, WebElement element)
//	{
//		WebElement element1=driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
//		return element;
//	}

}
