package fp01;

import java.util.List;

public class FP01StructuredEvenNumbers {
	public static void main(String[] args) {
		printAllEvenNumbersStructured(List.of(1, 91, 69, 24, 32, 98));
	}

	public static void print(int number) {
		System.out.println(number);
	}

	private static void printAllEvenNumbersStructured(List<Integer> numbers) {
		for (int number : numbers) {
			if(number%2==0)
				print(number);
		}
	}
}
