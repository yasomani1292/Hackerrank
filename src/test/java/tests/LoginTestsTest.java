package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pages.LoginPage;
public class LoginTestsTest {

	WebDriver driver;

	@BeforeMethod
	public void openBrowser() {

		driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/locatorspractice/");

	}

	@Test
	public void loginTest() {
		System.out.println("Hello");

		LoginPage loginpg = new LoginPage(driver);
		
		loginpg.login("Yasothai", "rahulshettyacademy");
	}

	@AfterMethod
	public void closeBrowser() {
		driver.quit();
	}

}