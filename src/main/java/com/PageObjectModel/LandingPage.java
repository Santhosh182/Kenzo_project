package com.PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.kenzoBaseClass.Base_Kenzo;

public class LandingPage{
public WebDriver driver;
public LandingPage(WebDriver driver) {

	this.driver = driver;
	PageFactory.initElements(driver, this);
}
@FindBy(className = "btn-content")
private WebElement international_btn;
@FindBy(id = "onetrust-accept-btn-handler")
private WebElement accept_cookies;


public WebElement getAccept_cookies() {
	return accept_cookies;
}


public WebElement getInternational_btn() {
	
	return international_btn;
}

}
