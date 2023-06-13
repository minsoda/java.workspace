package project;

import java.util.Scanner;

import project.controller.ShoppingController;
import project.controller.UserController;
import project.model.Pants;
import project.model.Top;
import project.model.User;

public class Application {


		 private Scanner sc = new Scanner(System.in);
		 private UserController uc = new UserController();
		 private ShoppingController shc = new ShoppingController();
		 
		 public static void main(String[] args) {
		
			 Application app = new Application();
			 app.mainMenu();
			 
	}

		 public void mainMenu() {
			 
			 System.out.println("=====♡  TTORY SHOP ♡ =====");
			 System.out.println();
			 
			 boolean check = true;
			 while(check) {
				System.out.println("1.  회원가입");
				System.out.println("2.  로그인");
				System.out.println("3.  종료");
				System.out.println("4. 직원 메뉴 (직원 전용)");
				System.out.println("메뉴 번호 입력 : ");
				switch(Integer.parseInt(sc.nextLine())) {
				case 1 :
					joinUser();
					break;
				case 2 :
					login();
					break;
				case 3 :
					check = false;
					System.out.println("프로그램 종료");
					break;
				case 4 :
					addNewShop();
				}
			 }
			 
		 }
		 
		 public void joinUser() {
			 
			System.out.print("ID : ");
			String id = sc.nextLine();
			
			System.out.print("PASSWORD : ");
			String password = sc.nextLine();
			
			System.out.print("NAME : ");
			String name = sc.nextLine();
			
			User u = new User(password, name);
			
			if(uc.joinUser(id, u)) {
				System.out.println("회원가입 성공!");
			}else {
				System.out.println("중복된 아이디입니다. 다시 입력해주세요.");
				joinUser();
			}
			 
		 }
		 
		 
		 public void login() {
			 
			System.out.print("ID : ");
			String id = sc.nextLine();

			System.out.print("PASSWORD : ");
			String password = sc.nextLine();
			
			String name = uc.login(id, password);
			if(name !=null) {
				System.out.println(name + "님, 어서오세용용");
				UserMenu();
			}else {
				System.out.println("틀린 아이디 또는 비밀번호 입니다. 다시 입력해주세요");
				login();
			}
			}
		 
		 public void addNewShop() {
			System.out.println("1. 상의 / 2. 하의 / 3. 신발");
			 System.out.println("추가할 종류의 번호 : ");
			 int select = Integer.parseInt(sc.nextLine());
			 System.out.println("추가할 이름 : ");
			 String name = sc.nextLine();
			 System.out.println("추가할 수량 : ");
			int amount = Integer.parseInt(sc.nextLine());
			 System.out.println("추가할 금액 : ");
			 int price = Integer.parseInt(sc.nextLine());
			 
			 boolean result = true;
			 
			 switch(select) {
			 case 1 : 
				 result = shc.addNewShop(new Top(name, price), amount);
			break;
			 case 2 :
				 result = shc.addNewShop(new Pants(name,price), amount);
			 break;
			 
			 }
		 }
		 
		 public void UserMenu() {
			 
			 boolean check  = true;
			 while(check) {
				 System.out.println("[ 회원 메뉴 ]");
				 System.out.println("1. 로그아웃");
				 System.out.println("2. ");
				 
				 switch(Integer.parseInt(sc.nextLine())) {
				 case 1 :
					 check = false;
					 break;
				 case 2 :
					 break;
				 }
				 
			 }
		 
}
			
		
	
			 
			 
			 
			 
		 }
		 
		 
		 
		 
		 
		 

