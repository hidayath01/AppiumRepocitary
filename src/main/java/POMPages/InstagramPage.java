package POMPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import GenericUtilities.BaseClass;

public class InstagramPage extends BaseClass{
	
	public InstagramPage()
	{
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath  = "//android.widget.FrameLayout[@resource-id=\"com.instagram.android:id/layout_container_main\"]/android.widget.FrameLayout/android.widget.FrameLayout[2]/android.widget.FrameLayout[1]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup/android.widget.EditText")
	public WebElement firstElement;
	@FindBy(xpath = "//android.widget.RelativeLayout[@resource-id=\\\"android:id/content\\\"]")
	public WebElement contentbutton;
	@FindBy(xpath = "//android.widget.Button[@content-desc=\\\"Log in\\\"]/android.view.ViewGroup")
	public WebElement viewButton;
	@FindBy(xpath = "//android.widget.Button[@content-desc=\\\"Save\\\"]/android.view.ViewGroup")
	public WebElement viewGroupButton;
	@FindBy(xpath = "//android.widget.Button[@resource-id=\\\"com.android.permissioncontroller:id/permission_allow_button\\\"]")
	public WebElement allowButton;
	@FindBy(xpath = "(//android.widget.ImageView[@resource-id=\\\"com.instagram.android:id/tab_icon\\\"])[4]")
	public WebElement iconTab;
	@FindBy(id = "com.android.permissioncontroller:id/permission_allow_selected_button")
	public WebElement allowButton2;
	@FindBy(xpath = "//android.widget.ImageButton[@content-desc=\\\"Cancel\\\"]")
	public WebElement cancelButton;
	@FindBy(id = "com.android.permissioncontroller:id/permission_allow_foreground_only_button")
	public WebElement allowButton3;
	@FindBy(id = "com.android.permissioncontroller:id/permission_deny_butto")
	public WebElement denyButton;
	@FindBy(id = "com.instagram.android:id/quick_capture_top_shadow_overlay")
	public WebElement shadowOverLay;
	
	public void instagramPageMethod() throws Throwable
	{
		Thread.sleep(5000);
		firstElement.click();
		Thread.sleep(5000);
		contentbutton.click();
		Thread.sleep(5000);
		viewButton.click();
		Thread.sleep(5000);
		viewGroupButton.click();
		Thread.sleep(5000);
		allowButton.click();
		Thread.sleep(5000);
		iconTab.click();
		Thread.sleep(5000);
		allowButton2.click();
		Thread.sleep(5000);
		cancelButton.click();
		Thread.sleep(5000);
		allowButton3.click();
		Thread.sleep(5000);
		denyButton.click();
		Thread.sleep(5000);
		shadowOverLay.click();
		Thread.sleep(5000);
		
		
	}
	
	
	

}
