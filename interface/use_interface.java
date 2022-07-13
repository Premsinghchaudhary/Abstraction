package Abstraction;

import java.util.Scanner;

public class use_interface implements A_interface,B_interface{
	int i,size,min;
	Scanner sc=new Scanner(System.in);
	
	@Override
	public void smallest_no() {
		System.out.println( " calculate the smallest number");
		System.out.print( " enter the size of array:");
		
		size=sc.nextInt();		
		System.out.println("enter the numbers:");
		int []arr=new int[size];
		for(  i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		
		  min = arr[0];
         for ( i = 0; i < arr.length; i++)
         {
                if (arr[i]< min)
                 min = arr[i];
         }
         System.out.println("The smallest number is :  "+min);
		
	}

	@Override
	public void reverse_of_digits() {
        int n,rev=0,rem;//rem = remainder,rev=reverse... 
        System.out.println( " REVERSE THE NUMBER");
		System.out.print("Enter the digits:");//get the digits from user.....
         n=sc.nextInt();
         while(n != 0)   
 		{  
 		 rem = n % 10;  
 		rev = rev * 10 + rem;  
 		n = n/10;  
 		}  
         System.out.println("The reverse to digits is:"+rev);
         
		
	}
	public static void main(String args[]) {
		
		use_interface obj=new use_interface();
		obj.smallest_no();
		obj.reverse_of_digits();
		
	}
	

}
