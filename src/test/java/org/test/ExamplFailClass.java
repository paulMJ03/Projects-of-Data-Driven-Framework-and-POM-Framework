package org.test;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ExamplFailClass {
	
	@Test()
	private void tc1() {
		System.out.println("Test 1");
		Assert.assertTrue(false);

	}
	@Test
	private void tc2() {
		System.out.println("Test 2");
		Assert.assertTrue(true);

	}
	@Test()
	private void tc3() {
		System.out.println("Test 3");
		Assert.assertTrue(false);

	}
	
	
	
	
	
	
	
	
	

}
