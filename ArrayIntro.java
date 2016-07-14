public class ArrayIntro {
	public static void main( String[] args ) {
		String[] planets = { "Mercury", "Venus", "Earth" , "Mars" ,
							"Jupiter", "Saturn", "Uranus", "Neptune" };
		String[] states = { "Colorado", "New Jersey", "New York", "Alaska",
							"Washington", "Georgia", "Florida" };
		int count = 0;

		for ( String p : planets ) {
			System.out.println( p + "\t" + p.toUpperCase() );
		}

		for ( String s : states ) {
			count++;
			System.out.println( count + ":\t" + s );
		}


	}
}			  			 		    	     	