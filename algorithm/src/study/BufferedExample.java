package study;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class BufferedExample {

	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));//BufferedReader,BufferedWriter ����
		StringTokenizer st;//����
		int T=Integer.parseInt(br.readLine());//�׽�Ʈ���̽��� ���� T�� �Է¹���
		for(int i=0;i<T;i++) { //�Է¹��� �׽�Ʈ���̽��� ����ŭ for���� ����
			st=new StringTokenizer(br.readLine());//�Է¹��� ������ ��ūȭ �Ͽ� ����
			bw.write(Integer.parseInt(st.nextToken())+Integer.parseInt(st.nextToken())+"\n");//��ū�� ����Ǿ��ִ� �μ��� ����
		}
		bw.close();
	}

}
