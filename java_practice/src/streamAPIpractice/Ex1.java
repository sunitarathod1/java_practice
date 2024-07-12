package streamAPIpractice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Ex1 {

	public static void main(String[] args) {
		
		
		List<String> students= Arrays.asList("Archana","sunitha","soniya","Rahul");
		
		
		System.out.println(students);
		
		
		List<String> filternames =students.stream().filter(n->n.startsWith("s")).collect(Collectors.toList());
		
		System.out.println(filternames);

	}

}
