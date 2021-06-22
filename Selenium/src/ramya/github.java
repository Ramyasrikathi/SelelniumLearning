package ramya;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class github {
	
	WebDriver driver;
	
	public void element() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Kiran\\Downloads\\Selenium\\chromedriver_win32 (1)\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://github.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[contains(text(),'Sign up for GitHub')]")).click();
	}
	
	public static void main(String[] args) throws InterruptedException {
	 
		github gh = new github();
		gh.element();
	}

}
