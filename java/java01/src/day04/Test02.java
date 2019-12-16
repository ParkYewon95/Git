package day04;

public class Test02 {
	public static void main(String[] args) {
		for(int i=0; i<3; i++) {
			
			for(int j=0; j<5; j++) {
				System.out.printf("i=%d, j=%d ",i,j);
			}
			System.out.println();
		}
		
		int i=0;
		while(i>10) {
			System.out.println(i);
			i++;
		}
		
//		double n = Math.random();
//		System.out.println(n);
//		
		boolean flag = true;
		while(flag) {
			System.out.println("");
			
			int num = (int) (Math.random()*10);
			System.out.println(num);
			if(num%3==0) flag = !flag;
			
		}
		
	}
}
