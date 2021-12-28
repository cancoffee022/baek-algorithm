package baek;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Baek_2775_ex1 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		
		int T=Integer.parseInt(br.readLine());
		
		while(T--!=0) {
			int k=Integer.parseInt(br.readLine());
			int n=Integer.parseInt(br.readLine());
			int[] ans=new int[n];
			for(int i=0;i<n;i++) {//0층의 i호에는 i명이 산다
				ans[i]=i+1;
			}
			while(k--!=0) {//k층 밑에 사는 인원을 더해주기
				for(int i=1;i<n;i++) {//이때 i는 호를 나타냄
					ans[i]+=ans[i-1];
				}
			}
			sb.append(ans[n-1]).append('\n');
		}
		bw.write(sb.toString());
		bw.close();
		br.close();
	}

}
