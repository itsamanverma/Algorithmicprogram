/*
 Write a static function toBinary that outputs the binary (base 2) representation of
 the decimal number typed as the input. It is based on decomposing the number into
 a sum of powers of 2. For example, the binary representation of 106 is 11010102,
 Page 6 of 16which is the same as saying that 106 = 64 + 32 + 8 + 2. Ensure necessary padding
 to represent 4 Byte String.
 To compute the binary representation of n, we consider the powers of 2 less than or
 equal to n in decreasing order to determine which belong in the binary
 decomposition (and therefore correspond to a 1 bit in the binary representation).
*/
package com.bridgelabz.algorithm;
import java.util.Scanner;
public class toBinary 
{
   public static void main(String[] args) 
   {
	 Scanner sc = new Scanner(System.in);
	 boolean flag=true;
	 String in;
	 System.out.println("Enter the Decimal Number to Convert into binary..!");
	 in=sc.next();
	 while(flag)
	 {
		 if(Utility.isNumber(in))
		 {
			 flag=false;
		 }
		 else
		 {
			 System.out.println("Enter the correct Decimal Number To Covert into binary..!");
			 in=sc.next();
		 }
	 }
	 int dec = Integer.parseInt(in);
	 
	 String str =Utility.toBinary(dec);//to add substring that why converted into string from...
	 int bin = Integer.parseInt(str);
	 System.out.println(bin);
	 
	 int decimal = Utility.binToDec(bin);
	 System.out.println(decimal);
	 
	 if(Utility.power2(decimal)==true)
           System.out.println(decimal+"is power of 2");
	 else
		   System.out.println(decimal+" is not power of 2");
	 
   }
}
