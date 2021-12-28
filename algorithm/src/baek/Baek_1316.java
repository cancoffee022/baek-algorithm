package baek;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baek_1316 {

	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		int n=Integer.parseInt(br.readLine());
		String[] arr=new String[n];
		int sum=n;
		
		for(int i=0;i<n;i++) {
			arr[i]=br.readLine();
			boolean isNegative=false;
			
			for(int j=0;j<arr[i].length()-1;j++) {
				char ch='0';
				for(int k=j+1;k<arr[i].length();k++) {
					if(arr[i].charAt(j)!=arr[i].charAt(k)) {
						ch=arr[i].charAt(j);
					}
					if(ch==arr[i].charAt(k))
						isNegative=true;
				}
			}
			if(isNegative)
				--sum;
		}
		
		System.out.print(sum);
	}

}
