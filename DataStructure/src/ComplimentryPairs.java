
public class ComplimentryPairs {

	public ComplimentryPairs() {
		// TODO Auto-generated constructor stub
	}

	public int noOfComplementaryPairs(int arr[], int k) {
		int result = 0;
		int complimentry =0;
		int length = arr.length-1;
		// first loop
		for (int i = 0; i <= length; i++) {

			// start at the current
			for (int j = i; j < length; j++) {
				
				complimentry = Math.abs(arr[i]) +  Math.abs(arr[j+1]);
				if (complimentry == k) {
					result++;
				}
			}
		}
		return result;
	}

	public static void main(String[] args) {
		int[] intArray = new int[] { 1, 8, -3, 0, 1, 3, -2, -4, 5 };
		int k = 6;
		System.out.println(
				"No of k complementary pairs : " + new ComplimentryPairs().noOfComplementaryPairs(intArray, k));
	}

}
