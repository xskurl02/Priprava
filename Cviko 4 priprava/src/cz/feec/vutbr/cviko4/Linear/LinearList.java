package cz.feec.vutbr.cviko4.Linear;

public class LinearList {
	Node head;

	/**
	 * Adds to a linear list
	 *
	 *
	 * @param data The {@code int} of data to be added
	 */

	public void insert(int data) {
		Node new_node = new Node(data);
		new_node.next = null;
		if (head == null) {
			head = new_node;
		} else {
			Node last = head;
			head = new_node;
			head.next = last;
		}
	}

	/**
	 * Goes through the list and checks if the int exists in the linear list
	 *
	 *
	 * @param cislo The {@code int} number we are searching for
	 */
	public boolean exists(int cislo) {
		Node currNode = head;
		int nodepos = 0;
		while (currNode != null) {
			if (currNode.data == cislo) {
				System.out.println("exists");
				System.out.println("at position: " + nodepos);
				return true;
			}
			currNode = currNode.next;
			nodepos++;
		}
		System.out.println("does not exists");
		return false;
	}

	public void maxValue() {

		Node currNode = head;
		int max = Integer.MIN_VALUE;
		int counter = 0;
		while (currNode != null) {
			if (max < currNode.data) {
				max = currNode.data;
			}
			currNode = currNode.next;
			counter++;
		}
		System.out.println("Max value is :" + " " + max + " " + "at pos: " + counter);
	}

	public void deleteFirst() {
		// If the Linked List is empty,
		// then make the new node as head
		if (head == null) {
			return;
		} else {
			// Else traverse till the last node
			// and insert the new_node there
			head = head.next;

		}
		return;
	}

	
	public void deleteLast() {
		Node second_last = head;
		if (head != null)
			if (head.next != null) {
				while (second_last.next.next != null) {
					second_last = second_last.next;
				}
				second_last.next = null;
			}
	}

	public void printList() {
		Node currNode = head;
		int sum = 0;
		float product;
		System.out.print("LinkedList: ");

		if (head == null) {
			System.out.println("List is empty");
			return;
		}

		// Traverse through the LinkedList
		int counter = 0;
		while (currNode != null) {
			// Print the data at current node
			sum += currNode.data;
			System.out.print(currNode.data + " ");

			// Go to next node
			currNode = currNode.next;
			counter++;
		}
		product = (float)sum/counter;
		System.out.println("sum is " + sum);
		System.out.println("product is " + product);
	}

}