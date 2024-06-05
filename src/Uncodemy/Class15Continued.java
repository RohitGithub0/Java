package Uncodemy;

public class Class15Continued {

	public static void main(String[] args) {
		byte b;
		int i; 
		b = 20;
		i = b * b; // OK, no cast needed 
		
		b = 30;
		b = (byte) (b * b); // cast needed!! as cannot assign int to byte
		System.out.println("i and b: " + i + " " + b);
	}

}