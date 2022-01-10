package javastudy;

import java.util.Scanner;

public class JavaStudy0823_3 {

	public static void main(String[] args) {
		
		
		Scanner scn = new Scanner(System.in);
		System.out.print("반복줄수입력 : ");
		int a = scn.nextInt();
		
		for(int  i= 0;  i< a; i++)
		{
		System.out.println("안녕하세요"+ (i+1)+"번줄");
        }

	

	}

}
