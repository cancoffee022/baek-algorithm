package baek;

public class Beak_15596 {
	long sum(int[] a) {
		long sum=0; //a �迭 ���� �� ����
		
		for(int i=0;i<a.length;i++) {
			sum+=a[i];
		}
		return sum;
	}
}