package FI;
@FunctionalInterface

public class CalcI {
	public abstract add(int a, int b);

}
public class CalcImpl {
	public static void main(String[] args) {
		CalcI obj=(a,b)->a+b;
		System.out.println(obj.add(10,20));
	}
	

	
}
