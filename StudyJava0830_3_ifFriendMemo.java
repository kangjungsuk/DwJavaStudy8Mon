package javastudy;

import java.util.Scanner;

public class StudyJava0830_3 {

	public static void main(String[] args) {	
		Scanner sc = new Scanner(System.in);
		//변수선언
		int select;
		String searchName;
		
		String friends[][] = new String [10][3];
		int cnt=0; // 친구수증가처리
		while(true)
		{
			System.out.println("1.친구입력/2.친구출력/3.검색/4.종료");			
			System.out.print("선택:");
			select = sc.nextInt();
			if(select == 1) {
				
				System.out.print("이름:");
				friends[cnt][0] = sc.next();
				System.out.print("전번:");
				friends[cnt][1] = sc.next();
				System.out.print("메모:");
				friends[cnt][2] = sc.next();
				cnt++;			
			}
			else if(select == 2) {
				for(int i =0; i<cnt ; i++)
				{
					System.out.println(i+1+"번 = "+friends[i][0]+" / "+friends[i][1]+" / "+friends[i][2]);
				}
			}
			else if(select == 3) {
				System.out.print("검색이름:");
				searchName = sc.next();
				for(int i =0; i<cnt ; i++)
				{
					if(searchName.equals(friends[i][0]))
					{
						System.out.println(i+1+"번 = "+friends[i][0]+" / "+friends[i][1]+" / "+friends[i][2]);
					}
				}	
				
				
				
				
			}
			else if(select == 4) {
				System.out.println("프로그램 종료.");	
				break;
			}
		}
		

	}

}
