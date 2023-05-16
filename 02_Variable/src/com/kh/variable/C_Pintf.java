package com.kh.variable;

public class C_Pintf {
	
	public static void main(String[] args) {
		
		//System.out.print(출력하고자하는 값); - 출력만 함 (줄바꿈 발생 x)
		//System.out.println(출력하고자하는 값); - 출력 후 줄바꿈 발생 0 
		
		System.out.print("hello\n");
		System.out.println("hello");
		
		// System.out.printf("출력하고 자하는 형식 (포맷)", 출력하고자 하는 값,...);
		// 출력하고자하는 값들이 제시한 형식에 맞춰서 출력만 진행
		
		/*
		 * 포맷으로 쓰이는 키워드
		 * %d : 정수
		 * %f : 실수
		 * %c : 문자
		 * %s : 문자열 (문자도 가능)
		 * */
		
		int iNum1 = 10;
		int iNum2 = 20;
		
		//  10%, 20%
		
		System.out.println(iNum1 + "% " + iNum2 + "%");	
		System.out.printf("%d%% %d%%", iNum1, iNum2); //%가 문자라서 한번 더 작성.	
		
		
		System.out.println("------------");
		
		//5칸의 공간 확보 수 오른쪽 정렬 (음수는 왼쪽)
		System.out.printf("%5d\n", iNum1);
		System.out.printf("%5d\n", 250);
		System.out.printf("%-5d\n", -12);
		
		
		System.out.println("---------");
		
		double dNum1 = 1.23456789;
		double dNum2 = 4.53;
		
		//무조건 소수점 아래 6번째 자리까지 보여줌.
		System.out.printf("%f\t%f\n", dNum1, dNum2); // \t 탭키와 동일
		System.out.printf("%f\t%.2f\n", dNum1, dNum2); // 2번째 자리까지 표시 가능 (.2 삽입)		
		System.out.printf("%.3f\t%.2f\n", dNum1, dNum2); // 따로 표시 가능	

		System.out.println("---------");
		
		char ch = 'a';
		String str = "Hello";
				
		// a Hello a
		
		System.out.printf("%c %s %c", ch, str, ch);
				
		System.out.println();
		
		// A HELLO A
		System.out.printf("%C %S %C", ch, str, ch);
	}
	
}
