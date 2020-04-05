package com.hrm.steps;

import com.hrm.utils.BaseClass;
import com.hrm.utils.CommonMethods;
import com.hrm.utils.DbUtils;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {
		@Before
		public void start(Scenario scenario) {
			System.out.println("Starting test: "+ scenario.getName());
			BaseClass.setUp();
		}
		
		@After
		public void end(Scenario scenario) {
			System.out.println("Ending test: "+scenario.getName());
			
			if(scenario.isFailed()) {
				byte[] shot=CommonMethods.takeScreenshot();
				scenario.embed(shot, "image/png");
				
			}
			BaseClass.tearDown();
			
		}
		
		@Before ("@db")
		public void open() {
			DbUtils.createConnection();
		}
		
		@After("@db")
		public void close() {
			DbUtils.closeConnection();
		}
		
		
		
		
}
