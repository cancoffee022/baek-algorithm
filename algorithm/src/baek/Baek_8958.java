package baek;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baek_8958 {

	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(br.readLine());
		StringTokenizer st;
		
		String[][] arr=new String[n][80];
		
		int sum=0;
		
		for(int i=0;i<n;i++) {
			st=new StringTokenizer(br.readLine(),"OX",true);
			int j=0;
			while(st.hasMoreTokens()) {
				arr[i][j]=st.nextToken();
				j++;
			}
		}
		for(int i=0;i<arr.length;i++) {
			int multi=0;
			sum=0;
			for(int j=0;j<arr[i].length;j++) {
				if("O".equals(arr[i][j])) {
					sum+=1+multi;
					++multi;
					
				}else
					multi=0;
			}
			System.out.println(sum);
		}
	}

}
