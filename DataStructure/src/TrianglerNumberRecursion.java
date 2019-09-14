
public class TrianglerNumberRecursion {

	public TrianglerNumberRecursion() {
		// TODO Auto-generated constructor stub
	}

	public static int getTranglerNumbr(int number){
	
		System.out.print("Method "+ number);
		
		int result = 0;
		
		if(number==1){
			
			System.out.print("return 1");
			
			return 1;
		}
		else {
			
			result  = number +getTranglerNumbr(number -1);
			System.out.println("return" + result);
			System.out.println(": "+number+"getTN("+number+"-1)");
		}
		
		return result;
	}
	
	public static void main(String[] args) {
	
		System.out.println("TN: "+getTranglerNumbr(6));

	}

}
