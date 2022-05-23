package demo;

import java.util.*;
public class Linked_Hash_Set_Demo {

	public static void main(String[] args) {
		LinkedHashSet<String> lhs = new LinkedHashSet<String>();
		lhs.add("this is");
		lhs.add("for");
		lhs.add("me a");
		lhs.add("very helpful");
		
		Iterator<String> itr = lhs.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.hasNext());
		}


	}

}
