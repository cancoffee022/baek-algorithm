package study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AddCycle {

	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(br.readLine());
		int index=0,ans=0,sum;
		ans=n;
		while(true) {
			int x=n/10;//x값은 십의자리
			int y=n%10;//y값은 일의자리
			sum=(x+y)%10;//x+y값이지만 10보다 크면 일의 자리만 가진다
			n=y*10+sum;//n값을 계산
			index++;
			if(ans==n)
				break;
		}
		System.out.print(index);
	}

}
