
public class BubbleSort {

	public BubbleSort() {
		// TODO Auto-generated constructor stub
	}
	
	//value of array 7 8 6 3 5 1
	public static int[] sort(int[] intArr){
		
		int[] value = null;
		int tmp = 0;
		
		for(int i = 0; i<= intArr.length-1; i++){
			
			
			if (i == 0){
				i = 1;
			}
			
			for (int j=0; j<= intArr.length-1-i; j++){
				
				if (intArr[j]>intArr[j+1]){
					
				tmp= intArr[j+1];	
				 intArr[j+1]= intArr[j];
				
				 intArr[j]= tmp;
				
				}
				
			}
			
		}
		
		return intArr;
	}
	public static void main(String[] args) {
		
		int[] value = {9,3,7,8};
		//DisplayArrayHorizonal ds = new DisplayArrayHorizonal(value);
		//ds.displayHorizontalArray();
		///System.out.println();
		System.out.print("Sorted value is ");
		for (int i: sort(value)){
		  System.out.print(String.valueOf(i));
		}
		

	}

}
