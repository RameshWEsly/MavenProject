package com.test;

import org.testng.annotations.Test;

public class SimpleTest1 {
	
	@Test
	public void test1() {
		System.out.println(this.getClass().getName());
	}

	@Test
	public void test2() {
		System.out.println(this.getClass().getName());
	}

}
