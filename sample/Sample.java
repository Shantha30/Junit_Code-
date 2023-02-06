package com.junit.sample;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class Sample {

	@BeforeClass
	public static void beforeClass(){
		System.out.println("Execute before class");
		//browserLaunch 
		//Mousehover on Pay
	}
	@Before
	public void beforeMethod() {
		System.out.println("Execute before every Test");
	}
	@Test
	public void testMethod1() {
		System.out.println("Test Method 1");
	}
	@Test
	public void testMethod2() {
		System.out.println("Test Method 2");
	}
	@Test
	public void testMethod3() {
		System.out.println("Test Method 3");
	}
	@After
	public void afterMethod() {
		System.out.println("Execute after every Test");
	}
	@AfterClass
	public static void afterClass() {
		System.out.println("Execute after class");
	}
}
