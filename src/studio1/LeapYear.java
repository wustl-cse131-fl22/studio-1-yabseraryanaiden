package studio1;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		Scanner in = new Scanner(System.in); 
		System.out.println("Enter a year "); 
		int n1 = in.nextInt();
		
		int Rem_1 = n1 % 4 ;
		boolean div_4 = Rem_1 == 0;  
		
		
		int Rem_2 = n1 % 100 ; 
		
	    int Rem_3 = n1 % 400 ;  
	    
		boolean div_100 = Rem_2  == 0 ;  
		
		
		boolean div_400 = Rem_3 == 0; 
		
		 
		boolean Answer = div_4 && !div_100 || div_400 ;  
		System.out.println(n1 + " is a leap year: "+Answer);
		
		
	}

}
