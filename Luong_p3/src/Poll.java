import java.util.Scanner;

public class Poll {
	/*todo:
	create poll
	store responces
	perform statistic on responces
	allow for multiple people to take the poll
	
	*/
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		
		//declare variables and create array to store data.
		String [] topics = new String[5];
		int [][] responses = new int[5][10];
		int [] points = new int[5]; // array for storing total points for each row
		float average;
		int userInput;
		int total = 0;
		int counter = 0;
		int max;
		int min;
		int i;
		int j = 0;
		String ans;
		char reply = 'Y';
		
		//creating topics array
		topics [0] = "first person shooter";
		topics [1] = "role playing";
		topics [2] = "battle royale";
		topics [3] = "fighting";
		topics [4] = "horror";
		
		
		//prompt and scan user input and store in responses array
		System.out.printf("Please rate the following questions on a scale of 1-10. (1 being not interested, 10 being very interested.)\n\n");
		while (reply == 'Y' || reply == 'y') { //allow for multiple users to take the survey
			for (i=0; i < topics.length; ++i) {
				System.out.printf("What are your thoughts on %s video games?\n", topics[i]);
				userInput = scnr.nextInt();
				if (userInput < 1 || userInput > 10) {
					while (userInput < 1 || userInput > 10 ) {
						System.out.println("That was not a valid answer");
						System.out.printf("What are your thoughts on %s video games?\n", topics[i]);
						userInput = scnr.nextInt();
					}
				}
				++responses[i][userInput - 1];
			}
			System.out.println("Would another person want to take the survey? (Reply Y/N)");
			ans = scnr.next();
			reply = ans.charAt(0);
		}
		//reformating array for table
		topics [0] = "first person shooter";
		topics [1] = "role playing        ";
		topics [2] = "battle royale       ";
		topics [3] = "fighting            ";
		topics [4] = "horror              ";
		
		
		//create and print table
		System.out.printf("\t\t");
		for (i=1; i < 11; ++i) {
			System.out.printf("\t%d", i);
		}
		System.out.printf("\t Avg");
		System.out.printf("\n----------------------------------------------------------------------------------------------------------------\n");
		
		for (i=0; i < 5; ++i) {
			System.out.printf("%s    ", topics[i]);
			for (j=0; j < 10; ++j) {
				System.out.printf("%d   |   ", responses[i][j]);
			}
		//computing and printing the average for the current row
			total = 0;
			counter = 0;
			for (j = 0; j < 10; ++j) {
				if (responses [i][j] > 0) {
					total = total + responses[i][j] * (j + 1);
					counter = counter + responses[i][j];
				}
			}
			average = total / (float)counter;
			points[i] = total;
			System.out.printf("%.2f   |   ", average);
			
			//printing new line
			System.out.printf("\n----------------------------------------------------------------------------------------------------------------\n");
		}
		//revert formating on topics array
		topics [0] = "first person shooter";
		topics [1] = "role playing";
		topics [2] = "battle royale";
		topics [3] = "fighting";
		topics [4] = "horror";
		//printing highest and lowest point total
		max = points[0];
		j = 0;
		for (i=0; i < 5; ++i) {
			if (max < points[i]) {
				max = points[i];
				j = i;
			}
		}
		System.out.println();
		System.out.printf("The topic that had the highest point total was %s with %d points\n\n",  topics[j], max);		
		min = points[0];
		j = 0;
		for (i=0; i < 5; ++i) {
			if (min > points[i]) {
				min = points[i];
				j = i;
			}
		}
		System.out.printf("The topic that had the lowest point total was %s with %d points\n",  topics[j], min);	
	}

}
