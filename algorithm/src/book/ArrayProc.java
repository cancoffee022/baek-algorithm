package book;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ArrayProc {
	void getValues(int[] array) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		for(int i=0;i<array.length;i++) {
			System.out.print("성적을 입력하시오:");
			array[i]=Integer.parseInt(br.readLine());
		}
	}
	
	double getAverage(int[] array) {
		int sum=0;
		for(int i=0;i<array.length;i++) {
			sum+=array[i];
		}
		
		return (double)sum/array.length;
	}
}
