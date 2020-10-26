package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import baseMethods.ProjectMethods;

public class ConfirmationPage extends ProjectMethods{

	public ConfirmationPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(how=How.XPATH,using="//td[text()='Id']/following-sibling::td")
	private WebElement getIdText;
	public ConfirmationPage getConfimrationId()
	{
		getExactText(getIdText);
		return this;
	}
	
}
