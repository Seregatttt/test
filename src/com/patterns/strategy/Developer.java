package com.patterns.strategy;

public class Developer {
	Activity activity;
	
	public void setActivity(Activity activity) {
		this.activity = activity;
	}
	
	public void executeActivity(int i){
		activity.justDoIt(i);
	}
}
