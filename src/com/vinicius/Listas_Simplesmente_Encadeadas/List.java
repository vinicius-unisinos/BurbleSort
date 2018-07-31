package com.vinicius.Listas_Simplesmente_Encadeadas;

import java.util.ArrayList;

import javax.naming.spi.DirStateFactory.Result;

// class List definition

public class List {
	private Node firstNode;
	private Node lastNode;
	private String name; 

	public List() {
		this("list");
	}

	public void ordenacaoLista() {
			Node current = firstNode;
			while (current.getNext() != null) {
				Object aux = null;
				Node aux2 = firstNode;
				while (aux2.getNext() != null ) {
					int num1 = convertObjectInInt(aux2.getData());
					int num2 = convertObjectInInt(aux2.getNext().getData());
					if (num1 > num2) {
						aux = aux2.getData();
						aux2.setData(aux2.getNext().getData());
						aux2.getNext().setData(aux);
						aux2 = firstNode;
					}
					aux2 = aux2.getNext();
				}
				current = current.getNext();
			}
	}

	public int convertObjectInInt(Object i) {
		int result = 0;
		try {
			result = Integer.parseInt(i.toString());
			return result;
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		return result;
	}

	public List(String listName) {
		name = listName;
		firstNode = lastNode = null;
	}

	public Node getFirst() {
		return firstNode;
	}

	public Node getLast() {
		return lastNode;
	}

	// insert Object at front of List
	public void insertAtFront(Object insertItem) {
		if (isEmpty()) // firstNode and lastNode refer to same object
			firstNode = lastNode = new Node(insertItem);

		else // firstNode refers to new node
			firstNode = new Node(insertItem, firstNode);
	}

	// insert Object at end of List
	public void insertAtBack(Object insertItem) {
		if (isEmpty()) // firstNode and lastNode refer to same Object
			firstNode = lastNode = new Node(insertItem);

		else {// lastNode's nextNode refers to new node
			lastNode.setNext(new Node(insertItem));
			lastNode = lastNode.getNext();
		}
	}

	// remove first node from List
	public Object removeFromFront() throws EmptyListException {
		if (isEmpty()) // throw exception if List is empty
			throw new EmptyListException(name);

		Object removedItem = firstNode.getData(); // retrieve data being removed

		// update references firstNode and lastNode
		if (firstNode == lastNode)
			firstNode = lastNode = null;
		else
			firstNode = firstNode.getNext();

		return removedItem; // return removed node data

	} // end method removeFromFront

	// remove last node from List
	public Object removeFromBack() throws EmptyListException {
		if (isEmpty()) // throw exception if List is empty
			throw new EmptyListException(name);

		Object removedItem = lastNode.getData(); // retrieve data being removed

		// update references firstNode and lastNode
		if (firstNode == lastNode)
			firstNode = lastNode = null;

		else { // locate new last node
			Node current = firstNode;

			// loop while current node does not refer to lastNode
			while (current.getNext() != lastNode)
				current = current.getNext();

			lastNode = current; // current is new lastNode
			current.setNext(null);
		}

		return removedItem; // return removed node data

	} // end method removeFromBack

	// determine whether list is empty
	public boolean isEmpty() {
		return firstNode == null; // return true if List is empty
	}

	public void remove_impar() {
		Node next = firstNode;
		Node current = firstNode;

		// while not at end of list, output current node's data
		while (current != null) {
			next = current;
			Object obj = null;
			int num = 0;
			// System.out.print(current.getData().toString() + " ");
			try {
				next = current.getNext();
				obj = next.getData();
				if (obj instanceof Integer) {
					num = (Integer) obj;
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
			if (obj != null) {
				if (num % 2 != 0) {
					current.setNext(next.getNext());
					break;
				}
			}
			current = current.getNext();
		}

	}

	// output List contents
	public void print() {
		if (isEmpty()) {
			System.out.println("Vazio " + name);
			return;
		}

		System.out.print("O " + name + " é: ");
		Node current = firstNode;

		// while not at end of list, output current node's data
		while (current != null) {
			System.out.print(current.getData().toString() + " ");
			current = current.getNext();
		}

		System.out.println("\n");
	}

	public void trocaTerQuarto() {
		int cont = 1;
		Node aux = firstNode;
		Object element3 = null;
		Object element4 = null;
		while (firstNode.getNext() != null) {
			if (!isEmpty()) {
				if (cont == 3) {
					element3 = firstNode.getData();
				} else if (cont == 4) {
					element4 = firstNode.getData();
				}
				firstNode = firstNode.getNext();
				cont++;
			}
		}
		firstNode = aux;
		for (int i = 2; i < 7; i++) {
			if (!isEmpty()) {
				firstNode = firstNode.getNext();
				if (i == 3) {
					firstNode.setData(element4);
				} else if (i == 4) {
					firstNode.setData(element3);
				}
			}
		}
		firstNode = aux;
	}

} // end class List
