package javastudy;

import java.util.Scanner;

public class JavaStudy0824_3{

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
		System.out.print("학년을입력하시오");
		int grade =sc.nextInt();
		
		switch(grade) 
		{
			case 1 : System.out.println("1학년입니다.");break;
			case 2 : System.out.println("2학년입니다.");break;
			case 3 : System.out.println("3학년입니다.");break;
			default : System.out.println("1~3학년만 입력하시오");
		}
	}

}
