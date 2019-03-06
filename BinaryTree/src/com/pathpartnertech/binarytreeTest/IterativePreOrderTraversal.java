package com.pathpartnertech.binarytreeTest;

import java.util.Scanner;
import java.util.Stack;

public class IterativePreOrderTraversal {

	public static void main(String[] args) 
	{
		
		System.out.println("Itterative Pre Order Traversal");
		System.out.println("Enter the Number of Nodes");
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		System.out.println("Enter the Node values");
		int[] numberOfNodes = new int[number];
		for(int i=0;i<number;i++) 
		{
			numberOfNodes[i] = sc.nextInt();
		}
		sc.close();
		InOrderTraverse traverse = new InOrderTraverse();
		Node node =
		traverse.insertNode(numberOfNodes, null, 0);
		
		iterativePreOrderTraversal( node);
	}

	private static void iterativePreOrderTraversal(Node node) {
		
		if(node == null)
		{
			return ;
		}
		Stack<Node> stack1 = new Stack<>();
		stack1.push(node);
		
		while(!stack1.isEmpty())
		{
			Node root = stack1.pop();
			System.out.println(root.getData());
			if(root.right != null) 
			{
				stack1.push(root.right);
			}
			if(root.left != null) 
			{
				stack1.push(root.left);
			}
			
		}	
		
	}

}
