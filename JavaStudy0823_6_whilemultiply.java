package javastudy;

public class JavaStudy0823_6 {
	public static void main(String[] args) {
	
		int dan =2;
		int su = 1;
			while( dan < 10 )///�տ� �ܼ��� �ö󰡱� ���� �ڸ�.
		{
				while(su < 10)//�� ���Ǽ��� ������ �ɶ����� �ݺ�.
				{
				System.out.println( dan + "x" + su + "=" + dan*su);
				su++;
				}
				
				dan++;
				su=1;//���߿�
				
				
		}
		
	}

}
