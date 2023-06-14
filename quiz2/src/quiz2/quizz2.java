
package quiz2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class quizz2 {
	
	public static void doSomething(int[] a) {
	    for (int i=0; i<a.length;i++)
	        if(a[i]<a[a.length-1-i]) {
	            a[i]=a[a.length-1-i];
	        }
	}
	
	
	   
	
  public static void main (String []args) {
	 
	  int[][] a = {{-1,1,7,3}, {2,9,5,4}};
	  for (int i=0; i<a.length; i++)
	      doSomething (a[i]);
	  System.out.println(a[0][2]);
	              
  } }
    
		
	  
	                          
  