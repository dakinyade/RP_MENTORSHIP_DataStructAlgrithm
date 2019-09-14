import java.util.Arrays;

import javax.swing.Popup;

public class StackSimulation {

	private static int totalSize = 10;
	static int[] stack = new int[totalSize];
	private static int currentSize = 0;

	public StackSimulation(int totalSize) {

		this.totalSize = totalSize;
	}

	public static void push(int numToPush) {
		int i = 1;
		if (totalSize >= currentSize) {

			stack[currentSize] = numToPush;

			currentSize++;
			return;
		}

		else {

			System.out.println("stackover flow");
		}

	}

	public static void pop() {

		if (!(stack[currentSize-1] == 0)) {

			stack[currentSize-1] = 0;
		}

	}

	public static void main(String[] args) {

		push(1);
		push(2);
		push(4);
		push(5);
		pop();

		int i = 0;

		for (int j = stack.length - 1; j >= 0; j--) {
			if (!(stack[j] == 0)) {
				System.out.print(" " + stack[j]);
				i++;
			}
		}
	}

}
