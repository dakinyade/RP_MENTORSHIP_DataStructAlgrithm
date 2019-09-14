import java.util.ArrayList;
import java.util.List;

public class LinkedListArrayFunctionTest {

	public LinkedListArrayFunctionTest() {

	}

	public static void main(String[] args) {

		// Number to parse into our test.
		long numb = (long) 1E7;
		long mili = System.currentTimeMillis();

		// Time taken for addition Arraylist
		// ##################################
		List<Integer> al = new ArrayList<>();
		mili = System.currentTimeMillis();
		for (int i = 0; i < numb; i++) {
			al.add(i);
		}
		System.out.println(
				"Addition of arraylist took :" + (System.currentTimeMillis() - mili) + " seconds for" + al.size());
		// ###########################

		// ################Time Taken for a LinkedList to insert
		// ##################

		LinkedList ll = new LinkedList();

		mili = System.currentTimeMillis();
		for (int i = 0; i < numb; i++) {

			ll.insertAtHead(i);
		}

		System.out.println(
				"Addition of LinkedList took :" + (System.currentTimeMillis() - mili) + " seconds for" + ll.length());
		// ################Time Taken for a LinkedList to insert
		// ##################

		// **************REMOVAL OF OBJECTS ARRAYLIST AND
		// LINKEDLIST**********************

	// Removal of ArrayList
		mili = System.currentTimeMillis();
		al.remove(1E5);
		System.out.println(
				"Removal of arraylist took :" + (System.currentTimeMillis() - mili) + " seconds for" + 1E2);
		// ###########################

	}
	
	
	
	

}
