package com.pageobjectmodelandmanager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Baseclass.Base_Classs;

public class services_page extends Base_Classs {
	
	public services_page(WebDriver driver1) {
		driver= driver1;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "(//a[text()='Services'])[1]")
	private WebElement servicesmovetotab;
	
	@FindBy(xpath = "//a[text()='Customs Brokerage']")
	private WebElement customsbrokage;
	
	@FindBy(xpath = "(//a[@class='content-row-tab-tab-item-cta'])[1]")
	private WebElement learnmore;
	
	@FindBy(xpath = "//a[@href='https://farrow.com/industries/automotive/']")
	private WebElement automotivesection;

	public WebElement getServicesmovetotab() {
		return servicesmovetotab;
	}

	public WebElement getCustomsbrokage() {
		return customsbrokage;
	}

	public WebElement getLearnmore() {
		return learnmore;
	}

	public WebElement getAutomotivesection() {
		return automotivesection;
	}

	
	
	
	
	

}
