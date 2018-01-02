package ex8;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;

public class ListMap {

	public static List<Double> randomNumberList(int size) {
		List<Double> nums = new ArrayList<>(size);
		for (int i = 0; i < size; i++) {
			nums.add(Math.random());
		}
		return (nums);
	}
	
	public static Double calcAverage(List<Double> list) {
		
		return list.stream().mapToDouble(n -> n.doubleValue()).average().orElse(Double.NaN);
	}
	
	public static void modify(List<Double> list) {
		list.replaceAll(n -> 2 * n);
		System.out.println(list);
	}

	public static List<Double> removeBelow(List<Double> list, Double cutoff) {
		return list.stream().filter(e -> e > cutoff).collect(Collectors.toList());
	}
	
	public static void main(String[] args) {
		
		Optional<String> gender = Optional.of("MALE");
		//Filter on Optional
        System.out.println(gender.filter(g -> g.equals("male"))); //Optional.empty
        System.out.println(gender.filter(g -> g.equalsIgnoreCase("MALE"))); //Optional[MALE]
        
		
	}

}
