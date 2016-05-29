import java.util.Scanner;

public class SafeSquareRoot {
	public static void main( String[] args ) {
		Scanner keyboard = new Scanner(System.in);
		double x, y;
		String eager;
		
		System.out.print( "Are you ready!?! (YES!/NO!)" );
		eager = keyboard.nextLine();
		
		// Srudy Drill:
		while ( !eager.equals("YES!") ) {
			System.out.print( "Are you ready!?! (YES!/NO!)" );
			eager = keyboard.nextLine();
		}
		
		
		System.out.print( "Give me a number, and I'll find out it's square root. ");
		System.out.print("(No negatives, please.) " );
		x = keyboard.nextDouble();
		
		while ( x < 0 ) {
			System.out.println( "It won't take the square root of a negative." );
			System.out.print( "\nNew number: ");
			x = keyboard.nextDouble();
		
		}
		
		y = Math.sqrt(x);
		
		System.out.println( "The square root of " + x + " is " + y );
	}
}