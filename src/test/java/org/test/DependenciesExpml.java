package org.test;

import org.testng.annotations.Test;

public class DependenciesExpml {
	//to admit a student in engineering
	@Test(enabled=true)
	public void highSchool() {
		System.out.println("High School");

	}
	@Test(dependsOnMethods="highSchool")
	public void highSecSchool() {
		System.out.println("Higher Secondary School");
	}
	
	@Test(dependsOnMethods="highSecSchool")
	public void enggCollege() {
			System.out.println("Engineering");
	}

}
