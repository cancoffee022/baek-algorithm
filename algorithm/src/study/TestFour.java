package study;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

//�Է��� ����� ���̻� ������ �ִµ����Ͱ� ������ �����(EOF)
//�� ������ �߿����� ���� ���� ������ ���� �־����� �ʰ� �Է¸� �����Ѵ�. ���� ���̻��� ������ �ִ� �����Ͱ� ������ �ݺ����� �����ϴ� ��
//�̷��� �����Ͱ� �� �̻� �������� ���� �� EOF(End of File) ������ ���̶�� �Ѵ�.
//BufferedReader�� �� ��Ȳ�� null�� ��ȯ�Ѵ�

public class TestFour {

	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		String str;
		while((str=br.readLine())!=null) {//EOF�϶� �ݺ����� ����
			st=new StringTokenizer(str," ");
			int a=Integer.parseInt(st.nextToken());
			int b=Integer.parseInt(st.nextToken());

			bw.write((a+b)+"\n");
		}
		bw.close();
	}

}