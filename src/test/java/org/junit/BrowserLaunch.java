package org.junit;

import java.util.Date;

import org.pojo.LoginPojo;

import com.helper.HelperClass;

public class BrowserLaunch extends HelperClass{
	@BeforeClass
	public static void startDate() {
		Date d=new Date();
		System.out.println(d);

	}
	
	@AfterClass
	public static void endDate() {
		Date d=new Date();
		System.out.println(d);

	}
	@Before
	public void launch() {
		launchBrowser();
		loadUrl("https://www.flipkart.com/account/login");
		maxWindow();

	}
	@After
	public void quitBrowser() {
		toQuit();

	}
	@Test
	public void testCase1() {
		LoginPojo l=new LoginPojo();
		//assert true
		toText(l.getTxtEmail(), "greens");
		String username= getAttribute(l.getTxtEmail());
		Assert.assertTrue("To check username", username.contains("green"));
		
		//assert equals
		toText(l.getTxtPass(), "greens123");
		String password=getAttribute(l.getTxtPass());
		Assert.assertEquals("To check pasword","greens123", "12345");

	}
	@Test
	public void testCase2() {
		LoginPojo l=new LoginPojo();
		toText(l.getTxtEmail(), "selenium");
		toText(l.getTxtPass(), "selenium123");

	}
	@Test
	public void tesCase3() {
		LoginPojo l=new LoginPojo();
		toText(l.getTxtEmail(), "python");
		toText(l.getTxtPass(), "python123");

	}
	
	

}
