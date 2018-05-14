package jenkinsTest;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class jenkinsTest1 {
	
	@BeforeClass
	public static void beforeClass() {
		System.out.println("The Before Class: Test1");
	}
	
	@Before
	public void before() {
		System.out.println("The Before : Test1");	
	}
	
	@Test
	public void fun1() {
		System.out.println("Test1: fun1");
	}
	
	@Test
	public void fun2() {
		System.out.println("Test1: fun2");
	}
	
	@After
	public void after() {
		System.out.println("The After : Test1");	
	}	
	
	@AfterClass
	public static void afterClass() {
		System.out.println("The After Class: Test1");
	}
	

}
