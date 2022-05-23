package demo;

import java.io.*;
import java.util.*;
class Collection_java {

	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		for(int i=1;i<=5;i++)
			al.add(i);
		System.out.println(al);
		al.remove(3);
		System.out.println(al);
		for(int i=1;i<al.size();i++)
			System.out.println(al.get(i)+" ");

	}

}

