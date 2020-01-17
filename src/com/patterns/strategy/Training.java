package com.patterns.strategy;

/**
 * Created by dev2 on 08.01.2020.
 */
public class Training implements Activity {
	@Override
	public void justDoIt(int i) {
		System.out.println("Training..."+i);
		
	}
}
