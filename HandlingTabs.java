package seleniumgoodpractices;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HandlingTabs {

	public static void main(String[] args) throws InterruptedException {

		// TC-1 Launch Firefox Browser
		System.setProperty("webdriver.firefox.driver", "/Users/ramkeshgupt/Software/firefoxdriver/geckodriver");

		WebDriver webDriver = new FirefoxDriver();

		// TC-2 Goto Test URL https://demoqa.com/
		webDriver.get("https://www.facebook.com/");

		// TC-3 Specify Wait Time for 3 Sec
		Thread.sleep(3000);

		// TC-4 Get the Title of Page into Console
		String pageTitle = webDriver.getTitle();
		System.out.println("Page Title is " + pageTitle);

		// TC- Get the Current URl
		String currentURL = webDriver.getCurrentUrl();
		System.out.println("Current URL is " + currentURL);

		// TC - Maximize browser window
		webDriver.manage().window().maximize();

		// Click on Create new account
		WebElement createAccount = webDriver.findElement(By.linkText("Create new account"));
		createAccount.click();
		Thread.sleep(3000);

		// Click on Privacy Link
		WebElement privacyLink = webDriver.findElement(By.id("privacy-link"));
		privacyLink.click();

		// Handling Tabs
		ArrayList<String> tabs = new ArrayList<String>(webDriver.getWindowHandles());
		System.out.println(tabs);
		Thread.sleep(3000);

		// Switch to Tab 1
		webDriver.switchTo().window(tabs.get(1));

		// TC- Get the Current URl
		String currentURLTab = webDriver.getCurrentUrl();
		System.out.println("Current URL is " + currentURLTab);
		Thread.sleep(3000);

		// Switch to Tab 0
		webDriver.switchTo().window(tabs.get(0));
		String currentURLTab0 = webDriver.getCurrentUrl();
		System.out.println("Current URL is " + currentURLTab0);
		Thread.sleep(3000);

		// Switch to Tab 1
		webDriver.switchTo().window(tabs.get(1));
		webDriver.close();

		webDriver.quit();

	}

}
