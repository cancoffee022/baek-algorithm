package baek;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baek_1193 {

	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		int x=Integer.parseInt(br.readLine());
		int q=x;
		int n=1;
		
		//x�� ���° ���� ������ ���ϱ�
		while(q>0) {
			q=q-n;
			n++;
		}//n-1�� �� 
		
		int num,deno;//����,�и�
		
		if(n%2!=0) {
			num=1+(n-2)+q;
			deno=n-num;
		}else {
			deno=1+(n-2)+q;
			num=n-deno;
		}
		
		System.out.print(num+"/"+deno);
	}

}
