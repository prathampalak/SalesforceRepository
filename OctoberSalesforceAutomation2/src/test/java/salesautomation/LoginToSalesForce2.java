package salesautomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginToSalesForce2 extends ReusableMethod {


	public static void main(String[] args) {

		
			launch();
			WebElement pwd = driver.findElement(By.id("password"));
			pwd.sendKeys("ganesh54");
			login();
	}

}
