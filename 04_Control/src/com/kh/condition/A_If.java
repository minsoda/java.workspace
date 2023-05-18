package com.kh.condition;

import java.util.Scanner;

public class A_If {
	
	Scanner sc = new Scanner(System.in); // 인스턴스 변수
	
	/*
	 * if문
	 * 
	 * [표현법]
	 * 
	 * if(조건식) {
	 *   ..조건식이 참(true)일 때 실행할 코드..
	 *   }
	 *
	 *   - 보통 조건식에는 비교연산자, 논리연산자를 주로 사용
	 *   
	 * */
	
	public void method1() {
		
		int score = 59;// 지역 변수
	
		// 60점 이상이어야 합격!
		// 만약 (60점 이상) {의사 코드 (슈도코드, pseudocode)}
		  if (score >= 60) { // 권장!!
			  System.out.println("합격");
		  }	
		  
		  if (score >= 60) System.out.println("합격"); //한줄은 가능.
			
		  //불합격!
		  if(score < 60) System.out.println("불합격");
		  
	}
	
	/*
	 * if-else문
	 * 
	 * [표현법]
	 * 
	 * if(조건식) {
	 *    ..조건식이 참(true)일 때 실행할 코드..
	 * } else {
	 *    ..조건식이 거짓(false)일 때 실행할 코드..
	 * }
	 * 
	 * */
	
	public void method2 () {
		
		int score = 0; //초기화 시키고 사용
		
		System.out.print("정수 입력 > ");
		score = sc.nextInt();  // sc 변수 사용 가능
		
		if(score >= 60) {
			System.out.println("합격!");
		} else {
			System.out.println("불합격!");
		}
		
		// 삼항연산자
		
//		String result = (score >= 60)? "합격" : "불합격";
//		System.out.println(result);
		
		System.out.println((score >= 60)? "합격" : "불합격");
		
	}
	
	public void method3( ) {
		
		String name = "";
		
		System.out.print("이름을 입력해주세여 > ");
		name = sc.nextLine();
		
		System.out.println("김민소" == name); // false_주소값이 저장되어서.
		System.out.println("김민소".equals(name)); // true, String 클래스의 equals 메소드
		System.out.println("김민소".charAt(0)); // 김 , String 클래스의 charAt(0) 메소드
		
		
		//본인이면 "본인이다", 본인이 아니라면 "본인이 아니다"
		
		if ("김민소".equals(name)) {
			System.out.println("본인이다.");
		}else {
			System.out.println("본인이 아니다.");
	}	
		}
	
		public void method4() {
	
	
		int number = 0;
		number = sc.nextInt();
	
		// 중첩 if 문 중첩해서 사용
		// 0보다 크면 "양수", 그게 아니면 "음수", 0일땐  "0"
		if (number > 0) {
				System.out.println("양수");
			}  else {
//				System.out.println("음수");
		if(number == 0) {
				System.out.println("0입니다.");
			} else {
				System.out.println("음수");
								}
	
										}
	
	}
		/*
		 * if-else if-else문
		 * 
		 * [표현법]
		 * 
		 * if(조건식1) {
		 *   ..조건식1이 참(true)일 때 실행할 코드..
		 * } else if(조건식2) {
		 *   ..조건식2가 참(true)일때 실행할 코드..
		 * } else {
		 *   ..위에 어느 조건식에도 만족하지 않을 때 실행할 코드 ..
		 * }
		 * 
		 * -else if 수는 제한 없음.
		 * -else는 생략이 가능
		 * */
		public void method5() {
			
			int number = 0;
			System.out.print("숫자 입렵 > ");
			number = sc.nextInt();
			
			if(number > 0) {
				System.out.println("양수");
			} else if(number < 0) {
				System.out.println("음수");
			} else {
				System.out.println("0입니다.");
			}
			
		}
		/*
		 * 사용자에게 점수(0-100)을 입력받아서 점수별로 등급을 출력하라.
		 * -90점 이상은 A 등급
		 * -90점 미만은 80점 이상은 B 등급
		 * -80점 미만 70점 이상은 C 등급
		 * -70점 미만은 60점 이상은 D 등급
		 * -60점 미만 F 등급
		 * 
		 * */
		public void method6() {
			
			int score = 0;
			score = sc.nextInt();
			System.out.print("점수 입력 : ");
			
			char grade = '\u0000'; // 중복되는 System.대신에 작성 가능.
			
			if (score>= 90 ) {
				//System.out.println("A 등급");
				grade = 'A';
			} else if (score >=80) {
//				System.out.println("B 등급");
				grade = 'B';
			} else if (score >=70) {
//				System.out.println("C 등급");
				grade = 'C';
			} else if (score >=60) {
//				System.out.println("D 등급");
				grade = 'D';
			} else {
//				System.out.println("F 등급");
				grade = 'F';
			}
			
			System.out.println(grade);
		}
			/*
			 * 세 정수를 입력했을 때 짝수만 출력
			 * 
			 * num1 입력 > 3
			 * num2 입력 > 4
			 * num3 입력 > 6
			 * 4
			 * 6
			 * */
		public void practice1() {
			
	
			System.out.print("num1 입력 : ");
			int num1 = sc.nextInt();
			
			System.out.print("num2 입력 : ");
			int num2 = sc.nextInt();
		
			System.out.print("num3 입력 : ");
			int num3 = sc.nextInt();
			
			if (num1 %2 == 0) System.out.println(num1);
			if (num2 %2 == 0) System.out.println(num2);
			if (num3 %2 == 0) System.out.println(num3);
			
		}
		
		/*
		 * 정수 1개를 입력했을 때 음(minus)/양(plus)/0(zero),짝(even)/홀(odd) 출력
		 * 
		 * */
		public void practice2() {
			
			int num = 0;
			
			System.out.print("정수 입력 : ");
			num = sc.nextInt();
			
			if(num > 0) {
				System.out.println("plus");
			} else {
				System.out.println("minus");
			}
				
				if(num % 2 == 0) {
					System.out.println("even");
				}else if (num == 0){
					System.out.println("zero");
				}  else {
				System.out.println("odd");
				}
		}
				
				
//				String g = "";
//				String grade = "";
//				
//				System.out.print("정수 입력 : ");
//				int num = sc.nextInt();
//				
//				if(num > 0) {
//					grade = "양(plus)";
//				} else {
//					grade = "음(minus)";
//				}
//					
//					if(num % 2 == 0) {
//						g = "짝(even)";
//					}else if (num == 0){
//						g = "0(zero)";
//					}  else {
//						g = "홀(odd)";
//					
//			}
//					
//					System.out.println(grade);
//					System.out.println(g);
			
		
	public static void main(String[] args) {
		
		A_If a = new A_If();
//		a.method1();
//		a.method2();
//		a.method3();
//		a.method4();
//		a.method5();
//		a.method6();
		
//		a.practice1();
		a.practice2();
		
	}
}
