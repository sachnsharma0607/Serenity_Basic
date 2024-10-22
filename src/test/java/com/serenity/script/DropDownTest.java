package com.serenity.script;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.serenity.webelements.dropdowns.DropDownPage;

import net.serenitybdd.annotations.Managed;
import net.serenitybdd.junit.runners.SerenityRunner;

@RunWith(SerenityRunner.class)
public class DropDownTest {

	@Managed
	WebDriver driver;
	
	DropDownPage dropDownPage;
	
	@Test
	public void tc1() throws InterruptedException
	{
		dropDownPage.selectValue("Ahmedabad Mercantile Co Operative Bank");
		dropDownPage.selectText("KARNATAKA");
		
		System.out.println(dropDownPage.getAllSelectedLabels());
		System.out.println(dropDownPage.getAllSelectedValues());
	
	}
}
