package baek;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baek_1157 {

	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String str=br.readLine();
		 
		int[] arr=new int[26];
		int max=-1;
		int alp=0;
		
		boolean isNegative=false;
		
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)<91)//�빮���϶�
				arr[((int)str.charAt(i)-65)]++;
			else//�ҹ����϶�
				arr[(int)str.charAt(i)-97]++;
		}

		for(int i=0;i<26;i++) {
			if(max<arr[i]) {//�ִ밪�� ���� arr�� �ּҰ��� �˾Ƴ���
				max=arr[i];
				alp=i;
				isNegative=false;
			}
			else if(max==arr[i])//�ִ밪�� �������϶� bool���� true�� ����
				isNegative=true;
		}
		
		char exchage=(char) (alp+65);
		
		if(isNegative)
			System.out.print("?");
		else
			System.out.println(exchage);
	}

}
