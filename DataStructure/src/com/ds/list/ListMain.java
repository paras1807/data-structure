package com.ds.list;

public class ListMain {

	public static void main(String[] args) {
		LList<Integer> llist = new LList<Integer>();
		ListMain main = new ListMain();
		main.testLListInsertion(llist);
		main.testRemove(llist);
		ReverseLList.reverseLinkedList(llist);
		ReverseLList.reverseLinkedListRecursion(llist);
		
	}

	private void testLListInsertion(LList<Integer> llist) {
		LList<Integer> llistBegining = new LList<Integer>();
		for (int i = 1; i <= 10; i++) {
			llist.insert(new LNode<Integer>(i));
			llistBegining.insertAtBegining(new LNode<Integer>(i));
		}
		llist.print();
		llistBegining.print();
	}

	private void testRemove(LList<Integer> list) {
		System.out.println("Removing from last");
		list.remove();
		list.print();

		System.out.println("Removing from begining");
		list.removeFromBegining();
		list.print();

		System.out.println("Removing Node 5");
		list.remove(new LNode<Integer>(5));
		list.print();

		System.out.println("Removing Node 2");
		list.remove(new LNode<Integer>(2));
		list.print();

		System.out.println("Removing Node 9");
		list.remove(new LNode<Integer>(9));
		list.print();

		System.out.println("Removing Node 15");
		list.remove(new LNode<Integer>(15));
		list.print();

	}
}
