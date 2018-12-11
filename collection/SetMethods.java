package collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class SetMethods {
	public static LinkedHashSet h1;
	public static HashSet hs;
	public static TreeSet ts;
	public static void CreateSet(Set s) {
		if(s instanceof LinkedHashSet) {
			h1=(LinkedHashSet)s;  
			System.out.println("LinkedHashSet");
		}else if(s instanceof HashSet) {
			hs=(HashSet)s;
			System.out.println("HashSet");
		}else if(s instanceof TreeSet) {
			ts=(TreeSet)s;
			System.out.println("TreeSet");
		}
	}
	public static void addElementSet(Set s) {
		System.out.println("Howmany Element you want to enter");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		if(s instanceof LinkedHashSet) {   
			for(int i=0;i<n;i++) {
				System.out.println("Enter element");
				String str=sc.next();
				h1.add(str);	
			}
		}else if(s instanceof HashSet) {
			for(int i=0;i<n;i++) {
				System.out.println("Enter element");
				String str=sc.next();
				hs.add(str);
			}
		}else if(s instanceof TreeSet) {
			for(int i=0;i<n;i++) {
				System.out.println("Enter element");
				String str=sc.next();
				ts.add(str);
			}
		}
	}
	public static void retrieve(Set s){
		if(s instanceof LinkedHashSet) {
			Iterator itr=h1.iterator();
			while(itr.hasNext()) {
				System.out.println(itr.next());
			}  
		}
		else if(s instanceof HashSet) {
			Iterator itr=hs.iterator();
			while(itr.hasNext()) {
				System.out.println(itr.next());
			} 
		}
		else if(s instanceof TreeSet) {
			Iterator itr=ts.iterator();
			while(itr.hasNext()) {
				System.out.println(itr.next());
			}
		}
	}
	public static void removeElement(Set s) {
		System.out.println("Howmany Element you want to enter");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		if(s instanceof LinkedHashSet) {
			for(int i=0;i<n;i++) {
				System.out.println("Enter element");
				String str=sc.next();
				h1.remove(str);	
			}
		}else if(s instanceof HashSet) {
			for(int i=0;i<n;i++) {
				System.out.println("Enter element");
				String str=sc.next();
				hs.remove(str);	
			}
		}else if(s instanceof TreeSet) {
			for(int i=0;i<n;i++) {
				System.out.println("Enter element");
				String str=sc.next();
				ts.remove(str);	
			}
		}
	}
}



