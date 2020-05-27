package com.ds.list;

/**
 * Singly Linked list
 * 
 * 
 *
 * @param <T>
 */
public class LList<T> {

	private LNode<T> head;

	public LNode<T> remove(LNode<T> node) {
		checkData(node);
		if (head == null) {
			return null;
		}
		if (head.getData().equals(node.getData())) {
			// if deleted node is head
			return removeFromBegining();
		} else {
			LNode<T> tmp = head;
			while (tmp.getNext() != null) {
				if (tmp.getNext().getData().equals(node.getData())) {
					LNode<T> dataFound = tmp.getNext();
					tmp.setNext(tmp.getNext().getNext());
					dataFound.setNext(null);
					return dataFound;
				}
				tmp = tmp.getNext();
			}
			// it means data not found
			return null;
		}
	}

	public LNode<T> removeFromBegining() {
		if (head == null) {
			return null;
		}
		LNode<T> tmp = head;
		head = head.getNext();
		return tmp;
	}

	/**
	 * By default returns from end
	 * 
	 * @return
	 */
	public LNode<T> remove() {
		if (head == null) {
			return null;
		}

		// if there is single node
		if (head.getNext() == null) {
			head = null;
			return head;
		}

		LNode<T> tmp = head;
		while (tmp.getNext().getNext() != null) {
			tmp = tmp.getNext();
		}

		// referencing last node
		LNode<T> last = tmp.getNext();
		// setting next of second last node to null
		tmp.setNext(null);
		return last;
	}

	/**
	 * Inserts the data at begining
	 * 
	 * @param data
	 */
	public void insertAtBegining(LNode<T> data) {
		checkData(data);

		if (head == null) {
			setHead(data);
		} else {
			LNode<T> tmp = head;
			data.setNext(tmp);
			setHead(data);
		}
	}

	/**
	 * By Default insert to end
	 * 
	 * @param data
	 */
	public void insert(LNode<T> data) {
		checkData(data);

		if (head == null) {
			setHead(data);
		} else {
			LNode<T> tmp = head;
			while (tmp.getNext() != null) {
				tmp = tmp.getNext();
			}
			tmp.setNext(data);
		}
	}

	public LNode<T> getHead() {
		return head;
	}

	public void setHead(LNode<T> head) {
		this.head = head;
	}

	private void checkData(LNode<T> data) {
		if (data == null || data.getData() == null) {
			throw new IllegalArgumentException("Node data invalid");
		}
	}

	public void print() {
		// printing head -> this will take care of printing other connecting nodes.
		System.out.println(getHead().toString());
	}

}
