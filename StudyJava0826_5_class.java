package javastudy;
import java.util.Scanner;
public class StudyJava0826_5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Adder ad = new Adder();
		
		int su1, su2;
		
		System.out.print("ù��°��: "); su1 = sc.nextInt();
		System.out.print("�ι�°��: "); su2 = sc.nextInt();
		
		
		int result = ad.add(su1, su2);
		System.out.println("���:"+ result);
		
	}
}
class Adder{		
	int add(int su1, int su2)
	{
		return su1+su2;
	}	
}
