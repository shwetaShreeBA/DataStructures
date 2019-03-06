package com.pathpartnertech.binarytreeTest;

public class InsertIntoBinarySearchTree 
{

	public Node insertIntoBST(Node node, Node newNode) 
	{
		
		if(node == null) {
			return node;
		}
		
		Node parentNode =   null;
		Node currentNode =  node;
		
		while(currentNode != null) {
			parentNode = currentNode;
			if(currentNode.getData() > newNode.getData()) {
				currentNode = currentNode.left;
			}else {
				currentNode = currentNode.right;
			}
		}
		
		if(parentNode.getData() < newNode.getData()) {
			parentNode.right = newNode;
			return node;
		}else {
			parentNode.left = newNode;
			return node;
		}
		
	}
	
}
