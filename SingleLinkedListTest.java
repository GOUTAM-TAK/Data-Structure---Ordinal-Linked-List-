package tester;

import java.util.Scanner;

import singleLinkedList.SingleLinkedList;

public class SingleLinkedListTest {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			SingleLinkedList list = new SingleLinkedList();
			boolean exit = false;

			while (!exit) {
				System.out.println("Menu : \n" + "1)Display List\n" + "2)Add Node at First\n"
						+ "3)Add Node at Last of list\n" + "4)Add Node at position\n"
								+ "5)Delete node at first position\n"
								+ "6)Is LinkedList Empty\n"
								+ "7)Delete at given position\n"
								+ "8)Delete All nodes\n"
								+ "9)Delete Last node\n"
								+ "0)Exit");

				try {
					switch (sc.nextInt()) {
					case 1:
						list.display();
						break;
					case 2:
						System.out.println("enter ineger value in node");
						list.addFirst(sc.nextInt());
						break;
					case 3:
						System.out.println("enter ineger value in node");
						list.addLast(sc.nextInt());
						break;
					case 4:
						System.out.println("enter value of node data and position : ");
						list.addAtPosition(sc.nextInt(), sc.nextInt());
						break;
					case 5:
						System.out.println("deleting value is : "+list.deleteFirstPosition());
						break;
					case 6: System.out.println("Is list empty : "+list.isEmpty());
						break;
					case 7:System.out.println("for delete at position, enter the position : ");
						System.out.println("delete element is : "+list.deleteAtPosition(sc.nextInt()));
						break;
					case 8:list.deleteAll();
						break;
					case 9:System.out.println("Delete node data is : "+list.deleteLastNode());
						break;
					case 0: System.out.println("Thank you!!");
					exit=true;
					break;
					}

				} catch (Exception e) {
					e.printStackTrace();
					sc.nextLine();
				}
			}
		}

	}

}
