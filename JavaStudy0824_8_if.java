package javastudy;

import java.util.Scanner;

public class JavaStudy0824_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int select, menu, num = 0;
		String name = null;
		
		while(true)
		{
			System.out.println("1.�Է�\n2.���\n3.ó��\n4.����");
			System.out.print("���� : ");
			menu = sc.nextInt();
			
			if(menu==1)
			{
				while(true)
				{
					System.out.println();
					System.out.println("1.����\n2.�̸�\n3.�ڷΰ���");
					System.out.print("���� : ");
					select = sc.nextInt();
				
					if(select==1)
					{
						System.out.println();
						System.out.print("�����Է� : ");
						num = sc.nextInt();
						System.out.println("�Է°� : " + num);
					}
					if(select==2)
					{
						System.out.println();
						System.out.print("�̸��Է� : ");
						name = sc.next();
						System.out.println("�Է°� : " + name);
					}
					if(select==3)
					{
						System.out.println();
						break;
					}
				}
			}
			if(menu==2)
			{
				System.out.println("���� �Է°� : " + num);
				System.out.println("�̸� �Է°� : " + name);
				System.out.println();
			}
			if(menu==3)
			{
				num = 1004;
				name = "����Ŀ^^";
				System.out.println("ó���Ǿ����ϴ�!");
				System.out.println();
				
			}
			if(menu==4)
			{
				System.out.println("���α׷��� �����մϴ�.");
				break;
			}
		}
	}
}