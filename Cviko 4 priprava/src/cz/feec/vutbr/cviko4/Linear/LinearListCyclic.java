package cz.feec.vutbr.cviko4.Linear;

public class LinearListCyclic {
	private Node head = null;
	private Node tail = null;

	public void addNodde(int value) {
		Node newNode = new Node(value);
		if (head == null) {
			head = newNode;
		} else {
			tail.next = newNode;
		}
		tail = newNode;
		tail.next = head;
	}

	public void traveseList() {
		Node currNode = head;
		if (head != null) {
			do {
				System.out.println(currNode.data + " ");
				currNode = currNode.next;
			}
			while (currNode != head);
		}

	}
	
    public int getLen()
    {
        int length = 0;
        Node temp = head;
        while (temp != null) {
            length++;
            temp = temp.next;
        }
        return length;
    }
 
    public void printMiddle()
    {
        if (head != null) {
            int length = getLen();
            Node temp = head;
            int middleLength = length / 2;
            while (middleLength != 0) {
                temp = temp.next;
                middleLength--;
            }
            System.out.print("The middle element is ["
                             + temp.data + "]");
            System.out.println();
        }
    }
    public void printNode()
    {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.print("Null"+"\n");
    }
	

}
