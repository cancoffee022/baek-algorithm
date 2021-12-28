package baek;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baek_11720 {

	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		br.readLine();
		
		int sum=0;
		
		for(byte value:br.readLine().getBytes()) {//getBytes는 해당 문자열을 하나의 Byte 배열로 변환해주는 메소드다
			sum+=(value-'0');//getBytes는 정수로 저장되는게 아니라 아스키코드로 바뀌기 때문에'0'는 아스키코드로 48이라는 값이고 이 값을 빼줘야 정수값이 나온다
		}
		System.out.print(sum);
	}

}
