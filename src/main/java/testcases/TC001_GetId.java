package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import baseMethods.ProjectMethods;
import pages.HomePage;
import pages.VacationPage;

public class TC001_GetId extends ProjectMethods{
	

	

	@BeforeTest
	public void setData() {
		testCaseName="TC001_GetId";
		testDescription="Purchase a ticket and get the ID";
		testNodes="ID";
		category="Smoke";
		authors="KSK";
		browserName="chrome";
		dataSheetName="TC001";
	}
	
	
	@Test(dataProvider="fetchData")
	public void purchaseTicket(String headerName,String vacationURL, String fromSource,String toDestination){		
		new HomePage()
		.getTitleName(headerName)
		.clickLink()
		.verifyUrl(vacationURL)
		.navigateToHome()
		.selectDeparture(fromSource)
		.selectDestination(toDestination)
		.clickFindFlights()
		.clickChooseThisFlight()
		.getTotalCost()
		.clickPurchaseFlight()
		.getConfimrationId()
		;
		
		
				
				
	}
	
	
	
	
}
