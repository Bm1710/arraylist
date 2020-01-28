package coll;
import java.util.*;
public class pro11 {

	 public static void main(String[] args) 
	    {
	
		 ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
		 
	        numbers.removeIf( number -> number%2 == 0 );
	         
	        System.out.println(numbers);
	    }
		 
		 
		 
	

}