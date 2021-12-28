package baek;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Beak_1065 {

	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(br.readLine());
		
		int a=H(n);
		System.out.print(a);
	}
	
	public static int H(int num) {
		
		int x=0;
		int arithmetic=0;
//		for(;num>0;num--)
//			System.out.println(num);
			
		for(;num>0;num--) {
			
			boolean isNegative=false;
			int a=num;
			int b=num;
			
			while(a!=0) {
				a/=10;
				x++;
			}
			
			int[] arr=new int[x];
			
			x=0;
			
			for(int i=0;i<arr.length;i++) {
				arr[i]=b%10;
				b/=10;
			}
			
			float d=(arr[0]-arr[arr.length-1])/(float)(arr.length-1);
			
			for(int i=0;i<arr.length;i++) {
				if(arr[arr.length-1-i]==arr[arr.length-1]+i*d) {
					isNegative=true;
				}
				else {
					isNegative=false;
					break ;
				}
			}
			if(arr.length-1==0)
				isNegative=true;

			if(isNegative)
				arithmetic++;
		}
		return arithmetic;
	}
	
}
