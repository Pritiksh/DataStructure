package programs;

public class IsNumber {

	public static boolean isCorrectPhoneNumber(String number) 
	{
		return number.matches("[0-9]{10}");
	}
	
	public static boolean isNumber(String number)
	{
		try {
		Long.parseLong(number);
		System.out.println("This is a valid number");
		
		}catch(NumberFormatException e) 
		{
			System.out.println("Not a valid no " + number);
			return false;
			
		}
		return true;
	}
	
	public static boolean isValidPhoneNumber(String number) {
		if(number.length()==10 && isNumber(number)) 
		{
			System.out.println("This is a valid phone number:"+ number);
			return true;
		}
		System.out.println("Not a valid phone number: "+number);
		return false;
		
	}
	
	public static boolean isValidCCNumber(String number) {
		if(number.length()==16 && isNumber(number)) 
		{
			System.out.println("valid Credit card number:"+ number);
			return true;
		}
		System.out.println("Not a valid credit card number: "+number);
		return false;
		
	}
	public static void main(String[] args) {
		System.out.println(isNumber("123a "));
		System.out.println(isValidPhoneNumber("1234567890"));
		System.out.println(isValidPhoneNumber("1234567"));
		System.out.println(isValidPhoneNumber("123456789011"));
		System.out.println(isValidCCNumber("1234567890111234"));

	}

}
