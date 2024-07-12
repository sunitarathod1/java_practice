package collections;
import java.util.*;

public class ALTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	ArrayList a1	=new ArrayList();
	ArrayList<String> enames=new ArrayList<String>();
	a1.add(101);
	a1.add(2.5);
	a1.add('c');
	a1.add("rahul");
	System.out.println(a1);
	
	enames.add("rahu");
	enames.add("sunita");
	enames.add("santosh");
	enames.add("lamani");
	System.out.println(enames);
	for(int i=0;i<enames.size()-1;i++) {
		System.out.println(enames.get(i));
		
	}
	System.out.println(enames.set(0, " Rahu jadav"));
	System.out.println(enames);

	}

}
