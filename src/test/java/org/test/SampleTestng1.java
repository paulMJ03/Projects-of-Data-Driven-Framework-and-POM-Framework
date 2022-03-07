package org.test;

import org.testng.annotations.Test;

public class SampleTestng1 {
	@Test(priority=0)
	public void startCar() {
		System.out.println("start car");

	}
	@Test(priority=1)
	public void putFirstGear() {
		System.out.println("first gear");

	}
	@Test(priority=2)
	public void putSecondGear() {
		System.out.println("second gear");

	}
	@Test(priority=3)
	public void putThirdGear() {
		System.out.println("third gear");

	}
	@Test(priority=4,enabled=false)
	public void turnMusic() {
		System.out.println("turn the music");

	}
	
	
	
	
	
	

}
