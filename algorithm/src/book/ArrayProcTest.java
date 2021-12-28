package book;

import java.io.IOException;

public class ArrayProcTest {
	final static int STUDENTS=5;

	public static void main(String[] args) throws IOException {
		int[] scores=new int[STUDENTS];
		ArrayProc obj=new ArrayProc();
		obj.getValues(scores);
		System.out.println("∆Ú±’¿∫ = "+obj.getAverage(scores));
	}

}
