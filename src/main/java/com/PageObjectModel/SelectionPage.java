package com.PageObjectModel;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectionPage {

public static WebDriver driver;
 public SelectionPage(WebDriver driver2)
 {
	 this.driver= driver2;
	 PageFactory.initElements(driver2, this);
 }


@FindBy(xpath ="//div[15]//div[2]//div[2]//div[1]//ul[1]//li[1]//button[1]")
 private WebElement camelClr;
 @FindBy(xpath ="//div[15]//div[1]//a[1]//picture[2]//img[1]")
 private WebElement shoeElem;
 @FindBy(xpath = "//span[@data-attr-value='51']")
 private WebElement shoeClr;
 @FindBy(xpath="(//ul[@is='a-btn-size'])[2]")
 private List <WebElement> shoeSize;
 @FindBy(xpath="(//button[@value='Add to bag'])[2]")
 private WebElement addToCart;
 public WebElement getShoeClr() {
	return shoeClr;
}


public List<WebElement> getShoeSize() {
	return shoeSize;
}


public WebElement getAddToCart() {
	return addToCart;
}


public WebElement getCamelClr() {
	return camelClr;
}


public WebElement getShoeElem() {
	return shoeElem;
}

}
