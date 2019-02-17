
public class LinkedList {
	class Node {
		Node next;
		int value;

		public Node(int value) {
			this.value = value;
		}
	}

	private Node head;

	public LinkedList() {
		head = null;
	}

	/**
	 * Add A Node in the head of the LinkedList
	 */
	public void push(int val) {
		Node newNode = new Node(val);
		if (head == null) {
			head = newNode;
		} else {
			newNode.next = head;
			head = newNode;
		}
	}

	/**
	 * Add A Node at the end of the LinkedList
	 */
	public void append(int val) {
		if (head == null) {
			head = new Node(val);
			return;
		}
		Node temp = head;
		while (temp.next != null) {
			temp = temp.next;
		}
		Node newNode = new Node(val);
		temp.next = newNode;
	}

	/**
	 * Delete node with a specific position
	 */
	public void delete(int key) {
		if (head == null)
			return;
		if (head.value == key) {
			head = head.next;
		}
		Node pre = head, cur = head;

		while (cur != null && cur.value != key) {
			pre = cur;
			cur = cur.next;
		}

		if (cur != null) {
			pre.next = cur.next;
		}
	}

	public int length() {
		if (head == null)
			return 0;
		int count = 0;
		while (head != null) {
			count++;
			head = head.next;
		}
		return count;
	}

	public String showList() {
		String listofNode = "";
		Node bufferString = head;
		while (bufferString != null) {
			if (bufferString.next != null) {
				listofNode += bufferString.value + " => ";
			} else
				listofNode += bufferString.value;
			bufferString = bufferString.next;
		}
		return listofNode;
	}

	/**
	 * Search for the specified key
	 * 
	 * @param key
	 * @return
	 */
	public boolean search(int key) {
		if (head == null)
			return false;
		Node temp = head;

		while (temp != null) {
			if (temp.value == key) {
				return true;
			}
			temp = temp.next;
		}
		return false;
	}
}
