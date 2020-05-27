package com.ds.list;

/**
 * Reverse Linked List
 * 
 * 
 *
 */
public class ReverseLList {

	public static <T> void reverseLinkedList(LList<T> list) {
		LNode<T> prev = null, next = null;
		LNode<T> current = list.getHead();

		while (current != null) {
			next = current.getNext();
			current.setNext(prev);
			prev = current;
			current = next;
		}
		list.setHead(prev);

		System.out.println("Reversed List is ");
		list.print();
	}

	public static <T> void reverseLinkedListRecursion(LList<T> list) {
		LNode<T> head = reverseRecursionUtil(list.getHead(), null);
		list.setHead(head);
		System.out.println("Reversed recursion List is ");
		list.print();
	}

	private static <T> LNode<T> reverseRecursionUtil(LNode<T> curr, LNode<T> prev) {
		LNode<T> next = curr.getNext();
		curr.setNext(prev);
		if (next == null) {
			return curr;
		}
		return reverseRecursionUtil(next, curr);
	}
}
