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
		System.out.println(" ���̵� :");
		input1 = scn.nextLine();
		
	
		System.out.println(" ��й�ȣ :");
		input2 = scn.nextLine();
		
	        	System.out.println("==�α��� ���α׷�==");
	    
	    
		if(input1.equals(id))
		{
			
			 if(input2.equals(pw))
		  	 {
		     
		   	 System.out.println("�����ڷ� �α��� �Ǿ����ϴ�.");
		 	 }
			else 
		 	 {
				System.out.println("��й�ȣ�� Ʋ���ϴ�.");
		 	 }
			
		 	 }
		else 
		{
		 	System.out.println("��ϵ� ���̵� �ƴմϴ�.");
		}
		
		
	}
}
	
	
	    
			
		
		
		
	   
		
		
	