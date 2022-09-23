package POM_Classes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class MasterPage {

	WebDriver driver;

	@FindBy(xpath = "//div[text()='मास्टर']")
	private WebElement masterbutton;

	@FindBy(xpath = "//a[@href=\"/designationRegister\"]")
	private WebElement postName;

	@FindBy(xpath = "/html/body/app-root/app-layout/div/div/app-designation/div/div/div/div/div[1]/form/div/div/div[1]/div[2]/div/ngx-select/div/div[2]/div") 
	private WebElement SelectTaluka;
	//input[@placeholder=" समिती स्तर "]
	//ngx-select[@optiontextfield=\"committee\"]
	@FindBy(xpath = "//input[@placeholder=\" समिती स्तर \"]")
	private WebElement Talukalevel;

	@FindBy(xpath = "//input[@placeholder=\"पदनाम\"]")
	private WebElement postname;

	@FindBy(xpath = "//input[@class=\"form-control ng-untouched ng-pristine ng-invalid\"]")
	private WebElement postname2;

	@FindBy(xpath = "/html/body/app-root/app-layout/div/div/app-designation/div/div/div/div/div[1]/form/div/div/div[2]/button[2]")
	private WebElement save;

	public MasterPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}

	public void clickOnMasterAndPostButton() throws InterruptedException {
		Thread.sleep(1000);
		masterbutton.click();
		Thread.sleep(1000);
		postName.click();
	}

	public void selectTaluka() throws InterruptedException {
		Thread.sleep(1000);
		SelectTaluka.click();
		Thread.sleep(3000);
		Talukalevel.sendKeys("DLC Committee");//span[text()='ittee']
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[@class=\"ngx-select__item dropdown-item ng-star-inserted ngx-select__item_active active\"]")).click();
//		Thread.sleep(2000);
//		Select s=new Select(Talukalevel);
//		Thread.sleep(1000);
//		s.deselectByIndex(5);
	}

	public void enterPostnames() throws InterruptedException {
		Thread.sleep(2000);
		postname.click();
		postname.sendKeys("User123");
		Thread.sleep(2000);
		 postname2.click();
		 postname2.sendKeys("गणेशोत्सव उत्साह.");
	}

	public void clickOnSave() throws InterruptedException {
		Thread.sleep(2000);
		save.click();
		System.out.println("Data Saved Successfully");
//		WebElement ele=driver.findElement(By.xpath("//div[@class=\"ng-tns-c36-16 ng-star-inserted ng-trigger ng-trigger-flyInOut ngx-toastr toast-success\"]"));
//		String s=ele.getText();
//		System.out.println(s);
	}
}






