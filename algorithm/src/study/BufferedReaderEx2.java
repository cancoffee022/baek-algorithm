package study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BufferedReaderEx2 {

	public static void main(String[] args) throws IOException {
		BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));//선언
		String str=bf.readLine();//변수 str에 readLine으로 읽은거 저장
		int i=Integer.parseInt(bf.readLine());//형변환
		
		StringTokenizer st=new StringTokenizer(str);//StringTokenizer 인자값에 입력 문자열 넣음
		int a=Integer.parseInt(st.nextToken());//첫번째 토큰 호출
		int b=Integer.parseInt(st.nextToken());//두번째 토큰 호출
	}

}
