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
		
//		System.out.println(hMap);
//		System.out.println(s);
//		System.out.println(hMap.containsKey(s));
		
		
//		System.out.println(hMap);
		
		// 해시맵 사용한 forEach --> 제거는 되지만 return 사용 불가!
//		hMap.forEach((key, value) -> {
//			if(key.getKind().equals(s.getKind()) && key.getName().equals(s.getName())) {
//				hMap.remove(key);
//			}
//		});
		
		//
		for(Shopping key: hMap.keySet()) {
			if(key.getKind().equals(s.getKind()) && key.getName().equals(s.getName())) {
				hMap.remove(key);
				return true;
			}
		}
		return false;
		
//		if(hMap.containsKey(s)) {
//			hMap.remove(s);
//			return true;
//		}
//			return false;
	}
	
public boolean changeAmount(Shopping s, int amount) {
		
	
	for(Shopping key : hMap.keySet()) {
		if(key.getKind().equals(s.getKind()) && key.getName().equals(s.getName())) {
			hMap.put(s , amount);
			return true;
		}
	}
	return false;
}


public HashMap<Shopping, Integer> printShopping() {
	
	return hMap;
}
}

