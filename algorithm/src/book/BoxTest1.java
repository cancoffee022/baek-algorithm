package book;

public class BoxTest1 {

	public static void main(String[] args) {
		
		Box1 b=new Box1();
		
		b.width=20;
		b.length=20;
		b.height=30;
		
		System.out.print("상자의 가로,세로,높이의 길이는 : "+b.width+", "+b.length+", "+b.height);
	}

}
