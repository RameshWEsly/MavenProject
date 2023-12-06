package com.test;

import org.testng.annotations.Test;

public class Simple2Test {
	
	@Test
	public void test1() {
		System.out.println(this.getClass().getName());
	}

	@Test
	public void test2() {
		System.out.println(this.getClass().getName());
	}

}
