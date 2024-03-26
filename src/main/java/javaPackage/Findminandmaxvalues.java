package javaPackage;

import java.util.Collections;
import java.util.List;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class Findminandmaxvalues {

	public static void miniMaxSum(List<Integer> arr) {
	    // Write your code here
		long maxCount=0;
        long  minCount=0;
        Collections.sort(arr);
        
        
        for(int i=0;i<arr.size()-1;i++)   {
            minCount=(long)minCount+arr.get(i);
        }
        for(int j=arr.size()-1;j>0;j--) {
             maxCount=(long)(maxCount+arr.get(j));
        }
         System.out.println(minCount + " " + maxCount);   
         
         
       
   }

	
//	Set<Integer> st= new HashSet<Integer>(candles);
//    for (Integer s:st)
//     System.out.println(Collections.frequency(candles,s));
//    
	public static String timeFormat(String s)
	{
	int hour = Integer.parseInt(s.substring(0, 2)) % 12;
    if (s.endsWith("PM"))
        hour += 12;
    return String.format("%02d", hour) + s.substring(2, 8);
	}
	
	public static void percentWork(String s)
	{
		int hour =1;
		 int hourconver=10%12;
		 System.out.println(hourconver);
		
		for(int i=0; i<10;i++)
		{
			String form = "%" + i + "d";
			System.out.println(String.format(form, hour));	}
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		1 2 3 4 5 Need an long output 
//		10 14
		
		System.out.println(timeFormat("11:07:23AM"));
		percentWork("11");
	}

}
