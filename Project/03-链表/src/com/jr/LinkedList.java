package com.jr;

public class LinkedList<E> extends AbstractList<E> {
	
	/// 链表的根节点
	private Node firstNode;
	
	/// 链表节点类
	private class Node<E> {
		/// 节点存储的内容
		E element;
		/// 下一个节点
		Node next;
		/// 构造方法
		public Node(E element, Node next) {
			this.element = element;
			this.next = next;
		}
	}

	@Override
	public void clear() {
		firstNode = null;
		size = 0;
	}

	

	@Override
	public E get(int index) {
		// TODO Auto-generated method stub
		return node(index).element;
	}

	@Override
	public E set(int index, E element) {
		E el = node(index).element;
		node(index).element = element;
		return el;
	}

	@Override
	public void add(int index, E element) {
		rangeCheckForAdd(index);
		if (index == 0) {
			firstNode = new Node<E>(element, firstNode);
		} else {
			Node<E> preNode = node(index - 1);
			preNode.next = new Node<E>(element, preNode.next);			
		}
		size++;
	}

	@Override
	public E remove(int index) {
		if (index == 0) {
			Node<E> oldNode = firstNode;
			firstNode = oldNode.next;
			return oldNode.element;
		} else {
			Node<E> preNode = node(index - 1);
			Node<E> oldNode = preNode.next;
			preNode.next = preNode.next.next;
			return oldNode.element;
		}
	}

	@Override
	public int indexOf(E element) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	private Node<E> node(int index) {
		/// 范围检查
		rangeCheck(index);
		Node node = firstNode;
		while (index-- > 0) {
			node = node.next;
		}
		return node;
	}
	
}
