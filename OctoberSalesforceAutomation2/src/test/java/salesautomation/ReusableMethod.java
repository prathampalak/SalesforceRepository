package salesautomation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ReusableMethod {
 static WebDriver driver;
	public static void login()
	{
	WebElement loginbtn = driver.findElement(By.id("Login"));
	loginbtn.click();
	}
	public static void launch()
	{
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		driver.get("https://login.salesforce.com/");
		WebElement username = driver.findElement(By.xpath("//input[@id='username']"));
		username.sendKeys("luxmi@infomaster.com");
		
	}
	public static void clickElement(WebElement element, String objname) {
		if (element.isDisplayed()) {
			element.click();
			System.out.println("pass " + objname + " element clicked");
		} else {
			System.out.println("fail");
		}
	}
	public static void waitForVisibilty(WebElement w) {
		WebDriverWait wait = new WebDriverWait(driver,50);
		wait.until(ExpectedConditions.visibilityOf(w));
	}
	public static void enterText(WebElement element, String text, String objname) {
		if (element.isDisplayed()) {
			clearElement(element, objname);
			element.sendKeys(text);
			System.out.println("text entered in " + objname + " field");
		} else {
			System.out.println("fail: " + objname + " element not displayed");
		}
	}
	
	public static void clearElement(WebElement element, String objname) {
		if (element.isDisplayed()) {
			element.clear();
			System.out.println("pass: " + objname + " element is cleared");
		} else {
			System.out.println("Fail: " + objname + " element not displayed");
		}

	}
	public static void validationString(String act, String expect) {

		System.out.println("actual=" + act);
		System.out.println("expected=" + expect);
		if (act.equalsIgnoreCase(expect)) {
			System.out.println("Actual and expected are same");
		} else {
			System.out.println("Actual and expected are not same");
		}
	}

	
}
