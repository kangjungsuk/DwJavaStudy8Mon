package javastudy;

import java.io.IOException;

public class JavaStudy0820_2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		
		//�ڹ��� �Է¹�� 1
		//�����ϳ� �Է��ϱ� read()���
		System.out.print("�����Է� a�� �Է� : ");
		int a =  System.in.read();//����� �߿��� �κ� 
		System.in.read();
		System.in.read();
		
		System.out.print("�����Է� b�� �Է� : ");
		int b =  System.in.read();
		System.in.read();
		System.in.read();
		
		System.out.print("�����Է� c�� �Է� : ");
		int c =  System.in.read();
		System.in.read();
		System.in.read();
		
		System.out.println("�Է��ѹ��ڴ� a�� ��= " + a);
		System.out.println("�Է��ѹ��ڴ� b�� ��= " + b);
		System.out.println("�Է��ѹ��ڴ� c�� ��= " + c);
		//int ascii = System.in.read();
		

	}

}
