package singleLinkedList;

public class SingleLinkedList {
	
	static class Node{
		private int data;
		private Node next; // sele referencial class - contain ref. of it's own type
		
		public Node() {
			data=0;
			next=null;
		}
		
		public Node(int value) {
			data=value;
			next=null;
		}
	}
	private Node head;
	
	public SingleLinkedList() {
		head = null;
	}
	
	public void addFirst(int value) {
		Node newNode = new Node(value);
		newNode.next=head;
		head=newNode;
	}

	public void addLast(int value) {
		Node newNode = new Node(value);
		if(head==null) {
			head=newNode;
		}
		else {
			Node trav;
			for(trav=head;trav.next!=null;trav=trav.next);
			trav.next=newNode;
		}
	}
	public void addAtPosition(int value,int pos) {
		Node newNode = new Node(value);
		if(head==null||pos<=1) {
			addFirst(value);
			
		}
		else {
			Node trav=head;
			for(int i=1;i<pos-1;i++ ) {
				if(trav.next==null)
					break;
				trav = trav.next;
			}
//			if(trav==null) {
//				throw new RuntimeException("position out of index!!!");
//			}
			newNode.next=trav.next;
			trav.next=newNode;
		}
	}
	public boolean isEmpty() {
		return head==null;
	}
	public int deleteFirstPosition() {
		if(head ==null)
			throw new RuntimeException("list already empty!!!");
		int value = head.data;
		head=head.next;
		return value;
	}
	public void deleteAll() {
		if(isEmpty()) {
			throw new RuntimeException("Linked List is empty already!!!");
		}
		head=null;
	}
	public int deleteAtPosition(int pos) {
		if(isEmpty()||pos<0) {
			
			throw new RuntimeException("List already empty!!! or Invalid Position!!!");
		}
		if(pos==1) {
			return deleteFirstPosition();
		}
		Node temp=null,trav=head;
		for(int i=0;i<pos;i++) {
			if(trav==null) {
				throw new RuntimeException("Invalid position!!!");
			}
			temp =trav;
			trav=trav.next;
		}
		temp.next=trav.next;
		return trav.data;
	}
	public int deleteLastNode() {
		if(isEmpty()) {
			throw new RuntimeException("list already empty!!!");
		}
		Node temp=null,trav=head;
		while(trav.next!=null) {
			temp=trav;
			trav=trav.next;
		}
		temp.next=null;
		return trav.data;
	}
	public void display() {
		if(isEmpty()) {
			throw new RuntimeException("Empty List!!!");
		}
		System.out.println("list is : ");
		Node trav;
		for(trav=head;trav!=null;trav=trav.next) {
			System.out.print(trav.data+" ");
		}
		System.out.println();
	}
}
