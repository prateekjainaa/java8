package ex1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;


public class ListUtils {

	private static <T> T lastEntry(List<T> list) {
		return list.get(list.size() -1);
	}
	
	private static<T> List<T> sort(List<T> list, Comparator<T> comp) {
	    list.sort(comp);
	    return list;
	}
	
	
	
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("aaaa");
		list.add("baaaa");
		list.add("caaaa");
		list.add("4ryyyyyyyyyy");
		list.add("ggggg5");
		
		System.out.println(lastEntry(list));
		
		System.out.println(sort(list, new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				
				if(o1.length() >= o2.length()) {
					return 1;
				} 
				return -1;
			}
			
		}));
		
		

	}
	
	
	

}
