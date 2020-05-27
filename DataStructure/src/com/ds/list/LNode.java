package com.ds.list;

/**
 * This version of List Node does not allow the data to be updated once set.
 * 
 * 
 *
 * @param <T>
 */
public class LNode<T> {

	private final T data;
	private LNode<T> next;

	public LNode(T data) {
		this.data = data;
	}

	public T getData() {
		return data;
	}

	public void setNext(LNode<T> next) {
		this.next = next;
	}

	public LNode<T> getNext() {
		return next;
	}

	@Override
	public String toString() {
		return data + " -> " + next;
	}
}
