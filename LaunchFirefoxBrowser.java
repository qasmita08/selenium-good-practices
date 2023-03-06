package seleniumgoodpractices;

/*Covert following Test Cases into Test Scripts

TC-1 Launch Firefox Browser 
TC-2 Goto Test URL https://www.moneycontrol.com/
TC-3 Specify Wait Time for 5 Sec
TC-4 Get the Title of Page into Console
TC-5 Close the Browser */

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchFirefoxBrowser {

	public static void main(String args[]) throws InterruptedException {

		// TC-1 Launch Firefox Browser
		System.setProperty("webdriver.firefox.driver", "/Users/ramkeshgupt/Software/firefoxdriver/geckodriver");

		WebDriver webDriver = new FirefoxDriver();

		// TC-2 Goto Test URL https://www.moneycontrol.com/
		webDriver.get("https://www.moneycontrol.com/");

		// TC-3 Specify Wait Time for 5 Sec
		Thread.sleep(3000);

		// TC-4 Get the Title of Page into Console
		String pageTitle = webDriver.getTitle();
		System.out.println("Page Title is " + pageTitle);

		// TC- Get the Current URl
		String currentURL = webDriver.getCurrentUrl();
		System.out.println("Current URL is " + currentURL);

		// TC - Maximize browser window
		webDriver.manage().window().maximize();

		Thread.sleep(3000);

		// TC - Minimize browser window
		webDriver.manage().window().minimize();

		Thread.sleep(3000);

		// TC-5 Close the Browser
		webDriver.close();

	}

}
