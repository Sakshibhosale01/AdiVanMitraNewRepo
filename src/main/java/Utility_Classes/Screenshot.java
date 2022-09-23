package Utility_Classes;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Screenshot {

	WebDriver driver;
	public static String getScreenshot(WebDriver driver, String testName) throws IOException
	{
		File source=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	    String path=testName+".png";
		//File Dest=new File("C:\\Users\\sakshib\\Pictures\\Screenshot");
		File dest= new File(path);
		FileHandler.copy(source, dest);
		return path;
	}
	
}
