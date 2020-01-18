package com.foreach;

import java.util.function.Consumer;

//Реализация интерфейса Consumer br6 12
class MyConsumer implements Consumer<Integer> {
	
	public void accept(Integer t) {
		System.out.println(t);
	}
	
	
}