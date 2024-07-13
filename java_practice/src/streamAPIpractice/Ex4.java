package streamAPIpractice;

import java.util.Arrays;
import java.util.List;

public class Ex4 {

	public static void main(String[] args) {
		List<String> enames = Arrays.asList("rahul","sonia","prianka","sunita");
		System.out.println(enames);
		
		long no_names = enames.stream().filter(ename->ename.startsWith("s"))
		                               .count();
		System.out.println(no_names);

	}

}
