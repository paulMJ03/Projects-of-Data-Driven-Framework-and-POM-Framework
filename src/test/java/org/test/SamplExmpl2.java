package org.test;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.helper.HelperClass;

public class SamplExmpl2 extends HelperClass {
	
	long startTime;
	long endTime;
	
	@BeforeSuite
	public void launchBrowsr() {
		long startTime = System.currentTimeMillis();
		launchBrowser();
	}
	@AfterSuite
	public void closBrowser() {
		toQuit();
		long endTime = System.currentTimeMillis();
		long totaltime= endTime-startTime;
		System.out.println("total time taken: "+totaltime);
		
	}
	@Test
	public void openGoogle() {
		loadUrl("https://www.google.com/");

	}
	@Test
	public void openGreens() {
		loadUrl("http://www.greenstech.in/selenium-course-content.html");

	}
	@Test
	public void openAdacitn() {
		loadUrl("http://adactinhotelapp.com/");

	}
	
	
	
	
	
	
	
	

}
