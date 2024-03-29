package Axis.QA;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UploadDownload {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\myank\\OneDrive\\Documents\\ManipalQa\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://chercher.tech/practice/practice-pop-ups-selenium-webdriver");
		
		driver.manage().window().maximize();
		
		WebElement upload = driver.findElement(By.xpath("//input[@name = 'upload']"));
		upload.sendKeys("C:\\Users\\myank\\Downloads\\Simaran_Photo.jpg");
		
		Thread.sleep(500);
		
		WebElement download = driver.findElement(By.xpath("//input[@name = 'download']"));
		download.click();
		Thread.sleep(500);
	}
}