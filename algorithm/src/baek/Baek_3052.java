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
			arr[i]=Integer.parseInt(br.readLine());//������ ������ �Է¹���
			int idx=arr[i]%42;//�Է¹��� ������ 42�� ���� �������� idx ���� ����
			div[idx]++;//div�迭�� ������ ���� � �ԷµǾ����� ���� ���������� ������ �ԷµǸ� div�迭 ���� ���� Ŀ��
		}
		for(int i=0;i<div.length;i++) {
			if(div[i]>0) {
				sum++;
			}
		}
		System.out.print(sum);
	}

}
