package demo;

import java.util.*;
public class GFG {

	public static void main(String[] args) {
		Stack<String> stack = new Stack<String>();
		stack.push("Hi");
		stack.push("Bye");
		stack.push("Hello");
		stack.push("gm");
		Iterator<String> itr = stack.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next()+ " ");
		}
		System.out.println();
		stack.pop();
		
		itr = stack.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next()+ " ");
		}
	}

}
