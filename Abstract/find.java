/*
WAP to implemet abstraction by using abstract class
one abstract class:
1 abstract,1 non abstract
non abstract:Sum of digit

second class:

abstract : Fibonnaci series

third:
Second class: Call both the methods
*/

package Abstraction;

import java.util.Scanner;

public abstract class find{
	
	public abstract void fib_seires();
	
	
	public void sum_of_digits() {

		int res,sum=0;
		int num;
		System.out.println(" enter the numbers:");
		Scanner sc=new Scanner(System.in);
		num=sc.nextInt();
		
		do 
		{
			res=num%10;  
			sum=sum+res;  
			num=num/10;       
		}
		while( num>0);
		System.out.println("The sum of digits is = " + sum);
		
	}
	
		
	
	

}
