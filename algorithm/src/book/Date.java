package book;

public class Date {
	int year;
	String month;
	int day;
	
	public Date(){
		this(1900,"1¿ù",1);
	}
	public Date(int y){
		this(y,"1¿ù",1);
	}
	public Date(int y,String m,int d){
		year=y;
		month=m;
		day=d;
	}
	
	public String toString() {
		return "Date [year="+year+", month="+month+", day="+day+"]";
	}
}
