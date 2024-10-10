package com.PageObjectManager;

import org.openqa.selenium.WebDriver;

import com.PageObjectModel.CartButton;
import com.PageObjectModel.HomePage;
import com.PageObjectModel.LandingPage;
import com.PageObjectModel.SelectionPage;

public class Pom {
	public  WebDriver driver;
	private  LandingPage lp;
	private  HomePage hp;
	private SelectionPage sp;
	private CartButton cb;



public Pom(WebDriver driver2) {
		this.driver=driver2;
	}

public LandingPage getLp() {
	if (lp==null)
	{
		lp = new LandingPage(driver);
		
	}

	return lp;
}
public HomePage getHp() {
	if (hp==null)
	{
		hp = new HomePage(driver);
	}
	return hp;
}
public SelectionPage getSp() {
	if(sp==null)
	{
		sp = new SelectionPage(driver);
	}
	return sp;
	
}


public CartButton getCb() {
		
	if(cb==null)
	{
		cb=new CartButton(driver);
	}
	return cb;
	}

}

