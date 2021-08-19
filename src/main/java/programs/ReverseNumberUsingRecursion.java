package programs;

public class ReverseNumberUsingRecursion {
	
	public static void rev(long number) {
		if(number<10) {
			System.out.println(number);
			return;
		}
		else {
			System.out.print(number%10);
			rev(number/10);
		}
		
	}
	public static void main(String[] args) {
		
		rev(12345);
		rev(123);
		rev(111);
		rev(553209767);
		rev(001);
		rev(0);
	}

}
