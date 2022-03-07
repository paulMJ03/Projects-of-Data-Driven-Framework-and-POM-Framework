package org.test;

import org.pojo.LoginPojo;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.helper.HelperClass;

public class AssertExmpl extends HelperClass {
	
	@BeforeMethod
	private void strtTime() {
		getDateAndTime();

	}
	@AfterMethod
	private void endTime() {
		getDateAndTime();

	}
	@Test
	public void tc1() {
		System.out.println("Test Case-1");

	}
	@Test
	public void tc2() {
		System.out.println("Test Case-2");

	}
	@Test
	public void tc3() {
		launchBrowser();
		loadUrl("https://www.facebook.com/login/");
		LoginPojo l=new LoginPojo();
		//softAssert
		SoftAssert s=new SoftAssert();
		toText(l.getTxtEmail(), "paul123@gmail.com");
		String username = getAttribute(l.getTxtEmail());
		s.assertTrue(username.contains("paul"), "to check username");
		
		toText(l.getTxtPass(), "paul1234");
		String password = getAttribute(l.getTxtPass());
		s.assertEquals("paul1234",password.contains("sel123"), "to check password");
		btnClick(l.getBtnLogin());
		toQuit();

	}
	}
