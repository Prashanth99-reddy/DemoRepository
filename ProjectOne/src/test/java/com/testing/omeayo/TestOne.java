package com.testing.omeayo;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestOne {
	
    @BeforeClass
	public void setup() {
		System.out.println("Opening browser");

	}
    
    @AfterClass
    public void closing() {
    	System.out.println("Closing browser");
    	
    }

	@Test(priority = 1)
	public void registration() {
		System.out.println("This is method One");
	}

	@Test(priority = 2)
	public void login() {
		System.out.println("This is inside methodTwo");
	}

	@Test(priority = 3)
	public void logout() {
		System.out.println("This is inside methodThree");

	}

}
