package project;

import java.util.Scanner;

import project.controller.UserController;
import project.model.User;

public class Application {


		 private Scanner sc = new Scanner(System.in);
		 private UserController uc = new UserController();
		 
		 public static void main(String[] args) {
		
			 Application app = new Application();
			 app.mainMenu();
			 
	}

		 public void mainMenu() {
			 
			 System.out.println("===== TTORY HOMEPAGE =====");
			 
			 boolean check = true;
			 while(check) {
				System.out.println("[ MAIN ]");
				System.out.println("1. 회원가입");
				System.out.println("2. 로그인");
				System.out.println("3. 종료");
				System.out.print("메뉴 번호 입력 : ");
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
		 
		 public void UserMenu() {
			 
			 boolean check  = true;
			 while(check) {
				 System.out.println("[ 회원 메뉴 ]");
				 System.out.println("1. 비밀번호 바꾸기");
				 System.out.println("2. 로그아웃");
				 
				 switch(Integer.parseInt(sc.nextLine())) {
				 case 1 :
					 changePassword();
					 break;
				 case 2 :
					 check = false;
					 break;
				 }
				 
			 }
		 }
		 
		 public void changePassword() {
			 System.out.print("ID : ");
			 String id = sc.nextLine();

			 System.out.print("PASSWORD : ");
			 String oldPw = sc.nextLine();
			 
			 System.out.println("NEW PASSWORD : ");
			 String newPw = sc.nextLine();
			 
			 if(uc.changePassword(id, oldPw, newPw)) {
				 System.out.println("비밀번호 변경 성공!");
				 ========
			 }else {
				 System.out.println("비밀번호 변결 실패! 다시 입력해주세요.");
				 changePassword();
			 }
			 
		 }
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
}
