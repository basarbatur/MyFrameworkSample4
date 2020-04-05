package com.hrm.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.hrm.utils.BaseClass;

public class A001LoginPage extends BaseClass {
	@FindBy(id="txtUsername")
	public WebElement userName;
	
	@FindBy(id="txtPassword")
	public WebElement password;
	
	@FindBy(id="btnLogin")
	public WebElement loginButton;
	
	@FindBy(css="img[src='/humanresources/symfony/web/webres_5acde3dbd3adc6.90334155/themes/default/images/login/syntax.png']")
	public WebElement logo;
	
	@FindBy(id="spanMessage")
	public WebElement errorMessage;
	
	public A001LoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	
	
	
	
	
	
	
}
