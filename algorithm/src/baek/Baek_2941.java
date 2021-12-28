package baek;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baek_2941 {

	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String str=br.readLine();
		
		int[] arr=new int[str.length()];
		int num=arr.length;
		
		for(int i=0;i<arr.length;i++) {
			arr[i]=(int)str.charAt(i);
		}

		
		for(int i=0;i<arr.length-1;i++) {
			if(arr[i]==99||arr[i]==115||arr[i]==122)
				if(arr[i+1]==61)
					num--;
			if(arr[i]==99||arr[i]==100)
				if(arr[i+1]==45)
					num--;
			if(arr[i]==108||arr[i]==110)
				if(arr[i+1]==106)
					num--;
			if(str.contains("dz="))
				if(arr[i]==100&&arr[i+1]==122&&arr[i+2]==61) {
				num-=2;
				++i;
			}
		}
		System.out.println(num);
	}

}
