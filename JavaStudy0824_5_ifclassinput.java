package javastudy;

import java.util.Scanner;

public class JavaStudy0824_5 extends JavaStudy0824_1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		
		
		while(true) 
		{
			int grade; //�г�
			System.out.println("�г��� �Է��ϼ���(0�Է½�����)");
			grade = sc.nextInt();
			
		    if( grade >= 1 && grade <=3)
		    {
			    System.out.println("1�г� �Դϴ�");
			    System.out.println("2�г� �Դϴ�");
			    System.out.println("3�г� �Դϴ�");
	        
		    }
		
			else if (grade >= 4 && grade <=6)
			{
				System.out.println("4�г� �Դϴ�");
				System.out.println("5�г� �Դϴ�");
				System.out.println("6�г� �Դϴ�");
			}
				
			else if (grade == 0 )
			{
				System.out.println("\n���α׷�����");
				break;
				
			}
			else
			{
				System.out.println("1~6�г⸸�Է����ּ���");
		    }
		}

	}

}
