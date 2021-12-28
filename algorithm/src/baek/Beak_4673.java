package baek;

public class Beak_4673 {

	public static void main(String[] args) {
		
		boolean[] check=new boolean[10001];//1���� 10000���� ������ ���̴� 10001
		
		for(int i=1;i<10001;i++) {//1���� 10000���� ����
			int n=d(i);
			
			if(n<10001) {//10000�� �Ѵ� ���� �ʿ� ����
				check[n]=true;//�����ڰ� �ִ� ���� true�� �ٲ���
			}
		}
		
		StringBuilder sb=new StringBuilder();
		
		for(int i=1;i<10001;i++) {
			if(!check[i]) {//false�� �ε����� ���
				sb.append(i).append('\n');
			}
		}
		System.out.println(sb);
	}
	
	public static int d(int number) {//�� �ڸ����� ���ϴ� �Լ�
		int sum=number;
		
		while(number!=0) {//�� �ڸ����� �����ִ� �ݺ���
			sum=sum+(number%10); //ù ��° �ڸ���
			number= number/10; //10�� ������ ù° �ڸ��� ����
		}
		
		return sum;
	}

}
