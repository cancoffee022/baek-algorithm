package study;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class BufferedWriterEx1 {

	public static void main(String[] args) throws IOException{
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out)); //�Ҵ�� ���ۿ� �� �־��ֱ�
		String str="abcdefg"; //����� ���ڿ�
		bw.write(str+"\n");//���
		bw.newLine();//�ٹٲ�
		bw.flush(); //�����ִ� �����͸� ��� ��½�Ŵ
		bw.close(); //��Ʈ���� ����
	}

}
