package javastudy;

import java.util.Scanner;

public class JaveStudy0820_6 {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		System.out.print("이름을 입력하세요");
		String name = scn.nextLine();
		
		System.out.println("입력한이름은 : " + name);

		System.out.print("나이를 입력하시오 : ");
		String age = scn.nextLine();
		
		System.out.println("입력한나이는"+ age);
		

	}

}
