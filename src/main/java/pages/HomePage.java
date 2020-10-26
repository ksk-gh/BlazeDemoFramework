package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import baseMethods.ProjectMethods;
import cucumber.api.java.en.And;

public class HomePage extends ProjectMethods {

	public HomePage(){
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(how=How.XPATH,using="//h1[contains(text(),'Simple Travel Agency!')]")
	private WebElement headerTitle;

	public HomePage getTitleName(String data)
	{

		verifyExactText(headerTitle, data);
		return this;
	}
	
	@FindBy(how=How.XPATH,using="//a[contains(text(),'destination of the week')]")
	private WebElement destinationLink;

	public VacationPage clickLink()
	{
		click(destinationLink);
		return new VacationPage();
	}
	
	/*
	 * public VacationPage verifyUrl(String data) { verifyURL(data); return new
	 * VacationPage(); }
	 */
	
	@FindBy(how=How.NAME,using="fromPort")
	private WebElement fromDeparture;
	
	public HomePage selectDeparture(String data)
	{
		
		selectDropDownUsingText(fromDeparture,data);
		
		return this;
	}
	
	
	@FindBy(how=How.NAME,using="toPort")
	private WebElement toDestination;
	
	public HomePage selectDestination(String data)
	{
		
		selectDropDownUsingText(toDestination,data);
		
		return this;
	}
	
	@FindBy(how=How.XPATH,using="//input[@value='Find Flights']")
	private WebElement findFlights;
	
	public ReservePage clickFindFlights()
	{
		click(findFlights);
		return new ReservePage();
	}
	
	
	
}
