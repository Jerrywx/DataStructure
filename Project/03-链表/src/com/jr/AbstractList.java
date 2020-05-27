package com.jr;

public abstract class AbstractList<E> implements List<E> {
	
	/// 链表的尺寸
	protected int size;

	public int size() {
		return size;
	}
	
	@Override
	public boolean isEmpty() {
		return size == 0;
	}

	@Override
	public boolean contains(E element) {
		return indexOf(element) != ELEMENT_NOT_FOUND;
	}

	@Override
	public void add(E element) {
		add(size, element);
	}
	
	
	/**
	 * 判断是否超出范围
	 * @param index
	 */
	protected void outOfBounds(int index) {
		throw new IndexOutOfBoundsException("Index" + index + ", Size:" + size);
	}
	
	protected void rangeCheck(int index) {
		if (index < 0 || index >= size) {
			outOfBounds(index);
		}
	}
	
	protected void rangeCheckForAdd(int index) {
		if (index < 0 || index > size) {
			outOfBounds(index);
		}
	}
	
}
