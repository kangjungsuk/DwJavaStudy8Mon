package javastudy;

import java.util.Scanner;

public class StudyJava0830_4 {

	public static void main(String[] args) {	
		Scanner sc = new Scanner(System.in);
		//��������
		int select;
		int score[][] = new int[10][5];//10���� ������������չ迭����
		String name[] = new String[10]; //10���� �̸�
		int cnt=0; //�л��� ����
		while(true)
		{
			System.out.println("1.�Է�/2.���/3.���80�̻�/4.���90�̻�/5.����");			
			System.out.print("����:");
			select = sc.nextInt();
			if(select == 1) {
					System.out.print(cnt+1+"��°�л��� �̸�:");
					name[cnt] = sc.next();
					System.out.print(cnt+1+"��°�л��� ����:");
					score[cnt][0] = sc.nextInt();
					System.out.print(cnt+1+"��°�л��� ����:");
					score[cnt][1] = sc.nextInt();
					System.out.print(cnt+1+"��°�л��� ����:");
					score[cnt][2] = sc.nextInt();
					
					//���� ���ó��
					score[cnt][3] = score[cnt][0]+score[cnt][1]+score[cnt][2];
					score[cnt][4] = score[cnt][3] / 3;
					cnt++;//�Է³����� �л���üũ�� 1������
				
			}
			else if(select == 2) {
				for(int i =0; i<cnt ; i++)
				{
					System.out.println(i+1+"���л� "+name[i]+" / ����:"+score[i][3]+" / ��� :"+score[i][4]);

				}	
			}
			else if(select == 3) {
				for(int i =0; i<cnt ; i++)
				{
					if(score[i][4] > 80)
					{
						System.out.println(i+1+"���л� "+name[i]+" / ����:"+score[i][3]+" / ��� :"+score[i][4]);
					}

				}
			}
			else if(select == 4) {
				for(int i =0; i<cnt ; i++)
				{
					if(score[i][4] > 90)
					{
						System.out.println(i+1+"���л� "+name[i]+" / ����:"+score[i][3]+" / ��� :"+score[i][4]);
					}

				}
			}
			else if(select == 5) {
				System.out.println("���α׷� ����.");	
				break;
			}
		}

	}

}
