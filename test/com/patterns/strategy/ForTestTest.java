package com.patterns.strategy;

import org.junit.Test;

public class ForTestTest {
	
	protected static ForTest forTest =   new ForTest();
	
	@Test
	public void demo() throws Exception {
		forTest.setDemo("ttt");
		// br1
		// br1
		// br3
		// br333
		System.out.println(forTest.getDemo());
	}
}
