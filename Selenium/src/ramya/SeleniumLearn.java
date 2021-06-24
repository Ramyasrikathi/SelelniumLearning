package ramya;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumLearn {
	WebDriver driver = new ChromeDriver();
	
	
	public void findelements() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Kiran\\Downloads\\Selenium\\chromedriver_win32 (1)\\chromedriver.exe");
		String baseUrl = "https://www.facebook.com";
		driver.get(baseUrl);
		driver.findElement(By.id("email")).sendKeys("kathiramyasri.chem@gmail.com");
		driver.findElement(By.className("_6luy _55r1 _1kbt")).sendKeys("Y@are@you@1991");
		driver.findElement(By.name("login")).click();
		
		
	}

	public static void main(String[] args) {
		SeleniumLearn SL = new SeleniumLearn();
	
		SL.findelements();

	}

}
