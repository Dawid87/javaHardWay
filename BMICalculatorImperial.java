import java.util.Scanner;

public class BMICalculatorImperial {
	public static void main ( String[] args ){
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
	}
}