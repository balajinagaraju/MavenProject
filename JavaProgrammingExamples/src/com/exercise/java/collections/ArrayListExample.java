package com.exercise.java.collections;

import java.util.ArrayList;
import java.util.Iterator;

//Array list a dynamic array. Test
public class ArrayListExample {

	public static void main(String args[]) {

		int a[] = new int[4]; // Fixed sized array or static array

		/*Properities 
		1. Dynamic in nature: increases the size dynamically and allocate memory on the fly
		2. Allows duplicate values
		3. Maintains insertion order
		4. Synchronised 
		5. Allows random access to fetch the element 
		*/
		
		//Generic array list: can store any type of data value 
		ArrayList myarraylist = new ArrayList();
		myarraylist.add(10);
		myarraylist.add(20);
		myarraylist.add(30);

		System.out.println(myarraylist.size());
		
		System.out.println("-------------------");

		myarraylist.add(40);
		myarraylist.add(50);

		System.out.println(myarraylist.size());  //Size of the arrayq
		
		System.out.println("-------------------");

		// Random access of elements
		System.out.println(myarraylist.get(3)); // to get the value from an index. 
		
		
		
		/*To retrieve all the elements of an arraylist : 
		1. Use for loop
		2. Use iterator 
		*/
		
		for(int i = 0;i<myarraylist.size();i++){
			
			
			System.out.println(myarraylist.get(i));
			
			
		}
		
		// non generics vs generics 
		
		ArrayList<Integer> myarraylist1 = new ArrayList<Integer>();
		myarraylist1.add(100);
		
		//throws a compile time error when you try to store any other data type value other than the declared type
		// myarraylist1.add("staga");
		
		
		Employee e1 = new Employee("Rakesh", "Male", 32);
		Employee e2 = new Employee("Priya","Female",26);
		Employee e3 = new Employee("Chethan", "Male", 32);
		
		ArrayList<Employee> myEmployees = new ArrayList<Employee>();
		myEmployees.add(e1);
		myEmployees.add(e2);
		myEmployees.add(e3);
		

		//use iterator to traverse through the list
		
		Iterator<Employee> it =  myEmployees.iterator();
		while(it.hasNext()){
			
			Employee tempemployee = it.next();
		    System.out.println(tempemployee.age);
		    System.out.println(tempemployee.gender);
            System.out.println(tempemployee.name);
		    
		}


	}
}
