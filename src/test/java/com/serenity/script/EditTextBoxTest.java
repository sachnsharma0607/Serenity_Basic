package com.serenity.script;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.serenity.webelements.dropdowns.EditTextBoxPage;

import net.serenitybdd.annotations.Managed;
import net.serenitybdd.junit.runners.SerenityRunner;

@RunWith(SerenityRunner.class)
public class EditTextBoxTest {
	
	@Managed
	WebDriver driver;
	
	EditTextBoxPage editTextBoxPage;
	
	@Test
	public void tc2() throws InterruptedException
	{
		editTextBoxPage.editTextBox("Admin", "Admin@123");
		Thread.sleep(1500);
		editTextBoxPage.editTextBox_Type("Ankita", "Ankita@123");
		Thread.sleep(1500);

		
	}

}
