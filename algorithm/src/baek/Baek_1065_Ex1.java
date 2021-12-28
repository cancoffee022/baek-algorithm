package baek;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
 
public class Baek_1065_Ex1 {
 
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print(arithmetic_sequence(Integer.parseInt(br.readLine())));
		
	}
 
	public static int arithmetic_sequence(int num) {
		int cnt = 0; // �Ѽ� ī����
 
		if (num < 100) {//100�̸��� ���� ������ �Ѽ�
			return num;
		}
 
		else {
			cnt = 99;
			if (num == 1000) { // ����ó�� �ʼ�
				num = 999;
			}
 
			for (int i = 100; i <= num; i++) {
				int hun = i / 100; // ���� �ڸ���
				int ten = (i / 10) % 10; // ���� �ڸ���
				int one = i % 10;
 
				if ((hun - ten) == (ten - one)) { // �� �ڸ����� ������ �̷��
					cnt++;
				}
			}
		}
 
		return cnt;
	}
 
}