package applicationPages;

import java.util.Properties;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import baseMethods.ProjectBaseMethod;


public class GroupsPage extends ProjectBaseMethod{
	
	public GroupsPage(WebDriver driver, Properties wOProp, Properties prop, WebDriverWait wait, JavascriptExecutor js) {
		this.driver = driver;
		this.wOProp = wOProp;
		this.prop = prop;
		this.wait = wait;
		this.js = js;
	}
	
	public GroupsPage clickMoreTab() {
		try {
			WebElement eleMoreDropDown = locateWebElement("xpath", wOProp.getProperty("GroupsPage.eleMoreDropDown.Xpath"));	
			click(eleMoreDropDown);
			reportStep("More clicked successfully","pass");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			reportStep("More  not clicked successfully", "fail");
		}
		return this;
	}

	public GroupsPage clickGroups() {
		try {
			//JavascriptExecutor js = (JavascriptExecutor) driver;
			WebElement eleGroups = locateWebElement("xpath", wOProp.getProperty("GroupsPage.eleGroups.Xpath"));	
			js.executeScript("arguments[0].click();", eleGroups);
			reportStep("Groups clicked successfully","pass");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			reportStep("Groups not clicked successfully", "fail");
		}
		return this;
	}

	public GroupsPage clickNew() {
		try {
			WebElement eleNew = locateWebElement("xpath", wOProp.getProperty("GroupsPage.eleNew.Xpath"));	
			click(eleNew);
			reportStep("New clicked successfully","pass");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			reportStep("New not clicked successfully", "fail");
		}
		return this;
	}
	
	public GroupsPage enterName(String Name) {
		try {
			WebElement eleName = locateWebElement("xpath", wOProp.getProperty("GroupsPage.eleName.Xpath"));
			wait.until(ExpectedConditions.visibilityOf(eleName));
			clearAndType(eleName,Name);		
			reportStep("Name entered successfully","pass");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			reportStep("Name not entered successfully", "fail");
		}
		return this;
	}

	public GroupsPage clickSave() {
		try {
			WebElement eleSave = locateWebElement("xpath", wOProp.getProperty("GroupsPage.eleSave.Xpath"));
			eleSave.click();
			reportStep("Save clicked successfully","pass");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			reportStep("Save not clicked successfully", "fail");
		}
		return this;
	}
	
	public GroupsPage verifyDisplayedMessage() {
		try {
			String expectedMsg = "These required fields must be completed: Access Type";
			WebElement eleErrorMsg = locateWebElement("xpath", wOProp.getProperty("GroupsPage.eleErrorMsg.Xpath"));
			String actualMsg = getText(eleErrorMsg);
			Assert.assertEquals(actualMsg, expectedMsg, "The error message is not displayed as expected! Please Verify!!");
			reportStep("ErrorMsg displayed successfully","pass");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			reportStep("ErrorMsg not displayed successfully", "fail");
		}
		return this;
	}
	

}
