package org.test;

import org.checkerframework.checker.units.qual.min;
import org.testng.annotations.Test;

public class Grouping {
	@Test(groups= {"Vivo"})
	public void vivo() {
		System.out.println("vivo testing");

	}
	@Test(groups= {"Vivo"})
	public void vivo1() {
		System.out.println("vivo testing 1");

	}
	@Test(groups= {"Samaung"})
	public void samsung() {
		System.out.println("samsung testing");

	}
	@Test(groups= {"Samaung"})
	public void samsung1() {
		System.out.println("samsung testing 1");

	}
	@Test(groups= {"MI"})
	public void mi() {
		System.out.println("mi testing");

	}
	@Test(groups= {"MI"})
	public void mi1() {
		System.out.println("mi testing 1");

	}
	
	
	
	
	

}
