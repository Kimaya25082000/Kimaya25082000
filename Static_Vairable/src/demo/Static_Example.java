package demo;

class Student
{  
	   int rollno;//instance variable  
	   String name;  
	   static String college ="PVG";//static variable  
 
	   Student(int r, String n){  
	   rollno = r;  
	   name = n;  
	   }  
	  
	   void display (){System.out.println(rollno+" "+name+" "+college);}  
	}  


public class Static_Example {

	public static void main(String[] args) 
	{
		 Student s1 = new Student(111,"Kimaya");  
		 Student s2 = new Student(222,"Nayna");  
		 s1.display();  
		 s2.display();  

	
	}

}
