public class ClubBouncer {
	public static void main ( String[] args ) {
		int age = 22;
		boolean onGuestList = false;
		double allure = 7.5;
		String gender = "F";
		
		if ( onGuestList || age >= 21 || (gender.equals("F") && allure >= 8) ) {
			System.out.println("You are allowed to enter the club.");
		}
		/*
		System.out.println("Test.");
		Study Drill 1:
		The above line won't compile because the else statement is no longer directly
		following the above if statement.
		*/
		else {
			System.out.println("Tou are not allowed to enter the club.");
		}
	}
}