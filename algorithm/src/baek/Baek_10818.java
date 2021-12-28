package baek;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Baek_10818 {

	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int N=Integer.parseInt(br.readLine());//1번째 줄에서 n을 읽음
		StringTokenizer st=new StringTokenizer(br.readLine());//다음줄에서 입력받은것들을 토큰화시킴
		br.close();
		int[] arr=new int[N];
		
		for(int i=0;i<N;i++) {
			arr[i]=Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(arr);
		System.out.print(arr[0]+" "+arr[arr.length-1]);;
	}

}
