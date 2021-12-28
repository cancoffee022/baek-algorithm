package baek;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baek_2577_Ex1 {

	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int a=Integer.parseInt(br.readLine()); int b=Integer.parseInt(br.readLine()); int c=Integer.parseInt(br.readLine());
		int n=a*b*c;
		int arr[]=new int[10];//배열에 각 자리수가 얼만큼 있는지 저장
		
		while(n>0) {//n값이 0보다 작아지면 끝나는 while문
			int idx=n%10;//1의자리수가 몇인지 구함
			arr[idx]++;//배열의 그 자리수가 몇개인지 저장
			n/=10;//1의 자리수를 버림
		}
		for (int x : arr) {//foreach 문 for(type var:iterate) lterate는 루프를 돌릴 객체에서 한개씩 var에 대입되어서 for문을 수행함 루프를 돌릴수 있는 배열과 ArrayList도 가능
			System.out.println(x);
		}
	}

}
