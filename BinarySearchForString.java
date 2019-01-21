/*binarySearch method for String*/
package com.bridgelabz.program;
import java.util.Scanner;
public class BinarySearchForString
{
	  public static void main(String[] args) throws InterruptedException
	  {
		long startTimer=0;
		long stopTimer=0;
		long elapsed; 
		
		SimulateStopwatch sw=new SimulateStopwatch();//creating the instance of SimulateStopwatch to access the Property 
		
		Scanner sc = new Scanner(System.in);//create the Scanner class to take User input
		System.out.println("Enter the size of String Array");
		int n =sc.nextInt();//user gives the size of array.. 
		
		String str[]=new String[n];//Declaration & Allocation of Array;
		System.out.println("Reading the String Array Elements:");//Read the String from User input
		for(int i=0;i<str.length;i++)
		{
			str[i]=sc.next();
		}
	   
		System.out.println("Enter the String Array Elements:");
        for(int i=0;i<str.length;i++)
		{
			System.out.print(str[i]+" ");
		}
        System.out.println();
		
		System.out.println("Enter the String to be Search");
		String st=sc.next();
		
		startTimer=System.currentTimeMillis();
		System.out.println(startTimer);
		
		int index=Utility.binarySearch(str,st);//call the method binarySearch
		Thread.sleep(10);
		
		stopTimer= System.currentTimeMillis();
		System.out.println(stopTimer);
		elapsed = stopTimer - startTimer;
		System.out.println("Elapsed time : "+elapsed);
		
		if(index==-1)
			System.out.println("Element not present");
		else
			System.out.println("Element found at"+" index: "+index);
  }
}

