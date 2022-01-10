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
		
		int s_gu=0,j_gu=0,d_gu=0,y_gu=0,dd_gu=0;//서구 중구 동구 유성구 대덕구
		int sel;
		int tot=0;
		
		System.out.println("대전시 인구조사프로그램 v0.1");		
		while(true)
		{		
						
			System.out.println("\n1.인구정보보기");
			System.out.println("2.인구입력하기");
			System.out.println("3.인구수정하기");
			System.out.println("4.종료");
			System.out.print("선택: "); sel = sc.nextInt();			
			if(sel == 1)	  {
				System.out.println("\n대전총인구 : "+tot+"만명");
				System.out.println("서구:"+s_gu+"만 / 중구:"+j_gu+"만 / 동구:"+d_gu+"만 /유성구:"+y_gu+"만\r\n"
						+ "대덕구:"+dd_gu +"만\n");
			}
			else if(sel == 2) {
				System.out.print("\n서구(단위:만명):"); s_gu = sc.nextInt();
				System.out.print("중구(단위:만명):"); j_gu = sc.nextInt();
				System.out.print("동구(단위:만명):"); d_gu = sc.nextInt();
				System.out.print("유성구(단위:만명):"); y_gu = sc.nextInt();
				System.out.print("대덕구(단위:만명):"); dd_gu = sc.nextInt();
				tot = s_gu+ j_gu+ d_gu+ y_gu+ dd_gu;
			}
			else if(sel == 3) {
				System.out.print("\n서구(단위:만명)현재:"+s_gu+"="); s_gu = sc.nextInt();
				System.out.print("중구(단위:만명)현재:"+j_gu+"="); j_gu = sc.nextInt();
				System.out.print("동구(단위:만명)현재:"+d_gu+"="); d_gu = sc.nextInt();
				System.out.print("유성구(단위:만명)현재:"+y_gu+"="); y_gu = sc.nextInt();
				System.out.print("대덕구(단위:만명)현재:"+dd_gu+"="); dd_gu = sc.nextInt();
				tot = s_gu+ j_gu+ d_gu+ y_gu+ dd_gu;
			}
			else if(sel == 4) {break;}
		}
	}
			
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
