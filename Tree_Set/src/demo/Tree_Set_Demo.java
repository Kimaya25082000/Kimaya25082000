package demo;

import java.util.*;
public class Tree_Set_Demo {

	public static void main(String[] args) {
		TreeSet<String> ts = new TreeSet<String>();
		ts.add("this is");
		ts.add("for");
		ts.add("me a");
		ts.add("very helpful");
		
		Iterator<String> itr = ts.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.hasNext());
		}

	}

}
