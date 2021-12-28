package baek;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Beak_2562 {

	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		int max=Integer.MIN_VALUE;
		
		int arr[]=new int[9];
		int l=0;
		
		for(int i=0;i<9;i++) {
			arr[i]=Integer.parseInt(br.readLine());
			int a=arr[i];
			if(a>max) {
				max=a;
			}
		}
		for(int i=0;i<9;i++) {
			if(max==arr[i])
				l=i+1;
		}
		System.out.print(max+"\n"+l);
	}

}
