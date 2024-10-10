package com.PageObjectModel;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	public  WebDriver driver;
public HomePage(WebDriver driver) {
	this.driver = driver;
	PageFactory.initElements(driver, this);
}
@FindBy(xpath="(//button[@aria-Label='Login'])[2]")
private WebElement login_btn;
@FindBy(id="co-guest-form-signInLogin")
private WebElement email_id;
@FindBy(xpath= "(//button[@class='importance-primary block'])[1]")
private WebElement continue_btn;
@FindBy(id="signin-form-signInPassword")
private WebElement password;
@FindBy(id="signin-form-signInPassword-error")
private WebElement error_msg;
@FindBy(xpath= "//span[text()='LOG IN']")
private WebElement Logged_in;
@FindBy(id="category-n1-men")
private WebElement menCat;
@FindBy(id="category-shoes-men-sneakers-1")
private WebElement menSneakers;


public WebElement getMenCat() {
	return menCat;
}


public WebElement getMenSneakers() {
	return menSneakers;
}



public void setPassword(WebElement password) {
	this.password = password;
}


public WebElement getPassword() {
	return password;
}


public WebElement getLogin_btn() {
	return login_btn;
}
public WebElement getEmail_id() {
	return email_id;
}
public WebElement getContinue_btn() {
	return continue_btn;
}

public WebElement getError_msg() {
	return error_msg;
}
public WebElement getLogged_in() {
	return Logged_in;
}

}
