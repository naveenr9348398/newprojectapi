package com.pageobjectmodelandmanager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.Baseclass.Base_Classs;

public class Pageobjecttmanagerr extends Base_Classs {
	public Pageobjecttmanagerr(WebDriver driver1) {
		driver = driver1;
		PageFactory.initElements(driver, this);
	}
	
	private Firstocassionaltab fot;
	
	private services_page sp;
	
	public Firstocassionaltab getfot() {
		fot = new Firstocassionaltab(driver);
		return fot;
	}
	
	public services_page getsp() {
		sp = new services_page(driver);
		return sp;
	}
	
	
	
	

}
