package demo;

import java.util.*;
public class HashSetDemo {

	public static void main(String[] args) {
		HashSet<String> hs = new HashSet<String>();
		hs.add("this is");
		hs.add("for");
		hs.add("me a");
		hs.add("very helpful");
		
		Iterator<String> itr = hs.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.hasNext());
		}

	}

}
