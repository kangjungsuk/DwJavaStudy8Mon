package javastudy;

import java.util.Scanner;

public class JavaStduy0823_7 {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int Select;
		while(true)
		{
			System.out.println("1.�Է�");
			System.out.println("2.���");
			System.out.println("3.ó��");
			System.out.println("4.����");
			System.out.println("���� : ");
			Select = sc.nextInt();
			
			if (Select == 4)
			{
				System.out.println("���α׷��������մϴ�.");	
				break;
			}
		}

	}

}
