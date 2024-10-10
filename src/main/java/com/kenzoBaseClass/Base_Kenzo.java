package com.kenzoBaseClass;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.*;




public class Base_Kenzo {

public static WebDriver driver;
public static WebDriver browser_configuration(String type)
{
	if(type.equalsIgnoreCase("chrome"))
	{
	 driver =  new ChromeDriver();
	System.setProperty("webdriver.chrome.driver", System.getProperty("userDir")+ ("\\driver\\chromedriver.exe"));
	}
	else if (type.equalsIgnoreCase("firefox")) 
	{
		 driver =  new FirefoxDriver();
		System.setProperty("webdriver.gecko.driver", System.getProperty("userDir")+ ("\\driver\\chromedriver.exe"));
		}	
	else if (type.equalsIgnoreCase("edge")) 
	{
		 driver =  new EdgeDriver();
		System.setProperty("webdriver.edge.driver", System.getProperty("userDir")+ ("\\driver\\chromedriver.exe"));
		}		
driver.manage().window().maximize();
return driver;
}


public static void wait_implicit()
{
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
}
public static void wait_explicit_visible(WebElement element, String type)
{
	WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
	if (type.equalsIgnoreCase("visible"))
	{	
	wait.until(ExpectedConditions.visibilityOf(element));	
	}
	else if (type.equalsIgnoreCase("invisible")) {
		wait.until(ExpectedConditions.invisibilityOf(element));
	}
}
public static void wait_explicit_invisible(WebElement element, Duration seconds)
{
	
}

public static void dropdown(WebElement element, String value, String type) {
	Select s = new Select(element);
	if (type.equalsIgnoreCase("byvalue"))
	{
	s.selectByValue(value);	
	}
	else if (type.equalsIgnoreCase("byindex")) 
	{

		int index = Integer.parseInt(value);
		s.selectByIndex(index);
	}
	else if (type.equalsIgnoreCase("bytext")) 
	{
		s.selectByVisibleText(value);
	}

}
public static void window_handle(String value) {
	Set<String> wh = driver.getWindowHandles();
String parentwindow = driver.getWindowHandle();
for (int i = 0; i < wh.size(); i++) {
	if(wh.equals(parentwindow)) {
		
	}
}	
driver.switchTo().window(value);
}
public static void getUrl(String url) {
	// TODO Auto-generated method stub
driver.get(url);
}
	

public static void tear_down() {
driver.close();
}
public static void clickOnElement(WebElement element)
{
element.click();
}
public static void inputValues(WebElement element, String value)
{
element.sendKeys(value);
}
public static void mouseAction(String type, WebElement element) {
	// TODO Auto-generated method stub
Actions ac = new Actions(driver);
if(type.equalsIgnoreCase("movetoelement"))
{
	ac.moveToElement(element).build().perform();
}
else if (type.equalsIgnoreCase("rightClick")) {
	ac.contextClick(element);
	
}
else if (type.equalsIgnoreCase("doubleClick"))
{
	ac.doubleClick(element);
}
}
}

