package project.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

import project.model.Shopping;

public class ShoppingController {

	
	private HashMap<Shopping, Integer[]> hMap = new HashMap<>();
	private Integer[] prices = hMap;
	private ArrayList<Shopping> list = new ArrayList<>();
	Set<Shopping>key = hMap.keySet();
	
	public boolean addNewShop(Shopping s, int amount, int price) {
		if(!hMap.containsKey(s)) {
			hMap.put(s, amount, price);
			return true;
		}
		return false;
	}
	
	public boolean removeShop(Shopping s) {
		if(hMap.containsKey(s)) {
			hMap.remove(s);
			return true;
		}
			return false;
	}
	


public HashMap<Shopping, Integer>printShopping(){
	return hMap;
}


// ===== 고객 관련 ====

public boolean buyShop(Shopping s) {
	if(hMap.containsKey(s) && hMap.get(s) > 0) {
		list.add(s);
		hMap.put(s, hMap.get(s)-1);
		return true;
	}
return false;

}

public boolean removeShops(Shopping s) {
	if(list.contains(s)) {
		list.remove(s);
		hMap.put(s, hMap.get(s)+1);
		return true;
	}
return false;
}

public ArrayList<Shopping> printBuyShopList(){
	return list;
}
}