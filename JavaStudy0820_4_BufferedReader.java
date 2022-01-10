package javastudy;

import java.io.*;//java.io를 통합해서 쓸 수 있음.


public class JavaStudy0820_4 {

	public static void main(String[] args) throws IOException {
		//옆라인에 x 뜨면 눌러서 상위 항목 클릭해보기. 중요!!(io.설정)
		

		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("주소를 입력하세요 : ");
		String addr = in.readLine();//int addr =Integer.parseInt(in.readLine()); 문자>숫자변환		 
		 
		 System.out.print("입력한주소는 : " + addr);
		 }

}
