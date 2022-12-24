package homeWork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserCommandsEx2 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

	WebDriver driver = new ChromeDriver();
				
	driver.manage().window().maximize();

	driver.navigate().to("https://workoglobe.com/");
	
	driver.findElement(By.xpath("//*[@id=\"home\"]/div[1]/div[2]/div[2]/div[2]/div/form/input")).sendKeys("QA Engineer");
	Thread.sleep(1000);
	
	driver.findElement(By.xpath("//*[@id=\"home\"]/div[1]/div[2]/div[2]/div[2]/div/form/button")).click();
	Thread.sleep(1000);
	
	driver.quit();
		
	}

}
