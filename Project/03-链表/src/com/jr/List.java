package com.jr;

public interface List <E> {

	static final int ELEMENT_NOT_FOUND = -1;
	
	/**
	 * 清空列表
	 */
	void clear();
	
	/**
	 * 获取列表大小
	 */
	int size();
	
	/**
	 * 判断列表是否为空
	 * @return
	 */
	boolean isEmpty();
	
	/**
	 * 列表是否包含某个元素
	 * @param element
	 * @return
	 */
	boolean contains(E element);
	
	/**
	 * 添加元素
	 * @param element
	 */
	void add(E element);
	
	/**
	 * 根据索引获取元素
	 * @param index
	 * @return
	 */
	E get(int index);
	
	/**
	 * 设置某个元素
	 * @param index
	 * @param element
	 * @return
	 */
	E set(int index, E element);
	
	/**
	 * 添加某个元素到指定位置
	 * @param index
	 * @param element
	 */
	void add(int index, E element);
	
	/**
	 * 删除指定位置元素
	 * @param index
	 * @return
	 */
	E remove(int index);
	
	/**
	 * 获取元素的索引
	 * @param element
	 * @return
	 */
	int indexOf(E element);
	
}





