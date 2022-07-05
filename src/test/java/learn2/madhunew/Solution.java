package learn2.madhunew;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;


public class Solution {


    public static void main(String[] args) {
  
    	int  x = 2;
    	int y = 0;
    	for ( ; y<10 ; ++y)
    	{
    		if(y%x==0)
    		  continue;
    		else if(y==8)
    			break;
    		else
    			System.out.println(y);
    	}
    }

}



