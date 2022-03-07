package org.junit;

import java.util.Date;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.pojo.LoginPojo;

import com.helper.HelperClass;

public class BrowserLaunch1 extends HelperClass {

	@BeforeClass
	public static void startDate() {
		Date d = new Date();
		System.out.println(d);

	}

	@AfterClass
	public static void endDate() {
		Date d = new Date();
		System.out.println(d);

	}

	@Before
	public void launch() {
		launchBrowser();
		loadUrl("http://adactinhotelapp.com/index.php");
		maxWindow();
	}

	@After
	public void quit() {
		toQuit();
	}

	@Test
	public void tCase1() {
		LoginPojo l = new LoginPojo();
		toText(l.getTxtEmail(), "Paul03696");
		toText(l.getTxtPass(), "53D137");
		btnClick(l.getBtnLogin());
		selectByVisibleText("New York", l.getLoc());
		selectByVisibleText("Hotel Sunshine", l.hotelName());
		selectByVisibleText("3 - Three", l.roomNo());
		selectByVisibleText("3 - Three", l.adultNo());
		btnClick(l.submit());
	}

	@Test
	public void tCase2() {
		LoginPojo l = new LoginPojo();
		toText(l.getTxtEmail(), "Paul03696");
		toText(l.getTxtPass(), "53D137");
		btnClick(l.getBtnLogin());
		selectByVisibleText("Los Angeles", l.getLoc());
		selectByVisibleText("Hotel Sunshine", l.hotelName());
		selectByVisibleText("4 - Four", l.roomNo());
		selectByVisibleText("3 - Three", l.adultNo());
		btnClick(l.submit());
	}

}
