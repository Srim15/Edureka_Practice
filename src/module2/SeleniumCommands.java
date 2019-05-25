package module2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumCommands {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Initialising the Browser
		//Chrome
		
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Selenium\\Drivers\\ChromeDriver_v74\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
	
		//gecko
		
	    System.setProperty("webdriver.gecko.driver", "C:\\Program Files\\Selenium\\Drivers\\geckodriver.exe");
		WebDriver driver1 = new FirefoxDriver();
	 
		//Close or Quit a browser
		
		driver.close(); //it closes all windows opened during the current execution
		driver.quit(); // it closes the current active window opened during the instance
		
		//Get commands
		
		driver.get("https://URL"); //to open the application on the browser (used at the start to open a URL)
		driver.getTitle(); //to fetch the title of the current page
		driver.getCurrentUrl(); //to fetch the current page URL
		driver.getWindowHandle(); //to get the window name
		
		
    	//Navigation commands
		
		driver.navigate().to("URL"); //it is used to open URL (mainly used to navigate to a URL from another URl)
		driver.navigate().back(); //to go to the previous page
		driver.navigate().forward();//to go to the next already executed page
		driver.navigate().refresh(); //to refresh the page
		
		//Element handling commands
		
		driver.findElement(By.id("")).clear(); //to clear a textbox
		driver.findElement(By.id("")).sendKeys(""); //to type in the text
		driver.findElement(By.id("")).click(); // to click on a button or link
		driver.findElement(By.id("")).getText(); //to fetch the text
		
		//hello new changes
		
		
	}

}
