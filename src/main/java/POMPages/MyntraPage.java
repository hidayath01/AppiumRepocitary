package POMPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import GenericUtilities.BaseClass;

public class MyntraPage extends BaseClass {

	public MyntraPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath  = "//android.widget.Button[@resource-id=\"com.myntra.android:id/askPermission\"]")
	public WebElement askPermission;
	@FindBy(id = "com.android.permissioncontroller:id/permission_allow_button")
	public WebElement allowButton;
	@FindBy(xpath = "(//android.view.ViewGroup[@content-desc=\"image_image_container\"])[1]/android.view.ViewGroup/android.widget.ImageView")
	public WebElement imageView;
	@FindBy(xpath = "//android.view.ViewGroup[@content-desc=\"buy_button\"]/android.view.ViewGroup")
	public WebElement fourthElement;
	@FindBy(xpath = "//android.view.ViewGroup[@content-desc=\"size_select_XL\"]/android.view.ViewGroup[1]")
	public WebElement sizeSelectionButton;
	@FindBy(xpath = "//android.view.ViewGroup[@content-desc=\"buy_done_button\"]")
	public WebElement doneButton;
	@FindBy(xpath = "//android.view.ViewGroup[@content-desc=\"buy_button\"]/android.view.ViewGroup")
	public WebElement goToCartButton;
	@FindBy(xpath = "android.widget.RelativeLayout")
	public WebElement placeOrderButton;
	
	public void myntraMethod() throws InterruptedException
	{
		Thread.sleep(5000);
		askPermission.click();
		Thread.sleep(5000);
		allowButton.click();
		Thread.sleep(5000);
		imageView.click();
		Thread.sleep(5000);
		fourthElement.click();
		Thread.sleep(5000);
		sizeSelectionButton.click();
		Thread.sleep(5000);
		doneButton.click();
		Thread.sleep(5000);
		goToCartButton.click();
		placeOrderButton.click();
	}
	
	
	
}
