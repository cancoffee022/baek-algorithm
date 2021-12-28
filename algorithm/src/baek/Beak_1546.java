package baek;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Beak_1546 {

	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(br.readLine());
		StringTokenizer st=new StringTokenizer(br.readLine());
		
		int max=-1;
		
		double avr=0;
		
		int arr[]=new int[n];
		
		for(int i=0;i<n;i++) {
			arr[i]=Integer.parseInt(st.nextToken());
			if(arr[i]>max) {
				max=arr[i];
			}
		}
		
		for(int i=0;i<n;i++) {
			avr+=(double)arr[i]/max*100;
		}
		System.out.print(avr/n);
	}

}
