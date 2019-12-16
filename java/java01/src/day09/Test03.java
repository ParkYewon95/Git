package day09;

import javax.swing.JOptionPane;

public class Test03 {
	public static void main(String[] args) {
		
		Controller cmd = null;
		
		// 객체 생성  - controller를 implement하는 새로운 객체를 생성
		Controller insert = new Controller() {
			@Override
			public void exec() {
				System.out.println("insert 수행");
			}
		};
		
		Controller update = new Controller() {
			@Override
			public void exec() {
				System.out.println("update 수행");
			}
		};
		
		Controller delete = new Controller() {
			@Override
			public void exec() {
				System.out.println("delete 수행");
			}
		};
		
		String msg = JOptionPane.showInputDialog("숫자를 입력하세요. 1.delete 2.insert 3.update");
				
		switch(msg) {
		case "1":
			cmd = delete;
			break;
		case "2":
			cmd = insert;
			break;
		case "3":
			cmd = update;
			break;
		default :
			System.out.println("명령선택을 다시 하세요");
			break;	
		}
		
		if(cmd!=null) cmd.exec();
		
	}
}

interface Controller{
	void exec();
}
