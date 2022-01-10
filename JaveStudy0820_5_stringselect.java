package javastudy;

import java.io.*;


public class JaveStudy0820_5 {

	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String name = "강정석";
		System.out.print("검색할 이름을 입력하시오 : ");
		String inputName = in.readLine();
		
		//제어
        if(inputName.equals(name))//equals 문자열 비교
        {
        	System.out.println("존재합니다.");
        }
        else if(inputName.equals("관리자"))
        {
        	System.out.println("관리자 입니다.");
        }
        else
        {
        	System.out.println("등록되지않았습니다.");
        }
	}

}
