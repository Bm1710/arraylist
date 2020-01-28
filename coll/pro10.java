package coll;
import java.util.*;
public class pro10 {

	 public static void main(String[] args) throws CloneNotSupportedException 
	    {
	        ArrayList<String> alphabets = new ArrayList<>(Arrays.asList("bm", "surya", "teja", "datha"));
	         
	        System.out.println(alphabets);
	         
	        alphabets.removeAll(Collections.singleton("bm"));
	         
	        System.out.println(alphabets);
	    }
	
	
}
