/*insertionSort method for integer*/
package com.bridgelabz.program;

import java.util.Scanner;

public class InsertionSortForInteger 
{
   public static void main(String[] args) 
   {
	      //create the Scanner Object to take The User Inputs
	      Scanner sc = new Scanner(System.in);
//	      System.out.println("Enter the Size of Array");
//	      int n= sc.nextInt();
	      boolean flag=true;
	      String input;
	      System.out.println("Enter the Size of Array:");
		  input=sc.next();
		  while(flag)
		  {
			 if(Utility.isNumber(input)) 
			 {
				flag=false;
			 }else 
			 {
				System.out.println("Enter the valid type..!:");
				input=sc.next();
			 }
		  }
	      int n=Integer.parseInt(input);
	      int ar[]=new int[n]; //Declaration & Allocation Of Array..
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
	      
	      Utility.insertionSort(ar);
   }
}
