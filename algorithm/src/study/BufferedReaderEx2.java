package study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BufferedReaderEx2 {

	public static void main(String[] args) throws IOException {
		BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));//����
		String str=bf.readLine();//���� str�� readLine���� ������ ����
		int i=Integer.parseInt(bf.readLine());//����ȯ
		
		StringTokenizer st=new StringTokenizer(str);//StringTokenizer ���ڰ��� �Է� ���ڿ� ����
		int a=Integer.parseInt(st.nextToken());//ù��° ��ū ȣ��
		int b=Integer.parseInt(st.nextToken());//�ι�° ��ū ȣ��
	}

}
