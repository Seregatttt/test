package com.patterns.strategy;

/**
 * Created by dev2 on 08.01.2020.
 */
public class Reading implements Activity {
	@Override
	public void justDoIt(int i) {
		System.out.println("Reading..."+i);
		
	}
}
