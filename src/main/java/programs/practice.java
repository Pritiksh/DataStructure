package programs;

import java.util.HashMap;
import java.util.Map;

public class practice {

	public static void main(String[] args) {
		countChar("test",'t');
		
	}
	
	public static int countChar(String str,char c) {
		int count = 0;
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)==c) {
				count++;
			}
			
		}
		return count;
	}
}
