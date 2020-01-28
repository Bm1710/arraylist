package coll;


import java.util.*;

public class pro9 {
	
	
	
	public static void main(String[] args) 
    {
        ArrayList<String> list = new ArrayList<>(Arrays.asList("bm", "surya", "teja", "datha"));

        
        Iterator<String> iterator = list.iterator();
        
        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        
        
}
}