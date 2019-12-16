package day06;

public class TVTest {
	public static void main(String[] args) {
		
		TV t1= new TV();
		t1.model = "Samsung TV";
		t1.size = 25;
		t1.powerOn();
		t1.setChannel(11);
		t1.channelDown();
		
		TV t2= new TV();
		t2.model = "LG TV";
		t2.size = 32;
		t2.powerOn();
		t2.setChannel(21);
		
		
//		t1.print();	
//		t2.print();
//		t2= t1; // t2가 생성했던 인스턴스와의 연결이 끊어짐. t2와 t1은 같은 객체를 가리키게 된다.

//		t1.print();
//		t2.print();
//
//		t2=null;
		
		
		TV[] tvs = new TV[3];
		tvs[0]= t1;
		

		for(int i =0; i<tvs.length;i++) {
			
			
//			if(tvs[i]!=null) {
//				
//				tvs[i].powerOn();
//				tvs[i].print();
//				
//			}
//			if(tvs[i]==null) break;
//			
//			tvs[i].print();
		}
		
	}
}

class TV{
	
	int size;
	String model;
	int channel;
	boolean power;
	
	public void print() {
		System.out.printf("TV(%s,%d 인치, power:%b, channel:%d)%n",model,size,power,channel);
	}
	public void powerOn() {
		power = true;
	}
	public void powerOff() {
		power = false;
	}
	public void setChannel(int c) {
		channel = c;
	}
	public void channelUp() {
		channel++;
	}
	public void channelDown() {
		channel--;
	}
	
}
