package baek;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baek_11720 {

	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		br.readLine();
		
		int sum=0;
		
		for(byte value:br.readLine().getBytes()) {//getBytes�� �ش� ���ڿ��� �ϳ��� Byte �迭�� ��ȯ���ִ� �޼ҵ��
			sum+=(value-'0');//getBytes�� ������ ����Ǵ°� �ƴ϶� �ƽ�Ű�ڵ�� �ٲ�� ������'0'�� �ƽ�Ű�ڵ�� 48�̶�� ���̰� �� ���� ����� �������� ���´�
		}
		System.out.print(sum);
	}

}
