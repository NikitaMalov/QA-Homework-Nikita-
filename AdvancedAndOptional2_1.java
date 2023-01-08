package homeWork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AdvancedAndOptional2_1 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();

		driver.navigate().to("https://www.w3schools.com/html/html_tables.asp");
			
	
		for (int i=2;i<=7;i++) {
			for (int j=1;j<=3;j++) {
			String sValue = null;
			sValue = driver.findElement(By.xpath("//*[@id=\"customers\"]/tbody/tr["+i+"]/td["+j+"]")).getText();
			System.out.println("The value of " + j + "column of row " + i + " is: " +sValue);
			}
				
					}
	
				driver.quit();
	
}
}
		
	


