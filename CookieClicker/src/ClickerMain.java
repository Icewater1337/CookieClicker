import java.awt.AWTException;
import java.awt.Robot;
import java.io.FileNotFoundException;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;





public class ClickerMain {
    
   

    	
    	static Robot robi;
	WebElement id, pass, button;
	static WebDriver driver;
    	
    	public static void main (String[] args) throws FileNotFoundException, AWTException {
    	    
    	    
    	    String importSave = "MS4wNDY2fHwxNDE4MjE2MDQ3NzMyOzE0MTgyMTYwNDc3MzI7MTQxODMxNTc3MDk5OTtSYWRpY2FsIE11ZmZpbnwxMTEwMTEwMTEwMHw4NTk4MzAyMDI1MTQuMjU3MTs2MjQ1MDc5OTY1NDYzNy43MzsxMTI2NTY0Ozg7MTgwMjEzMTk5NTQ4ODAuODYzOzE4ODstMTstMTswOzA7MDswOzA7LTE7MDs4OzA7MDswOzA7MDswOzswOzA7fDEzNiwxMzYsMTcxNjA0NjIxMDA5LDA7MTIxLDEyMSw5MzUzMzM1NzU3NiwwOzEyMiwxMzIsMTA3MTMyNDU3OCwwOzk4LDk5LDE1ODA3MzMwMzMsMDsxMDMsMTA4LDgxODMzNjIzMjUsMDs4NSw4OSwxMTEwNDM1Nzg5MSwwOzgxLDgyLDMyNTMxNDc1MjEzLDA7NjcsNjcsNTA2MDExMDk5NDIwLDA7NTEsNTEsNDAzNjgzNTcxMTI2NywwOzQxLDQxLDE0NTc3ODc4MTY1NzUzLDA7MzEsMzEsMjQyODEyMTk1Njc3MzcsMDt8NDUwMzU5OTYyNzM3MDQ5NTs0NTAzMTg3MzEwNTEwMDc5OzIyNTI4OTkzMjUzMTE1NTE7Mzk0MDY1MjQ5MjUzMjIyMzsyMjUzNDQ5NTE1MjgxMDU1OzIyNTE3OTk4MTM2ODUyNDk7MjI1MTc5OTgxMzY4NTI0OTsyMjUxODAxOTYxMTcwOTkxOzIyNTE3OTk4MTM2ODUyNDk7MzI3Njl8MzkzODk5ODI5MjQ2MzYxNTsyMjUyMDk2NDMxNjM0MTQzOzIzMjIxODU3NTQ1MDkzNDc7NDE5NDMwNQ%3D%3D%21END%21";
    	    // start the page
    	   driver =  login(importSave);
    	  WebElement cookie = driver.findElement(By.id("bigCookie"));
    	   
    	 int i = 0;
    	 
    	 WebElement building = driver.findElement(By.id("productName10"));
    	 
    	while ( true) {
    	   
    	    	robi.delay(10);
    	       cookie.click();
    	       i++;
    	       if ( i == 1000) {
    		building.click();
    		i = 0;
    	}
    	       
    	   } 
    	    
    	}
    	
    
	

	public static WebDriver login(String hyperlink) throws AWTException, FileNotFoundException {
		System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");
		driver = new ChromeDriver();
		robi = new Robot();

		driver.get("http://orteil.dashnet.org/cookieclicker/");
		
		robi.delay(3000);
		
		driver.findElement(By.id("prefsButton")).click();
		
		robi.delay(3000);
		
		 driver.findElement(By.xpath("//*[@id=\"menu\"]/div[3]/div[3]/a[2]")).click();
		//"input[onclick*='1 Bedroom Deluxe']"
		
		robi.delay(5000);
		
		driver.findElement(By.id("textareaPrompt")).sendKeys(hyperlink);
		robi.delay(5000);
		driver.findElement(By.id("promptOption0")).click();
		
		
		
		return driver;

	}

}
