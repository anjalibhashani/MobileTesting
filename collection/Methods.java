package collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Queue;
import java.util.Scanner;
import java.util.Set;
import java.util.Stack;
import java.util.Vector;

public class Methods {
         //public static ArrayList a1=null;
         public static ArrayList a1;
         public static LinkedList l1;
         public static Vector v1;
         public static Stack s1;
	   //public static 
       public static void createList(List l) {
    	   if(l instanceof ArrayList)
    	   {
    	       //System.out.println(l instanceof List);
    	       //System.out.println(l);
    	       a1=(ArrayList)l;
    	       System.out.println("List");
    	   }
    	   else if(l instanceof LinkedList) {
    		   l1=(LinkedList)l;
    		   System.out.println("LinkedList");
    	   }
    	   else if(l instanceof Vector){
    		   v1=(Vector)l;
    		   System.out.println("vector");
    	   }
    	   else {
    		   s1=(Stack)l;
    		   System.out.println("stack");		 
    	   }
       }
       public static void addElement(List l){
    	   if(l instanceof ArrayList) {
    	    a1.add("dcg");
    	    a1.add(5);
    	    a1.add(444);
    	    System.out.println(a1.size());
          }else if(l instanceof LinkedList) {
             l1.add("dcfdf");
             l1.add(555);
             l1.add("sd");
             l1.add("dsd");
             System.out.println(l1.size());
          }else if(l instanceof Vector){
    	       v1.add("fdf");
    	       v1.addElement(45);
    	       System.out.println(v1.size());
           }
    	   else{
    		   s1.add("fddfd");
    		   s1.add(145);
    	   }
     }
       public static void getElement(List l) {
    	   if(l instanceof ArrayList) {
    	   ListIterator itr=a1.listIterator();
    	   while(itr.hasNext()) {
    		   System.out.println(itr.next());
    	   }
       }
       
       else if(l instanceof LinkedList) {
    	   ListIterator itr=l1.listIterator();
    	   while(itr.hasNext()) {
    		   System.out.println(itr.next());
    	   }
      } 
       else if(l instanceof Vector){
    	   ListIterator itr=v1.listIterator();
    	   while(itr.hasNext()) {
    		   System.out.println(itr.next());
    	   } 
     }
       else{
    	   ListIterator itr=s1.listIterator();
    	   while(itr.hasNext()) {
    		   System.out.println(itr.next());
    	   } 
        }
 
   }
       public static void removeElement(List l){
    	   System.out.println("Which element you want to delete");
    	   Scanner sc=new Scanner(System.in);
    	   String str=sc.next();
    	   if(l instanceof ArrayList) {
    		   a1.remove(str);
    	   }
    	   else if(l instanceof LinkedList) {
    		   l1.remove(str);
    	   }
    	   else if(l instanceof Vector){
    		   v1.remove(str);
    	   }
    	   else {
    		   s1.remove(str);
    	   }
    	   
       }
   }

