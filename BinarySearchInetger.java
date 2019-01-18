/*binarySearch method for integer*/
package com.bridgelabz.program;
import java.util.Scanner;
public class BinarySearchInetger
{
public static void main(String[] args)
  {
	//create the Scanner class object to take user inputs.
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the Size of Array..!");
	int n= sc.nextInt();
	int ar[]=new int[n];
	System.out.println("Read the Elements of Array..!");
	for(int i=0;i<ar.length;i++)
	{
		ar[i]=sc.nextInt();
	}
	System.out.println("Enter the Elements of Arrays..!");
	for(int i=0;i<ar.length;i++)
	{
		System.out.print(ar[i]+" ");
	}
	System.out.println();
	System.out.println("Enter the ELement To Search..!");
	int ele=sc.nextInt();
	int in=Utility.binarySearch(ar,0,ar.length-1,ele);
	if(in>=0)
		System.out.println("Index of elements:"+ in);
	else
		System.out.println("Elements is Not Found");
  }
}
