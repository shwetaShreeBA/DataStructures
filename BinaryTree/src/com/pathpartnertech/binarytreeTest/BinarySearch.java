package com.pathpartnertech.binarytreeTest;

public class BinarySearch {

	public Node search(Node node, int key) {
		
		if(node == null) {
			return null;
		}
		if(node.getData() == key) {
			return node;
		}else if(node.getData() > key) {
			return search(node.left, key);
		}else {
			return search(node.right, key);
		}
		
	}

}
