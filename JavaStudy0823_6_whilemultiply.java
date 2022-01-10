package javastudy;

public class JavaStudy0823_6 {
	public static void main(String[] args) {
	
		int dan =2;
		int su = 1;
			while( dan < 10 )///앞에 단수가 올라가기 위한 자리.
		{
				while(su < 10)//이 안의수가 거짓이 될때까지 반복.
				{
				System.out.println( dan + "x" + su + "=" + dan*su);
				su++;
				}
				
				dan++;
				su=1;//개중요
				
				
		}
		
	}

}
