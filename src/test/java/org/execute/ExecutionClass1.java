package org.execute;

import org.junit.Assert;
import org.junit.Test;
import org.pojo.LoginPojo;

import com.helper.HelperClass;

public class ExecutionClass1 extends HelperClass {

	@Test
	public void tCase3() {
		launchBrowser();
		loadUrl("http://adactinhotelapp.com/index.php");
		maxWindow();
		
		LoginPojo l = new LoginPojo();
		toText(l.getTxtEmail(), "Paul03696");
		String username = getAttribute(l.getTxtEmail());
		Assert.assertTrue("To check username", username.contains("Paul"));
		
		toText(l.getTxtPass(), "53D137");
		String pass=getAttribute(l.getTxtPass());
		Assert.assertEquals("To check passwrd", "53D137", "123456");
//		toQuit();
		btnClick(l.getBtnLogin());
		selectByVisibleText("New York", l.getLoc());
		selectByVisibleText("Hotel Sunshine", l.hotelName());
		selectByVisibleText("3 - Three", l.roomNo());
		selectByVisibleText("3 - Three", l.adultNo());
		btnClick(l.submit());

	}
	@Test
	public void tCase4() {
		launchBrowser();
		loadUrl("http://adactinhotelapp.com/index.php");
		maxWindow();
		
		LoginPojo l=new LoginPojo();
		toText(l.getTxtEmail(), "selenium");
		toText(l.getTxtPass(), "selenium123");
		toQuit();

	}
}
