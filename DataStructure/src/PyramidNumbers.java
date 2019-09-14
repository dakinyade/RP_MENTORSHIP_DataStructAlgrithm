
public class PyramidNumbers {

	public static void main(String[] args) {

		pyramid(5);
	}
	
	public static void pyramid(int num){
		int counter = 0;
		
		while (counter<num){
			
		 System.out.println(counter+" ");
			
		 for (int i=0; i<=counter; i++){
			 
			 System.out.print(counter + " ");
		 }
			counter++;
		}
		
	}

}
