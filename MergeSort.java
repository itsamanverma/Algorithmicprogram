/* Merge Sort­Write a program with Static Functions to do Merge Sort of list of Strings.
 a. Logic­>To Merge Sort an array,we divide it into two halves,
 sort the two halves independently,and then merge the results to sort the full array.
 To sort a[lo,hi],we use the following recursive strategy:
 b.Base case:If the subarray  length is 0 or 1,it is already sorted.
 c.Reduction step:Otherwise,compute mid=lo+(hi­lo)/2,recursively sort the two subarrays a[lo,mid] and a[mid,hi],
 and merge them to produce a sorted result.*/ 
package com.bridgelabz.program;
import java.util.Scanner;
public class MergeSort 
{
public static void main(String[] args) 
  {
	 Scanner sc = new Scanner(System.in);
	 boolean flag=true;
     String input;//make the stake input validate format
     System.out.println("Enter the size of array");
	  input=sc.next();
	  while(flag)
	  {
		 if(Utility.isNumber(input)) 
		 {
			flag=false;
		 }else 
		 {
			System.out.println("Enter the correct type size of array:");
			input=sc.next();
		 }
	  }
     int n=Integer.parseInt(input);
	 //int n = sc.nextInt();
	 int ar[]=new int[n];
	 System.out.println("Read the Elements of Array");
	 for(int i=0;i<ar.length;i++)
	 {   
		 boolean flag1=true; 
		 String input1;
		 input1=sc.next();
	      while(flag1)
	      {
	    	  if(Utility.isNumber(input1))
	    	  {
	    		  flag1=false;
	    	  }
	    	  else
	    	  {
	    		  System.out.println("Read the correct Type Of Elements of Array..!");
	    		  input1=sc.next();
	    	  }
	      }
	       ar[i]=Integer.parseInt(input1);
		 //ar[i]=sc.nextInt();
	 }
	 System.out.println("Enter the Elements of Array");
	 for(int i=0;i<ar.length;i++)
	 {
	
		 System.out.print(ar[i]+" ");
	 }  
	 Utility.mergeSort(ar,0,ar.length-1);
	 System.out.println();
	 System.out.println("Sorted Array:");
	 for(int i=0;i<ar.length;i++)
	 {
		 System.out.print(ar[i]+" ");
	 }  
	 
  }
}
