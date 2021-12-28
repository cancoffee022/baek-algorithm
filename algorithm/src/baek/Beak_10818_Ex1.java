package baek;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Beak_10818_Ex1 {//배열을 사용하지 않고 푼 방식
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 
		Integer.parseInt(br.readLine());	//첫 줄 N 은 안쓰이므로 입력만 받는다.
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int max = Integer.MIN_VALUE;//처음 입력받은 수를 최대값으로 지정하기 위해 비교값을 정수중 가장 작은값을 저장
		int min = Integer.MAX_VALUE;//처음 입력받은 수를 최대값으로 지정하기 위해 비교값을 정수중 가장 작은값을 저장
		
		while(st.hasMoreTokens()) {//while문의 조건은 st에 입력받은 토큰이 존재하는지를 검사한다
			int val = Integer.parseInt(st.nextToken());
			if(val>max) {//
				max = val;
			}
			if(val<min) {
				min = val;
			}
		}
		System.out.println(min + " " + max);
	}
}
