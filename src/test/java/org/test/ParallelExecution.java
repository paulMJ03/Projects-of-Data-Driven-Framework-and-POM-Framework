package org.test;

import java.util.concurrent.ThreadPoolExecutor;

import org.testng.annotations.Test;

import com.helper.HelperClass;

public class ParallelExecution extends HelperClass {
	@Test(threadPoolSize=3,invocationCount=3,timeOut=1000)
	private void tc1() throws InterruptedException {
		System.out.println("im test1"+Thread.currentThread().getId());
		
		launchBrowser();
		loadUrl("https://www.facebook.com/login/");
		getTitle();
		Thread.sleep(3000);

	}
	@Test
	private void tc2() throws InterruptedException {
		System.out.println("im test2"+Thread.currentThread().getId());

		launchBrowser();
		loadUrl("https://login.yahoo.com/?.intl=us");
		getTitle();
		Thread.sleep(3000);

	}
	@Test
	private void tc3() throws InterruptedException {
		System.out.println("im test3"+Thread.currentThread().getId());
		
		launchBrowser();
		loadUrl("https://www.google.com/");
		getTitle();
		Thread.sleep(3000);

	}

}
