package javastudy;

import java.util.Scanner;

public class JavaStudy0824_3{

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
		System.out.print("�г����Է��Ͻÿ�");
		int grade =sc.nextInt();
		
		switch(grade) 
		{
			case 1 : System.out.println("1�г��Դϴ�.");break;
			case 2 : System.out.println("2�г��Դϴ�.");break;
			case 3 : System.out.println("3�г��Դϴ�.");break;
			default : System.out.println("1~3�г⸸ �Է��Ͻÿ�");
		}
	}

}
