package day09;

import javax.swing.JOptionPane;

public class Test01 implements Command{

	public static void main(String[] args) {
		
		Command cmd = null;
		
		String msg = JOptionPane.showInputDialog("숫자를 입력하세요. 1.delete 2.insert 3.update");
		
		switch(msg) {
		case "1":
			cmd = new DeleteCommand();
			break;
		case "2":
			cmd = new InsertCommand();
			break;
		case "3":
			cmd = new UpdateCommand();
			break;
		default :
			cmd = new ListCommand();
			break;
		
		}
		
		if(cmd!=null) {
			System.out.println("cmd에 값이 들어왔음!");
			cmd.exec();
			cmd.base();
		}
		
		
		
	}

	@Override
	public void exec() {
		
	}

}

interface Command{
	void exec();
	//jdk 1.7버전 이상에서 default 키워드를 지원한다. -> 선택적으로 오버라이딩 가능하게함.
	default void base() {
		System.out.println("command base");
	};
}

class DeleteCommand implements Command{

	@Override
	public void exec() {
		System.out.println("DeleteCommand 수행");
	}
}

class UpdateCommand implements Command{
	@Override
	public void exec() {
		System.out.println("UpdateCommand 수행");
	}
	
	public void base() {
		System.out.println("command base() 오버라이딩");
	}
}
class InsertCommand implements Command{
	
	@Override
	public void exec() {
		System.out.println("InsertCommand 수행");
		
	}
	
}

class ListCommand implements Command{
	public void exec() {
		System.out.println("ListCommand 수행");
		
	}
}



