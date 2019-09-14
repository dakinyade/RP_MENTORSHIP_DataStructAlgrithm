
public class BinarySearch {

	public static int[] intArr = { 1, 2, 4, 5, 6, 7, 8, 9, 10, 11, 12, 17, 18, 19 };

	public BinarySearch(int[] intArr) {
		super();
		this.intArr = intArr;
	}

	public static int search(int[] intArr, int numToSerach) {

		int startNum = 0;
		int qEndIndex = intArr.length - 1;
		int middleValue = qEndIndex / 2;
		while (qEndIndex >= startNum) {

			if (numToSerach == intArr[middleValue]) {
				return middleValue;

			} else

			if (numToSerach >= intArr[middleValue] && !(numToSerach == intArr[middleValue])) {

				middleValue = (qEndIndex + middleValue) / 2;

			} else if (numToSerach <= intArr[middleValue] && !(numToSerach == intArr[middleValue])) {

				middleValue = middleValue - 1;

			}

			startNum++;
		}

		return -1;
	}

	public static int BinarySearch2(int numb, int[] intArr) {

		int arraySize = intArr.length;

		int middleNumb = arraySize / 2;

		while (!(middleNumb < 0) && middleNumb < arraySize) {

			if (numb == intArr[middleNumb]) {

				return middleNumb;
			} else

			if (numb > intArr[middleNumb]) {

				middleNumb++;

			} else if (numb < intArr[middleNumb]) {

				middleNumb--;
			}

		}

		return -1;

	}

	// Derek Bamas
	public static int binarySearchValue3(int value) {

		int result = 0;
		int lowIndex = 0;
		int highIndex = intArr.length - 1;
		int middleIndex = 0;

		while (lowIndex <= highIndex) {

			middleIndex = (highIndex + lowIndex) / 2;

			if (intArr[middleIndex] < value) {

				lowIndex = middleIndex + 1;
				
			} else if (intArr[middleIndex] > value) {

				highIndex = middleIndex - 1;
				

			} else {
				System.out.println("\n found a match for ");

				lowIndex = highIndex + 1;
				
				if (value == intArr[middleIndex] ){
					result = middleIndex;
				}
			}

		}

		return result;

	}

	public static void displayArrayHorizontally() {

		int n = intArr.length * 4;

		for (int i = 0; i < n; i++) {
			System.out.print("-");
		}
		System.out.println();

		for (int i = 0; i < intArr.length; i++) {

			System.out.print("| " + i + " ");
		}

		System.out.println();
		for (int i = 0; i < intArr.length; i++) {

			System.out.print("| " + intArr[i] + " ");
		}
		System.out.println("|");
		for (int i = 0; i < n; i++)
			System.out.print("-");
	}

	public static void main(String[] args) {
		System.out.println("Number of loops and index number of search is :" + binarySearchValue3(11));

		displayArrayHorizontally();

	}

}
