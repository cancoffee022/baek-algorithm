package baek;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Beak_10809 {//각각의 알파벳에 대해서, a가 처음 등장하는 위치, b가 처음 등장하는 위치, ... z가 처음 등장하는 위치를 공백으로 구분해서 출력한다.

	public static void main(String[] args) throws IOException{
		//입력받은 문자열이 몇번째 위치에 무슨 알파벳이 있는지 알아야함
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String str=br.readLine();
		
		for(int i=0;i<26;i++) {
			int k=0;//위치값
			for(int j=0;j<str.length();j++) {
				if(i==(int)str.charAt(j)-97) {//입력받은 문자열을 검사시킴
					k=j;//위치값 지정
					break;
				}else
					k=-1;
			}
			System.out.print(k+" ");
		}
	}

}
