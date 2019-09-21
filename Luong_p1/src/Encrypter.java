import java.util.Scanner;

public class Encrypter {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		// Variable declaration
		int userInput;
		int firstDigit;
		int secondDigit;
		int thirdDigit;
		int fourthDigit;
		int placeholder;
		
		// Prompt the user for input and store in userInput.
		System.out.println("Enter a four digit integer:");
		userInput = scnr.nextInt();
		
		// Separating userInput into digits.
		
		firstDigit = (userInput / 1000);
		secondDigit = ((userInput / 100) % 10);
		thirdDigit = ((userInput / 10) % 10);
		fourthDigit = (userInput % 10);
		
		//Encryption Process
		// 1. Adding 7 to each digit then dividing by 10 and getting the remainder.
		
		firstDigit = ((firstDigit + 7) % 10);
		secondDigit = ((secondDigit + 7) % 10);
		thirdDigit = ((thirdDigit + 7) % 10);
		fourthDigit = ((fourthDigit + 7) % 10);
		
		// 2.Swapping the digits.
			// Swapping the first and third digits.
		
			placeholder = firstDigit;
			firstDigit = thirdDigit;
			thirdDigit = placeholder;
		
			// Swapping the second and fourth digits.
		
			placeholder = secondDigit;
			secondDigit = fourthDigit;
			fourthDigit = placeholder;
		
		// 3. Printing the encrypted number.
		
		System.out.printf("Your encrypted number is: %d%d%d%d\n", firstDigit, secondDigit, thirdDigit, fourthDigit);
		
	}

}
