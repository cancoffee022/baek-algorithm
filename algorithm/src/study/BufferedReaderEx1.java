package study;
import java.io.*;
import java.util.StringTokenizer;

public class BufferedReaderEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {//����ó�� �ʼ� or throwsIOExceptiion�ϱ�
			//�ֿܼ��� �Է¹��� ���
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			
			//���Ͽ��� �Է¹��� ���
			/*
			FileReader fr=new FileReader("BufferedReaderEx1.java");
			BufferedReader br_f=new BufferedReader(fr);
			*/
			//string�� ���ϰ��̿��� ����ȯ �ʼ�! ���δ���
			int num=Integer.parseInt(br.readLine());//�������� ���ڿ��� ���� ������ ������ �ش� ���� 10������ Integer ������ ��ȯ �Ѵ�
			br.close(); //������� ������ �ݾ��ֱ�
			
			//������ ���� ���� �о ����Ѵ�
			/*String line="";
			for(int i=1;(line=br_f.readLine())!=null;i++) {
				System.out.println(line);
			}
			*/
		}	catch(IOException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
	}

}
