package javastudy;
import java.util.Scanner;
public class StudyJava0826_4 {
	public static void main(String[] args) {
		Method method =new Method();
		//호출
		//1. 전달값  x    리턴값 x
		//method.chulsu1();
		//2. 전달값  o    리턴값 x
		//method.chulsu2(10000);
		//3. 전달값  x    리턴값 o
		//int coffeeCount = method.chulsu3();
		//System.out.println("철수가준 커피갯수:" + coffeeCount);
		//4. 전달값  o    리턴값 o
		int keyboardCount = method.chulsu4(50000);
		System.out.println("철수가사다준 k키보드갯수:" + keyboardCount);		
	}
}
class Method{	
	//메서드정의
	int chulsu4(int money)
	{
		System.out.println("철수는 "+money+"원을 받았다.");
		return 2;
	}
	void chulsu1()
	{		System.out.println("철수야 유튜브 그만봐!");	}
	void chulsu2(int money)
	{		System.out.println("철수야 "+money+"원줄테니 커피사다줘");	}
	int chulsu3()
	{	return 111;	}
	
	
	
}
