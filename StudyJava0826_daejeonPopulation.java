package javastudy;
import java.util.Scanner;
public class StudyJava0826_3 {
	public static void main(String[] args) {
		Dw503_2 dw =new Dw503_2();
		
	}
}
class Dw503_2{
	
	Dw503_2()
	{
		Scanner sc = new Scanner(System.in);
		
		int s_gu=0,j_gu=0,d_gu=0,y_gu=0,dd_gu=0;//���� �߱� ���� ������ �����
		int sel;
		int tot=0;
		
		System.out.println("������ �α��������α׷� v0.1");		
		while(true)
		{		
						
			System.out.println("\n1.�α���������");
			System.out.println("2.�α��Է��ϱ�");
			System.out.println("3.�α������ϱ�");
			System.out.println("4.����");
			System.out.print("����: "); sel = sc.nextInt();			
			if(sel == 1)	  {
				System.out.println("\n�������α� : "+tot+"����");
				System.out.println("����:"+s_gu+"�� / �߱�:"+j_gu+"�� / ����:"+d_gu+"�� /������:"+y_gu+"��\r\n"
						+ "�����:"+dd_gu +"��\n");
			}
			else if(sel == 2) {
				System.out.print("\n����(����:����):"); s_gu = sc.nextInt();
				System.out.print("�߱�(����:����):"); j_gu = sc.nextInt();
				System.out.print("����(����:����):"); d_gu = sc.nextInt();
				System.out.print("������(����:����):"); y_gu = sc.nextInt();
				System.out.print("�����(����:����):"); dd_gu = sc.nextInt();
				tot = s_gu+ j_gu+ d_gu+ y_gu+ dd_gu;
			}
			else if(sel == 3) {
				System.out.print("\n����(����:����)����:"+s_gu+"="); s_gu = sc.nextInt();
				System.out.print("�߱�(����:����)����:"+j_gu+"="); j_gu = sc.nextInt();
				System.out.print("����(����:����)����:"+d_gu+"="); d_gu = sc.nextInt();
				System.out.print("������(����:����)����:"+y_gu+"="); y_gu = sc.nextInt();
				System.out.print("�����(����:����)����:"+dd_gu+"="); dd_gu = sc.nextInt();
				tot = s_gu+ j_gu+ d_gu+ y_gu+ dd_gu;
			}
			else if(sel == 4) {break;}
		}
	}
			
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
