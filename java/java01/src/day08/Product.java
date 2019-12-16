package day08;

class Product {

	int price;
	int bonuspoint;
	
	Product(int price){
		this.price = price;
		bonuspoint = price/10;
	}
	
	Product(){
		
	}
	
}

class TV extends Product{
	TV(){
		super(100);
	}
	public String toString() {
		return "TV";
	}	
}


class Computer extends Product{
	Computer(){
		super(200);
	}
	public String toString() {
		return "Computer";
	}	
}

class Audio extends Product{
	Audio(){
		super(50);
	}
	public String toString() {
		return "Audio";
	}	
}

class Buyer{
	int money=1000;
	int bonuspoint=0;
	Product[] item = new Product[10]; // 제품을 저장할 배열
	int i=0;
	
	void buy(Product p) {
		if(money<p.price) {
			System.out.println("돈 부족"); 
			return;
		}
		money -= p.price;
		bonuspoint +=p.bonuspoint;
		item[i++]=p;
		System.out.println(p+"를 구입하셨습니다.");
		
	}
	
	void summary() {
		int sum=0;
		String itemList = "";
		
		for(int i=0; i<item.length; i++) {
			if(item[i]==null) break;
			sum+=item[i].price;
			itemList += item[i] + ",";
		}
		System.out.println("구입한 물품의 총 금액 : " +sum+"만원 입니다.");
		System.out.println("구입한 물품은 : " +itemList+" 입니다.");
		System.out.println("누적 포인트는 : "+bonuspoint+"원 입니다");
	}
	
}
