package baek;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Beak_10809 {//������ ���ĺ��� ���ؼ�, a�� ó�� �����ϴ� ��ġ, b�� ó�� �����ϴ� ��ġ, ... z�� ó�� �����ϴ� ��ġ�� �������� �����ؼ� ����Ѵ�.

	public static void main(String[] args) throws IOException{
		//�Է¹��� ���ڿ��� ���° ��ġ�� ���� ���ĺ��� �ִ��� �˾ƾ���
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String str=br.readLine();
		
		for(int i=0;i<26;i++) {
			int k=0;//��ġ��
			for(int j=0;j<str.length();j++) {
				if(i==(int)str.charAt(j)-97) {//�Է¹��� ���ڿ��� �˻��Ŵ
					k=j;//��ġ�� ����
					break;
				}else
					k=-1;
			}
			System.out.print(k+" ");
		}
	}

}
