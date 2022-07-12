package Abstraction;

public class fib extends find {
	
	


	@Override
	public void fib_seires() {

		 int i,n=0,n1=1,n2,c=10; //declared the variable
   	  System.out.println("n = "+n); //print the value of n
   	  System.out.println("n1 = "+n1);//print the value of n1
   	  
   	  for( i=2;i<c;i++) //using for loop 
       {
   		  n2=n+n1; //sense of human
   		  System.out.println("n2 = "+n2);//print the value of n2  
   		  n=n1;
   		  n1=n2;
   		  System.out.println ( );
   		  }
 	   
     }	
	}


