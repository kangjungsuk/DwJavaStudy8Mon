package javastudy;

import java.util.Scanner;

public class JavaStudy0823_5 {
	public static void main(String[] args) {
	

		Scanner scn = new Scanner(System.in);
		System.out.print("원하는 구구단 입력 : ");
			int a = scn.nextInt();
		
				for(int  j= 1;  j< 10; j++)
				{
					System.out.println(a + "x" + j + "=" +a*j);
				}
		
		
		
	}
}
