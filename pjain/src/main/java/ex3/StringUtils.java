package ex3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class StringUtils {
	
	
	public static <T> List<T> allMatches(List<T> s, Predicate<T> filter) {
		List<T> list = new ArrayList<>();
		Iterator<T> itr = s.iterator();
		while(itr.hasNext()) {
			T t = itr.next();
			if (filter.test(t)) {
				list.add(t);
			}
		}
		
		return list;
	}
	
	
	public static <T, R> List<R> transformedList(List<T> s, Function<T, R> func) {
		List<R> list = new ArrayList<>();
		Iterator<T> itr = s.iterator();
		while(itr.hasNext()) {
			T t = itr.next();
			list.add(func.apply(t));
		}		
		return list;
		
	}

}
