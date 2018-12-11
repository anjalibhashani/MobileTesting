package collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Vector;

public class CallerPrg {
    public static void main(String[] args) {
    	   System.out.println("List created");
    	 
		  
		   System.out.println("Enter the list you want to create object");
  	     //  Scanner sc=new Scanner(System.in);
		 //  String  str=sc.next();
		   Methods.createList(new ArrayList());
		// Methods.createList(new LinkedList());
		// System.out.println("You want to add in which list");
		// Scanner sc=new Scanner(System.in);
		// String  str=sc.next();
		 //System.out.println(str+"==");
		// System.out.println("Add Elements");
		
	     Methods.addElement(new ArrayList());
	     
	     //Methods.di();
	     
	     Methods.getElement(new ArrayList());
	     
	     Methods.removeElement(new ArrayList());
	     
	}
}
