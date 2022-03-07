package org.runner;

import org.execute.ExecutionClass;
import org.execute.ExecutionClass1;
import org.junit.BrowserLaunch;
import org.junit.BrowserLaunch1;
import org.junit.Test;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import net.jodah.failsafe.Execution;
public class RunnerClass {
	
	@Test
	public void executeAll() {
		Result r=JUnitCore.runClasses(BrowserLaunch.class,ExecutionClass.class);
		System.out.println("Run Count :"+r.getRunCount());
		System.out.println("Ignore count :"+r.getIgnoreCount());
		System.out.println("Failure count :"+r.getFailureCount());
		System.out.println("Runtime :"+r.getRunTime());

	}

}
