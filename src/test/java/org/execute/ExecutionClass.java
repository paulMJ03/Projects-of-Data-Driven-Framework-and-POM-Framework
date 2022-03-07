package org.execute;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;
import org.pojo.LoginPojo;

import com.helper.HelperClass;

public class ExecutionClass extends HelperClass {

	@Test
	public void tc4() {
		launchBrowser();
		loadUrl("https://www.flipkart.com/account/login");
		maxWindow();
		
		LoginPojo l=new LoginPojo();
		//assert true
		toText(l.getTxtEmail(), "greens");
		String username= getAttribute(l.getTxtEmail());
		Assert.assertTrue("To check username", username.contains("green"));
		
		//assert equals
		toText(l.getTxtPass(), "greens123");
		String password=getAttribute(l.getTxtPass());
		Assert.assertEquals("To check pasword","greens123", "12345");
		toQuit();
	}
	@Test
	public void tc5() {
		launchBrowser();
		loadUrl("https://www.flipkart.com/account/login/");
		maxWindow();
		
		LoginPojo l=new LoginPojo();
		toText(l.getTxtEmail(), "selenium");
		toText(l.getTxtPass(), "selenium123");
		toQuit();

	}
	@Ignore
	@Test
	public void tc6() {
		launchBrowser();
		loadUrl("https://www.flipkart.com/account/login");
		maxWindow();
		
		LoginPojo l=new LoginPojo();
		toText(l.getTxtEmail(), "jira");
		toText(l.getTxtPass(), "jira123");
		toQuit();

	}

	
}
