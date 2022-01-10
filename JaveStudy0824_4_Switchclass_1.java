package javastudy;

import java.util.Scanner;

public class JaveStudy0824_4 extends JavaStudy0824_1 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("학년을입력하시오");
		int grade =sc.nextInt();
		
	
		switch(grade) 
		{
			case 1 : System.out.println("1학년입니다.");
			case 2 : System.out.println("2학년입니다.");
			case 3 : System.out.println("3학년입니다.");break;
			case 4 : System.out.println("4학년입니다.");
			case 5 : System.out.println("5학년입니다.");
			case 6 : System.out.println("6학년입니다.");break;
			default : System.out.println("1~6학년만 입력하시오");
	
	
	}
  }
}