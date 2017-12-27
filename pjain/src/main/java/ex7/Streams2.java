package ex7;

import java.util.Arrays;
import java.util.List;

public class Streams2 {

	private static List<String> words = Arrays.asList("hi", "hello", "namaste", "jmjk", "jsr");
	
	public static void main(String[] args) {
		String s = words.stream().reduce("", (s1, s2) -> s1 + s2.toUpperCase());
		System.out.println(s);
		
		
		String s3 = words.stream().map(s4 -> s4.toUpperCase()).reduce("", (s5, s6) -> s5 + s6);
		System.out.println(s3);
		
		String s7 = words.stream().reduce((s8, s9) -> s8 + "," + s9).get();
		System.out.println(s7);
		
		int l = words.stream().mapToInt(w -> w.length()).sum();
		System.out.println(l);
		
		long h = words.stream().filter(f -> f.contains("h")).count();
		System.out.println(h);
		
	}

}
