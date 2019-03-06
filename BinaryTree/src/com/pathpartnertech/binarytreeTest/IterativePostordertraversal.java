package com.pathpartnertech.binarytreeTest;

import java.util.Scanner;
import java.util.Stack;

public class IterativePostordertraversal 
{

	public static void main(String[] args)
	{
		System.out.println("Itterative Traversal");
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
		ItterativePostOrderTraverse(node);
		
	}

	private static void ItterativePostOrderTraverse(Node node) 
	{
		
		if(node ==null) 
		{
			return ;
		}
		Stack<Node> stack1 = new Stack<>();
		Stack<Node> stack2 = new Stack<>();
		stack1.push(node);
		
		while(!stack1.isEmpty()) 
		{
			Node root = stack1.pop();
			stack2.push(root);
			if(root.left != null) 
			{
				stack1.push(root.left);
			}
			if((root.right != null))
			{
				stack2.push(root.right);
			}	
			
		}
		
		while(!stack2.isEmpty()) 
		{
			System.out.print(stack2.pop().getData()+ " "); 
			
		}
		
		
		
	}
	
}
