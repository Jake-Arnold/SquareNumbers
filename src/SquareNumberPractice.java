import java.util.Scanner;

public class SquareNumberPractice {

	public void begin(Scanner scanner) {
		System.out.println("You have chosen to PRACTICE");
		System.out.println();
		
		System.out.println("Please enter the number that you would like to go up to: ");
		int maxValue = scanner.nextInt();
		
		
		System.out.println("You will practice your square numbers up to " + maxValue + ".");
		System.out.println();
		
	
		for (int i = 1; i < maxValue + 1; i++) {
			System.out.println("Please enter the square of " + (i) + ":");
			int p = scanner.nextInt();

			while (p != SquareNumbers.squareValue(i)) {

				System.out.println("That answer is incorrect.");
				System.out.println("Please enter the square of " + (i) + ":");
				p = scanner.nextInt();

			}
		}
		
		System.out.println("You have successfully practiced square numbers up to " + maxValue + ".");
		scanner.close();
	}
}
