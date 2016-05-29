import java.util.Scanner;

public class ForgetfulMachine {
	public static void main( String[] args ) {
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println( "What city is the capital of France?" );
		keyboard.next();
		
		System.out.println( "What is 6 multiplied by 7?" );
		keyboard.nextInt();
		
		System.out.println( "Enter a number between 0.0 and 1.0" );
		keyboard.nextDouble();
		
		System.out.println( "Is there anything else you would like to say?" );
		keyboard.next();
	}
}

// Study Drills:
// Typing a string into the 2nd question causes it to throw an error.
// Typing anything other than numbers causes question 3 to throw an error as well.