package com.jr;

public class ArrayList {
	/**
	 * 元素的数量
	 */
	private int size;
	/**
	 * 存放所有的元素
	 */
	private int[] elements;
	
	private static final int DEFAULT_CAPATICY = 10;
	
	public ArrayList(int capaticy) {
		capaticy = (capaticy < DEFAULT_CAPATICY) ? DEFAULT_CAPATICY : capaticy;
		elements = new int[capaticy];
	}

	public ArrayList() {
		this(DEFAULT_CAPATICY);
	}
	
	
	/**
	 * 清除所有元素
	 */
	public void clear() {
		
	}
	
	/**
	 * 元素的数量
	 * @return
	 */
	public int size() {
		return 0;
	}
	
	/**
	 * 是否为空
	 * @return
	 */
	public boolean isEmpty() {
		return false;
	}
	/**
	 * 是否包含某元素
	 * @param element
	 * @return
	 */
	public boolean contains(int element) {
		return false;
	}
	
	/**
	 * 添加元素到尾部
	 * @param element
	 */
	public void add(int element) {
		
	}
	
	/**
	 * 获取index位置的元素
	 * @param index
	 * @return
	 */
	public int get(int index) {
		return 0;
	}
	
	/**
	 * 设置index位置的元素
	 * @param index
	 * @param element
	 * @return
	 */
	public int set(int index, int element) {
		return 0;
	}
	
	/**
	 * 在 index 位置插入一个元素
	 * @param index
	 * @param element
	 */
	public void add(int index, int element) {
		
	}
	
	/**
	 * 删除 index 位置的元素
	 * @param index
	 * @return
	 */
	public int remove(int index) {
		return 0;
	}
	
	/**
	 * 查看元素的索引
	 * @param element
	 * @return
	 */
	public int indexOf(int element) {
		return -1;
	}
}













