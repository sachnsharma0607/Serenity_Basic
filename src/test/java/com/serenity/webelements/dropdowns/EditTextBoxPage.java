package com.serenity.webelements.dropdowns;

import net.serenitybdd.annotations.DefaultUrl;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

@DefaultUrl("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login")
public class EditTextBoxPage extends PageObject{

	@FindBy(name="username")
	private WebElementFacade txtusername;
	

	@FindBy(name="password")
	private WebElementFacade txtpassword;
	
	// Selenium
	public void editTextBox(String username,String pwd)
	{
		open();
		txtusername.sendKeys(username);
		txtpassword.sendKeys(pwd);
	}
	
	// Serenity
	public void editTextBox_Type(String username,String pwd)
	{
		open();
		txtusername.type(username+"123");
		txtpassword.type(pwd+"123");
	}
	

}
