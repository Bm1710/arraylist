package coll;
import java.util.*;
public class pro7 {
	 public static void main(String[] args) 
	    {
	        ArrayList<String> list = new ArrayList<>(Arrays.asList("bm", "surya", "teja", "datha"));
	        
	        int firstIndex = list.indexOf("teja");
	        
	        System.out.println(firstIndex);
	        
	        firstIndex = list.indexOf("bala");
	        
	        System.out.println(firstIndex);
	    }
}
