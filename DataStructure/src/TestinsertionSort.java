import java.util.Arrays;

public class TestinsertionSort {

	public TestinsertionSort() {
		// TODO Auto-generated constructor stub
	}

	public static int[] testinsertion(int[] intArr) {

		for (int i = 1; i <= intArr.length - 1; i++) {

			// int currentkey = intArr[i];
			for (int j = 0; j <= i; j++) {

				if (j >= 0 && intArr[j] > intArr[i]) {
					int currentKey = intArr[i];
					intArr[i] = intArr[j];
					intArr[j] = currentKey;

				}
			}

		}

		return intArr;
	}

	public static int binarySearch(int num, int[] arrNum) {

		int value = 0;
		int value2 = 0;
		int[] sorted = testinsertion(arrNum);

		int getlength = sorted.length / 2;

		// checks for the finding value to the right
		if (!(sorted[getlength] == num) && sorted[getlength] > num) {

			while (!(sorted.length == getlength) && !(sorted[getlength] == num)) {

				getlength = (sorted.length + getlength) / 2;
			}

			value = sorted[getlength];

			value2 = Arrays.asList(sorted).indexOf(value);

		}

		if (num < sorted[getlength]) {

			
			
		}

		return value2;
	}

	public static String convertIntegerArrayToString(int[] intArr) {
		StringBuilder strBld = new StringBuilder();
		for (int i : intArr) {

			strBld.append(String.valueOf(i) + "");
		}

		return strBld.toString();
	}

	public static void main(String[] args) {

		int[] intArry = { 7, 9, 6, 4, 9, 3 };
		// ystem.out.println(convertIntegerArrayToString(testinsertion(intArry)));

		System.out.println(binarySearch(3, intArry));

	}

}
