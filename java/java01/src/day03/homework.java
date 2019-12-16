package day03;

public class homework {
	public static void main(String[] args) {
		
		//problem 1
		
		int year =0;
		if(year%400==0 || (year%4==0 && year%100!=0))
			System.out.println("윤년");
		
		
		// problem 2
		int sum=0;
		for(int i=1; i<=20;i++) {
			if(i%2==0 || i%3==0) {
				continue;
			}
			sum +=i;
		}
		System.out.println(sum);
		
		
		//problem 3
		int total =0;
		for (int i=1; i<=10; i++) {
			int tt=0;
			System.out.print("(");
			for(int z=1; z<=i; z++) {
				System.out.print(z);
				if(z<i)
					System.out.print("+");
				tt += z;
			}
			System.out.print(")");
			System.out.print("+");
			
			total +=tt;
		}
		
		System.out.println("");
		System.out.println(total);
		
	}
}
