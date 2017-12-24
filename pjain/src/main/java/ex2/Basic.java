package ex2;

import java.util.Arrays;

public class Basic {

	private static String[] arr = {"hello", "hi", "namaste", "jmjk", "jsr"};
	
	
	public static void main(String[] args) {
		System.out.println(Arrays.asList(arr));
		Arrays.sort(arr, (String s1, String s2) -> s1.length() - s2.length());
		System.out.println(Arrays.asList(arr));
		
		
		

	}

}
