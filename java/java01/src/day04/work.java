package day04;

public class work {

	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		//ex1
		
		String msg ="yes";
		boolean msg_flag = false;
		if(msg=="yes")
			msg_flag=true;
		
		
		//ex2
		int sum=0;
		
		int i=1;
		int j=i;
		
		while(sum<100) {
			sum += j;
			i++;
			System.out.println("sum : "+sum);
			if(i%2==0)
				j= i*(-1);
			else
				j = i;
			System.out.println(j);
		}
		System.out.println("i는 "+i+" 총 합은 "+sum);
		
		
		int[] arr = {10, 20, 30, 40, 50}; 
		
		// TODO arr 배열 에 담긴 모든 값을 더하는 프로그램을 완성
		int total=0;
		for(int k=0; k<arr.length; k++) {
			total +=arr[k];
			
		}
		
		System.out.println("total"
				+ "="+total);
		
	}

}

class Exercise2 { 
	public static void main(String[] args) { 
		
	 } 
}

