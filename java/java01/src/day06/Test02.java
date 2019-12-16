package day06;

public class Test02 {

	public static void main(String[] args) {

		Time t1 = new Time();
		
		// private설정하면 멤버변수에 직접 접근할 수 없다.
//		 t1.hour=13;
//       t1.minute=30;
		t1.setHour(13);
		t1.setMinute(45);
		
		t1.print();	
		
	}
}


class Time{
	private int hour;
	private int minute;
	private int second;
	
	public int getHour() {
		return hour;
	}
	public void setHour(int hour) {
		if(hour>=0 && hour<24)
			this.hour = hour;
	}
	
	public int getMinute() {
		return minute;
	}
	public void setMinute(int minute) {
		if(minute>=0 && minute<60)
			this.minute = minute;
	}
	
	public int getSecond() {
		return second;
	}
	public void setSecond(int second) {
		if(second>=0 && second<60)
			this.second = second;
	}
	
	public void print() {
		System.out.printf("%d시 %d분 %d초 %n",hour,minute,second);
	}
}


