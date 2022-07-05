package learn2.madhunew;

//Java program to iterate
//LinkedHashMap in reverse order


import java.util.*;
import java.util.Map.Entry;


public class string_check {

	public static void main(String[] args)
	{
		System.out.println("Student Details:");
		
		Map<Integer, String> lhm = new LinkedHashMap<Integer, String>();

		// adding key-value pairs to HashMap object
		lhm.put(5, "Z");
		lhm.put(2, "A");
		lhm.put(3, "X");
		lhm.put(4, "Y");
		lhm.put(1, "B");

		System.out.println("\n\nReverse of Insertion Order:"
						+ " iterating \n");
		
	

		 
          
          
       /*
		Map<Integer, String> reverseSortedMap = new HashMap<>();
        lhm.entrySet()
           .stream()
           .sorted(Map.Entry.comparingByKey(Comparator.reverseOrder()))
           .forEachOrdered(x -> reverseSortedMap.put(x.getKey(), x.getValue()));
         
        System.out.println("Reverse Sorted Map   : " + reverseSortedMap); */
	
		}
	}


