package javastudy;

import java.util.Scanner;

public class StudyJava0830_2 {

	public static void main(String[] args) {	
		Scanner sc = new Scanner(System.in);
		//변수선언
		int select;
		int score[][] = new int[3][5];//3명의 국영수총점평균배열선언
		
		while(true)
		{
			System.out.println("1.점수입력/2.점수출력/3.종료");			
			System.out.print("선택:");
			select = sc.nextInt();
			if(select == 1) {
				for(int i=0; i<score.length; i++)
				{
					System.out.print(i+1+"번째학생의 국어:");
					score[i][0] = sc.nextInt();
					System.out.print(i+1+"번째학생의 영어:");
					score[i][1] = sc.nextInt();
					System.out.print(i+1+"번째학생의 수학:");
					score[i][2] = sc.nextInt();
					
					//총점 평균처리
					score[i][3] = score[i][0]+score[i][1]+score[i][2];
					score[i][4] = score[i][3] / 3;
				}
			}
			else if(select == 2) {
				for(int i=0; i<score.length; i++)
				{
					System.out.println(i+1+"번학생 총점:"+score[i][3]+" / 평균 :"+score[i][4]);
				}
			}
			else if(select == 3) {
				System.out.println("프로그램 종료.");	
				break;
			}
		}
		

	}

}
