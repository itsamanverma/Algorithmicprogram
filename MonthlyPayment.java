/*Write a Util Static Function to calculate monthlyPayment that reads in three
command­line arguments P, Y, and R and calculates the monthly payments you
would have to make over Y years to pay off a P principal loan amount at R per cent
interest compounded monthly. The formula is The formula is
*/
package com.bridgelabz.algorithm;
import java.util.Scanner;
public class MonthlyPayment 
{
  public static void main(String[] args) 
  {
	  
	if(args.length<3)//auto generated command line arguments 
	{
		System.out.println("Enter minimum three arguments:");
	}
	else
	{
		Double principleAmount;
		Double year;
		Double rateOfInterest;
		Double payment;
		
		try 
		{
		  principleAmount = Double.parseDouble(args[0]);
		  year = Double.parseDouble(args[1]);
		  rateOfInterest = Double.parseDouble(args[2]);
		  
		    payment = Utility.monthlyPayment(principleAmount,year,rateOfInterest);
		    System.out.println("given:\n princple Amount = "+principleAmount+"\n Year = "+year+" years "+"\n RateOfIntrest = "+rateOfInterest +"%");
			System.out.format("\nMonthly Payment : %.2f",payment);
		}
		catch(NumberFormatException e)
		{
		   System.out.println("Enter the Three valid Arguments as Inputs:"+e.getMessage());	
		}
	}
  }
}