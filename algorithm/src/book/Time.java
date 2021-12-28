package book;

public class Time {
	int hour;
	int minute;
	int second;
	
	public Time() {
		this(0,0,0);
	}
	public Time(int h,int m,int s) {
		if(h<25&&m<60&&s<60) {
			hour=h;
			minute=m;
			second=s;
		}else
			hour=minute=second=0;
			
	}
	
	public String toString() {
		return String.format("%02d:%02d:%02d",hour,minute,second);
	}
}
