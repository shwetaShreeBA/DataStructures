package com.pathpartnertech.binarytreeTest;

import java.util.Scanner;

public class IsBinarySearchTree {

	public static void main(String[] args) 
	{
		System.out.println("Is it a Binary Search Tree");
		System.out.println("Enter the number of the Nodes ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println("Enter the Nodes");
		int[] elements = new int[n];
		for(int i=0;i<n;i++) 
		{
			System.out.println("Element in the node "+ i);
			elements[i] = sc.nextInt();
		}
		InOrderTraverse traverse = new InOrderTraverse();
		Node node =  traverse.insertNode(elements, null, 0);
		boolean isBinarySearch = isBinarySearchTree(node , -100 , 100);
		
		if(isBinarySearch) 
		{
			System.out.println("Yeah !! We got it Its a Binary tree");
		}
		else 
		{
			System.out.println("Nope !! Its Not the Binary Tree.");
		}
	}

	private static boolean isBinarySearchTree(Node node, int min, int max) 
	{
		
		if(node == null) 
		{
			return true;
		}
		if(node.getData() < min  && node.getData() >max) 
		{
			return false;
		}
		
		
		return ( isBinarySearchTree(node.left, min, node.getData()) 
		&& isBinarySearchTree(node.right, node.getData(), max));
	}
		
}
