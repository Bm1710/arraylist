package coll;
import java.util.*;
public class pro8 {
	
	
	
	public static void main(String[] args) 
    {
        ArrayList<String> list = new ArrayList<>(Arrays.asList("bm","datha", "surya", "teja", "datha"));
        
        int lastIndex = list.lastIndexOf("datha");
        
        System.out.println(lastIndex);

        lastIndex = list.lastIndexOf("bala");
        
        System.out.println(lastIndex);
    }
	

}
