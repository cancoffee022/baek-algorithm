package study;

import java.util.StringTokenizer;

public class StringTokenizerEx {

	public static void main(String[] args) {
		String str="���ڿ�/�� �پ��� ������� ��ū/ȭ �غ�/��";
		StringTokenizer st=	new StringTokenizer(str);//���� �������� ���ڿ��� �и�
		StringTokenizer st_1=new StringTokenizer(str,"/");//������ "/"�� �������� ���ڿ��� �и�
		StringTokenizer st_2=new StringTokenizer(str,"/",true);//�����ڸ� �������� ���ڿ��� �и��� �� �����ڵ� ��ū���� ������ ��ū�� ���Խ�Ű�� ������
		
		int i=1;
		while(st.hasMoreTokens()) { //���� ��ū�� ������ ����
			System.out.println((i++)+"��° ��ū: "+st.nextToken());
		}
		i=1;
		while(st_1.hasMoreTokens()) { //���� ��ū�� ������ ����
			System.out.println((i++)+"��° ��ū: "+st_1.nextToken());
		}
		i=1;
		while(st_2.hasMoreTokens()) { //���� ��ū�� ������ ����
			System.out.println((i++)+"��° ��ū: "+st_2.nextToken());
		}
	}

}
