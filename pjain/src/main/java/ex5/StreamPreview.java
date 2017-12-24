package ex5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StreamPreview {

	public static void main(String[] args) {
		List<String> words = Arrays.asList("hi", "hello", "bye", "goodbye");
		String s1 = words.stream().filter(word -> word.contains("o")).findFirst().orElse(null);
		System.out.println(s1);
		String s2 = words.stream().filter(word -> word.length() > 5).findFirst().orElse(null);
		System.out.println(s2);

	}
	
	private static <E> List<E> anyPassPredicate(List<E> list, Predicate<E>... predicate) {
		Predicate<E> p1 = (e -> {return false;});
		for (Predicate<E> p : predicate) {
			// list.stream().filter(p);
			p1 = p1.or(p);
		}
		return list.stream().filter(p1).collect(Collectors.toList());
	}
	

	private static <E> List<E> filterAll(List<E> list, Predicate<E>... predicate) {
		Predicate<E> p1 = (e -> {
			return true;
		});
		for (Predicate<E> p : predicate) {
			// list.stream().filter(p);
			p1 = p1.and(p);
		}
		return list.stream().filter(p1).collect(Collectors.toList());
	}

}
