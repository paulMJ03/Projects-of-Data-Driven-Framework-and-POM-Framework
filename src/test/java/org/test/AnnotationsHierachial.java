package org.test;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class AnnotationsHierachial {
  @Test
  public void f() {
	  System.out.println("test");
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("b4 methd");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("aftr methd");
  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println("b4 class");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("aftr class");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("b4 test");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("aftr tst");
  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("b4 suite");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("aftr suite");
  }

}
