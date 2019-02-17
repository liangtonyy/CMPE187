
public class LinkedListTest {
	LinkedList list = new LinkedList();

	/**
	 * Set up the Linked List Append add the list from the end of the list
	 */
	public void setUp() {
		list = new LinkedList();
		list.append(100);
		list.append(200);
		list.append(300);
		list.append(400);
		list.append(500);
		list.append(600);
		System.out.println("SETUP LINKED LIST");
		System.out.println("Answer: " + list.showList());
		System.out.print("Expected Result:");
		System.out.println("1 -> 2 -> 3 -> 4 -> 5 -> 6");
		System.out.println("___________________________________________ ");
	}

	/*
	 * Append add from value from the end of the list
	 */
	public void append() {
		list.append(1000);
		System.out.println("Append add from the end of the list ");
		System.out.println("Answer: " + list.showList());
		System.out.print("Expected Result:");
		System.out.println("1 -> 2 -> 3 -> 4 > 5 -> 6 -> 10");
		System.out.println("___________________________________________");

	}

	/*
	 * Push add the value from the head of the list
	 */
	public void push() {
		list.push(250);
		list.push(150);
		System.out.println("Push add from the head of the list ");
		System.out.println("Answer: " + list.showList());
		System.out.print("Expected Result:");
		System.out.println("15 -> 25 -> 1 -> 2 -> 3 -> 4 -> 5 -> 6 -> 10");
		System.out.println("___________________________________________");
	}

	/*
	 * Delete the value from the LinkedList
	 */
	public void delete() {
		list.delete(400);
		list.delete(150);
		list.delete(1000);
		System.out.println("Delete the value from the LinkedList ");
		System.out.println("Answer: " + list.showList());
		System.out.print("Expected Result:");
		System.out.println("25 -> 1 -> 2 -> 3 -> 5 -> 6");
		System.out.println(" ___________________________________________");
	}

	public void search() {
		list.search(1000);
		list.search(300);
		System.out.println("Search the value from the LinkedList ");
		System.out.println("Answer: " + list.search(1000) + " , " + list.search(300));
		System.out.print("Expected Result:");
		System.out.println("false, true");
		System.out.println(" ___________________________________________");
	}

	public void length() {
		System.out.println("Current List List Length : " + list.length());
	}
}
