package javastudy;

import java.io.IOException;

public class JavaStudy0820_3 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		//char a, b ; ������ �ѹ��� ������ �� �� ����.(1)
	
		
		System.out.print("������ �������� �Է��ϼ��� : ");
			char a =  (char) System.in.read();//Ű���� �Է��Ѱ� ���� �ϳ� ����
	    	System.in.read(); //����ó���� ����
	   	System.in.read(); //�ٹٲٱ� ���� ó��
		System.out.print("ģ���� �������� �Է��ϼ��� : ");
			char b =  (char) System.in.read();
	    	System.in.read();
	   	System.in.read();
	    
	   	System.out.println("����� ��������  " + a +"�Դϴ�.");
		System.out.println("����� ��������  " + b +"�Դϴ�.");
	}

}
