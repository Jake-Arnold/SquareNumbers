import java.util.Scanner;

public class SquareNumberTest {

	public void begin(Scanner scanner) {
		int correctAnswers = 0;
		int maxValue;
		
		System.out.println("You have started the TEST");
		System.out.println();
		System.out.println("Please enter the number that you would like to go up to: ");
		maxValue = scanner.nextInt();
		
		System.out.println("You will be tested on your square numbers up to " + maxValue + ".");
		System.out.println();
		
		
		for (int i = 1; i < maxValue + 1; i++) {
			System.out.println("Please enter the square of " + (i) + ":");
			int p = scanner.nextInt();
			if (p == SquareNumbers.squareValue(i))
				correctAnswers++;
		}
		
		System.out.println("You correctly answered " + correctAnswers + " out of " + maxValue + ".");
		scanner.close();
	}

}
