package POMPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;

public class OrangeHRMLoginPage {
	public AppiumDriver driver;
	
	public OrangeHRMLoginPage(AppiumDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(id =  "com.android.chrome:id/signin_fre_dismiss_button")
	public WebElement continueButton;
	
	@FindBy(id = "com.android.chrome:id/ack_button")
	public WebElement primearyButton;
	
	@FindBy(xpath = "//android.widget.EditText[@resource-id=\"com.android.chrome:id/search_box_text\"]")
	public WebElement searchButton;
	
	@FindBy(id = "com.android.permissioncontroller:id/permission_allow_button")
	public WebElement allowButton;
	
	@FindBy(xpath = "//androidx.recyclerview.widget.RecyclerView[@resource-id=\"com.android.chrome:id/omnibox_suggestions_dropdown\"]/android.view.ViewGroup[1]")
	public WebElement below;
	
	@FindBy(xpath = "//android.view.View[@resource-id=\"app\"]/android.view.View/android.view.View/android.view.View[3]/android.view.View[3]/android.widget.EditText")
	public WebElement user;
	
	@FindBy(xpath = "//android.view.View[@resource-id=\"app\"]/android.view.View/android.view.View/android.view.View[3]/android.view.View[6]/android.widget.EditText")
	public WebElement passwrd;
	
	public void loginMethod(String Ourl, String username,String password) throws Throwable
	{
		Thread.sleep(50000);
		continueButton.click();
		Thread.sleep(5000);
		primearyButton.click();
		Thread.sleep(5000);
		allowButton.click();
		Thread.sleep(4000);
		searchButton.sendKeys(Ourl);
		Actions action = new Actions(driver);
		action.moveToElement(below).click().build().perform();
		Thread.sleep(10000);
		user.sendKeys(username);
		Thread.sleep(5000);
		passwrd.sendKeys(password);
		Thread.sleep(5000);
	}
}
