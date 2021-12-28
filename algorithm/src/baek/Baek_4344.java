package baek;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baek_4344 {

	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int c=Integer.parseInt(br.readLine());
		
		int arr[][]=new int[c][];//가변배열 행의 수는 c
		
		for(int i=0;i<c;i++) {
			st=new StringTokenizer(br.readLine());
			arr[i]=new int[st.countTokens()];//countTokens() 토큰의 개수를 리턴하여 열의 수를 배열의 크기를 지정함
			for(int j=0;st.hasMoreTokens();j++) {
				arr[i][j]=Integer.parseInt(st.nextToken());
			}
		}
		
		for(int i=0;i<arr.length;i++) {
			int sum=0;
			double avr=0;
			double percent=0;
			int g=0;
			
			for(int j=1;j<arr[i].length;j++) {
				sum+=arr[i][j];
			}
			avr=(double)sum/arr[i][0];
			for(int j=1;j<arr[i].length;j++) {
				if(arr[i][j]>avr)
					g++;
			}
			percent=(g/(double)arr[i][0]*100);
			System.out.println(String.format("%.3f", percent)+"%");//Stringformat()은 "%.nf"일때 n번째 자리까지 반올림 하여 나타낸다
		}
	}
		
}


