package javastudy;

import java.util.Scanner;

public class JaveStudy0824_4 extends JavaStudy0824_1 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("�г����Է��Ͻÿ�");
		int grade =sc.nextInt();
		
	
		switch(grade) 
		{
			case 1 : System.out.println("1�г��Դϴ�.");
			case 2 : System.out.println("2�г��Դϴ�.");
			case 3 : System.out.println("3�г��Դϴ�.");break;
			case 4 : System.out.println("4�г��Դϴ�.");
			case 5 : System.out.println("5�г��Դϴ�.");
			case 6 : System.out.println("6�г��Դϴ�.");break;
			default : System.out.println("1~6�г⸸ �Է��Ͻÿ�");
	
	
	}
  }
}