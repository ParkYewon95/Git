package day02;

public class Test04 {
	public static void main(String[] args) {
		int num=100;
		
		int i =99, j=77;
		
		int tmp;
		tmp = i;
		i = j;
		j=tmp;
		
		//System.out.printf("i=%d, j =%d",i,j);
		
		
		char c1 ='b', c2 = 'w';
		System.out.printf("c1=%c , c2=%c %n",c1,c2);
		
		char c ;
		c = c1;
		c1 = c2;
		c2 = c;
		
		System.out.printf("c1=%c , c2=%c %n",c1,c2);
		
		String s1 = "hello", s2 = "java";
		
		System.out.printf("s1=%s , s2=%s %n",s1,s2);
		String str;
		str = s1;
		s1 = s2;
		s2 = str;
		System.out.printf("s1=%s , s2=%s %n",s1,s2);
		
		
		
		
		
		
		
	}
}
