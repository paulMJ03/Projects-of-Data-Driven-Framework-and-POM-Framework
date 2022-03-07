package org.test;

import org.pojo.LoginPojo;
import org.testng.annotations.Ignore;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.helper.HelperClass;

public class SampleExmpl3 extends HelperClass {
	@Test
	public void tc1() {
		launchBrowser();
		loadUrl("https://www.facebook.com/login/");
		maxWindow();
		LoginPojo l=new LoginPojo();
		toText(l.getTxtEmail(), "selenium@gmail.com");
		toText(l.getTxtPass(), "selenium123");
		btnClick(l.getBtnLogin());
		toQuit();
		
		System.out.println("Sample test case executed");

	}
	
	@Test
	@Parameters({"email","pass"})
	private void tc2(@Optional("paul@gmail.com")String username,String password) {
		launchBrowser();
		loadUrl("https://www.facebook.com/login/");
		maxWindow();
		LoginPojo l=new LoginPojo();
		toText(l.getTxtEmail(), username);
		toText(l.getTxtPass(), password);
		btnClick(l.getBtnLogin());
		toQuit();

	}
	@Test
	public void tc3() {
		launchBrowser();
		loadUrl("https://www.facebook.com/login/");
		LoginPojo l=new LoginPojo();
		toText(l.getTxtEmail(), "python@gmail.com");
		toText(l.getTxtPass(), "python123");
		btnClick(l.getBtnLogin());
		toQuit();

	}
	
	
	
	
	

}
