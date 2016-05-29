import java.util.Scanner;

public class BMICategories {
	public static void main( String[] args ) {
		Scanner keyboard = new Scanner(System.in);
		double bmi, kg, lbs, inches, m;
		
		System.out.print( "Your height(feet only): " );
		inches = (keyboard.nextDouble()) * 12;
		
		System.out.print( "Your height(inches): " );
		inches = (keyboard.nextDouble()) + inches;
		
		System.out.print( "Your weight in lbs: " );
		lbs = keyboard.nextDouble();
		
		kg = lbs * 0.453592;
		m = inches * 0.0254;
		bmi = kg / (m*m);
		
		System.out.println( "Your BMI is " + bmi );
		
		System.out.print( "BMI category: " );
		if ( bmi < 15.0 ) {
			System.out.println( "very severely underweight" );
		}
		else if ( bmi <= 16.0 ) {
			System.out.println( "severely underweight" );
		}
		else if ( bmi < 18.5 ) {
			System.out.println( "underweight" );
		}
		else if ( bmi < 25.0 ) {
			System.out.println( "normal weight" );
		}
		else if ( bmi < 30.0 ) {
			System.out.println( "overweight" );
		}
		else if ( bmi < 35.0 ) {
			System.out.println( "moderately obese" );
		}
		else if ( bmi < 40.0 ) {
			System.out.println( "severely obese" );
		}
		else {
			System.out.print( "very severely /\"morbidly\" obese" );
		}
	}
}