package coll;
import java.util.*;
public class pro2 {
	public static void main(String[] args)
	{
		 ArrayList<String> list1 = new ArrayList<>();  
         
	        list1.add("A");
	        list1.add("B");
	        list1.add("C");
	        list1.add("D");
	         
	        ArrayList<String> list2 = new ArrayList<>();  
	         
	        list2.add("E");
	         
	        list1.addAll(list2);
	         
	        System.out.println(list1);     
	    }
	

}
