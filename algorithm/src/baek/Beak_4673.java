package baek;

public class Beak_4673 {

	public static void main(String[] args) {
		
		boolean[] check=new boolean[10001];//1부터 10000까지 임으로 길이는 10001
		
		for(int i=1;i<10001;i++) {//1부터 10000까지 대입
			int n=d(i);
			
			if(n<10001) {//10000이 넘는 수는 필요 없음
				check[n]=true;//생성자가 있는 수는 true로 바꿔줌
			}
		}
		
		StringBuilder sb=new StringBuilder();
		
		for(int i=1;i<10001;i++) {
			if(!check[i]) {//false인 인덱스만 출력
				sb.append(i).append('\n');
			}
		}
		System.out.println(sb);
	}
	
	public static int d(int number) {//각 자리수를 더하는 함수
		int sum=number;
		
		while(number!=0) {//각 자리수를 더해주는 반복문
			sum=sum+(number%10); //첫 번째 자리수
			number= number/10; //10을 나누어 첫째 자리를 없앰
		}
		
		return sum;
	}

}
