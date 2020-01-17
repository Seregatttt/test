package com.patterns.strategy;

public class DeveloperRunner {
	
	public static void main(String[] args) {
		Developer developer = new Developer();
		
		developer.setActivity(new Sleeping());
		developer.executeActivity(1);
		
		developer.setActivity(new Coding());
		developer.executeActivity(2);
		
		developer.setActivity(new Reading());
		developer.executeActivity(3);
		
		developer.setActivity(new Training());
		developer.executeActivity(4);
	}
}
