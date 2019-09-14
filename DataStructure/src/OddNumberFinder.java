import java.util.Arrays;

/*
A non-empty zero-indexed array A consisting of N integers is given. The array contains an odd number of elements, and each element of the array can be paired with another element that has the same value, except for one element that is left unpaired.

For example, in array A such that:

  A[0] = 9  A[1] = 3  A[2] = 9
  A[3] = 3  A[4] = 9  A[5] = 7
  A[6] = 9
the elements at indexes 0 and 2 have value 9,
the elements at indexes 1 and 3 have value 3,
the elements at indexes 4 and 6 have value 9,
the element at index 5 has value 7 and is unpaired.
Write a function:

int solution(int A[], int N);

that, given an array A consisting of N integers fulfilling the above conditions, returns the value of the unpaired element.

For example, given array A such that:

  A[0] = 9  A[1] = 3  A[2] = 9
  A[3] = 3  A[4] = 9  A[5] = 7
  A[6] = 9
the function should return 7, as explained in the example above.
  int[] value = {9, 3, 9, 3, 9, 7, 9};
Assume that:

N is an odd integer within the range [1..1,000,000];
each element of array A is an integer within the range [1..1,000,000,000];
all but one of the values in A occur an even number of times.
Complexity:

expected worst-case time complexity is O(N);
expected worst-case space complexity is O(1), beyond input storage (not counting the storage required for input arguments).
Elements of input arrays can be modified.*/

public class OddNumberFinder {

	public OddNumberFinder() {
		// TODO Auto-generated constructor stub
	}

	public static int solution(int A[], int N) {
		int unpaird = 0;
		int paired = 0;
		int currentValue = 0;
		int previousIndex = 0;
		int nextValue =0;

		Arrays.sort(A);

		for (int i = 1; i < A.length-1; ++i) {
			currentValue = A[i];
			previousIndex = A[i-1];

			if (currentValue == previousIndex || currentValue == nextValue ) {

				paired = previousIndex;
			}

			else if (!(currentValue == previousIndex ) && !(previousIndex == paired)) {

				unpaird = previousIndex;
				
				return unpaird;
			}

		}

		return 0;
	}

	public static void main(String[] args) { // TODO Auto-generated method stub

		int[] value = { 9, 3, 9, 3, 9, 7, 9 };
		System.out.println(solution(value, 6));
	}

}
