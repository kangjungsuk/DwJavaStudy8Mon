package javastudy;

import java.io.*;


public class JaveStudy0820_5 {

	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String name = "������";
		System.out.print("�˻��� �̸��� �Է��Ͻÿ� : ");
		String inputName = in.readLine();
		
		//����
        if(inputName.equals(name))//equals ���ڿ� ��
        {
        	System.out.println("�����մϴ�.");
        }
        else if(inputName.equals("������"))
        {
        	System.out.println("������ �Դϴ�.");
        }
        else
        {
        	System.out.println("��ϵ����ʾҽ��ϴ�.");
        }
	}

}
