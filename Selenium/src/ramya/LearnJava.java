package ramya;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnJava {
	WebDriver driver;
	
	public void launchbrowser(){
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Kiran\\Downloads\\Selenium\\chromedriver_win32 (1)\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in");
		}
	public void searchproduct() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone SE");
		Thread.sleep(2000);
		driver.findElement(By.id("nav-search-submit-button")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[contains(text(),'See more')]")).click();
	}
	
	public void navigate() throws InterruptedException {
		Thread.sleep(2000);
		driver.navigate().to("https://www.youtube.com/");
		Thread.sleep(2000);
		driver.navigate().back();
		System.out.println("This page title is " + driver.getTitle());
	}
	
	public void closebrowser() {
		driver.quit();
	}

	public static void main(String[] args) throws InterruptedException{
		LearnJava obj = new LearnJava();
		obj.launchbrowser();
		obj.searchproduct();
		//obj.navigate();
		//obj.closebrowser();
	
	}

}
