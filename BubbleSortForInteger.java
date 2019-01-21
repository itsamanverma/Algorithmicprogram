/*Bubble Sort for Integer..*/
package com.bridgelabz.program;
import java.util.Scanner;
public class BubbleSortForInteger 
{
  public static void main(String[] args) 
  {
	Scanner sc = new Scanner(System.in);//create the scanner class object to take user inputs
	System.out.println("Enter the size of Array");
	int n = sc.nextInt();
	int ar[]=new int[n];
	
	System.out.println("Read the Elements of Array..!");
	for(int i=0;i<ar.length;i++)
	{
		ar[i]=sc.nextInt();
	}
	
	System.out.println("Enter the Elements of Array..!");
	for(int i=0;i<ar.length;i++)
	{
		System.out.print(ar[i]+" ");
	}
	
	Utility.bubbleSorting(ar);
  }
}
