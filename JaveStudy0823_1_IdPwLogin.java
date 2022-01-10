package javastudy;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class StudyJava0819_2 {

	public static void main(String[] args) {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String id;
		String pw;
		String input1;
		String input2;
		
		id = "admin";
		pw = "1004";
        
		Scanner scn = new Scanner(System.in);
		System.out.println(" 아이디 :");
		input1 = scn.nextLine();
		
	
		System.out.println(" 비밀번호 :");
		input2 = scn.nextLine();
		
	        	System.out.println("==로그인 프로그램==");
	    
	    
		if(input1.equals(id))
		{
			
			 if(input2.equals(pw))
		  	 {
		     
		   	 System.out.println("관리자로 로그인 되었습니다.");
		 	 }
			else 
		 	 {
				System.out.println("비밀번호가 틀립니다.");
		 	 }
			
		 	 }
		else 
		{
		 	System.out.println("등록된 아이디가 아닙니다.");
		}
		
		
	}
}
	
	
	    
			
		
		
		
	   
		
		
	