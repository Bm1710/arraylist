package coll;
import java.util.*;
public class pro12 {


	public static void main(String[] args) throws CloneNotSupportedException 
    {
        ArrayList<String> alphabets = new ArrayList<>(Arrays.asList("A", "B", "A", "D", "A"));
         
        System.out.println(alphabets);
         
        alphabets.retainAll(Collections.singleton("A"));
         
        System.out.println(alphabets);
    }
		 
		 

}