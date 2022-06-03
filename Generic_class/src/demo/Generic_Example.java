package demo;

import java.io.*;
import java.util.*;

class GenericClass<T>
{
	GenericClass(){
		System.out.println("The generic class is declared now.You can use it well");
	}
	public void methodgeneric(T obj) {
		System.out.println("The type of the object that this class now contains is"
				+ obj.getClass().getSimpleName());
	}
}
public class Generic_Example {

	public static void main(String[] args) 
	{
		GenericClass<Integer> test = new GenericClass<>();
		Integer a= 5;
		test.methodgeneric(a);
		
		GenericClass<String> teststring = new GenericClass<>();
		String s = "Hello";
		teststring.methodgeneric(s);

	}

}
