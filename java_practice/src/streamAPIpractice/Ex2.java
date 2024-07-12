package streamAPIpractice;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Ex2 {

	public static void main(String[] args) {
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		numbers.add(12);
		numbers.add(23);
		numbers.add(4);
		numbers.add(6);
		numbers.add(45);
		System.out.println(numbers);
		
		List even_number=numbers.stream()
		        .filter(num->num%2==0)
		        .collect(Collectors.toList());
		System.out.println(even_number);
		
		
		for(int num:numbers) {
			if(num%2==0) {
				System.out.println(num);
				
			}
			
		}
		
	}

}