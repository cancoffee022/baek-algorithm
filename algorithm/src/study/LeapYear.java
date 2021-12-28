package study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LeapYear {

	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int year=Integer.parseInt(br.readLine());
		int is=0;
		if(year%4==0) {
			if(year%100!=0||year%400==0)
				is=1;
		}
		System.out.print(is);
	}

}
