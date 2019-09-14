
public class LinkedList {

	public LinkedList() {

	}

	private Node head;

	public void insertAtHead(int data) {

		Node newNode = new Node(data);

		newNode.setNextNode(this.head);
		this.head = newNode;

	}

	public int length() {

		int length = 0;

		Node current = this.head;
		while (current != null) {
			length++;
			current = current.getNextNode();
		}
		return length;
	}

	@Override
	public String toString() {
		String results = "{";

		Node current = this.head;
		while (current != null) {

			results += current.toString() + ",";
			current = current.getNextNode();

		}
		results += "}";

		return results;
	}

}
