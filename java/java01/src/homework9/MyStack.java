package homework9;

public class MyStack {

	private int[] mystack ;
	
	private int index=-1;
	
	MyStack(){
		this(10);
	}
	
	MyStack(int a){
		if(a<0)
			mystack = new int[10];
		else
			mystack = new int[a];
	}
	
	public int top() {
		
		return mystack[index];
	}
	
	public int pop() {
		
		if (index==-1) {
			System.out.println("-1");
		}
		
		return mystack[index--];
	}
	
	public void push(int i) {
		
		if(isFull()) { //배열 resizing 
			int[] temp = new int[mystack.length*2];
			System.arraycopy(mystack, 0, temp, 0, mystack.length);
			mystack = temp;
			temp = null;
			
		}
		
		if (index==mystack.length) {
			System.out.println("저장공간이 가득찼습니다");
			return;
		}

		mystack[++index]=i;
		System.out.println(index+"번째에 " + i +"값 push");		
	}
	
	public boolean isFull() {
		if(index==mystack.length-1)
			return true;
		return false;
	}


	public boolean isEmpty() {
		if (index==-1) {
			return true;
		}
		return false;
	}
	
	public int[] getMystack() {
		return mystack;
	}
	public void setMystack(int[] mystack) {
		this.mystack = mystack;
	}
	
	
	
	
}
