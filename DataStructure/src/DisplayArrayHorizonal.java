
public class DisplayArrayHorizonal {

	private int[] intArr;
	
	public DisplayArrayHorizonal(int[] intArr) {
		super();
		this.intArr=intArr;
	}

	
	public void displayHorizontalArray(){
		
		int n = intArr.length * 4;

		for (int i = 0; i < n; i++)
			System.out.print("-");
		System.out.println();
		for (int i = 0; i < intArr.length; i++) {

			System.out.print("| " + i + " ");
		}
		System.out.println();
		for (int i = 0; i < n; i++)
			System.out.print("-");
		System.out.println();
		for (int i = 0; i < intArr.length; i++) {

			System.out.print("| " + intArr[i] + " ");
		}
		System.out.println("|");
		for (int i = 0; i < n; i++)
			System.out.print("-");
	}
	

	
}
