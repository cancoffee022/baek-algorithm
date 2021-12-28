package baek;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Beak_10818_Ex1 {//�迭�� ������� �ʰ� Ǭ ���
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 
		Integer.parseInt(br.readLine());	//ù �� N �� �Ⱦ��̹Ƿ� �Է¸� �޴´�.
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int max = Integer.MIN_VALUE;//ó�� �Է¹��� ���� �ִ밪���� �����ϱ� ���� �񱳰��� ������ ���� �������� ����
		int min = Integer.MAX_VALUE;//ó�� �Է¹��� ���� �ִ밪���� �����ϱ� ���� �񱳰��� ������ ���� �������� ����
		
		while(st.hasMoreTokens()) {//while���� ������ st�� �Է¹��� ��ū�� �����ϴ����� �˻��Ѵ�
			int val = Integer.parseInt(st.nextToken());
			if(val>max) {//
				max = val;
			}
			if(val<min) {
				min = val;
			}
		}
		System.out.println(min + " " + max);
	}
}
