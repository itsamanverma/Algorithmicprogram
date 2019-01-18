package com.bridgelabz.program;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
 
/**
 * @author amanverma
 */
/******************************************************************************************************/
public class Utility 
{
	
	BufferedReader br;
	public Utility()//Create the Constructor to Provide Runtime Input
	{ 
		br=new BufferedReader(new InputStreamReader(System.in));
	}
	/**
	 *take the user  string input
	 * @return string	
	 */
	/******************************************************************************************************/
	public String inputString() 
	{ 
		try
		{
		  return br.readLine();	
		}catch( Exception e)
		{
			System.out.println(e);
		}
		return"";
	}
	/**
	 * take the user Input Integer
	 * @return Integer
	 */
	/******************************************************************************************************/
	public int inputInteger() 
	{
		 try 
		 {
			return Integer.parseInt(br.readLine()); 
		 }catch(Exception e)
		 {
			 System.out.println(e);
		 }
		return 0;//Create the method To Calculate the triples
	}
	/**
	 * takes the user Inputs double
	 * @return 
	 * @return double
	 */
	 public double inputDouble()
		{
			try 
			{ 
			  return Double.parseDouble(br.readLine());	
			}catch(Exception e)
			{	
				System.out.println(e);
			}
			return 0.0;
		}
	    
	//Create the Method To Calculate the Power Of Any Number//
	public void table(int n) 
	{
		System.out.println("Here the your table, you want");
		for(int i=1;i<=10;i++)
		{   
			System.out.println(n+"*"+i+"="+n*i);
		}
		
	}
	//create the method To Calculate  the Triples OF Integer;
	public void triples(int[] ar) 
	{
		for(int i=1;i<ar.length-2;i++)
			 {
				for(int j=i+1;j<ar.length-1;j++)
				{
					for(int k=i+2;k<ar.length;k++)  
					{
						if(ar[i]+ar[j]+ar[k]==0)
						{
							System.out.print("The triple integer:"+ar[i]+" "+ar[j]+" "+ar[k]);
						}
						System.out.println();
					}
				}
			 }	
   	}
	/**
	 * Create the Method To Check String is Anagram Or Not
	 * @param st1
	 * @param st2
	 * @return boolean
	 */
	public boolean isAnagram(String st1, String st2) 
	{
		int c1[]=countOccurance(st1);
		int c2[]=countOccurance(st2);
		for(int i=0;i<c2.length;i++)
		{
			if(c1[i]!=c2[i])
				return false;
		}
		return true;
	}
	
	//Create the Method To Count the Occurances OF Character//
	private int[] countOccurance(String st) 
	{
		int c[]= new int[26];
		for(int i=0;i<st.length();i++)
		{
			char ch=st.charAt(i);
			if(ch>=65 && ch<=90)
				c[ch-65]++;		
			if(ch>=97 && ch<=122)
				c[ch-97]++;
		}
		return c;
	}
	//create the method to find the possible permutation//
   public void permute(String st, int l, int r) 
   {
	if(l==r) 
	System.out.println(st);
	else
	  {
		for(int i=l;i<=r;i++)
		{	
			st=swap(st,l,i);
			permute(st,l+1,r);
			st=swap(st,l,i);
		}
	  }		
   }
	//Create the Method of Swap//
	private String swap(String st, int l, int i) 
	{
		char temp;
		char[] chArr=st.toCharArray();
		temp=chArr[l];
		chArr[l]=chArr[i];
		chArr[i]=temp;
		return String.valueOf(chArr);
		
	}
	/**
	 * create the method for BinarySearch Algorithm
	 * @param str shows the array of String type
	 * @param st shows the particular string which user search
	 * @return index value of that particular string which nothing but integer value 
	 */
	public static int binarySearch(String[] str, String st) 
	{
		int l=0,r=str.length-1;
		while(l<=r)
		{                 // a,b,c,d
			int mid=l+(r-1)/2;
			int res=st.compareToIgnoreCase(str[mid]);
			if(res==0)
				return mid;
			if(res>0)
				l=mid+1;	
			else
				r=mid-1;	
		}
		return -1;	 
	}
	/**
	 * create the method for Insertion sorting Algorithm
	 * @param ch shows the array of Char type 
	 */
	public void insertionSort(char[] ch) 
	{
		for(int i=1;i<ch.length-1;i++)
		{		
			char ch1=ch[i];
			int j=i-1;
			while(j>=0 && ch1<ch[j])
			{
				ch[j+1]=ch[j];
				j--;
			}
			ch[j+1]=ch1;
	   	}
		System.out.println();
		System.out.println("String After the Insertion sort : ");
		for(int i=0;i<ch.length;i++)
		{
			System.out.print(ch[i]+" ");
		}
	}
	/**
	 * create the method for Insertion sorting Algorithm
	 * @param ar shows the array of Integer type 
	 */
	public void insertionSort(int[] ar) 
	{
		for(int i=1;i<ar.length-1;i++)
		{
			int ele=ar[i];
			int j=i-1;
			while( j>=0 && ele<ar[j])	
			{
				ar[j+1]=ar[j];
				j--;		
			}
			ar[j+1]=ele;
		}
		System.out.println();
		System.out.println("Array After the Insertion Sort:");
		for(int i=0;i<ar.length;i++)
		{
			System.out.print(ar[i]+" ");
		}
		
	}
	/**
	 * create the method for bubble sorting Algorithm
	 * @param ar shows the array of Integer type 
	 */
	public static void bubbleSorting(int[] ar) 
	{
		for(int i=0;i<ar.length-1;i++)
		{
			for(int j=i+1;j<ar.length;j++ )
			{
				if(ar[i]>ar[j])
				{
					int t=ar				[i];
					ar[i]=ar[j];
					ar[j]=t;
				}
			}
		}	
		System.out.println();
		System.out.println("Array after the Down Bubble Sort");
		for(int i=0;i<ar.length;i++)
		{
		System.out.print(ar[i]+" ");
		}
		
	}
	/**
	 * create the method for bubble sorting Algorithm
	 * @param ch shows the array of char type 
	 */
	public void bubbleDownSorting(char[] ch)
   {
		for(int i=0;i<ch.length-1;i++)
		{
			for(int j=i+1;j<ch.length;j++ )
			{
				if(ch[i]>ch[j])
				{
					char t=ch[i];
					ch[i]=ch[j];
					ch[j]=t;
				}
			}
		} 
		System.out.println();
		System.out.println("Array after the Bubble Sort");
		for(int i=0;i<ch.length;i++)
		{
		System.out.print(ch[i]+" ");
		}
		
	}
	
	/**
	 * create the method to count the notes according to money enter by user
	 * @param st shows starting range of number
	 * @param end shows the ending range of number
	 * @return list<Integer> of prime number
	 */
	public static List<Integer> isPrime(int st, int end) 
	{
	     List<Integer> list = new ArrayList<Integer>();
	     int flag=0;
	     for(int i=st;i<=end;i++) 
	     {
	    	 for(int j=2;j<=st;j++)
	    	 {
	    		 if(i%j==0)
	    		 {
	    			 flag=0;
	    			 break;					
	    		 }
	    		 else
	    		 {
	    			 flag=1;		
	    		 }
	    	 if(flag==1)
	    	 {
	    		 list.add(i);
	    	 }
	     }
	 }
		return list;
	}
	
	/**
	 * create the method to check the number is prime or not
	 * @param i show the number enter by user
	 */
	public boolean isPrime(int i) 
	{
		int r=2;
		while(r<i/2)
		{
			if(i%r==0)
				return false;
		}
		return true;		
	}		
	/**
	 * create the method to count the notes according to money enter by user
	 * @param rupees shows money enter by user
	 */
	public static void countNotes(int rupees)  
	{											
 int ar[]= {1000,500,100,50,10,5,2,1};
		 int notes=0;	
		 for(int i=0;i<ar.length;i++)
		 {	
			 if(rupees/ar[i]>0)
			 {
				 System.out.println("No of Notes"+ar[i]+"is"+rupees/ar[i]);
				 notes=notes+rupees/ar[i];
				 rupees=rupees%ar[i];
			 }
		 }
		 System.out.println(" minimum number of Notes requires is"+notes);
		
	}
	/**
	 * create  the method to binary search for Integer
	 * @param ar shows the Array of Integer Taken by User
	 * @param low shows the zeroth index element of the Array 
	 * @param high  shows the last elements of The array 
	 * @param ele shows the Particular elements which we search 
	 * @return the index of the elements which we search
	 */
	
	public static int binarySearch(int[] ar, int low, int high, int ele) 
	{
		if(low>high)
           return -1;
		int mid =(low+high)/2;
		if(ar[mid]==ele)
			return mid;
		if(ar[mid]<ele)
			return binarySearch(ar,mid+1,high,ele);
		else
			return binarySearch(ar,low,mid-1,ele);
	}
	/**
	 * create  the method to generate the random coupon No
	 * @param noOfCoupon shows the No of Coupons required by users 
	 * @param random shows the random generate numbers
	 * @param countCoupons shows that the random coupon 
	 * @param ele shows the Particular elements which we search 
	 * @return the index of the elements which we search
	 */
	public static void coupon() 
	{
		Scanner sc = new Scanner(System.in); 
		System.out.println("Enter the No of Coupon u want to genrate..!");
		int noOfCoupon=sc.nextInt();
		int random,countCoupons,countTotal=0;
		int coupons[]=new int[noOfCoupon];
		int ar[]=new int[noOfCoupon];
		for(int i=0;i<noOfCoupon;i++)
		{
			coupons[i]=(int)(Math.random()*(noOfCoupon+1));
			System.out.print(coupons[i]+" ");		
		}
		for(countCoupons=0;countCoupons<noOfCoupon;countTotal++)
		{
			random=(int)(Math.random()*(noOfCoupon+1));
			for(int i=0;i<noOfCoupon;i++)
			{
				if(coupons[i]==random && ar[i]==0)
				{
					ar[i]=1;
					countCoupons++;
				}
			}
		}
     	System.out.println("the no of times tired to get all the coupons is"+countTotal);
	}
	/**
	 * create  the method to check the Value at position
	 * @param tac shows 2D array in which comp or user enter the value 
	 * @param index shows that random position on the matrix
	 * @return the integer value at particular position
	 */
	public static int valueAtPosition(int[][] tac, int index) 
	{
		switch(index)
		{
		case 1:
			return tac[0][0];
		case 2:
			return tac[0][1];
		case 3:
			return tac[0][2];
		case 4:
			return tac[1][0];
		case 5:
			return tac[1][1];
		case 6:
			return tac[1][2];
		case 7:
			return tac[2][0];
		case 8:
			return tac[2][1];
		case 9:
			return tac[2][2];
		default:
			return 1;
		}
	}
	/**
	 * create  the method to enter the value at position by computer
	 * @param tac shows 2D array in which computer or user enter the value
	 * @param index shows the random position in the matrix
	 * @param num show that it comp chance or user chance 
	 * @return the 2D matrix with enter value on the positions
	 */
	public static int[][] enter(int[][] tac, int index, int num) 
	{
		switch(index)
		{
		case 1:
			tac[0][0]=num;
			return tac;

		case 2:
			tac[0][1]=num;
			return tac;

		case 3:
			tac[0][2]=num;
			return tac;

		case 4:
			tac[1][0]=num;
			return tac;

		case 5:
			tac[1][1]=num;
			return tac;

		case 6:
			tac[1][2]=num;
			return tac;

		case 7:
			tac[2][0]=num;
			return tac;

		case 8:
			tac[2][1]=num;
			return tac;

		case 9:
			tac[2][2]=num;
			return tac;
		}
		return tac;
	}
	/**
	 * create  the method to check that who won comp or user
	 * @param tac shows 2D array in which computer or user enter the value
	 * @param val show that it comp chance or user chance 
	 * @return the integer value which is show the comp won or user
	 */
	public static int checkIfWon(int[][] ar, int val) 
	{
	   int flag=0;
	   
	   if((ar[0][0]==val && (ar[0][1]==val && ar[0][2]==val) ||(ar[1][0]==val && ar[2][0]==val) || (ar[1][1]==val && ar[2][2]==val)))
		   flag=1;
	   else if((ar[2][2]==val && (ar[1][2]==val && ar[0][2]==val) ||(ar[2][1]==val && ar[2][0]==val)))
		   flag=1;
	   else if(ar[2][0]==val && ar[1][1]==val && ar[0][2]==val)
		   flag=1;
	   else if((ar[0][1]==val && ar[1][1]==val && ar[2][1]==val) || (ar[1][0]==val && ar[1][1]==val && ar[1][2]==val))
		   flag=1;
	   
	       return flag;
	}
	/**
	 * create  the method named as printGame who's show that the condition of won or loose  
	 * @param tac shows 2D array in which computer or user enter the value
	 */
	public static void printGame(int[][] tac) 
	{
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				if(tac[i][j]==0)
					System.out.print("X");
				else if(tac[i][j]==1)
					System.out.print("O");
				else
					System.out.print("-");
			}
			System.out.println();
		}
	}
	/**
	 * create  the method named as checkIfEnd who's shows that in these situation who is win comp or user
	 * @param tac shows 2D array in which computer or user enter the value
	 * @return 
	 */
	public static int checkIfEnd(int[][] tac) 
	{
		int i,j,won=1;
		
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
				if(tac[i][j]==0 || tac[i][j]==1)
				continue;
				else
				won=0;
			}
		}
		if(won==1)
			System.out.println("Game Over..!");
		return won;
	}
	
	/**
	 * create the method named gambler who start with $stake and place fair $1 bets until he/she goes broke or reach $goal  
	 * @param stake shows initial money at gambler
	 * @param goal shows if they achieve the target than gambler win
	 * @param games shows the no of games play to achieve the target or gaol.
	 */
	
	public static void gambler(int stake, int goal , int games)
	{
		int counter=0,win=0,bets=0;
		float n;
		while(counter<games && (stake>0 && stake<goal) ) {
			bets++;
			n=(float) Math.random();
			if(n>0.5) {
				stake++;
				win++;
				System.out.println(n+" win ");
			}
			else {
				stake--;
				
				System.out.println(n+" loss ");

			}
			counter++;
		}
		System.out.println("The number of wins are: "+win+", percentage of wins: "+(win*100/(bets)+", bets: "+bets));			
	}
}
