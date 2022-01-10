package javastudy;

import java.io.IOException;

public class JavaStudy0820_2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		
		//자바의 입력방식 1
		//문자하나 입력하기 read()방식
		System.out.print("문자입력 a를 입력 : ");
		int a =  System.in.read();//요것이 중요한 부분 
		System.in.read();
		System.in.read();
		
		System.out.print("문자입력 b를 입력 : ");
		int b =  System.in.read();
		System.in.read();
		System.in.read();
		
		System.out.print("문자입력 c를 입력 : ");
		int c =  System.in.read();
		System.in.read();
		System.in.read();
		
		System.out.println("입력한문자는 a의 값= " + a);
		System.out.println("입력한문자는 b의 값= " + b);
		System.out.println("입력한문자는 c의 값= " + c);
		//int ascii = System.in.read();
		

	}

}
