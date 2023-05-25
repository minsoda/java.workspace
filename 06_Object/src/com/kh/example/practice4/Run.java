package com.kh.example.practice4;

import java.util.Scanner;

import com.kh.example.practice4.controller.SnackController;
import com.kh.example.practice4.model.Snack;

public class Run {

	public static void main(String[] args) {

//		Snack s = new Snack();

		SnackController scr = new SnackController();
		Scanner sc = new Scanner(System.in);

		System.out.println("스낵류를 입력하세요.");
		
		System.out.print("종류 : ");
//	String a = sc.nextLine();
//	s.setKind(a);
//	s.setKind(sc.nextLine());
		String kind = sc.nextLine();

		System.out.print("이름 : ");
//	String b = sc.nextLine();
//	s.setName(b);
		String name = sc.nextLine();

		System.out.print("맛 : ");
//	String c = sc.nextLine();
//	s.setFlavor(c);
		String flavor = sc.nextLine();

		System.out.print("개수 : ");
//	int d = sc.nextInt();
//	s.setNumOf(d);
//	s.setNumOf(Integer.parseInt(sc.nextLine()));
		int numOf = sc.nextInt();

		System.out.print("가격 : ");
//	int e = sc.nextInt();
//	s.setPrice(e);
//	s.setPrice(Integer.parseInt(sc.nextLine()));
		int price = sc.nextInt();

		Snack s = new Snack(kind, name, flavor, numOf, price);

		if (scr.saveDate(s)) {

			System.out.println("저장이 완료되었습니다.");
			System.out.println(scr.confirmDate());

		}

//	System.out.println(s);
//	System.out.println(s.getKind() + "(" + s.getName() + "-" + s.getFlavor() + ")" + s.getNumOf() + "개" + s.getPrice() + "원");

	}
}
