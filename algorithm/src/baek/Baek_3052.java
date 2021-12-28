package baek;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baek_3052 {

	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int arr[]=new int[10];
		int div[]=new int[42];
		
		int sum=0;
		
		for(int i=0;i<10;i++) {
			arr[i]=Integer.parseInt(br.readLine());//열개의 정수를 입력받음
			int idx=arr[i]%42;//입력받은 정수를 42로 나눈 나머지를 idx 값에 저장
			div[idx]++;//div배열에 나머지 값이 몇개 입력되었는지 저장 나머지값이 여러번 입력되면 div배열 안의 수가 커짐
		}
		for(int i=0;i<div.length;i++) {
			if(div[i]>0) {
				sum++;
			}
		}
		System.out.print(sum);
	}

}
