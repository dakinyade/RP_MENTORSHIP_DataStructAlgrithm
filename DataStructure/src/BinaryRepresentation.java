import java.util.Arrays;

public class BinaryRepresentation {

	public static int numberOfGaps = 0;

	public static String binaryRep(int numb) {

		return Integer.toBinaryString(numb);
	}

	public int binaryGap(int numb) {

		Integer.toBinaryString(numb);

		return 0;
	}

	public static int testbinarygap(int numb) {

		int binaryGap = 0;

		binaryGap = numb >> 1;

		return binaryGap & 1;
	}

	// Binary Gap example
	public static int moreTest(int numb) {

		int currentInteger = 0;

		String strBinaryGap = null;
		String[] strArr;

		

		int highestGap = 0;

		for (int i = 0; i < numb; i++) {

			if (numb > currentInteger) {

				strBinaryGap = (Integer.toBinaryString(numb));
				numb = numb >> currentInteger;

				// get the highest binary gap
				if (strBinaryGap.length() > 1) {
					strArr = strBinaryGap.split("");
					int currentGapNumber = 0;
					for (int j = 0; j < strArr.length; j++) {

						if (Integer.valueOf(strArr[j]) < 1) {

							currentGapNumber++;
						}
					}

					if (currentGapNumber>=highestGap) {
						highestGap = currentGapNumber;
					}

				}

				numberOfGaps = currentInteger++;
			} else {

				break;
			}
		}

		System.out.println("Number of gap " + numberOfGaps);
		System.out.println("Number of gap count " + highestGap);

		return 0;
	}

	public static void main(String[] args) {

		// System.out.println(binaryRep(5));
		// System.out.println(testbinarygap(8));
		System.out.println(moreTest(32));

	}

}
