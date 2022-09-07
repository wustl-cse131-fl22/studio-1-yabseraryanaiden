package studio1;

import java.util.Scanner;

public class HiOne {

	/**
	 * Says hello to the supplied argument
	 */
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		System.out.print("Enter value for arg 0: ");
		String name = in.nextLine(); 
		System.out.println("Hi, "+ name + ". How are you?" ); 
		
		//
		// Below this line, enter code PAso that this program's output says
		//      Hi, Pat.  How are you?
		// if the value of name is "Pat"
		//

	}

}
