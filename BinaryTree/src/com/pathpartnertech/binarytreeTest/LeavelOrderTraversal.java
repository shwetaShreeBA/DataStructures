package com.pathpartnertech.binarytreeTest;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class LeavelOrderTraversal 
{
	public static void main(String[] args ) 
	{
		
		System.out.println("Is Leavel Order Traversal");
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
		leavelOrderTraversal(node);
		
	}

	private static void leavelOrderTraversal(Node node)
	{
		if(node == null) 
		{
			return ;
		}
		Queue<Node> que = new LinkedList<>();
		que.add(node);
		while(!que.isEmpty()) 
		{
			node = que.remove();
			System.out.println(node.getData());
			if(node.left!=null) {
				que.add(node.left);
			}
			if(node.right!=null) 
			{
				que.add(node.right);
			}
			
			
		}
		
	}
	
}
