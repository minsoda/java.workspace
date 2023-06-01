package Quiz;

import java.util.Scanner;

public class step1 {

    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
        
        int num = Integer.parseInt(sc.nextLine());
        int num1 = num /4;
			
			for(int i=0; i<num1; i++) {
				System.out.print("long ");
			}
			System.out.print("int");
		}
}