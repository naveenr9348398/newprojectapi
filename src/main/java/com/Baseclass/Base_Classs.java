package com.Baseclass;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base_Classs {
	
	public static WebDriver driver;
	static JavascriptExecutor js;
	static Actions act;
	static Robot r;
	
	public static void browserlaunch(String url) {
		WebDriverManager.chromedriver().setup();
		ChromeOptions ch = new ChromeOptions();
		ch.addArguments("Incognito");
		driver = new ChromeDriver(ch);
		driver.manage().window().maximize();
		driver.get(url);
	}
	
	public static void clickonelementt(WebElement element) {
		if(element.isDisplayed()) {
			element.click();
		}
		
	}
	
	public static void sendkeyss(WebElement element,String value) {
		if(element.isDisplayed()) {
			element.sendKeys(value);
		}
		
	}
	
	public static void screenshott(String filename) throws IOException {
		TakesScreenshot ts = (TakesScreenshot)driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File destination = new File("C:\\Users\\nsk47\\eclipse-workspace\\Mavennfarrowproject\\screenshot"+filename+".png");
		FileUtils.copyFile(source, destination);
		
	}
	
	public static void dropdownn(WebElement element,String value,String option) {
		
        Select s = new Select(element);	
		if(option.equalsIgnoreCase("index")) {
			s.selectByIndex(Integer.parseInt(value));
		}
		
		else if(option.equalsIgnoreCase("value")) {
			s.selectByValue(value);
		}
		
		else if(option.equalsIgnoreCase("visibletext")) {
			s.selectByVisibleText(value);
		}
	}
	
	public static void javassendkeys(String txtbox, WebElement element) {
		 js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].setAttribute('value','"+txtbox+"') ", element);
	}
	
	public static void javasclick(WebElement element) {
		 js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", element);
	}
	
	public static void executeanyjsscript(String scriptt) {
	  js = (JavascriptExecutor)driver;
		js.executeScript(scriptt);
	}
	
	public static void mouseclick(WebElement element) {
		 act = new Actions(driver);
		act.click(element).build().perform();
	}
	
	public static void mousedoubleclick(WebElement element) {
		 act = new Actions(driver);
		act.doubleClick(element).build().perform();
	}
	
	public static void mousecontextclick(WebElement element) {
		act = new Actions(driver);
		act.contextClick(element).build().perform();
	}
	
	public static void mousemovetoelement(WebElement element) {
		act = new Actions(driver);
		act.moveToElement(element).build().perform();
	}
	
	public static void mousedraganddrop(WebElement target1,WebElement target2) {
		act = new Actions(driver);
		act.dragAndDrop(target1, target2);
	}
	
	public static void simplealertt() {
		driver.switchTo().alert().accept();
	}
	
	public static void confirmalertt(String option) {
		if(option.equalsIgnoreCase("accept")) {
			driver.switchTo().alert().accept();
		}
		
		else if (option.equalsIgnoreCase("dismiss")) {
			driver.switchTo().alert().dismiss();
		}
	}
	
	public static void prompttalert(String option,String input) {
		Alert alert = driver.switchTo().alert();
		alert.sendKeys(input);
		if(option.equalsIgnoreCase("accept")) {
			alert.accept();
		}
		else if(option.equalsIgnoreCase("dismiss")) {
			alert.dismiss();
		}
	}
	
	public static void implictttwaitt() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	}
	
	public static void explicitttwait(WebElement elemetn) {
		WebDriverWait wait= new WebDriverWait(driver,null);
		wait.until(ExpectedConditions.visibilityOf(elemetn));
	}
	
	public static void windowswitch(int index) {
		Set <String> tabidset =	driver.getWindowHandles();
		List <String> id_list = new LinkedList<>(tabidset);
		String string = id_list.get(index);
		driver.switchTo().window(string);
		}

	
	public static void frameindex(int index) {
		driver.switchTo().frame(index);
	}
	public static void frameidorname(String value) {
		driver.switchTo().frame(value);
	}
	public static void elementss(WebElement element) {
		driver.switchTo().frame(element);
	}
	public static void Robott() throws AWTException {
		r = new Robot();
		r.keyPress(KeyEvent.VK_ENTER);
		
	}
	public static void executeJavaScriptt(String scriptToExecute,WebElement element) {
		 js = (JavascriptExecutor) driver;
		js.executeScript(scriptToExecute,element);
	}
	
	public static void closebrowser() {
		driver.quit();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
