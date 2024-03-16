package java;

import java.util.Collections;
import java.util.List;

public class Findminandmaxvalues {

	public static void miniMaxSum(List<Integer> arr) {
	    // Write your code here
		long maxCount=0;
        long  minCount=0;
        Collections.sort(arr);
        
        
        for(int i=0;i<arr.size()-1;i++)
        {
            minCount=(long)minCount+arr.get(i);
        }
        for(int j=arr.size()-1;j>0;j--)
        {
             maxCount=(long)(maxCount+arr.get(j));
        }
         System.out.println(minCount + " " + maxCount);   
       
   }

	
	Set<Integer> st= new HashSet<Integer>(candles);
    for (Integer s:st)
     System.out.println(Collections.frequency(candles,s));
    

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		1 2 3 4 5 Need an long output 
//		10 14
		
		

	}

}
