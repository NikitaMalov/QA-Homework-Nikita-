package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import utility.Constant;
import utility.ExcelUtils;

public class TestSignin {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		final long SHORT_DELAY = 1000;
		final long LONG_DELAY = 5000;
		
		ExcelUtils.setExcelFile(Constant.Path_TestData + Constant.File_TestData, "Sheet1");
		
		String email = ExcelUtils.getCellData(3, 1);
		String password = ExcelUtils.getCellData(3, 2);
		
		 WebDriver driver = new ChromeDriver();
			
		   driver.manage().window().maximize();
		   
		    driver.get("https://www.worldtimebuddy.com");
		    
		 driver.findElement(By.id("tab_signin")).click();
		 Thread.sleep(SHORT_DELAY);
		 
		 driver.findElement(By.cssSelector("#tabs-func > li.dropdown > div > a.si_menuitem_last")).click();
		 Thread.sleep(SHORT_DELAY);
		 
		 driver.findElement(By.cssSelector("#screen-login > form > input:nth-child(2)")).sendKeys(email);
		 Thread.sleep(SHORT_DELAY);
		 
		 driver.findElement(By.cssSelector("#screen-login > form > input:nth-child(4)")).sendKeys(password);
		 Thread.sleep(SHORT_DELAY);
		 		 
		 driver.findElement(By.cssSelector("#screen-login > form > div:nth-child(6) > input")).click();
		 Thread.sleep(LONG_DELAY);
		 
		 driver.findElement(By.cssSelector("#tab_account")).click();
		 Thread.sleep(SHORT_DELAY);
		 
		 driver.findElement(By.cssSelector("#tabs-func > li.dropdown > div > a.si_menuitem_last")).click();
		 Thread.sleep(LONG_DELAY);
		 
		 driver.quit();
		 
		 ExcelUtils.setCellData("Pass", 3, 3);
		 
	}

}
 