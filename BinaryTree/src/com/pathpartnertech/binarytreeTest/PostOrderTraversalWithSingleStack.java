package com.pathpartnertech.binarytreeTest;

import java.util.Scanner;
import java.util.Stack;

public class PostOrderTraversalWithSingleStack {

	public static void main(String[] args) {
		System.out.println(" Post Order Traversal Using Single Stack ");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number of Nodes");
		int numOfNodes = sc.nextInt();
		System.out.println("Enter the Node Values ");
		int[] elements = new int[numOfNodes];
		for(int i=0;i<numOfNodes ;i++ ) 
		{
			System.out.println("Enter the values for "+ i);
			elements[i] = sc.nextInt();
		}
		sc.close();
		
		InOrderTraverse traverse = new InOrderTraverse();
		Node node =
		traverse.insertNode(elements, null, 0);
		
		PostOrderTraversalWithSingleStack stacky = new PostOrderTraversalWithSingleStack();
		stacky.traversrPostOrderlyUsingSingleStack(node);
		
	}

	private void traversrPostOrderlyUsingSingleStack(Node node) 
	{
		
		Node current = node;
		Stack<Node> stackOfNodes = new Stack<>();
		while((current != null) || 
				!stackOfNodes.isEmpty()) 
		{
			if(current!=null) 
			{
				stackOfNodes.push(current);
				current = current.left;
				
			}
			else 
			{
				Node temp = stackOfNodes.peek().right;
				
				if(temp==null) 
				{
					temp = stackOfNodes.pop();
					System.out.println(temp.getData());	
					while(!stackOfNodes.isEmpty() && temp == stackOfNodes.peek().right) 
					{
						temp = stackOfNodes.pop();
						System.out.println(temp.getData());
					}
					
				}
				else 
				{
					current =temp;
				}
				
			}
			
		}
		
	}

}
