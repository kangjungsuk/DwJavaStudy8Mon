package javastudy;

import java.util.Scanner;

public class JavaStudy0824_5 extends JavaStudy0824_1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		
		
		while(true) 
		{
			int grade; //학년
			System.out.println("학년을 입력하세요(0입력시종료)");
			grade = sc.nextInt();
			
		    if( grade >= 1 && grade <=3)
		    {
			    System.out.println("1학년 입니다");
			    System.out.println("2학년 입니다");
			    System.out.println("3학년 입니다");
	        
		    }
		
			else if (grade >= 4 && grade <=6)
			{
				System.out.println("4학년 입니다");
				System.out.println("5학년 입니다");
				System.out.println("6학년 입니다");
			}
				
			else if (grade == 0 )
			{
				System.out.println("\n프로그램종료");
				break;
				
			}
			else
			{
				System.out.println("1~6학년만입력해주세요");
		    }
		}

	}

}
