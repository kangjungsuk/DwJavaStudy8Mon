package javastudy;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;//??


public class JaveStudy0820_7 {

	public static void main(String[] args) {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		Scanner scn = new Scanner(System.in);
		System.out.print("�̸��� �Է��ϼ���");
		String name = scn.nextLine();
		
        System.out.print("�������� �Է��Ͻÿ� : ");
		String blood = scn.nextLine();
		
		System.out.print("Ű�� �Է��ϼ��� : ");
		double height = scn.nextDouble();
		
        System.out.print( "����� ã�ҽ��ϴ�.");
		
		System.out.print( name + "����" + blood + "����");
		
		if ( height <= 160  )
		{
			System.out.print(" �ణ ��� ���� �Դϴ�.");
		}
		
		else if (height >= 160 && height <=180)
		{
			System.out.print(" ����Դϴ�!");
		}
		else if (height >= 180 && height <=190)
		{
		    System.out.print(" ���صǰڽ��ϴ�.");
		}
		
	    
		
		

	}

}
