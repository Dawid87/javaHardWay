import java.util.Scanner;

public class AgeMessages {
	public static void main( String[] args ) {
		Scanner keyboard = new Scanner(System.in);
		int age;
		
		System.out.print( "How old are you? " );
		age = keyboard.nextInt();
		
		System.out.println( "You are: " );
		if ( age < 13 ) {
			System.out.println( "\ttoo young to create a Facebook account" );
		}
		else {
			System.out.println("\told enough to create a Facebook account" );
		}
		if ( age < 16 ) {
			System.out.println( "\ttoo young to get a driver's license" );
		}
		else {
			System.out.println("\told enough to get a driver's license" );
		}
		if ( age < 18 ) {
			System.out.println( "\ttoo young to get a tattoo" );
		}
		else {
			System.out.println("\told enough to get a tattoo" );
		}
		if ( age < 21 ) {
			System.out.println( "\ttoo young to drink alcohol" );
		}
		else {
			System.out.println("\told enough to drink alcohol" );
		}
		if ( age < 35 ) {
			System.out.println( "\ttoo young to run for President of the U.S." );
			System.out.println( "\t\t(How Sad!)" );
		}
		else {
			System.out.println("\told enough run for President of the U.S." );
		}
		if ( age >= 65 ) {
			System.out.println( "You are old enough to retire!" );
		}
		else {
			System.out.println("\tyou are too young to retire!" );
		}
	}
}

//Study Drill
// 1. Initially typing age 35 met none of the if-statement conditions, so it printed nothing.
