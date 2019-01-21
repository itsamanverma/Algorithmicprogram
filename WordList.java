/*6. Binary Search the Word from Word List
a. Desc ­> Read in a list of words from File. Then prompt the user to enter a word to
search the list. The program reports if the search word is found in the list.
b. I/P ­> read in the list words comma separated from a File and then enter the word
to be searched
c. Logic ­> Use Arrays to sort the word list and then do the binary search
d. O/P ­> Print the result if the word is found or not*/
package com.bridgelabz.algorithm;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class WordList {

	public static void main(String[] args) {
		String[] wordList;
		String line ="";
		String word;
		int res;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Path where file available..!!");
//		 boolean flag=true;
//	      String input;//make the stake input validate format
//	      System.out.println("Enter the Stake amount:");
//		  input=sc.next();
//		  while(flag)
//		  {
//			 if(Utility.isNumber(input)) 
//			 {
//				flag=false;
//			 }else 
//			 {
//				System.out.println("Enter the correct Stake amount:");
//				input=sc.next();
//			 }
//		  }
//	      String path=input;
		String path =sc.next();

		try(BufferedReader br = new BufferedReader(new FileReader(path)))
		{
			String temp = null;
			while((temp = br.readLine())!= null)
			{
				line = line+ temp;
			}
			wordList = line.split(",");
			Arrays.sort(wordList);
			System.out.println("listed Words:");
			Utility.printStringArray(wordList);
			do {
				System.out.println("\nEnter the key...!");
				word = Utility.getString();
			}while(word.trim().equals("") || word == null);

			res = Utility.binarySearch(wordList, word);
			if(res >= 0)
				System.out.println("word '"+ word+"' found at position "+res);
			else
				System.out.println("word '"+word+"' not found...!");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	
	}

}