package javastudy;

import java.util.Scanner;

public class JavaStudy0824_6 extends JavaStudy0824_1 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		while(true)
		{
			System.out.print("학년을입력하시오(0입력시 종료)");
			int grade  = sc.nextInt();
			switch(grade)
			{
			case 1 : case 2 : case 3 :
				System.out.println("1~3학년입니다.");break;
			case 4 : case 5 : case 6 :
				System.out.println("4~6학년입니다.");break;
				
				}
			if (grade == 0)
			{
				System.out.println("\n프로그램종료");
			    break;
			}
				else System.out.println("1-6사이 입력");
			}
		}
		
 }
