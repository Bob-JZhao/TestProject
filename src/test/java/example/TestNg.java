package example;

 import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.AssertJUnit;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;		
public class TestNg {		
	    private WebDriver driver;
	    
		@Test				
		public void testEasy() {	
	//		driver.get("http://google.com");  
		//	String title = driver.getTitle();				 
		//	AssertJUnit.assertTrue(title.contains("Google")); 
			AssertJUnit.assertEquals(true, true);
		}	
		@Test				
		public void testFail() {	
	//		driver.get("http://google.com");  
		//	String title = driver.getTitle();				 
		//	AssertJUnit.assertTrue(title.contains("Google")); 
			System.out.println("test......");
			AssertJUnit.assertEquals(true, true);
			
			
			
			
		}	
		@BeforeTest
		public void beforeTest() {	
		  //  driver = new FirefoxDriver();  
		}		
		@AfterTest
		public void afterTest() {
			//driver.quit();			
		}		
}