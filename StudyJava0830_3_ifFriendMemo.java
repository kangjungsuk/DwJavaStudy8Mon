package javastudy;

import java.util.Scanner;

public class StudyJava0830_3 {

	public static void main(String[] args) {	
		Scanner sc = new Scanner(System.in);
		//��������
		int select;
		String searchName;
		
		String friends[][] = new String [10][3];
		int cnt=0; // ģ��������ó��
		while(true)
		{
			System.out.println("1.ģ���Է�/2.ģ�����/3.�˻�/4.����");			
			System.out.print("����:");
			select = sc.nextInt();
			if(select == 1) {
				
				System.out.print("�̸�:");
				friends[cnt][0] = sc.next();
				System.out.print("����:");
				friends[cnt][1] = sc.next();
				System.out.print("�޸�:");
				friends[cnt][2] = sc.next();
				cnt++;			
			}
			else if(select == 2) {
				for(int i =0; i<cnt ; i++)
				{
					System.out.println(i+1+"�� = "+friends[i][0]+" / "+friends[i][1]+" / "+friends[i][2]);
				}
			}
			else if(select == 3) {
				System.out.print("�˻��̸�:");
				searchName = sc.next();
				for(int i =0; i<cnt ; i++)
				{
					if(searchName.equals(friends[i][0]))
					{
						System.out.println(i+1+"�� = "+friends[i][0]+" / "+friends[i][1]+" / "+friends[i][2]);
					}
				}	
				
				
				
				
			}
			else if(select == 4) {
				System.out.println("���α׷� ����.");	
				break;
			}
		}
		

	}

}
