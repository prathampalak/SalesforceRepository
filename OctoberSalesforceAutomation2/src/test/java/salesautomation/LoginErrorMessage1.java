package salesautomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginErrorMessage1 extends ReusableMethod {
	
	
	public static void main(String[] args) {
		launch();
		
		WebElement pwd = driver.findElement(By.id("password"));
		pwd.clear();
		login();
		WebElement msg = driver.findElement(By.id("error"));
		String expected = "Please enter your password.";
		String actual = msg.getText();
		validationString(actual,expected);
		//driver.close();
	


	}

}
