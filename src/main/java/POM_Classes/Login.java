package POM_Classes;

import javax.swing.JOptionPane;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Login {

	WebDriver driver;

	@FindBy(xpath = "//a[text()='अधिकारी लॉगिन']")
	private WebElement OfficerLogin;

	@FindBy(xpath = "//input[@placeholder=\" वापरकर्त्याचे नाव\"]")
	private WebElement UserName;

	@FindBy(xpath = "//input[@placeholder=\"पासवर्ड\"]")
	private WebElement Password;

	@FindBy(xpath="//button[@class=\"btn btn-main\"]")
	private WebElement LoginButton;
	
	public Login(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}

	public void clickOnAdhikariLoginButton() throws InterruptedException {
		Thread.sleep(1000);
		OfficerLogin.click();
	}

	public void enterUserName() throws InterruptedException {
		Thread.sleep(1000);
		UserName.click();
		UserName.sendKeys("admin");
	}

	public void enterPassword() throws InterruptedException {
		Thread.sleep(1000);
		Password.click();
		Password.sendKeys("admin");
	}
	
	public void enterCaptcha() throws InterruptedException {
		Thread.sleep(1000);
		String c = JOptionPane.showInputDialog("कॅप्चा प्रविष्ट करा");
		driver.findElement(By.xpath("//input[@placeholder=\"कॅप्चा प्रविष्ट करा\"]")).sendKeys(c);
	}
	
	public void LoginButton() throws InterruptedException {
		Thread.sleep(2000);
		LoginButton.click();
	}
}
