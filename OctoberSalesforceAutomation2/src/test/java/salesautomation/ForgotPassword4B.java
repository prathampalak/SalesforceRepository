package salesautomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ForgotPassword4B extends ReusableMethod {
static WebDriver driver;
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		driver.get("https://login.salesforce.com/");	
		WebElement username = driver.findElement(By.id("username"));
		username.sendKeys("123");
		WebElement pwd = driver.findElement(By.id("password"));
		pwd.sendKeys("22131");
		WebElement login = driver.findElement(By.id("Login"));
		login.click();
		WebElement err = driver.findElement(By.id("error"));
		System.out.println(err.getText());
		
		String actual = err.getText();
		String expected="Please check your username and password. If you still can't log in, contact your Salesforce administrator.";
		validationString(actual,expected);
	}

}
