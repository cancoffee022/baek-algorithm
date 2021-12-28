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
		
		int arr[][]=new int[c][];//�����迭 ���� ���� c
		
		for(int i=0;i<c;i++) {
			st=new StringTokenizer(br.readLine());
			arr[i]=new int[st.countTokens()];//countTokens() ��ū�� ������ �����Ͽ� ���� ���� �迭�� ũ�⸦ ������
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
			System.out.println(String.format("%.3f", percent)+"%");//Stringformat()�� "%.nf"�϶� n��° �ڸ����� �ݿø� �Ͽ� ��Ÿ����
		}
	}
		
}


