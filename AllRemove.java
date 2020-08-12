/*
*
*	Convert 	Removing All function
*Using object
*
*
*/
import java.io.*;
import java.util.Map;
import java.util.*;
import java.util.HashMap;
import java.lang.Object;
import java.util.stream.Collectors; 
//import org.apache.commons.lang3.StringUtils;

public class AllRemove{


		public static void main (String []args){
			
			
			List<String> list1= new ArrayList<String>();
			
			
			list1.add("hello");
			list1.add("world");
			
			
			list1.forEach(list-> System.out.println(list));
			
			
			ArrayList<String > list2=new ArrayList<String>();
			
			list2.add("Bye");
			list2.add("JAVA");
			
			list2.forEach(list -> System.out.println( list));
			
			
			list2.removeAll(list1);
			
			list2.forEach(list -> System.out.println(list));
		}
	}
	