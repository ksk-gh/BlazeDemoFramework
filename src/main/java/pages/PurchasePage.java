package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import baseMethods.ProjectMethods;

public class PurchasePage extends ProjectMethods{

	public PurchasePage()
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(how=How.XPATH,using="//input[@value='Purchase Flight']")
	private WebElement purchaseFlight;
	
	public ConfirmationPage clickPurchaseFlight()
	{
		click(purchaseFlight);
		return new ConfirmationPage();
	}
	
	
	
	@FindBy(how=How.XPATH,using="//p[contains(text(),'Please submit')]/preceding-sibling::p[1]/em")
	private WebElement totalCost;
	public PurchasePage getTotalCost()
	{
		getExactText(totalCost);
		return this;
	}
	
	
	
}
