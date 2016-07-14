import java.util.Scanner;

public class ItemNotFound {
	public static void main( String[] args ) {
		Scanner keyboard = new Scanner(System.in);

		String[] heroes = { "Abderus" , "Achilles", "Aeneas", "Ajax", "Ajax",
			"Amphitryon", "Bellerophon", "Castor", "Chrysippus", "Daedalus",
			"Diomedes", "Eleusis", "Eunostus", "Ganymede", "Hector", "Hector", 
			"Iolaus", "Jason", "Meleager", "Odysseus", "Orpheus", "Perseus", "Theseus" };

		String guess;
		boolean found;
		int counter = 0; // Added for study drill.

		System.out.println( "Pop Quiz!" );
		System.out.print(" Name any *mortal* hero from greek mythology: ");
		guess = keyboard.next();


		found = false;
		for ( String hero: heroes ) {
			if ( guess.equals(hero) ) {
				found = true; 
			}
		}
		// Added for study drill.
		for ( String hero : heroes) {
			if ( guess.equals(hero) ){
				counter++;
			}
		}
		//

		if ( found == false ) {
			System.out.println("No, " + guess + " wasn't a Greek mortal hero.");
		}

		// Added for study drill.
		if (counter == 0) {
			System.out.println("Hero not found.");
		}
			else { 
				System.out.println("Hero was found " + counter + " times in array.");	
			}
		//
	}
}