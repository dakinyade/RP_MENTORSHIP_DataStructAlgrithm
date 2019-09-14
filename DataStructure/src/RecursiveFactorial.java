import java.util.Arrays;

public class RecursiveFactorial {

	public RecursiveFactorial() {

	}

	public static String recursiveMethod(int i) {
		if (i > 10) {
			System.out.println("Now unloading method from Stack");
		}

		if (i <= 10) {
			System.out.println(i);
			recursiveMethod(i + 1);
			System.out.println(i);
		}

		return "Now Loading to Stack Completed";
	}

	// recursion count down
	public static int recursiveTest(int N) {

		System.out.println(N);
		if (N >= 0) {

			return recursiveTest(N - 1);
		} else
			return 0;
	}

	public static void main(String[] args) {

		// System.out.println(recursiveMethod(1));
		// recursiveTest(32);

		String[] strArr = { "B", "A", "D", "j", "F" };
		Arrays.sort(strArr);

		for (String s : strArr) {

			System.out.print(s + " ");
		}

	}

}
