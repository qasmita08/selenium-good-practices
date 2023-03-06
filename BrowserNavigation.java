package seleniumgoodpractices;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/*
TC-1	Launch Chrome  Browser
TC-2	Go to Test URL  https://www.google.com
TC-3	Maximize the Browser Window
TC-4	Get the URL of Page
TC-5	Navigate to Test URL  https://www.selenium.dev/
TC-6	Get the URL of Page
TC-7	Navigate back to Test URL  https://www.google.com
TC-8    Get the URL of Page 
TC-8	Navigate one step forward to Test URL  https://www.selenium.dev/ 
TC-9    Get the URL of Page 
TC-10	Refresh the Current Page 
TC-11	Get the URL of Page 
TC-12   Close the Browser */

public class BrowserNavigation {
	public static void main(String args[]) throws InterruptedException {

		// TC-1 Launch Chrome Browser
		System.setProperty("webdriver.chorme.driver", "/Users/ramkeshgupt/Software/chromedriver_mac64/chromedriver");

		WebDriver webDriver = new ChromeDriver();

		// TC-2 Go to Test URL https://www.google.com
		webDriver.get("https://www.google.com");
		Thread.sleep(3000);

		// TC-3 - Maximize browser window
		webDriver.manage().window().maximize();

		// TC-3 Specify Wait Time for 5 Sec
		Thread.sleep(3000);

		// TC- Get the Title of Page into Console
		String pageTitle1 = webDriver.getTitle();
		System.out.println("Page Title is " + pageTitle1);

		// TC-4 Get the Current URl
		String currentURL1 = webDriver.getCurrentUrl();
		System.out.println("Current URL is " + currentURL1);
		Thread.sleep(3000);

		// TC-5 Navigate to Test URL https://www.selenium.dev/
		webDriver.navigate().to("https://www.selenium.dev/");
		Thread.sleep(3000);

		// TC- Get the Title of Page into Console
		String pageTitle2 = webDriver.getTitle();
		System.out.println("Page Title is " + pageTitle2);

		// TC-6 Get the Current URl
		String currentURL2 = webDriver.getCurrentUrl();
		System.out.println("Current URL is " + currentURL2);
		Thread.sleep(3000);

		// TC-6 Navigate back to Test URL https://www.google.com
		webDriver.navigate().back();
		Thread.sleep(3000);

		// TC- Get the Title of Page into Console
		String pageTitle3 = webDriver.getTitle();
		System.out.println("Page Title is " + pageTitle3);

		// TC-7 Get the Current URl
		String currentURL3 = webDriver.getCurrentUrl();
		System.out.println("Current URL is " + currentURL3);
		Thread.sleep(3000);

		// TC-8 Navigate one step forward to Test URL https://www.selenium.dev/
		webDriver.navigate().forward();
		Thread.sleep(3000);

		// TC- Get the Title of Page into Console
		String pageTitle4 = webDriver.getTitle();
		System.out.println("Page Title is " + pageTitle4);

		// TC-9 Get the Current URl
		String currentURL4 = webDriver.getCurrentUrl();
		System.out.println("Current URL is " + currentURL4);
		Thread.sleep(3000);

		// TC-10 Refresh the Current Page
		webDriver.navigate().refresh();
		Thread.sleep(3000);

		// TC- Get the Title of Page into Console
		String pageTitle5 = webDriver.getTitle();
		System.out.println("Page Title is " + pageTitle5);

		// TC-11 Get the Current URl
		String currentURL5 = webDriver.getCurrentUrl();
		System.out.println("Current URL is " + currentURL5);
		Thread.sleep(3000);

		// TC-12 Close the Browser
		webDriver.close();

	}

}
