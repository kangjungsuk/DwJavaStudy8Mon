package javastudy;

import java.io.*;//java.io�� �����ؼ� �� �� ����.


public class JavaStudy0820_4 {

	public static void main(String[] args) throws IOException {
		//�����ο� x �߸� ������ ���� �׸� Ŭ���غ���. �߿�!!(io.����)
		

		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("�ּҸ� �Է��ϼ��� : ");
		String addr = in.readLine();//int addr =Integer.parseInt(in.readLine()); ����>���ں�ȯ		 
		 
		 System.out.print("�Է����ּҴ� : " + addr);
		 }

}
