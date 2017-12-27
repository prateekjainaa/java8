package ex7;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Streams1 {

	
	private static List<String> words = Arrays.asList("hi", "hello", "namaste", "jmjk", "jsr");
	
	public static void main(String[] args) {
		words.stream().forEach(e -> System.out.println("  "+ e));
		
		List<String> transf = words.stream().map(e -> e + "!").collect(Collectors.toList());
		System.out.printf("%s.\n", transf);
		
		List<String> filter = words.stream().filter(e -> (e.length() > 4)).collect(Collectors.toList());
		System.out.printf("%s.\n", filter);
		
	}

}
