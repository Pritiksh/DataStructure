package programs;

public class PrintOneToHundred {

	public static void main(String[] args) {
		/**
		 * output numbers from 1...100
		 * without using any numbers in your code.
		 */
		int one = 'A'/'A';//1
		String s1 = ".........." ;
		for(int i=one;i<=(s1.length()*s1.length());i++) {
			System.out.println(i);
		}
		//a-97 b-98 c-99 d-100
		for(int i=one;i<='d';i++) {
			System.out.println(i);
		}
		String s = "programmin";
		int zero = s.length()-s.length();
		int hundred = s.length() * s.length();
		for(int i = zero; i<=hundred; i++) {
			System.out.println(i);
		}
	}

}
