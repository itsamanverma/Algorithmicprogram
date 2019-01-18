/*An Anagram Detection Example
a.Desc ­> One string is an anagram of another if the second is simply a
rearrangement of the first. For example, 'heart' and 'earth' are anagrams...
b. I/P ­> Take 2 Strings as Input such abcd and dcba and Check for Anagrams
c. O/P ­> The Two Strings are Anagram or not....*/
package com.bridgelabz.program;
import java.util.Scanner;
public class Anagram 
{
public static void main(String[] args) 
  {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the First String inputs...");
	String st1=sc.next();
	System.out.println("Enter the Second String Inputs..");
	String st2=sc.next();
	Utility u = new Utility();
	boolean rs=u.isAnagram(st1,st2);
	if(rs)
		System.out.println("String are Anagram");
	else
		System.out.println("String not Anagram");
  }
} 
