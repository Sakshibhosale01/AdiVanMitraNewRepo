package POM_Classes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Update_Master {

	WebDriver driver;

	@FindBy(xpath = "//button[@class=\"btn text-main bg-light-main rounded me-2\"]")
	private WebElement updateBTN;

	@FindBy(xpath = "//input[@placeholder=\"पदनाम\"]")
	private WebElement postname;

	@FindBy(xpath = "/html/body/app-root/app-layout/div/div/app-designation/div/div/div/div/div[1]/form/div/div/div[1]/div[4]/div/input")
	private WebElement postname2;

	@FindBy(xpath = "/html/body/app-root/app-layout/div/div/app-designation/div/div/div/div/div[1]/form/div/div/div[2]/button[2]")
	private WebElement update;
	
	public Update_Master(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}

	public void clickOnUpdate() throws InterruptedException {
		Thread.sleep(4000);
		updateBTN.click();
	}
	
	public void updatePosts() throws InterruptedException {
		Thread.sleep(2000);
		postname.click();
		postname.clear();
		Thread.sleep(2000);
		postname.sendKeys("DemoUser");
		Thread.sleep(2000);
		postname2.click();
		postname2.clear();
		Thread.sleep(1000);
		postname2.sendKeys("विसर्जन");
	}

	public void clickOnSave() throws InterruptedException {
		Thread.sleep(2000);
		update.click();
		System.out.println("Data Updated successfully");
//		WebElement ele=driver.findElement(By.xpath("//div[text()=' Record updated successfully ']"));
//		String s=ele.getText();
//		System.out.println(s);
	}
}
