package javastudy;

import java.util.Scanner;

public class StudyJava0830_4 {

	public static void main(String[] args) {	
		Scanner sc = new Scanner(System.in);
		//변수선언
		int select;
		int score[][] = new int[10][5];//10명의 국영수총점평균배열선언
		String name[] = new String[10]; //10명의 이름
		int cnt=0; //학생수 변수
		while(true)
		{
			System.out.println("1.입력/2.출력/3.평균80이상/4.평균90이상/5.종료");			
			System.out.print("선택:");
			select = sc.nextInt();
			if(select == 1) {
					System.out.print(cnt+1+"번째학생의 이름:");
					name[cnt] = sc.next();
					System.out.print(cnt+1+"번째학생의 국어:");
					score[cnt][0] = sc.nextInt();
					System.out.print(cnt+1+"번째학생의 영어:");
					score[cnt][1] = sc.nextInt();
					System.out.print(cnt+1+"번째학생의 수학:");
					score[cnt][2] = sc.nextInt();
					
					//총점 평균처리
					score[cnt][3] = score[cnt][0]+score[cnt][1]+score[cnt][2];
					score[cnt][4] = score[cnt][3] / 3;
					cnt++;//입력끝나면 학생수체크후 1명증가
				
			}
			else if(select == 2) {
				for(int i =0; i<cnt ; i++)
				{
					System.out.println(i+1+"번학생 "+name[i]+" / 총점:"+score[i][3]+" / 평균 :"+score[i][4]);

				}	
			}
			else if(select == 3) {
				for(int i =0; i<cnt ; i++)
				{
					if(score[i][4] > 80)
					{
						System.out.println(i+1+"번학생 "+name[i]+" / 총점:"+score[i][3]+" / 평균 :"+score[i][4]);
					}

				}
			}
			else if(select == 4) {
				for(int i =0; i<cnt ; i++)
				{
					if(score[i][4] > 90)
					{
						System.out.println(i+1+"번학생 "+name[i]+" / 총점:"+score[i][3]+" / 평균 :"+score[i][4]);
					}

				}
			}
			else if(select == 5) {
				System.out.println("프로그램 종료.");	
				break;
			}
		}

	}

}
