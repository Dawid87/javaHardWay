import java.util.Scanner;

public class ComparingNumbers {
	public static void main( String[] args ) {
		Scanner keyboard = new Scanner(System.in);
		double first, second;
		
		System.out.print( "Give me two numbers. First: " );
		first = keyboard.nextDouble();
		System.out.print( "Second : " );
		second = keyboard.nextDouble();
		
		if ( first < second ) 
			System.out.println( first + " is LESS THAN " + second );
		
		if ( first <= second ) 
			System.out.println( first + " is LESS THAN/EQUAL TO " + second );
		
		if ( first == second ) 
			System.out.println( first + " is EQUAL TO " + second );
		
		if ( first >= second ) 
			System.out.println( first + " is GREATER THAN/EQUAL TO " + second );
		
		if ( first > second ) 
			System.out.println( first + " is GREATER THAN " + second );
		
		if ( first != second ) {
			System.out.println ( first + " is NOT EQUAL TO " + second );
			System.out.println ( "Hey." );
		}
	}
}

/*
Study Drills:
1. While not being contained in braces, the if statement will only run the first 
line of code after it, so "Hey." was just a print statement that printed no matter
the values entered.

2. After removing all braces from the if statements except the last one, "Hey." 
was now a part of the final if statement and only displayed if the condition was
met. 
*/