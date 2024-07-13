package streamAPIpractice;

import java.util.Arrays;
import java.util.List;

public class DoubleColonEx {

	public static void main(String[] args) {
		List<String> enames =Arrays.asList("rahul","sonia","prianka","sunita");
		System.out.println(enames);
		enames.stream().filter(ename -> ename.startsWith("p"))
		               .forEach(System.out::println);
		
		enames.stream().filter(ename->ename.startsWith("s"))
		               .forEach(ename->System.out.println(ename));

	}

}
