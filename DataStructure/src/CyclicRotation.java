
public class CyclicRotation {

	/*
	 * A zero-indexed array A consisting of N integers is given. Rotation of the
	 * array means that each element is shifted right by one index, and the last
	 * element of the array is also moved to the first place.
	 * 
	 * For example, the rotation of array A = [3, 8, 9, 7, 6] is [6, 3, 8, 9,
	 * 7]. The goal is to rotate array A K times; that is, each element of A
	 * will be shifted to the right by K indexes.
	 * 
	 * Write a function:
	 * 
	 * struct Results solution(int A[], int N, int K);
	 * 
	 * that, given a zero-indexed array A consisting of N integers and an
	 * integer K, returns the array A rotated K times.
	 * 
	 * For example, given array A = [3, 8, 9, 7, 6] and K = 3, the function
	 * should return [9, 7, 6, 3, 8].
	 * 
	 * Assume that:
	 * 
	 * N and K are integers within the range [0..100]; each element of array A
	 * is an integer within the range [−1,000..1,000]. In your solution, focus
	 * on correctness. The performance of your solution will not be the focus of
	 * the assessment.
	 * 
	 */
	public CyclicRotation() {

	}

	public static int[] solution(int A[], int N, int k) {

		int[] result = new int[N];

		int length = A.length;
		int truncateValue = 0;
		int insertIndex;

		for (int i = 0; i < length; i++) {

			if ((i + k) < length) {
				insertIndex = k + i;
				result[insertIndex] = A[i];
			}

			if ((i + k) >= length) {

				truncateValue = (i + k) - length;

				result[truncateValue] = A[i];

			}

		}

		return result;
	}

	public static void main(String[] args) {
	
		int[] A =  {3, 8, 9, 7, 6};
		
	   int N = 5;
	   
	   int k= 4;
		
		int[] result = solution(A, N, k);
		
		for (int s: result){
			
			System.out.print(s+", ");
		}
		
	}

}
