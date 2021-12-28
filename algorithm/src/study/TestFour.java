package study;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

//입력의 종료는 더이상 읽을수 있는데이터가 없을때 종료됨(EOF)
//이 문제의 중요점은 파일 종료 조건이 따로 주어지지 않고 입력만 존재한다. 따라서 더이상의 읽을수 있는 데이터가 없을때 반복문을 종료하는 것
//이렇게 데이터가 더 이상 존재하지 않을 때 EOF(End of File) 파일의 끝이라고 한다.
//BufferedReader는 이 상황에 null을 반환한다

public class TestFour {

	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		String str;
		while((str=br.readLine())!=null) {//EOF일때 반복문을 종료
			st=new StringTokenizer(str," ");
			int a=Integer.parseInt(st.nextToken());
			int b=Integer.parseInt(st.nextToken());

			bw.write((a+b)+"\n");
		}
		bw.close();
	}

}
