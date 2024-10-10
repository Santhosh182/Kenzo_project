package com.PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartButton extends SelectionPage {

public WebDriver driver;

	public CartButton(WebDriver driver)
{
	super(driver);
	this.driver=driver;
	PageFactory.initElements(driver, this);
	}
@FindBy(xpath ="//span[text()='Continue Shopping']")
private WebElement ContinueBtn;
@FindBy(xpath ="(//button[@aria-label='Your Cart'])[1]")
private WebElement cartBtn;

public WebElement getContinueBtn() {
	
	return ContinueBtn;
}
public WebElement getCartBtn() {
	return cartBtn;
}

}
