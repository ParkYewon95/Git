package day06;

import javax.swing.JOptionPane;

public class AccountTest3 {

	public static void main(String[] args) {
		
		Account[] a = {
				new Account("2019-12-09-001","박예원",10),
				new Account("2019-12-09-002","김예원",700),
				new Account("2019-12-09-003","이예원",90),
				new Account("2019-12-09-004","최예원",1000),
				new Account("2019-12-09-005","강예원",3200),
				new Account("2019-12-09-006","차예원",10000),		
		};
		System.out.println("Account list");
		for(int i=0; i<a.length; i++) {
			a[i].print();
		}
		
		//계좌 검색
		System.out.println("\n 계좌 검색");
		String name = JOptionPane.showInputDialog("검색할 이름을 입력하세요");
		for(int i=0; i<a.length;i++) {
			//System.out.println(a[i].getName());
			if (a[i].getName().equals(name.trim()))
				a[i].print();

		}
		
		
		
	}

}
