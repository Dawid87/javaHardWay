public class CreatingVariables {
	public static void main( String[] args ) {
		int x, y, age, year;
		double seconds, e, checking, savings;
		String firstName, lastName, title, middleName, favoriteColor; 
		
		x = 100;
		y = 400;
		age = 39;
		year = 2016;
		seconds = 4.71;
		e = 2.71828182845904523536;
		checking = 1.89;
		savings = 5234.11;
		
		firstName = "Elijah";
		middleName = "Aaron";
		lastName = "Ginter";
		title = "Mr.";
		favoriteColor = "Red";
		
		System.out.println( "The variable x contains " + x );
		System.out.println( "The value " + y + " is stored in the variable y." );
		System.out.println( "The experiment took " + seconds + " seconds." );
		System.out.println( "A favorite irrational # is Euler's number: " + e );
		System.out.println( "Hopefully you have more than $" + checking + "!" );
		System.out.println( "Combined with your savings you have: $" + ( checking + savings )); 
		System.out.println( "My name's " + title + " " + firstName + " " + middleName + 
		" " + lastName + " and my favorite color is " + favoriteColor + ".");
		
	}
}