package study;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class BufferedExample {

	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));//BufferedReader,BufferedWriter 선언
		StringTokenizer st;//선언
		int T=Integer.parseInt(br.readLine());//테스트케이스의 개수 T를 입력받음
		for(int i=0;i<T;i++) { //입력받은 테스트케이스의 수만큼 for문을 돌림
			st=new StringTokenizer(br.readLine());//입력받은 정보를 토큰화 하여 저장
			bw.write(Integer.parseInt(st.nextToken())+Integer.parseInt(st.nextToken())+"\n");//토큰에 저장되어있는 두수를 더함
		}
		bw.close();
	}

}
