import java.lang.AssertionError;

/*
 * Template for a singly- or doubly-linked list of ints.
 */
public class IntDoublyLinkedList {
	
	class Node {
		int data = 0;
		Node prev = null;
		Node next = null;
		
		Node(int data) {
			this.data = data;
			this.prev = null;
			this.next = null;

		}
	}

	private Node head = null;
	private Node tail = null;
	private int size = 0;

	/**
	 * Construct an IntDoublyLinkedList.
	 */
	public IntDoublyLinkedList() {
		this.head = null;
		this.tail = null;
		this.size = 0;
	}

	/**
	 * Return the number of elements in the IntDoublyLinkedList.
	 *
	 * @return The number of elements in the IntDoublyLinkedList.
	 */
	public int size() {
		return this.size;
	}

	/**
	 * Add an element to the end of the IntDoublyLinkedList.
	 *
	 * @param element The element to add.
	 */
	public void add(int element) {
		// FIXME
	}

	/**
	 * Get the element at the specified index.
	 *
	 * This function assumes that the index argument is within range of the IntDoublyLinkedList.
	 *
	 * @param index The index to get.
	 * @return The element at the specified index.
	 */
	public int get(int index) {
		Node currNode = this.head;
		for (int i = 0; i < index; i++) {
			currNode = currNode.next;
		}
		return currNode.data;
	}

	/**
	 * Remove the element at the specified index.
	 *
	 * This function assumes that the index argument is within range of the IntDoublyLinkedList.
	 *
	 * @param index The index to remove.
	 */
	public void remove(int index) {
		// FIXME
	}

	/**
	 * Create a String representation of the IntDoublyLinkedList.
	 *
	 * @return A String representation of the IntDoublyLinkedList.
	 */
	public String toString() {
		String result = "{";
		if (this.size() > 0) {
			result += this.get(0);
		}
		for (int i = 1; i < this.size; i++) {
			result += ", " + this.get(i);
		}
		result += "}";
		return result;
	}

	/**
	 * Check that an IntDoublyLinkedList contains the same elements as an int array.
	 *
	 * If the list and the array are not the same, throw an AssertionError.
	 *
	 * @param list The IntDoublyLinkedList to check.
	 * @param answer The expected answer, in the form of an int array.
	 */
	public static void assertArraysEqual(IntDoublyLinkedList list, int[] answer) {
		if (list.size() != answer.length) {
			throw new AssertionError("Expected list of length " + answer.length + " but got " + list.size());
		}
		for (int i = 0; i < answer.length; i++) {
			if (list.get(i) != answer[i]) {
				throw new AssertionError("Expected " + answer[i] + " but got " + list.get(i) + " at index " + i);
			}
		}
	}

	/*
	 * Test that the empty list has size 0.
	 */
	public static void test1() {
		IntDoublyLinkedList list = new IntDoublyLinkedList();
		int[] answer = new int[0];
		assertArraysEqual(list, answer);
	}

	/*
	 * Test insertion into a list.
	 */
	public static void test2() {
		IntDoublyLinkedList list = new IntDoublyLinkedList();
		for (int i = 0; i < 5; i++) {
			list.add(i * i);
		}
		int[] answer = {0, 1, 4, 9, 16};
		assertArraysEqual(list, answer);
	}

	/*
	 * Test deletion from a list without emptying it.
	 */
	public static void test3() {
		IntDoublyLinkedList list = new IntDoublyLinkedList();
		for (int i = 0; i < 5; i++) {
			list.add(i * i);
		}
		list.remove(1);
		list.remove(2);
		int[] answer = {0, 4, 16};
		IntDoublyLinkedList.assertArraysEqual(list, answer);
	}

	/*
	 * Test deletion from a list and emptying it.
	 */
	public static void test4() {
		IntDoublyLinkedList list = new IntDoublyLinkedList();
		for (int i = 0; i < 5; i++) {
			list.add(i * i);
		}

		list.remove(1);
		list.remove(2);

		// delete the final remaining numbers
		list.remove(0);
		list.remove(0);
		list.remove(0);
		int[] answer1 = {};
		IntDoublyLinkedList.assertArraysEqual(list, answer1);

		// check that there are no last-element issues
		for (int i = 0; i < 5; i++) {
			list.add(i * i);
		}
		list.remove(4);
		list.add(-1);
		int[] answer2 = {0, 1, 4, 9, -1};
		IntDoublyLinkedList.assertArraysEqual(list, answer2);
	}

	/**
	 * Put the IntDoublyLinkedList through some simple tests.
	 *
	 * @param args Ignored command line arguments.
	 */
	public static void main(String[] args) {
		test1();
		test2();
		test3();
		test4();

		System.out.println("pass");
	}

}
