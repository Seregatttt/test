package com.foreach;

import java.util.function.Consumer;

//Реализация интерфейса Consumer
class MyConsumer implements Consumer<Integer> {
	
	public void accept(Integer t) {
		System.out.println(t);
	}
	
	
}