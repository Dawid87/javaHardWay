import java.util.Scanner;

public class EnterPIN {
	public static void main( String[] args ) {
		Scanner keyboard = new Scanner(System.in);
		int pin, entry;
		String entry2, password = "abcde";
		pin = 12345;
		
		System.out.println( "WELCOME TO THE BANK OF JAVA." );
		System.out.print( "PLEASE ENTER YOUR PASSWORD: " );
		entry2 = keyboard.nextLine();
		
		while (!entry2.equals(password)) {
			System.out.println("\nINCORRECT PASSWORD. TRY AGAIN.");
			System.out.print( "ENTER YOU PASSWORD: ");
			entry2 = keyboard.nextLine();
		}	
			System.out.print( "ENTER YOUR PIN: " );
			entry = keyboard.nextInt();
		
		
			while ( entry != pin ) {
				System.out.println("\nINCORRECT PIN. TRY AGAIN.");
				System.out.print( "ENTER YOU PIN: ");
				entry = keyboard.nextInt();
			}
		
		System.out.println("\nPIN ACCEPTED. YOUR ACCOUNT BALANCE IS $425.17");
	}
}