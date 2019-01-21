package com.bridgelabz.program;
import java.util.Scanner;
public class BubbleSortForString 
{
  public static void main(String[] args) 
  {
	    Scanner sc = new Scanner(System.in);//create the scanner class object to take user inputs
		System.out.println("Enter the String");
		String str=sc.next();//read the user string
		char ch[]=str.toCharArray();//convert the string into char type array
		System.out.println("Enter the Element of The Array");
		for(int i=0;i<ch.length;i++)
		{
			System.out.print(ch[i]+"  ");
		}  
		Utility u = new Utility();
		  u.bubbleDownSorting(ch);
	    }
}
