package com.jr;

import java.util.Comparator;

import com.jr.print.BinaryTrees;

public class Main {
	
	/// 比较的内部类
	private static class PersonComparator implements Comparator<Person> {

		@Override
		public int compare(Person o1, Person o2) {
			// TODO Auto-generated method stub
			return o1.age - o2.age;
		}
	}
	
	private static class PersonComparator2 implements Comparator<Person> {

		@Override
		public int compare(Person o1, Person o2) {
			// TODO Auto-generated method stub
			return o2.age - o1.age;
		}
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		///
		addNode();
		
		
	}
	
	/// 遍历元素
	
	/// 添加元素
	private static void addNode() {
		BinarySearchTree<Person> bb = new BinarySearchTree<Person>( new Comparator<Person>() {
			@Override
			public int compare(Person o1, Person o2) {
				// TODO Auto-generated method stub
				return o2.age - o1.age;
			}
		});
		
		bb.add(new Person(25));
		bb.add(new Person(13));
		bb.add(new Person(56));
		bb.add(new Person(11));
		bb.add(new Person(45));
		bb.add(new Person(22));
		bb.add(new Person(33));
		
		BinaryTrees.println(bb);
		System.out.println();
		bb.preorderTraversal();
	}

}








