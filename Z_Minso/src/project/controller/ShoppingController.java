package project.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

import project.model.Shopping;

public class ShoppingController {

	
	private HashMap<Shopping, Integer > hMap = new HashMap<>();
	private ArrayList<Shopping> list = new ArrayList<>();
	Set<Shopping>key = hMap.keySet();
	
	public boolean addNewShop(Shopping s, int amount) {
		if(!hMap.containsKey(s)) {
			hMap.put(s, amount);
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
	
public boolean changeAmount(Shopping s, int amount) {
		
		// 전달 받은 f가 hMap 안에 key로 존재할 때 
		// f와 amount 저장 후 true 반환
		
		// 존재하지 않을 경우 false 반환
		if(hMap.containsKey(s)) {
			hMap.put(s, amount);
			return true;
		}
		return false;
	}

public HashMap<Shopping, Integer> printShopping() {
	
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