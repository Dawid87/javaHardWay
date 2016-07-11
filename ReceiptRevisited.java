import java.io.PrintWriter;
import java.util.Date;
import java.util.Scanner;

public class ReceiptRevisited { 
	public static void main( String[] args ) throws Exception {
		
		double gallons, total;
		double price = 3.029;

		Date date = new Date();
		Scanner keyboard = new Scanner(System.in);

		System.out.println( "Gas costs: $" + price );
		System.out.println( "How many gallons do you want? ");
		gallons = keyboard.nextDouble();
		total = gallons * price; 


		PrintWriter fileout = new PrintWriter("receipt.txt");

		fileout.println( "+------------------------------+" );
		fileout.println( "|                              " );
		fileout.println( "|         CORNER STORE         " );
		fileout.println( "|                              " );
		fileout.println( "| " + date + "     " );
		fileout.println( "|                              " );
		fileout.println( "| Gallons:           " + gallons + "    " );
		fileout.println( "| Price/gallon:    $ " + price + "     " );
		fileout.println( "|                              " );
		fileout.println( "| Fuel total:      $ " + total + "     " );
		fileout.println( "|                              " );
		fileout.println( "+------------------------------+" );
		fileout.close();

		System.out.println( "Writing receipt to 'receipt.txt'... done.");

	}
}