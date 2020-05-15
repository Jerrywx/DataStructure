package com.jr;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.Queue;

import com.jr.print.BinaryTreeInfo;

public class BinarySearchTree<E> implements BinaryTreeInfo {

	/// 元素个数
	private int size;
	/// 根节点
	private Node<E> root;
	/// 比较方法
	private Comparator<E> comparator;
	
	public BinarySearchTree(Comparator<E> comparator) {
		this.comparator = comparator;
	}
	
	public BinarySearchTree() {
		this(null);
	}

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
	
		Node newNode = new Node<E>(element, null);
		
		/// 第一个节点
		if (root == null) {
			root = newNode;
			size++; return;
		}
		
		/// 父节点
		Node parent = root;
		Node tmpNode = root;
		int comp = 0;
		while (tmpNode != null) {
			
			comp = compare((E)tmpNode.element, element);
			
			parent = tmpNode;
			/// 大于
			if (comp > 0) {
				tmpNode = tmpNode.right;
			} 
			/// 小于
			else if (comp < 0) {
				tmpNode = tmpNode.left;
			}
			/// 相等 用心元素覆盖就元素
			else {
				tmpNode.element = element;
				return;
			}
		}
		if (comp > 0) {
			parent.right = newNode;
		} else {
			parent.left = newNode;
		}
		size++;
	}
	
	/// 节点比较方法
	private int compare(E element1, E element2) {
		if (comparator != null) {
			return comparator.compare(element1, element2);
		} else {
			return ((Comparable<E>)element1).compareTo(element2);
		}
	}
	
	/**
	 * 遍历元素
	 */
	public void preorderTraversal() {
//		inOrder(root);
		levelOrder(root);
	}
	
	// 中序遍历
	public void inOrder(Node<E> node) {
		if (node == null) { return; }
		inOrder(node.left);
		System.out.println(node.element);
		inOrder(node.right);
	}
	
	// 前序遍历
	public void preOrder(Node<E> node) {
		if (node == null) { return; }
		System.out.println(node.element);
		preOrder(node.left);
		preOrder(node.right);
	}
	
	// 后序遍历
	public void postOrder(Node<E> node) {
		if (node == null) { return; }
		System.out.println(node.element);
		postOrder(node.left);
		postOrder(node.right);
	}
	
	/// 层序遍历
	public void levelOrder(Node<E> node) {
		if (node == null) { return; }
		
		/// 创建队列
		Queue<Node<E>> queue = new LinkedList<BinarySearchTree.Node<E>>();
		
		queue.offer(node);
		
		while (queue.size() > 0) {
			
			Node<E> node2 = queue.poll();
			System.out.println(node2.element);
			
			if (node2.left != null) {
				queue.offer(node2.left);
			}
			
			if (node2.right != null) {
				queue.offer(node2.right);
			}
		}
		
		
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
		
		Person person = (Person)(((Node<E>)node).element);
		return person;
	}
}
