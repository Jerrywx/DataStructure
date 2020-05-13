package com.jr;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Integer data[] = new Integer[] {
				7, 4, 9,2, 5, 8, 11, 3
		};
		
		BinarySearchTree<Integer> bb = new BinarySearchTree<Integer>();

		for (int i = 0; i < data.length; i++) {
			
			bb.add(data[i]);
			
			
		}
		
		BinaryTrees.println(bb);
		
	}

}
