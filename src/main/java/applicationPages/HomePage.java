package applicationPages;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import baseMethods.ProjectBaseMethod;

public class HomePage extends ProjectBaseMethod{

	public HomePage(WebDriver driver, Properties wOProp, Properties prop, WebDriverWait wait, JavascriptExecutor js) {
		this.driver = driver;
		this.wOProp = wOProp;
		this.prop = prop;
		this.wait = wait;
		this.js = js;
	}

	public HomePage clickToggleButton() {
		try {
			WebElement eleToggleButton = locateWebElement("xpath", wOProp.getProperty("HomePage.eleToggleButton.Xpath"));
			wait.until(ExpectedConditions.visibilityOf(eleToggleButton));
			click(eleToggleButton);
			reportStep("clicked Toggle successfully","pass");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			reportStep("Toggle not clicked successfully","fail");
		}
		return this;
	}

	public HomePage clickViewAllOption() {
		try {
			WebElement eleViewAll = locateWebElement("xpath", wOProp.getProperty("HomePage.eleViewAll.Xpath"));
			wait.until(ExpectedConditions.visibilityOf(eleViewAll));
			click(eleViewAll);
			reportStep("clicked View All successfully","pass");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			reportStep("View All not clicked successfully","fail");
		}
		return this;
	}

	public GroupsPage clickSales() {
		try {
			WebElement eleSales = locateWebElement("xpath", wOProp.getProperty("HomePage.eleSales.Xpath"));
			click(eleSales);
			reportStep("clicked Sales successfully","pass");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			reportStep("Sales not clicked successfully","fail");
		}
		return new GroupsPage(driver,wOProp, prop, wait,js);
	}

}
