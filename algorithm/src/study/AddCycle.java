package study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AddCycle {

	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(br.readLine());
		int index=0,ans=0,sum;
		ans=n;
		while(true) {
			int x=n/10;//x���� �����ڸ�
			int y=n%10;//y���� �����ڸ�
			sum=(x+y)%10;//x+y�������� 10���� ũ�� ���� �ڸ��� ������
			n=y*10+sum;//n���� ���
			index++;
			if(ans==n)
				break;
		}
		System.out.print(index);
	}

}
