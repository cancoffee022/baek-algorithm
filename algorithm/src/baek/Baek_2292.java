package baek;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baek_2292 {

	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(br.readLine())-1;//1�� �Է¹޾����� while���� �����Ű�� �ʱ����� -1�� ��
		int x=1;//1���� �����ؼ� 1�� �Է¹޾����� 1�� ��µǵ��� ��
		
		while(n>0) {//�� ������ �ܼ�ȭ ��Ű�� 1�� �������� 6�� ����� �����ϴ� �ڸ��� Ŀ���� �����̴�
			n=n-(6*x);
			x++;
		}
		System.out.println(x);
	}

}
