import java.util.Scanner;

public class BMI_Calculator {

	public static void main(String[] args) {
		
		//create scanner and declare variables
		Scanner scnr = new Scanner(System.in);
	
		float userHeight;
		float userWeight;
		double BMI;
		int units = 0;		//used to determine metric or imperial formula
		
		//prompt the user and which units they prefer and store in flag
		while (!(units == 1 || units == 2)) {		//checks to see if a valid response has been given
		System.out.println("What units would you like to use? (Type 1 for imperial, 2 for metric)");
		units = scnr.nextInt();
			if (!(units == 1 || units == 2)) {		
				System.out.println("Sorry, that was not a valid response.");	
			}
		} //end of while loop
		
		//imperial method
		if (units == 1) { //prompt user for values of height and weight and stores values
			System.out.println("Enter your height in inches:");
			userHeight = scnr.nextFloat();
			System.out.println("Enter your weight in pounds:");
			userWeight = scnr.nextFloat();
			
		//calculating BMI for imperial values and printing result;
			BMI = ((703 * userWeight) / (Math.pow(userHeight, 2)));
			System.out.printf("Your BMI is: %.1f\n", BMI);
			System.out.println();
			
		//print out BMI catagories
			System.out.println("BMI Catagories:");
			System.out.println();
			System.out.println("Underweight = <18.5");
			System.out.println("Normal weight = 18.5–24.9");
			System.out.println("Overweight = 25–29.9");
			System.out.println("Obesity = BMI of 30 or greater");
		} //end of imperial method
		
		//metric method
		if (units == 2) { //prompt user for values of height and weight in metric units
			System.out.println("Enter your height in centimeters:");
			userHeight = scnr.nextFloat();
			userHeight = userHeight / 100; //convert from centimeters to meters
			System.out.println("Enter your weight in kilograms:");
			userWeight = scnr.nextFloat();
			
		//calculating BMI for metric units and printing result
			BMI = (userWeight / Math.pow(userHeight, 2));
			System.out.printf("Your BMI is: %.1f\n", BMI);
			System.out.println();
			
		//print out BMI catagories
			System.out.println("BMI Catagories:");
			System.out.println();
			System.out.println("Underweight = <18.5");
			System.out.println("Normal weight = 18.5–24.9");
			System.out.println("Overweight = 25–29.9");
			System.out.println("Obesity = BMI of 30 or greater");
		} //end of metric method	
	}

}
