package coll;
import java.util.*;
public class pro5 {
	
	public static void main(String[] args) 
    {
        ArrayList<String> list = new ArrayList<>(2);
         
        list.add("BM");
        list.add("Surya");
         
        System.out.println(list);
         
        list.ensureCapacity(20);
         
        list.add("Teja");
        list.add("Mani");
        list.add("Datha");
 
        System.out.println(list);
    }
}
