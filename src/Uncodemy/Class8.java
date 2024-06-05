package Uncodemy;

public class Class8 {

	public static void main(String[] args) {
		boolean b;
		b = false; 
		System.out.println("b is " + b);
		b = true;
		System.out.println("b is " + b);

		// a boolean value can control the if statement 
		if(b) 
		System.out.println("This is executed.");
		
		b = false; //in case of if(), if the values of the variable is false, then it won't print the statement.
		if(b) 
		System.out.println("This is not executed.");

		// outcome of a relational operator is a boolean value 
		System.out.println("10 > 9 is " + (10 > 9));

	}

}
