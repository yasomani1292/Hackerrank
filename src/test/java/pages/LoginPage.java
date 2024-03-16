package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utils.CommonUtils;


public class LoginPage extends CommonUtils {

//	private WebDriver driver;
//	CommonUtils cmUtil = new CommonUtils();

	public LoginPage(WebDriver driver) {
//		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "inputUsername")
	private WebElement txtUserName;

	@FindBy(name = "inputPassword")
	private WebElement txtPassword;

	@FindBy(className = "signInBtn")
	private WebElement btnSignIn;

	public void login(String username, String password) {
		setText(txtUserName, "Yasothai");
		setText(txtPassword, "rahulsheetyacademy");
		click(btnSignIn);
	}

}
