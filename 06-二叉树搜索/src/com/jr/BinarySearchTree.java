package com.jr;

public class BinarySearchTree<E extends Comparable> implements BinaryTreeInfo {

	/// 元素个数
	private int size;
	/// 根节点
	private Node<E> root;

	/**
	 * 返回元素个数
	 * @return
	 */
	public int size() {
		return size;
	}
	
	/**
	 * 树是否为空
	 * @return
	 */
	public boolean isEmpty() {
		return size == 0;
	}
	
	/**
	 * 清空树
	 */
	public void clear() {
		
	}

	/**
	 * 添加元素
	 * @param element 元素
	 */
	public void add(E element) {
		elementNotNullCheck(element);
	
		/// 第一个节点
		if (root == null) {
			root = new Node<E>(element, null);
			size++; return;
		}
		
		/// 父节点
		Node parent = root;
		Node tmpNode = root;
		int compare = 0;
		while (tmpNode != null) {
			compare = element.compareTo(tmpNode.element);
			parent = tmpNode;
			/// 大于
			if (compare > 0) {
				tmpNode = tmpNode.right;
			} 
			/// 小于
			else if (compare < 0) {
				tmpNode = tmpNode.left;
			}
			/// 相等
			else {
				return;
			}
		}
		if (compare > 0) {
			parent.right = new Node<E>(element, null);
		} else {
			parent.left = new Node<E>(element, null);
		}
		size++;
	}
	
	
	/**
	 * 删除元素
	 * @param element 元素
	 */
	public boolean remove(E element) {
		return false;
	}	
	
	/**
	 * 节点为空检测
	 */
	private void elementNotNullCheck(E element) {
		if (element == null) {
			throw new IllegalArgumentException("element must not be null");
		}
	}
	
	/**
	 * 节点
	 * @author wangxiao
	 *
	 * @param <E>
	 */
	private static class Node<E> {
		/// 元素
		E element;
		/// 左子节点
		Node<E> left;
		/// 右子节点
		Node<E> right;
		/// 父节点
		Node<E> parent;
		/**
		 * 构造方法
		 * @param element
		 * @param parent
		 */
		public Node(E element, Node<E> parent) {
			this.element = element;
			this.parent = parent;
		}
	}

	@Override
	public Object root() {
		// TODO Auto-generated method stub
		return root;
	}

	@Override
	public Object left(Object node) {
		// TODO Auto-generated method stub
		return ((Node<E>)node).left;
	}

	@Override
	public Object right(Object node) {
		// TODO Auto-generated method stub
		return ((Node<E>)node).right;
	}

	@Override
	public Object string(Object node) {
		// TODO Auto-generated method stub
		return ((Node<E>)node).element;
	}
}
