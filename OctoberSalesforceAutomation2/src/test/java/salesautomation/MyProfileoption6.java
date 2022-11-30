package salesautomation;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MyProfileoption6 extends ReusableMethod{
	

	public static void main(String[] args) throws InterruptedException
	{
	launch();
	WebElement pwd = driver.findElement(By.id("password"));
	pwd.sendKeys("ganesh54");
	login();
	WebElement menu = driver.findElement(By.xpath("//span[@id='userNavLabel']"));
	waitForVisibilty(menu);
	clickElement(menu, "menu");
	WebElement prof = driver.findElement(By.linkText("My Profile"));
	waitForVisibilty(prof);
	clickElement(prof,"profile");
	//WebElement edit = driver.findElement(By.xpath("//a[@class='contactInfoLaunch editLink']"));
	
//	WebElement edit = driver.findElement(
//			By.xpath("//tbody/tr[1]/td[1]/div[1]/div[2]/div[2]/div[1]/h3[1]/div[1]/div[1]/a[1]/img[1]"));

	//waitForVisibilty(edit);
	WebElement edit=driver.findElement(By.xpath("//img[@xpath='1']"));
	Thread.sleep(2000);
	clickElement(edit,"edit");

	driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='contactInfoContentId']")));
	Thread.sleep(3000);
	driver.findElement(By.xpath("//a[contains(text(),'About')]")).click();
	WebElement lname = driver.findElement(By.xpath("//input[@id='lastName']"));
	waitForVisibilty(lname);
	enterText(lname, "devi", "last name");
	Thread.sleep(3000);
	WebElement savebtn = driver.findElement(By.xpath("//body/div[1]/div[1]/div[1]/div[2]/form[1]/div[1]/input[1]"));
	waitForVisibilty(savebtn);
	clickElement(savebtn, "save all");
	driver.switchTo().defaultContent();

	WebElement post = driver.findElement(By.xpath("//span[text()='Post']"));
	Thread.sleep(3000);

	clickElement(post, "Post");
	WebElement frame1 = driver.findElement((By.xpath("//iframe[@class='cke_wysiwyg_frame cke_reset']")));
	WebElement ptext = driver.findElement(By.xpath("/html[1]/body[1]"));
	clickElement(ptext, "Post Text");
	ptext.sendKeys("i am fine");
	driver.switchTo().defaultContent();
	WebElement share = driver.findElement(By.xpath("//input[@id='publishersharebutton']"));
	waitForVisibilty(share);
	clickElement(share, "share");

	WebElement f = driver.findElement(By.xpath("//span[text()='File']"));
	Thread.sleep(3000);
	clickElement(f, "File");
	WebElement upfile = driver.findElement(By.xpath("//a[@id='chatterUploadFileAction']"));
	clickElement(upfile, "upload file");
	;
	Thread.sleep(3000);

	WebElement bfile = driver.findElement(By.className("file"));

	Thread.sleep(3000);
	clickElement(bfile, "Browse file");
	bfile.sendKeys("C:\\Users\\deepa\\Documents\\pro1.png");
	driver.close();

	

}
}