package study;
import java.io.*;
import java.util.StringTokenizer;

public class BufferedReaderEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {//예외처리 필수 or throwsIOExceptiion하기
			//콘솔에서 입력받을 경우
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			
			//파일에서 입력받을 경우
			/*
			FileReader fr=new FileReader("BufferedReaderEx1.java");
			BufferedReader br_f=new BufferedReader(fr);
			*/
			//string이 리턴값이여서 형변환 필수! 라인단위
			int num=Integer.parseInt(br.readLine());//숫자형의 문자열을 인자 값으로 받으면 해당 값을 10진수의 Integer 형으로 반환 한다
			br.close(); //입출력이 끝난후 닫아주기
			
			//파일의 한줄 한줄 읽어서 출력한다
			/*String line="";
			for(int i=1;(line=br_f.readLine())!=null;i++) {
				System.out.println(line);
			}
			*/
		}	catch(IOException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
	}

}
