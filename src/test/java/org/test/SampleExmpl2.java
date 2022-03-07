package org.test;

import java.util.Date;

import org.pojo.LoginPojo;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.helper.HelperClass;

public class SampleExmpl2 extends HelperClass {
	
	@BeforeClass
	public void launchBrowser1() {
		launchBrowser();
		
		maxWindow();

	}
	@AfterClass
	public void quitBows() {
	toQuit();
	getResult();

	}
	@BeforeMethod
	public void titl() {
		getTitle();
		getDateAndTime();

	}
	@AfterMethod
	public void endTime() {
		getDateAndTime();

	}
	@Test
	public void testCase1() {
		loadUrl("https://login.yahoo.com/?.intl=us");
		
		LoginPojo l=new LoginPojo();
		toText(l.getTxtEmail(), "paul12@gmail.com");
		btnClick(l.getBtnLogin());

	}
	
	

}
