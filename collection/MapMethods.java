package collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class MapMethods {
	public static HashMap hm;
	public static LinkedHashMap lh;
	public static TreeMap tm;
	
	public static void createMap(Map m){
		if(m instanceof HashMap) {
			hm=(HashMap)m;
			System.out.println("HashMap");
		}else if(m instanceof LinkedHashMap) {
			lh=(LinkedHashMap)m;
			System.out.println("LinkedHashMap");
		}else if(m instanceof TreeMap) {
			tm=(TreeMap)m;
			System.out.println("Treemap");
		}
	}
	public static void addElement(Map m) {
		System.out.println("Enter howmany element you want to add");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		if(m instanceof HashMap){
			for(int i=0;i<n;i++){
				System.out.println("Enter key");
				String key=sc.next();
				System.out.println("Enter value");
				String str=sc.next();
			    hm.put(key,str);
			    System.out.println("added");

			}
		}else if(m instanceof LinkedHashMap) {
			for(int i=0;i<n;i++){
				System.out.println("Enter key");
				String key=sc.next();
				System.out.println("Enter value");
				String str=sc.next();
				lh.put(key,str);
				System.out.println("added");
			}
			
		}else if(m instanceof TreeMap){
			for(int i=0;i<n;i++){
				System.out.println("Enter key");
				String key=sc.next();
				System.out.println("Enter value");
				String str=sc.next();
				tm.put(key,str);
				System.out.println("added");
			}
		}
	}
	public static void removeElement(Map m) {
		System.out.println("Enter element you want to delete");
		Scanner sc=new Scanner(System.in);
		int key=sc.nextInt();
		//String str=sc.next();
		if(m instanceof HashMap){
			hm.remove(key);
			System.out.println("Removed");
		}else if(m instanceof LinkedHashMap) {
			lh.remove(key);
			System.out.println("Removed");
		}else if(m instanceof TreeMap){
			tm.remove(key);
			System.out.println("Removed");
		}
		
	}
	public static void iteration(Map m){ 
		 if(m instanceof HashMap) {
			    Set set=hm.entrySet();//Converting to Set so that we can traverse  
			    Iterator itr=set.iterator();  
			 while(itr.hasNext()){  
			        //Converting to Map.Entry so that we can get key and value separately  
			        Map.Entry entry=(Map.Entry)itr.next();  
			        System.out.println(entry.getKey()+" "+entry.getValue());  
			    }  
		 }
		    
	}
	
	
	
}


