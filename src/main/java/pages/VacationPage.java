package pages;

import org.openqa.selenium.support.PageFactory;

import baseMethods.ProjectMethods;

public class VacationPage extends ProjectMethods {
	
	public VacationPage()
	{
		PageFactory.initElements(driver, this);
	}

		
	public HomePage navigateToHome()
	{
		//verifyURL();
		navigateBack();
		return new HomePage();
	}
	
	public VacationPage verifyUrl(String data)
	{
		verifyURL(data);
		return this;
	}
	
}
