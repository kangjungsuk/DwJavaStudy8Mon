package javastudy;

import java.util.Scanner;

public class JavaStudy0824_6 extends JavaStudy0824_1 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		while(true)
		{
			System.out.print("�г����Է��Ͻÿ�(0�Է½� ����)");
			int grade  = sc.nextInt();
			switch(grade)
			{
			case 1 : case 2 : case 3 :
				System.out.println("1~3�г��Դϴ�.");break;
			case 4 : case 5 : case 6 :
				System.out.println("4~6�г��Դϴ�.");break;
				
				}
			if (grade == 0)
			{
				System.out.println("\n���α׷�����");
			    break;
			}
				else System.out.println("1-6���� �Է�");
			}
		}
		
 }
