package javastudy;

import java.util.Scanner;

public class JavaStduy0823_7 {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int Select;
		while(true)
		{
			System.out.println("1.입력");
			System.out.println("2.출력");
			System.out.println("3.처리");
			System.out.println("4.종료");
			System.out.println("선택 : ");
			Select = sc.nextInt();
			
			if (Select == 4)
			{
				System.out.println("프로그램을종료합니다.");	
				break;
			}
		}

	}

}
