package streamAPIpractice;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Ex3 {

	public static void main(String[] args) {
		ArrayList<Integer> numbers=new ArrayList<Integer>();
		numbers.add(12);
		numbers.add(56);
		numbers.add(45);
		numbers.add(68);
		System.out.println(numbers);
		
		long count_number=numbers.stream()
		       .filter(n->n%2==0)
		        .count();
		System.out.println(count_number);
		

	}

}
