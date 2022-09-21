package generalUtility;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebdriverUtility {
	private JavascriptExecutor js;
	private WebDriver driver;
	SoftAssert soft;

	/**
	 * 
	 * This method is used to switch between the browsers
	 * 
	 * @param browser
	 * @return
	 */

	public WebDriver openBrowser(String browser) {
		switch (browser) {
		case "firefox":
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			break;
		case "chrome":
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			break;
		default:
			System.out.println("please enter the valid browser key");
			break;
		}
		return driver;
	}

// access specifier modifier name returntype method_name(parameters if any)
	/**
	 * This particular method can be used to maximize the browser
	 * 
	 * @author DIVYASIDDAPPA
	 * @param driver
	 */

	public void maximizebrowser(WebDriver driver) {
		driver.manage().window().maximize();
	}

// access specifier modifier name returntype method_name(parameters if any)
	/**
	 * This particular method can be used to minimize the browser
	 * 
	 * @author DIVYASIDDAPPA
	 * @param driver
	 */

	public void minimizebrowser(WebDriver driver) {

		driver.manage().window().minimize();

	}

//access specifier modifier name returntype method_name(parameters if any)
	/**
	 * This particular method can be used to get the fullscreen of the browser
	 * 
	 * @author DIVYASIDDAPPA
	 * @param driver
	 */
	public void fullscreenbrowser(WebDriver driver) {
		driver.manage().window().fullscreen();

	}

	// access specifier modifier name returntype method_name(parameters if any)

	/**
	 * This particular method can be used to make the driver wait for an particular
	 * time to match the browser speed with the selenium(implicity wait
	 * synchronization)
	 * 
	 * @param driver
	 * @param longtimewait
	 * 
	 */
	public void waittillpageload(WebDriver driver, int longtimewait) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(longtimewait));
	}

//access specifier modifier name returntype method_name(parameters if any)
	/**
	 * This method is used to get the url use it in the driver
	 * 
	 * @author DIVYASIDDAPPA
	 * @param driver
	 * @param url
	 */

	public void gotospecifiedurl(WebDriver driver, String url) {
		driver.get(url);
	}

//access specifier modifier name returntype method_name(parameters if any)
	/**
	 * This method is used to close the driver
	 * 
	 * @param driver
	 * @author DIVYASIDDAPPA
	 * 
	 * 
	 */
	public void closethebrowser() {
		driver.quit();
	}

//access specifier modifier name returntype method_name(parameters if any)
	/**
	 * This particular method has the combination of all the three methods above as
	 * the parameters passed are same
	 * 
	 * @param driver
	 * @param longtimewait
	 * @param url
	 * @param browser
	 * @param time
	 * @param url
	 * @return
	 * 
	 */
	public WebDriver starttheapplication(String browser, int time, String url) {

		WebDriver driver = openBrowser(browser);
		maximizebrowser(driver);
		waittillpageload(driver, time);
		gotospecifiedurl(driver, url);
		return driver;

	}

//access specifier modifier name returntype method_name(parameters if any)
	/**
	 * 
	 * This particular method is used for performing the mousehover action
	 * 
	 * @author DIVYASIDDAPPA
	 * @param driver
	 * @param ele
	 */
	public void mousehoveraction(WebDriver driver, WebElement ele) {
		new Actions(driver).moveToElement(ele).perform();
	}

//access specifier modifier name returntype method_name(parameters if any)
	/**
	 * 
	 * This particular method is used for performing the doubleclick action on any
	 * of the webelement
	 * 
	 * @author DIVYASIDDAPPA
	 * @param driver
	 * 
	 * @param ele1
	 * 
	 */
	public void doubleclick(WebDriver driver, WebElement ele1) {
		new Actions(driver).doubleClick(ele1).perform();
	}

//access specifier modifier name returntype method_name(parameters if any)
	/**
	 * 
	 * This particular method is used for performing the doubleclick action on any
	 * of the webpage
	 * 
	 * @author DIVYASIDDAPPA
	 * @param driver
	 * 
	 */
	public void doubleclickwebpage(WebDriver driver) {
		new Actions(driver).doubleClick().perform();
	}

	// access specifier modifier name returntype method_name(parameters if any)
	/**
	 * 
	 * This particular method is used for performing the dropdown for selectby index
	 * action
	 * 
	 * @author DIVYASIDDAPPA
	 * @param ele
	 * @param Indexno
	 * 
	 */
	public void dropdownaction(WebElement ele, int Indexno) {
		new Select(ele).selectByIndex(Indexno);
	}

	// access specifier modifier name returntype method_name(parameters if any)
	/**
	 * 
	 * This particular method is used for performing the dropdown for selectby value
	 * action
	 * 
	 * @author DIVYASIDDAPPA
	 * @param ele
	 * @param valuedetails
	 * 
	 */
	public void dropdownactionvalue(WebElement ele, String valuedetails) {
		new Select(ele).selectByValue(valuedetails);

	}

	// access specifier modifier name returntype method_name(parameters if any)
	/**
	 * 
	 * This particular method is used for performing the dropdown for selectby
	 * visibleText action
	 * 
	 * @author DIVYASIDDAPPA
	 * @param ele
	 * @param textdetails
	 * 
	 */
	public void dropdownactionvisibleText(WebElement ele, String textdetails) {
		new Select(ele).selectByVisibleText(textdetails);
	}

	// access specifier modifier name returntype method_name(parameters if any)
	/**
	 * 
	 * This particular method is used for performing the scrollbar action
	 * 
	 * @author DIVYASIDDAPPA
	 * @param driver
	 * @param y
	 * @param x
	 * 
	 */
	public void scrollbyaction(WebDriver driver, int y, int x) {
		JavascriptExecutor a = (JavascriptExecutor) driver;
		a.executeScript("window.scrollBy(" + x + "," + y + ")");
	}

	// access specifier modifier name returntype method_name(parameters if any)

	/**
	 * This method is used for alertpopup action for accept option
	 * 
	 * @author DIVYASIDDAPPA
	 * @param driver
	 */
	public void alertpopupaccept(WebDriver driver) {
		driver.switchTo().alert().accept();
	}

	// access specifier modifier name returntype method_name(parameters if any)

	/**
	 * This method is used for alertpopup action for dismiss option
	 * 
	 * @author DIVYASIDDAPPA
	 * @param driver
	 */
	public void alertpopupdismiss(WebDriver driver) {
		driver.switchTo().alert().dismiss();
	}

	// access specifier modifier name returntype method_name(parameters if any)
	/**
	 * @param element This element is used to clear data in the textField
	 */
	public void tocleardataintextfield(WebElement element) {
		element.sendKeys(Keys.CONTROL + "a");
		element.sendKeys(Keys.CLEAR);
	}

	/**
	 * @author DIVYASIDDAPPA This method is used for explicitly wait condition only
	 * @param driver
	 * @param element
	 * @param time
	 * 
	 */

	// access specifier modifier name returntype method_name(parameters if any)
	public void explicitlywait(WebDriver driver, WebElement element, long time) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(time));
		wait.until(ExpectedConditions.visibilityOf(element));
	}

	/**
	 * this method is used to switch child browser to particularbrowser
	 * 
	 * @author DIVYASIDDAPPA
	 * @param url
	 * 
	 */

	public void switchtowindow(WebDriver driver, String url) {
		Set<String> ids = driver.getWindowHandles();
		for (String id : ids) {
			driver.switchTo().window(id);
			if (driver.getCurrentUrl().equalsIgnoreCase(url)) {
				break;
			}
		}
	}

	/**
	 * This
	 * 
	 * @author DIVYSIDDAPPA
	 * @param driver
	 * 
	 */
	// access specifier modifier name returntype method_name(parameters if any)
	public void jsInitialization(WebDriver driver) {
		js = (JavascriptExecutor) driver;
	}

	/**
	 * This method is used to launch any application that is developed with
	 * javascript via the url specified
	 * 
	 * @author DIVYSIDDAPPA
	 * @param driver
	 * @param url
	 * 
	 */
	// access specifier modifier name returntype method_name(parameters if any)
	public void Launchapplication(String url) {
		js.executeScript("window.location=arguments[0]", url);
	}

	/**
	 * @param element
	 * @param data
	 * @author DIVYASIDDAPPA
	 */
	// access specifier modifier name returntype method_name(parameters if any)

	public void sendkeysUsingjs(WebElement element, String data) {
		js.executeScript("arguments[0].value=arguments[1]", element, data);

	}

	/**
	 * @param element This method is used to click on the particular element using
	 *                javascript
	 * 
	 * 
	 */
	// access specifier modifier name returntype method_name(parameters if any)
	public void clickUsingjs(WebElement element) {
		js.executeScript("arguments[0].click()", element);
	}

	/**
	 * This method is used to scroll till the element
	 * 
	 * @param element
	 */
	// access specifier modifier name returntype method_name(parameters if any)
	public void scrolltillelement(WebElement element) {
		js.executeScript("arguments[0].scrollIntoview()", element);
	}

	/**
	 * This method is used to refresh the browser
	 */
	// access specifier modifier name returntype method_name(parameters if any)

	public void refreshthebrowser() {
		js.executeScript("location.reload()");
	}

	/**
	 * @param java
	 * @param classname This particular method is to create a screenshot when there
	 *                  is a defect in the testcase
	 * 
	 * 
	 */
	public void Screenshot(JavaUtility java, WebDriver driver, String classname) {
		String CT = java.currenttime();
		TakesScreenshot ts = (TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dst = new File("./screenshot/" + classname + "_" + CT + ".PNG");
		try {
			FileUtils.copyFile(src, dst);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/**
	 * This particular method is to create a screenshot when there is a defect in
	 * the testcases
	 * 
	 * @param driver
	 * @return
	 */

	public String screenshot1(WebDriver driver) {
		TakesScreenshot ts1 = (TakesScreenshot) driver;
		String path = ts1.getScreenshotAs(OutputType.BASE64);
		return path;
	}

	/**
	 * 
	 * This particular method is used to validate any method using assertequals
	 * 
	 * @param a
	 * @param b
	 */
	public void validateusingassertequals(String a, String b) {
		Assert.assertEquals(a, b);
	}

	/**
	 * this particular method is used to validate using assertnotequals method
	 * 
	 * @param d
	 * @param e
	 */
	public void validateusingassertnotequals(String d, String e) {
		Assert.assertNotEquals(d, e);
	}

	/**
	 * This particular method is used to verify the specified page details and check
	 * until the page details is obtained
	 * 
	 * @param element
	 * @param expectedText
	 * @param element1
	 */

	public void verifypage(WebElement element, String expectedText, WebElement element1) {
		for (;;) {
			try {
				Assert.assertEquals(element.getText(), expectedText);
				break;
			} catch (Exception e) {
				WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
				wait.until(ExpectedConditions.visibilityOf(element1));
			}
		}
	}

	/**
	 * 
	 * This particular method is used to create an object for soft assert
	 * 
	 */
	public void softassertinitialize() {
		soft = new SoftAssert();
	}

	/***
	 * This particular method is used for soft assert assertall
	 */
	public void softassertall() {
		soft.assertAll();
	}

}
