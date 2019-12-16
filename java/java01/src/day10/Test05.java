package day10;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.Vector;

import javax.swing.JOptionPane;

import util.MyUtil;

public class Test05 {

	public static void main(String[] args) {
		Set<String> set = new TreeSet<String>();
		set.add("lee");
		set.add("kim");
		set.add("park");
		set.add("ko");
		set.add("lee");
		
		MyUtil.iteratorPrint(set);
		
	}

}
