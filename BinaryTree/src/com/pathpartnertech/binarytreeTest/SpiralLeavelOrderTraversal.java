package com.pathpartnertech.binarytreeTest;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class SpiralLeavelOrderTraversal {
	
	public static void main(String[] args) 
	{
		System.out.println("Spiral Leavel Order Traversal");
		System.out.println("Enter the Number of Nodes");
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		System.out.println("Enter the Node values");
		int[] numberOfNodes = new int[number];
		for(int i=0;i<number;i++) 
		{
			System.out.println("Enter Node Value for "+ i);
			numberOfNodes[i] = sc.nextInt();
		}
		sc.close();
		InOrderTraverse traverse = new InOrderTraverse();
		Node node =
		traverse.insertNode(numberOfNodes, null, 0);
		
		spiralLeavelOrderTraversalOfNodes(node);
		
		
	}

	private static void spiralLeavelOrderTraversalOfNodes(Node node) {
		
		Deque<Node> deque = new LinkedList<>();
		int leavelCount =1;
		int currentCount =0;
		
		boolean flip =true;
		deque.offerFirst(node);
		while(!deque.isEmpty()) 
		{
			while(leavelCount > 0 )
			{	
				if(flip)
				{	
					Node current = deque.pollFirst();
					System.out.println(current.getData());
					if(current.left != null) 
					{
						deque.offerLast(current.left);
						currentCount ++;
					}
					if(current.right != null) 
					{
						deque.offerLast(current.right);
						currentCount ++;
					}
				
			}
			else 
			{
				
					Node current = deque.pollLast();
					System.out.println(current.getData());
					if(current.right != null) 
					{
					
						deque.offerFirst(current.right);
						currentCount++;
					
					}
					if(current.left != null) 
					{
						deque.offerFirst(current.left);
						currentCount++;
					
					}
				
			}
				leavelCount--;
			}
			flip = !flip;
			leavelCount = currentCount;
			currentCount =0;
			
		}
		
	}
	
}
