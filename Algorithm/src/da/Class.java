package da;


import java.io.*;
import java.util.Scanner;


  class Person{
		private int age;
	  
//	  Person(){ 
//		this.age=age;  
//	  }

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
		
			   
			
			
		
}	
public class Class{
	    public static void main (String args[]) {
	        Person aPerson = new Person();
	        
	        aPerson.setAge(17);
	        System.out.println(aPerson.getAge());
	    }
}
