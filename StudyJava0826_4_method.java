package javastudy;
import java.util.Scanner;
public class StudyJava0826_4 {
	public static void main(String[] args) {
		Method method =new Method();
		//ȣ��
		//1. ���ް�  x    ���ϰ� x
		//method.chulsu1();
		//2. ���ް�  o    ���ϰ� x
		//method.chulsu2(10000);
		//3. ���ް�  x    ���ϰ� o
		//int coffeeCount = method.chulsu3();
		//System.out.println("ö������ Ŀ�ǰ���:" + coffeeCount);
		//4. ���ް�  o    ���ϰ� o
		int keyboardCount = method.chulsu4(50000);
		System.out.println("ö��������� kŰ���尹��:" + keyboardCount);		
	}
}
class Method{	
	//�޼�������
	int chulsu4(int money)
	{
		System.out.println("ö���� "+money+"���� �޾Ҵ�.");
		return 2;
	}
	void chulsu1()
	{		System.out.println("ö���� ��Ʃ�� �׸���!");	}
	void chulsu2(int money)
	{		System.out.println("ö���� "+money+"�����״� Ŀ�ǻ����");	}
	int chulsu3()
	{	return 111;	}
	
	
	
}
