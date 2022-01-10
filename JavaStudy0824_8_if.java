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
			System.out.println("1.입력\n2.출력\n3.처리\n4.종료");
			System.out.print("선택 : ");
			menu = sc.nextInt();
			
			if(menu==1)
			{
				while(true)
				{
					System.out.println();
					System.out.println("1.숫자\n2.이름\n3.뒤로가기");
					System.out.print("선택 : ");
					select = sc.nextInt();
				
					if(select==1)
					{
						System.out.println();
						System.out.print("숫자입력 : ");
						num = sc.nextInt();
						System.out.println("입력값 : " + num);
					}
					if(select==2)
					{
						System.out.println();
						System.out.print("이름입력 : ");
						name = sc.next();
						System.out.println("입력값 : " + name);
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
				System.out.println("숫자 입력값 : " + num);
				System.out.println("이름 입력값 : " + name);
				System.out.println();
			}
			if(menu==3)
			{
				num = 1004;
				name = "난해커^^";
				System.out.println("처리되었습니다!");
				System.out.println();
				
			}
			if(menu==4)
			{
				System.out.println("프로그램을 종료합니다.");
				break;
			}
		}
	}
}