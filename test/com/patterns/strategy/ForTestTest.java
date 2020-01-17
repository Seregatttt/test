package com.patterns.strategy;

import org.junit.Test;

public class ForTestTest {
	
	protected static ForTest forTest = new ForTest();
	
	@Test
	public void demo() throws Exception {
		forTest.setDemo("ttt");
		
		System.out.println(forTest.getDemo());
	}
}
