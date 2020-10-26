package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import baseMethods.ProjectMethods;

public class ReservePage extends ProjectMethods{

	public ReservePage()
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(how=How.XPATH,using="(//form[contains(@action,'purchase')]/following-sibling::td/input)[1]")
	private WebElement chooseThisFlight;
	
	public PurchasePage clickChooseThisFlight()
	{
		click(chooseThisFlight);
		return new PurchasePage();
	}
}
