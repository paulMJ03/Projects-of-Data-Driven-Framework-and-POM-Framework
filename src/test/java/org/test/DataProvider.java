package org.test;

import org.pojo.LoginPojo;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.helper.HelperClass;

public class DataProvider extends HelperClass {
	
	@BeforeClass
	public void befClass() {
		launchBrowser();
		maxWindow();

	}
	@AfterClass
	public void aftrClass() {
		toQuit();

	}
	@BeforeMethod
	public void befMe() {
		getDateAndTime();

	}
	@AfterMethod
	public void aftrMe() {
		getDateAndTime();

	}
	
	@Test
	public void tc1() {
		getTitle();

	}
	@Test
	public void tc2() {
		currentUrl();

	}
	
	@Test(dataProvider = "TestData")
	public void tc3(String username, String password) throws InterruptedException {
		loadUrl("https://www.facebook.com/login/");
		LoginPojo l=new LoginPojo();
		toText(l.getTxtEmail(), username);
		toText(l.getTxtPass(), password);
		btnClick(l.getBtnLogin());
		Thread.sleep(3000);
		

	}
	@org.testng.annotations.DataProvider(name = "TestData")
	
	private Object[] [] data() {
		return new Object[] [] {
			{"Selenium","Selenium123"},{"Greens","Greens123"},{"python","pyhon123"}

	};
	

	}}
	
	
	
	
	
