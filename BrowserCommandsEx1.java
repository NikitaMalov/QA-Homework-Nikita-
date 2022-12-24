package homeWork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserCommandsEx1 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

	WebDriver driver = new ChromeDriver();
				
	driver.manage().window().maximize();

	driver.navigate().to("https://www.google.com");
	
	String URL = driver.getCurrentUrl();
	System.out.println(driver.getCurrentUrl());
	
	if(URL.equals("https://www.google.com/")) {
		System.out.println("Test PASSED");
	}
	else {
		System.out.println("Test Failed");
	}
	
	driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/input")).sendKeys("Automation");
	Thread.sleep(1000);
	
	driver.quit();
		
	}

}
