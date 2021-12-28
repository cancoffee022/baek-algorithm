package book;

public class SafeArrayTest {

	public static void main(String[] args) {
		SafeArray arr=new SafeArray(3);
		
		for(int i=0;i<(arr.length+2);i++) {
			arr.put(i, i*10);
		}
	}

}
