package day04;

import java.util.Arrays;

public class Test05 {
	public static void main(String[] args) {
		
		int num[] =new int[10];
		for(int i=0; i<num.length;i++) {
			
			int rand = (int)(Math.random()*100)+1;
			
			for(int j=0; j<i;j++) {
				
				
			}
			
			num[i]=rand;
			System.out.print(num[i]+" ");
		}
		
		
		
		System.out.println();
		
		System.out.println(Arrays.toString(num));
		
		//int[] temp = new int[num.length*2];
		
		// num 배열의 0번째를 , temp배열의 0번째부터 , num의 길이만큼 복사한다.
		//System.arraycopy(num, 0, temp, 0, num.length);
		//System.out.println(Arrays.toString(temp));
		
		//num = temp;
	}
}
