package ex3;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class Lambda1 {

	private List<String> words = Arrays.asList("hi", "hello", "namaste", "JMJK", "jsr");
	List<Integer> nums = Arrays.asList(1, 10, 100, 1000, 10000);
	

	@Test
	public void testAllMatches() {
		
		assertEquals(3, StringUtils.allMatches(words, (String s) -> s.length() > 3).size());
		assertEquals(2, StringUtils.allMatches(nums, (Integer i) -> i > 500).size());
	}
	
	@Test
	public void testTransformation() {
		
		List<String> upperCaseWords = StringUtils.transformedList(words, String::toUpperCase);
		System.out.println(upperCaseWords);
	}

}
