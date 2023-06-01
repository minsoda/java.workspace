package com.kh._abstract.step2;

public class PotatoPizza extends Pizza {

	
	public PotatoPizza(int price, String storeName) {
		super(price, storeName); // protected 로 지정해서 이렇게도 사용가능 this. price = price; this.storeName = storeNmae;
	}

	@Override
	public void topping() {
		System.out.println("Potato Topping...");
	}

}
