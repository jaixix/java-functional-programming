package fp01;

import java.util.List;

public class FP01Functional {

	public static void main(String[] args) {
		printAllNumbersFunctional(List.of(1,287,73,69,81,89));
	}
	
	public static void print(int number) {
		System.out.println(number);
	}

	private static void printAllNumbersFunctional(List<Integer> numbers) {
//		numbers.stream().forEach(FP01Functional::print); //converting numbers list into a stream; :: is method referencing used to print each number of stream by calling print menthod.
		//or
		numbers.stream().forEach(System.out::println);
	}

}
