package javastudy;

import java.io.IOException;

public class JavaStudy0820_3 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		//char a, b ; 변수를 한번에 설정해 둘 수 있음.(1)
	
		
		System.out.print("본인의 혈액형을 입력하세요 : ");
			char a =  (char) System.in.read();//키보드 입력한거 글자 하나 저장
	    	System.in.read(); //엔터처리용 공백
	   	System.in.read(); //줄바꾸기 공백 처리
		System.out.print("친구의 혈액형을 입력하세요 : ");
			char b =  (char) System.in.read();
	    	System.in.read();
	   	System.in.read();
	    
	   	System.out.println("당신의 혈액형은  " + a +"입니다.");
		System.out.println("당신의 혈액형은  " + b +"입니다.");
	}

}
