package graph;

public class LinkedList {
	Node head;

	static class Node {
		int data;
		Node next;

		public Node(int data) {
			super();
			this.data = data;
			this.next = null;
		}
	}

	public static void main(String[] args) {
		LinkedList linkedList = new LinkedList();
		linkedList.head = new Node(1);
		linkedList.head.next = new Node(2);
		linkedList.head.next.next = new Node(3);
		linkedList.printLinkedList();
		linkedList.insertAtFront(4);
		linkedList.printLinkedList();
		linkedList.insertAtBack(5);
		linkedList.printLinkedList();
		linkedList.insertAfterNode(linkedList.head.next, 6);
		linkedList.printLinkedList();
	}

	private void printLinkedList() {
		Node ptr = head;
		String output=" ";
		while (ptr != null) {
			output = output + ptr.data + " ";
			ptr = ptr.next;
		}
		System.out.println(output.trim());
	}

	private void insertAtFront(int data) {
		Node node = new Node(data);
		node.next = head;
		head = node;
	}

	private void insertAtBack(int data) {
		Node node = new Node(data);
		if(head == null) {
			head = node;
			return;
		}
		Node ptr = head;
		while(ptr.next!=null) {
			ptr = ptr.next;
		}
		ptr.next = node;
	}

	private void insertAfterNode(Node pre,int data) {
		Node node = new Node(data);
		if(pre ==null) {
			head = node;
			return;
		}
		node.next = pre.next;
		pre.next = node;
	}
}
