package testCases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import applicationPages.LoginPage;
import baseMethods.ProjectBaseMethod;

public class GroupsTests extends ProjectBaseMethod{
	
	@BeforeTest
	public void setTestDetails() {
		testName = "Groups Test";
		testDesc = "Create Groups Without Mandatory Fields";
		testAuth = "Shyamala";
		testCategory = "Regression";
	}

	
	@Test
	public void verifyFunctionalityCreateGroupsWithoutMandatoryFields() throws InterruptedException {
		new LoginPage(driver,wOProp,prop,wait,js)
		.enterLoginName()
		.enterLoginPassword()
		.clickLoginButton()
		.clickToggleButton()
		.clickViewAllOption()
		.clickSales()
		.clickMoreTab()
		.clickGroups()
		.clickNew()
		.enterName("HK")
		.clickSave()
		.verifyDisplayedMessage();
	}

}
