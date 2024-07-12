package Quiz;

public class Quiz3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "prostack";
		String str2 = new String("prostack").intern();
		
		System.out.println(str1==str2);
		System.out.println(str1.equals(str2));
		System.out.println(str1.hashCode()==str2.hashCode());
		

	}

}
