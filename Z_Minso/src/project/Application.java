package project;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

import project.controller.ShoppingController;
import project.controller.UserController;
import project.model.Pant;
import project.model.Shoes;
import project.model.Shopping;
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
			 
			 boolean check = true;
			 while(check) {
				 System.out.println("메뉴 번호 입력 : ");
				System.out.println("1.  회원가입");
				System.out.println("2.  로그인");
				System.out.println("3.  종료");
				System.out.println("4. 직원 메뉴 (직원 전용)");
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
					adminMenu();
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
				System.out.println("====" + " 님, 보시고 마음에 드시면 눌러주세요~ ^^* ====" );
				UserMenu();
			}else {
				System.out.println("틀린 아이디 또는 비밀번호 입니다. 다시 입력해주세요");
				login();
			}
		 }
			
		 
			public void adminMenu() {
			 
			 boolean check  = true;
			 while(check) {
				 System.out.println("[ 직원 메뉴 ]");
				 System.out.println("메뉴 번호 선택 : ");
				 System.out.println("1. 새 의류 추가");
				 System.out.println("2. 의류 삭제");
				 System.out.println("3. 수량 수정");
				 System.out.println("4. 의류 목록");
				 System.out.println("5. 메인으로 돌아가기");
				 
				 switch(Integer.parseInt(sc.nextLine())) {
				 case 1 :
					 addNewShop();
					 break;
				 case 2 :
					 removeShop();
					 break;
				 case 3 :
					 changeAmount();
					 break;
				 case 4 :
					 printShopping();
					 break;
				 case 5 :
					 check = false;
					 break;
				 }
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
				 result = shc.addNewShop(new Pant(name,price), amount);
			 break;
			 case 3 : 
				 result = shc.addNewShop(new Shoes(name,price), amount);
			 break;
			 case 4 :
				 System.out.println("메뉴 번호 입력 : ");
				 mainMenu();
				 break;
			 }
			 
			 if(result) {
				 System.out.println("의류가 추가 되었습니다.");
			 } else {
				 System.out.println("의류 추가에 실패하였습니다. 다시 입력해주세요.");
				 addNewShop();
			 }
		 }
		 
		 public void removeShop() {
			 
			 System.out.println("1. 상의 / 2. 하의 / 3. 신발");
			 System.out.println("삭제할 종류의 번호 : ");
			 int select = Integer.parseInt(sc.nextLine());
			 System.out.println("삭제할 이름 : ");
			 String name = sc.nextLine();

			 
			 boolean result = true;
			 
			 switch(select) {
			 case 1 : 
				 result = shc.removeShop(new Top(name));
			break;
			 case 2 :
				 result = shc.removeShop(new Pant(name));
			 break;
			 case 3 : 
				 result = shc.removeShop(new Shoes(name));
			 break;
			 case 4 :
				 System.out.println("메뉴 번호 입력 : ");
				 mainMenu();
				 break;
			 }
			 
			 if(result) {
				 System.out.println("의류가 삭제 되었습니다.");
			 } else {
				 System.out.println("의류 삭제에 실패하였습니다. 다시 입력해주세요.");
				 addNewShop();
			 }
			 
		 }
		 
		 
		 public void changeAmount() {
			 
			 try {
				 System.out.println("1. 상의 / 2. 하의 / 3. 신발");
				 System.out.println("수정할 종류의 번호 : ");
				 int select = Integer.parseInt(sc.nextLine());
				 System.out.println("수정할 이름 : ");
				 String name = sc.nextLine();
				 System.out.println("수정할 수량 : ");
				int amount = Integer.parseInt(sc.nextLine());
				 System.out.println("수정할 금액 : ");
				 int price = Integer.parseInt(sc.nextLine());
					
					boolean result = true;
					
					switch(select) {
					case 1:
						result = shc.changeAmount(new Top(name, price), amount);
						break;
					case 2:
						result = shc.changeAmount(new Pant(name, price), amount);
						break;
					case 3:
						result = shc.changeAmount(new Shoes(name, price), amount);
						break;
						default:
							throw new Error();
					}
					if(result) {
						System.out.println("의류 수정에 성공하였습니다.");
					}else {
					System.out.println("의류 수정에 실패하였습니다. 다시 입력해주세요.");
					changeAmount();
					}
					} catch (Exception e) {
						System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
						changeAmount();
					}
				}
	
	
		 public void printShopping() {
			 HashMap<Shopping, Integer> hMap = shc.printShopping();
			 Set<Shopping> keys = hMap.keySet();
			 Iterator<Shopping> is = keys.iterator();
			 
			 while(is.hasNext()) {
				 Shopping key = is.next();
				 System.out.printf("%s : %s(%d개)\n", key.getKind(),key.getName(), hMap.get(keys));
			 }
		 }
		 
		 public void UserMenu() {
			 
			 boolean check = true;
			 
			 while(check) {
				 
				 System.out.println("==== TTORY SHOP LIST ====");
				 printShopping();
				 System.out.println("====");
				 
				 
				 
				 
				 
				 
			 }
			 }
		 
	 
		 public void buyShop() {
			 
		 }
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 }
		 
		 
		
		 
		 
		 
		 
		 
		 

