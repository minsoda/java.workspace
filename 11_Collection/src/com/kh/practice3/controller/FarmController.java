package com.kh.practice3.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;
import java.util.Objects;

import com.kh.practice3.model.Farm;

public class FarmController {
	
	// Farm - 종류, 이름 / Integer - 수량
	private HashMap<Farm, Integer> hMap = new HashMap<>(); // 마트에서 농산물 저장용
	private ArrayList<Farm> list = new ArrayList<>();      // 고객이 구매한 농산물 저장용
	Set<Farm> key = hMap.keySet();
	public boolean addNewKind(Farm f, int amount) {
		
		//containsKey() : map에 key가 존재하는가
		// 전달 받은 f가 hMap 안에 key로 존재하지 않을 때
		// f와 amount를 각각 키와 값으로 저장 후 true 반환
		
		// 존재할 경우 false 반환
		
	
		
			hMap.put(f, amount);
			return true;

		
	
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(hMap, key, list);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		FarmController other = (FarmController) obj;
		return Objects.equals(hMap, other.hMap) && Objects.equals(key, other.key) && Objects.equals(list, other.list);
	}

	public boolean removeKind(Farm f) {
		
		// 전달 받은 f가 hMap 안에 key로 존재할 때
		// hMap에 f 삭제 후 true 반환
		
		// 존재하지 않을 경우 false 반환
		Set<Entry<Farm, Integer>> entrySet = hMap.entrySet();
		for(Entry<Farm, Integer> entry : entrySet) {
			if(entry.getKey() != null) {
				return hMap.remove(f, entrySet);
				
			}
		}
		return false;
	}
	
	public boolean changeAmount(Farm f, int amount) {
		
		// 전달 받은 f가 hMap 안에 key로 존재할 때 
		// f와 amount 저장 후 true 반환
		
		// 존재하지 않을 경우 false 반환
		Set<Entry<Farm, Integer>> entrySet = hMap.entrySet();
		for(Entry<Farm, Integer> entry : entrySet) {
			if(entry.getKey() != null) {
				hMap.put(f, amount);
				return true;
			}
		}
		return false;
	}
	
	public HashMap<Farm, Integer> printFarm() {
		
		return hMap;
	}
	
	// 고객 관련 기능 ------------------------------------------------------------
	
	public boolean buyFarm(Farm f) {
		
		// 전달 받은 f가 hMap 안에 존재하면서 그 f의 수량이 1개 이상 일 때
		// list에 f 추가, 그리고 hMap에 f 수량 1 감소, true 반환
		
		// 존재하지 않으면 false 반환
		
		for(Farm farm : list) {
			if(list.get(hMap.size()).equals(f)) {
				list.add(f);
				return 
			}
		}
		

		return false;
	}
	
	public boolean removeFarm(Farm f) {
		
		// 전달 받은 f가 list에 존재할 때 
		// list에 f 삭제, 그리고 hMap에 f 수량 1 증가, true 반환
		
		// 아니면 false 반환
		int count = 0;
		for(Farm farm : list) {
			if(list.get(hMap.get(f)).equals(f)) {
				list.remove(farm.getKind());
				count++;
				return hMap
			}
		}
		
		
		return false;
	}
	
	public ArrayList<Farm> printBuyFarm() {
		return list;
	}
}
