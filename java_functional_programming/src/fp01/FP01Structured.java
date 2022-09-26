package fp01;

import java.util.List;

public class FP01Structured {

	public static void main(String[] args) {
		printAllNumbersStructured(List.of(1,91,69,24,32,98));
	}
	
	public static void print(int number) {
		System.out.println(number);
	}

	private static void printAllNumbersStructured(List<Integer> numbers) {
		for(int number:numbers) {
			print(number);
		}
	}

}
