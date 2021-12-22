package application;

import java.util.stream.IntStream;

public class App {

	public static void main(String[] args) {
		// First attempt without watching video
		String[] animals = { "cats", "dogs", "birds", "fish" };

		IntStream.range(0, animals.length).forEach(i -> {

			System.out.printf("%d. %s\n", i, animals[i]);
		});

	}

}
