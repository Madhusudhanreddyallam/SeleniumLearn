package learn2.madhunew;

import java.util.ArrayList;

public class test_complex {
	
	 public static void main(String[] args)
	 {
		  int a = 123;    
		 
		 String s = String.valueOf(a);		 
		 
		ArrayList<Integer> I = new ArrayList<Integer>();
		 
		I.add(Integer.valueOf(s));
	 }	

	    public static void string() {
	        String blogName = "JavaBlog";
	        char two ='2';
	        String cblogName = addCharToString(blogName,two,4);
	        System.out.println(cblogName);
	    }
	 
	    public static String addCharToString(String str, char c, int pos) {
	        StringBuilder stringBuilder = new StringBuilder(str);
	        stringBuilder.insert(pos, c);
	        return stringBuilder.toString();
	    }
		  
	 

}
