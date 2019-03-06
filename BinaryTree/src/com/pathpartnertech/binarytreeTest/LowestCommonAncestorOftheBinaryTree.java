package com.pathpartnertech.binarytreeTest;

import java.util.Scanner;

public class LowestCommonAncestorOftheBinaryTree {

	public static void main(String[] args) {
		
		System.out.println("Find the Lowest Common Ancestor of Binary Tree");
		System.out.println("Enter the Number of Nodes");
		Scanner sc = new Scanner(System.in);
		int numOfNodes = sc.nextInt();
		int[] elements = new int[numOfNodes];
		System.out.println("Please Enter the Nodes");
		
		for(int i=0 ;i< numOfNodes ;i++) 
		{
			System.out.println("Elements in Index "+ i);
			elements[i] = sc.nextInt();
		}
		InOrderTraverse traverse = new InOrderTraverse();
		Node node =
		traverse.insertNode(elements, null, 0);
	/*	System.out.println("Enter the Node1 ");
		int nodeData =sc.nextInt();
		Node n1 = new Node(nodeData);
		System.out.println(" Enter Node2 ");
		int nodeData2 = sc.nextInt();
		Node n2 = new Node(nodeData2);
	*/	sc.close();
		
		LowestCommonAncestorOftheBinaryTree tree = new LowestCommonAncestorOftheBinaryTree();
		Node lca =
		tree.findLowestCommonAncestor(node ,node.right, node.right.right.left);
		System.out.println("Lowest Common Ancestor of the Nodes are "+ lca.getData());
		
	}

	private Node findLowestCommonAncestor(Node node, Node n1, Node n2) {
		
		if(node == null) 
		{
			return null;
		}
		if(node == n1 || node == n2)
		{
			return node;
		}	
		
		Node left = findLowestCommonAncestor(node.left, n1, n2);
		Node right = findLowestCommonAncestor(node.right, n1, n2);
		if(left == null && right == null) {
			return null;
		}
		if(left!= null && right!= null) {
			return node;
		}
		
		return (left!=null)? left :right ;
	}



}
