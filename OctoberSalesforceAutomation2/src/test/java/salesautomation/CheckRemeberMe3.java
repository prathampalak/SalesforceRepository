package salesautomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CheckRemeberMe3 extends ReusableMethod {
	
	public static void main(String[] args) {

		launch();
		WebElement pwd = driver.findElement(By.id("password"));
		pwd.sendKeys("ganesh54");
		WebElement cbox = driver.findElement(By.id("rememberUn"));
		if (!cbox.isSelected()) {
			cbox.click();
		}
		login();

		WebElement username1 = driver.findElement(By.cssSelector("#userNavLabel"));
		username1.click();
		WebElement logout = driver.findElement(By.xpath("//a[contains(text(),'Logout')]"));
		logout.click();
		WebElement username = driver.findElement(By.name("//input[@id='username']"));
		String actual = username.getText();
		System.out.println(actual);
		String expected = "luxmi@infomaster.com";
		validationString(actual, expected);
	}

}
