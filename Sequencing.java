import java.util.Scanner;

public class Sequencing {
	public static void main( String[] args ){
		
		Scanner keyboard = new Scanner(System.in);
		double price, salesTax, total;
		
		System.out.print( "How much is the purchase price? " );
		price = keyboard.nextDouble();
		
		salesTax = price * 0.0825;
		total = price + salesTax;
		
		System.out.println( "Item price:\t" + price );
		System.out.println( "Sales tax:\t" + salesTax );
		System.out.println( "Total cost:\t" + total );
	}
}

/* Study Drills
1. The program won't compile without a variable being initilized if 
it's used later in the code

2. Swapped code to make the program follow logical sequencing.

3. price no longer has to be defined, as the user inputs it's value prior
to the program referencing it.

*/