package com.pathpartnertech.binarytreeTest;

public class InOrderTraverse {

	
	Node root;
	
	InOrderTraverse(){
		root = null;
	}
	
	InOrderTraverse(int data){
		root = new Node(data);
	}
	
	//Method to construct a binary tree from the given array
	public Node insertNode(int[] elements, Node node, int i){
		
		if(i < elements.length){
			node = new Node(elements[i]);
			
			node.left = insertNode(elements,node.left,2 * i + 1);
			
			node.right = insertNode(elements,node.right,2 * i + 2);
		}
		
		return node;
	}
		
	//Method to print all the nodes from a given node to the root node
	public boolean printNode(Node node, int data){
		//Write your code here
		return true;
		
	}
	
	public boolean preOrderTraverse(Node node) {
				
		if(node!=null) {
			System.out.println(node.getData());
			preOrderTraverse(node.left);
			preOrderTraverse(node.right);
			
		}
		return true;
	}
	
	public void doInOrderTraversal(Node node) {
		if(node!=null) 
		{
			doInOrderTraversal(node.left);
			System.out.println(node.getData());
			doInOrderTraversal(node.right);
		}
		
	}

	public void doPostOderTraversal(Node node) {
		
		if(node!=null)
		{
			doPostOderTraversal(node.left);
			doPostOderTraversal(node.right);
			System.out.println(node.getData());
		}
		
	}
	
	
	

}
