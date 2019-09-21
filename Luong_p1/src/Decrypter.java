import java.util.Scanner;
public class Decrypter {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);

		// Variable declaration
		int userInput;
		int firstDigit;
		int secondDigit;
		int thirdDigit;
		int fourthDigit;
		int placeholder;
		
		//Prompt user for input and store in userInput
		System.out.println("Enter a four digit integer:");
		userInput = scnr.nextInt();
		
		//Separating userInput into digits.
		firstDigit = (userInput / 1000);
		secondDigit = ((userInput / 100) % 10);
		thirdDigit = ((userInput / 10) % 10);
		fourthDigit = (userInput % 10);
		
		//Decryption process
		// 1. Swapping the digits
			// Swapping the first and the third digits.
		
			placeholder = firstDigit;
			firstDigit = thirdDigit;
			thirdDigit = placeholder;
		
			// Swapping the second and fourth digits.
		
			placeholder = secondDigit;
			secondDigit = fourthDigit;
			fourthDigit = placeholder; 
		
		// 2. Getting original digits from remainder.
			// Add 10 to each digit, then subtract 7, then mod 10 to return to original digits.
			
			firstDigit = (((firstDigit + 10) - 7) % 10);
			secondDigit = (((secondDigit + 10) - 7) % 10);
			thirdDigit = (((thirdDigit + 10) - 7) % 10);
			fourthDigit = (((fourthDigit + 10) - 7) % 10);
		
		// 3. Printing the decrypted number.
		
		System.out.printf("Your decrypted number is: %d%d%d%d\n", firstDigit, secondDigit, thirdDigit, fourthDigit);
		
			
			
	}

}
