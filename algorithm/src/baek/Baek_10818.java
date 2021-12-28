package baek;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Baek_10818 {

	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int N=Integer.parseInt(br.readLine());//1��° �ٿ��� n�� ����
		StringTokenizer st=new StringTokenizer(br.readLine());//�����ٿ��� �Է¹����͵��� ��ūȭ��Ŵ
		br.close();
		int[] arr=new int[N];
		
		for(int i=0;i<N;i++) {
			arr[i]=Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(arr);
		System.out.print(arr[0]+" "+arr[arr.length-1]);;
	}

}
