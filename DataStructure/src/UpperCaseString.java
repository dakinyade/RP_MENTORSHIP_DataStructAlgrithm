import java.util.Queue;
import java.util.Stack;

public class UpperCaseString {

	static int a = 0;
	static int b = 2;

	public void calculator(String fn, String ln) {

	}

	
	//First Letter to upper case
	public static String checkSplitter(String str){
		
	String value = null;
	String finans = null;
		
		String[]  strArr = str.split(" ");
	for(String s: strArr){
		
		char sh = s.charAt(0);
		value = String.valueOf(sh).toUpperCase();
		finans = s.replaceFirst(String.valueOf(sh), value);
		
		System.out.println("String value is: "+ finans );
	}
		return null;
	}
	
	
	public static void main(String[] args) {
	
		checkSplitter("dew mango into");
		
	}

}
