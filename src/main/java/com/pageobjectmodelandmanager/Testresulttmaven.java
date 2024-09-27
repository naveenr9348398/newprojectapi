package com.pageobjectmodelandmanager;

import com.Baseclass.Base_Classs;
import com.pageobjectmodelandmanager.Pageobjecttmanagerr;

public class Testresulttmaven extends Base_Classs {

	public static void main(String[] args) {
		Pageobjecttmanagerr pom = new Pageobjecttmanagerr(driver);
		browserlaunch("https://farrow.com/");
		mousemovetoelement(pom.getsp().getServicesmovetotab());
		mouseclick(pom.getsp().getCustomsbrokage());
		executeJavaScriptt("arguments[0].scrollIntoView();", pom.getsp().getLearnmore());
		clickonelementt(pom.getsp().getLearnmore());
		windowswitch(1);
		executeJavaScriptt("arguments[0].scrollIntoView();", pom.getsp().getAutomotivesection());
		clickonelementt(pom.getsp().getAutomotivesection());
		windowswitch(2);
		executeJavaScriptt("arguments[0].scrollIntoView();", pom.getfot().getIndoverview());
		clickonelementt(pom.getfot().getIndoverview());
		executeJavaScriptt("arguments[0].scrollIntoView();", pom.getfot().getAllresources());
		clickonelementt(pom.getfot().getAllresources());
		closebrowser();
		System.out.println("output1");
		System.out.println("output2");
		System.out.println("output3");
		System.out.println("output4");
		
		System.out.println("testing1");
		System.out.println("testing2");
		System.out.println("testing3");
		System.out.println("testing4");
		System.out.println("testing5");
		System.out.println("testing6");
		System.out.println("testing7");
		System.out.println("testing10");
		System.out.println("testing11");
		
		
		
		
		
	}
	
}
