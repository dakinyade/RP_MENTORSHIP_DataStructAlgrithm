/**
 * 
 */

/**
 * @author DNA
 *
 */
public @interface DeleteArrayIndex {

	
	public class DeleteArray{
		
		
		public int[] deleteArray(int numbToDelete, int[] intArr){
			
			for (int i=0; i<intArr.length-1; i++){
				
				if(numbToDelete == intArr[i]){
					
					int delIndex = intArr.length - intArr[i];
					
					while (delIndex < intArr.length-1){
						intArr[i]=intArr[i+1];
						
					}
					
				//intArr.length--;
					
					return intArr;
					
				}
				
				else {
					
					
					System.out.print("Number not found"+ numbToDelete);
											
				}
			}
			
			
			return intArr;
		}
	}
}
