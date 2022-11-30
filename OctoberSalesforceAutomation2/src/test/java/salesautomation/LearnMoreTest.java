package salesautomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnMoreTest {
	static WebDriver driver;
	

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://login.salesforce.com/");	
		WebElement fram=driver.findElement(By.xpath("//iframe[@id='marketing']"));
		driver.switchTo().frame(fram);
		WebElement learn=driver.findElement(By.xpath("//a[contains(@href,'signup') and @target='_blank']"));
		learn.click();
		System.out.println(learn.getText());
	

		
	}

}
