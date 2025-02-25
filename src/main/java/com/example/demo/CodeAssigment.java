import java.util.*;
import java.util.stream.Collectors;

public class CountWords {
	public static void main(String[] args) {
		//List of Strings
		List<String> words = Arrays.asList("Maven", "MVC", "Jenkins", "Camuda", "Agile", "Mongo", "JavaSE");

		// Count words start with 'M' or 'm'
		long count = words.stream().filter(word -> word.toLowerCase().startsWith("m")).count();
		List<String> wordsStartwithM = words.stream().filter(word -> word.toLowerCase().startsWith("m")));
		
		// Return all words longer than 5 characters
		List<String> longWords = words.stream()
			.filter(word -> word.length() > 5)
			.collect(Collectors.toList());

		System.out.println("Number of words starting with 'M' or 'm':" + count, +wordsStartwithM);
		System.out.println("All the words longer than 5 characters: " + longWords);
	}
}
