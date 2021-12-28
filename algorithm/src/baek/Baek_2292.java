package baek;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baek_2292 {

	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(br.readLine())-1;//1을 입력받았을때 while문을 통과시키지 않기위해 -1을 함
		int x=1;//1부터 시작해서 1을 입력받았을때 1이 출력되도록 함
		
		while(n>0) {//이 수들을 단순화 시키면 1을 기점으로 6의 배수씩 차지하는 자리가 커지는 수들이다
			n=n-(6*x);
			x++;
		}
		System.out.println(x);
	}

}
