package baseMethods;

import java.net.MalformedURLException;

import org.openqa.selenium.ElementNotVisibleException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;

public interface InterfaceMethods {


	public void startApp(String browser) throws MalformedURLException ;

	public WebElement locateElement(String locator, String locValue) ;	
	
	public WebElement locateElement(String locValue) ;	
	
	public void type(WebElement ele, String data) ;
	
	public void click(WebElement ele);

	public String getText(WebElement ele);

	public void selectDropDownUsingText(WebElement ele, String value) ;
	
	public void selectDropDownUsingIndex(WebElement ele, int index) ;

	public boolean verifyTitle(String expectedTitle);

	public void verifyExactText(WebElement ele, String expectedText);
	
	public void verifyPartialText(WebElement ele, String expectedText);

	public void verifyExactAttribute(WebElement ele, String attribute, String value);
	
	public void verifyPartialAttribute(WebElement ele, String attribute, String value);

	public void verifySelected(WebElement ele);
	
	public void verifyDisplayed(WebElement ele);
	
	public void switchToWindow(int index);
	
	public void switchToFrame(WebElement ele);
	
	public void acceptAlert();
	
	public void dismissAlert();
	
	public String getAlertText();
	
	public long takeSnap();
	
	public void closeBrowser();		
	
	public void closeAllBrowsers();

	public String getUrl();
	
	public void navigateBack();
	
	public boolean verifyURL(String value);
	
	public String getExactText(WebElement ele);
	
	
	
	
}
