package baek;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baek_2577_Ex1 {

	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int a=Integer.parseInt(br.readLine()); int b=Integer.parseInt(br.readLine()); int c=Integer.parseInt(br.readLine());
		int n=a*b*c;
		int arr[]=new int[10];//�迭�� �� �ڸ����� ��ŭ �ִ��� ����
		
		while(n>0) {//n���� 0���� �۾����� ������ while��
			int idx=n%10;//1���ڸ����� ������ ����
			arr[idx]++;//�迭�� �� �ڸ����� ����� ����
			n/=10;//1�� �ڸ����� ����
		}
		for (int x : arr) {//foreach �� for(type var:iterate) lterate�� ������ ���� ��ü���� �Ѱ��� var�� ���ԵǾ for���� ������ ������ ������ �ִ� �迭�� ArrayList�� ����
			System.out.println(x);
		}
	}

}
