
import java.io.*;
import java.util.Map;
import java.util.*;
import java.util.HashMap;
import java.lang.Object;
//import org.apache.commons.lang3.StringUtils;

public class ArrRev {


		public static void main (String []args){
	
							
							int [] arr= {1,1,2,2,3,4,5,5,5,6,7,0,1,3,4,5};
							
							int n=arr.length;
							int j=0;
							//int [] res=new int [len];
							
						for (int i = 0; i < n-1; i++) {
            if (arr[i] != arr[i+1]) 
                arr[j++] = arr[i]; 
						}
        arr[j++] = arr[n-1]; 
       
	 
			   for (int i=0; i<n; i++) 
           System.out.print(arr[i]+" "); 
	 
	 
	}
}
	
							