import java.util.Scanner;

public class RudeQuestions {
	public static void main( String[] args ) {
		String name, status;
		int age;
		double weight, income;
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print( "Hello. What is your name? " );
		name = keyboard.next();
		
		System.out.print( "Hi, " + name + "! How old are you? ");
		age = keyboard.nextInt();
		
		System.out.println( "So you're " + age + ", eh? That's not very old." );
		System.out.print( "How much do you weigh, " + name + "? " );
		weight = keyboard.nextDouble();
		
		System.out.println( weight + "! Better keep that quiet!!" );
		System.out.print( "Finally, what's your income, " + name + "? " );
		income = keyboard.nextDouble();
		
		System.out.print( "Hopefully that is " + income + " per hour");
		System.out.println( " and not per year!" );
		System.out.print( "Well, thanks for answering my rude questions, ");
		System.out.println( name + "." );
	
		//Study Drill 4:
		
		System.out.print( "Are you married, divorced, or single?" );
		status = keyboard.next();
		System.out.println( status + "! I'm sorry to hear that.");
	
	}
}

//Study Drills
/*
1. The program works fine when you enter an integer in place of a double. As 
an integer can be declared a double, but not always the other way around. 

2. The program will allow a numberic value instead of a text string because 
strings can be text or numeric.

3. Entering a space won't "explode" the program, but it's the only way I found
to fail the .next() method.
*/