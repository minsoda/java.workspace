package com.kh.polymorphism.controller;

import com.kh.polymorphism.model.child.Engineer;
import com.kh.polymorphism.model.parent.Employee;

public class EmployeeController {

	//Employee 객체 배열과 이름을 가지고 와서 일치한 사람 반환
	public Employee findEmplyoeeByName(Employee[] ea, String name) {
		
		Employee emp = null;
		
			
		for(Employee employee : ea) //for(int i = 0; i<ea.length; i++) 
			{
			if(employee.getName().equals(name)){
		
				return employee; // ea[i]
			}
		}
		
	return null;
	}
	
	// 연봉 계산 : engineer 인 경우 보너스가 있음
	public int getAnnualSalary(Employee e) {
		
//		int annualSalary = e.getSalary() * 12;
		
		// instanceof 연산자 : 현재 참조변수가 실제로 어떤 클래스 형의 객체의 주소를 참조하고 있는지 확인할때 사용
		if(e instanceof Engineer) {
			Engineer eg = (Engineer) e ; //부모 -> 자식 : 강제 형 변환
			
//			annualSalary += eg.getBonus();
		return e.getSalary() * 12 + eg.getBonus();
	}
		return e.getSalary() * 12;
	}
	
	public int getTotalCoast(Employee[] ea) {
		
		int sum = 0;
		for(Employee employee : ea) {
			sum += getAnnualSalary(employee);
//			for(int i =0; i<ea.lenght; i++){
//			sum += this.getAnnualSalary(ea[i]);
			}
		
		return sum;
	}
	
	
	
}


