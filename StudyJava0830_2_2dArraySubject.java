package javastudy;

import java.util.Scanner;

public class StudyJava0830_2 {

	public static void main(String[] args) {	
		Scanner sc = new Scanner(System.in);
		//��������
		int select;
		int score[][] = new int[3][5];//3���� ������������չ迭����
		
		while(true)
		{
			System.out.println("1.�����Է�/2.�������/3.����");			
			System.out.print("����:");
			select = sc.nextInt();
			if(select == 1) {
				for(int i=0; i<score.length; i++)
				{
					System.out.print(i+1+"��°�л��� ����:");
					score[i][0] = sc.nextInt();
					System.out.print(i+1+"��°�л��� ����:");
					score[i][1] = sc.nextInt();
					System.out.print(i+1+"��°�л��� ����:");
					score[i][2] = sc.nextInt();
					
					//���� ���ó��
					score[i][3] = score[i][0]+score[i][1]+score[i][2];
					score[i][4] = score[i][3] / 3;
				}
			}
			else if(select == 2) {
				for(int i=0; i<score.length; i++)
				{
					System.out.println(i+1+"���л� ����:"+score[i][3]+" / ��� :"+score[i][4]);
				}
			}
			else if(select == 3) {
				System.out.println("���α׷� ����.");	
				break;
			}
		}
		

	}

}
