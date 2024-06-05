package Uncodemy;

public class Class3 {

	public static void main(String[] args) {
		int n=5, d=6;
		n = 10; // In case of JAVA, the latest values are updated like in this case n is now 10 instead of 5 and same for d as well.
		d = 2;

		if(d != 0 && (n % d) == 0) //In case of JAVA for Logical AND(&&), if one condition becomes false then whole statement becomes false and then it won't execute syso. 
			//In case of JAVA for Logical AND(||), if one condition becomes false and other is true then it whole statement is considered as true, then it will execute syso. 
		
		System.out.println(d + " is a factor of " + n); 
		
		d = 0; // now, set d to zero
		// Since d is zero, the second operand is not evaluated. 
		
		if(d != 0 && (n % d) == 0)
		System.out.println(d + " is a factor of " + n);

		/* Now, try same thing without short-circuit operator. This will cause a divide-by-zero error.
		*/

		if(d != 0 & (n % d) == 0)

		System.out.println(d + " is a factor of " + n);

	}

}
