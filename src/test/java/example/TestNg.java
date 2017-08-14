package example;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.AssertJUnit;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNg {

	@Test
	public void testEasy() {
		// driver.get("http://google.com");
		// String title = driver.getTitle();
		// AssertJUnit.assertTrue(title.contains("Google"));
		System.setProperty("webdriver.gecko.driver",
				System.getProperty("user.dir") + "/src/main/resources/BrowserLib/geckodriver");
		System.out.println(System.getProperty("user.dir") + "/src/main/resources/BrowserLib/geckodriver");
		// WebDriver driver = new FirefoxDriver();
		 
		 System.setProperty("webdriver.chrome.driver",
					System.getProperty("user.dir") + "/src/main/resources/BrowserLib/chromedriver");

		 WebDriver	driver = new ChromeDriver();
		 
		driver.get("http://google.com");
		System.out.println(	driver.getTitle());
		AssertJUnit.assertEquals(driver.getTitle(), "Google");
	}

	@Test
	public void testFail() {
		// driver.get("http://google.com");
		// String title = driver.getTitle();
		// AssertJUnit.assertTrue(title.contains("Google"));
		System.out.println("test.........");
		AssertJUnit.assertEquals(true, true);

	}

	@BeforeTest
	public void beforeTest() {
		// driver = new FirefoxDriver();
	}

	@AfterTest
	public void afterTest() {
		// driver.quit();
	}
}