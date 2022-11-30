package salesautomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ForgotPassword4A extends ReusableMethod{
	static WebDriver driver;

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		driver.get("https://login.salesforce.com/");	
		WebElement fgot = driver.findElement(By.id("forgot_password_link"));
		fgot.click();
		WebElement fuser = driver.findElement(By.id("un"));
		fuser.sendKeys("luxmi@infomaster.com");
		WebElement cont = driver.findElement(By.id("continue"));
		cont.click();

	}

}
