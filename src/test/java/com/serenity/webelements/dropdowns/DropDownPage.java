package com.serenity.webelements.dropdowns;

import java.util.Properties;
import java.util.Set;

import com.thoughtworks.xstream.io.path.Path;

import net.serenitybdd.annotations.DefaultUrl;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.components.Dropdown;

@DefaultUrl("https://www.policybazaar.com/ifsc/")
public class DropDownPage extends PageObject {

	@FindBy(id = "bank")
	private WebElementFacade dropdownID_Bankd;

	@FindBy(name = "state")
	private WebElementFacade dropdownID_State;

	@FindBy(id = "district")
	private WebElementFacade dropdownID_district;

	public void selectValue(String value) throws InterruptedException {

		open();
		Thread.sleep(500);
		Dropdown.forWebElement(dropdownID_Bankd).selectByValue(value);
		Thread.sleep(1500);

	}

	public void selectText(String value) throws InterruptedException {

		Thread.sleep(500);
		Dropdown.forWebElement(dropdownID_State).select(value);
		Thread.sleep(1500);

	}

	public void selectFromDropdownValue(String value) throws InterruptedException {

		selectFromDropdown(dropdownID_district, value);
		Thread.sleep(1500);

	}

	public Set<String> getAllSelectedLabels() throws InterruptedException {

		return Dropdown.forWebElement(dropdownID_State).getSelectedOptionLabels();

	}

	public Set<String> getAllSelectedValues() throws InterruptedException {

		return Dropdown.forWebElement(dropdownID_State).getSelectedOptionValues();

	}
	
}
