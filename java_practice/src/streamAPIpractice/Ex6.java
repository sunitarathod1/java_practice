package streamAPIpractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Ex6 {
	public static void main(String[] args) {
		List<String> enames = Arrays.asList("rahul","sonia","prianka","sunita");
		System.out.println(enames);
		
		List<String> new_enames = enames.stream()
		.sorted()
		.map(ename->ename.toUpperCase())
		.collect(Collectors.toList());
		System.out.println(new_enames);
		               
	}

}
