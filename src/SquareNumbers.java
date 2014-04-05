import java.util.Scanner;

public class SquareNumbers {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		SquareNumberTest test = new SquareNumberTest();
		SquareNumberPractice practice = new SquareNumberPractice();

		System.out
				.println("Type 'practice' to practice, or 'test' to start the test");
		String testOrPractice = scanner.next();

		if (testOrPractice.equalsIgnoreCase("Practice"))
			practice.begin(scanner);
		else
			test.begin(scanner);

	}

	public static final int squareValue(int i) {
		return i * i;
	}

}
