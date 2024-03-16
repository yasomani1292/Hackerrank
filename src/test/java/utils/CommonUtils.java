package utils;

import org.openqa.selenium.WebElement;

public class CommonUtils {
	public void click(WebElement element) {
		element.click();
	}

	public void setText(WebElement element, String text) {
		element.clear();
		element.sendKeys(text);
	}

	public String getText(WebElement element) {
		return element.getText();
	}

	public void waitFor(int seconds) throws InterruptedException {
		Thread.sleep(seconds * 1000);
		
	}
	
}
