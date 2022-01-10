package javastudy;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;//??


public class JaveStudy0820_7 {

	public static void main(String[] args) {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		Scanner scn = new Scanner(System.in);
		System.out.print("이름을 입력하세요");
		String name = scn.nextLine();
		
        System.out.print("혈액형을 입력하시오 : ");
		String blood = scn.nextLine();
		
		System.out.print("키를 입력하세요 : ");
		double height = scn.nextDouble();
		
        System.out.print( "결과를 찾았습니다.");
		
		System.out.print( name + "님은" + blood + "형에");
		
		if ( height <= 160  )
		{
			System.out.print(" 약간 평균 이하 입니다.");
		}
		
		else if (height >= 160 && height <=180)
		{
			System.out.print(" 평균입니다!");
		}
		else if (height >= 180 && height <=190)
		{
		    System.out.print(" 모델해되겠습니다.");
		}
		
	    
		
		

	}

}
