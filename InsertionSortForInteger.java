/*insertionSort method for integer*/
package com.bridgelabz.program;

import java.util.Scanner;

public class InsertionSortForInteger 
{
   public static void main(String[] args) 
   {
	 //create the Scanner Object to take The User Inputs
	   Scanner sc = new Scanner(System.in);
	   System.out.println("Enter the Size of Array");
	   int n= sc.nextInt();
	   //Declaration & Allocation Of Array..
	   int ar[]=new int[n];
	   System.out.println("Read the Elements of Array:");
	   for(int i=0;i<ar.length;i++)
	   {
		   ar[i]=sc.nextInt();
	   }
	   System.out.println("Enter the Elements of Array..");
	   for(int i=0;i<ar.length;i++)
	   {
		   System.out.print(ar[i]+" ");
	   }
	   Utility u = new Utility();
	   u.insertionSort(ar);
   }
}
