package aSelePractice;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.stream.IntStream;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class drivemethods {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

////		WebDriverManager.chromedriver().setup();
////		WebDriverManager.chromedriver().setup();
////		WebDriverManager.firefoxdriver().setup();
////		WebDriverManager.iedriver().setup();
////		WebDriverManager.edgedriver().setup();
////		WebDriverManager.operadriver().setup();
////		FirefoxOptions ffOptions = new FirefoxOptions();
////		ChromeOptions chOptions= new ChromeOptions();	
//		WebDriver driver = new ChromeDriver();
//		driver.get("https://www.google.com/");
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
//		
////		We can give expected conditions
//		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(3));
//		wait.until(ExpectedConditions.alertIsPresent());
//		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.id(""))));
//		
//		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(6));
//		driver.manage().timeouts().scriptTimeout(Duration.ofMillis(1000));
//		
//		FluentWait fluWait= new FluentWait(driver);
////		Specify timeout &polling time& ignoringException &ExpectedCondition
//		fluWait.withTimeout(Duration.ofMillis(1000));
//		fluWait.pollingEvery(Duration.ofMillis(1000));
//		fluWait.ignoring(NoSuchElementException.class);
//		fluWait.until(ExpectedConditions.alertIsPresent());
		
		
		
		IntStream.range(1, 11).forEach(System.out::println);
		IntStream.range(1, 11).forEach(value -> System.out.println(value));
		
		
		
		
		
	}

}
