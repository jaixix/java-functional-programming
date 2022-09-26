package fp01;

import java.util.List;

public class FP01FunctionalEvenNumbers {
	public static void main(String[] args) {
		printAllEvenNumbersFunctional(List.of(1, 91, 69, 24, 32, 98));
	}
	
	public static boolean isEven(int number) {
		return number%2==0;
	}

	private static void printAllEvenNumbersFunctional(List<Integer> numbers) {
		numbers.stream()
		.filter(FP01FunctionalEvenNumbers::isEven) //Allows only even numbers to go through.
		.forEach(System.out::println); //Prints only those numbers that are passed via filter.
	}
}
