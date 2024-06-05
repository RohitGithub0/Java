package Uncodemy;

import java.io.IOException;

public class Class26 {

	public static void main(String[] args) throws IOException  {
		char ch; 
		for( ; ; ) {
			System.out.println("This is text statement");
			ch= 'a';
			ch = (char) System.in.read(); // get a char 
			if(ch == 'q') 
			break;
			}
			System.out.println("You pressed q!");

	}

}
