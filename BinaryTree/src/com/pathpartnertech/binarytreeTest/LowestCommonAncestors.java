package com.pathpartnertech.binarytreeTest;

import java.util.Scanner;

public class LowestCommonAncestors 
{

	public static void main(String[] args) 
	{

			System.out.println("Finding the Lowest Common Ancestor");
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
			System.out.println("Enter the Node1 ");
			int nodeData =sc.nextInt();
			Node n1 = new Node(nodeData);
			System.out.println(" Enter Node2 ");
			int nodeData2 = sc.nextInt();
			Node n2 = new Node(nodeData2);
			sc.close();
			
			LowestCommonAncestors ancestor = new LowestCommonAncestors();
			int ancestorval =
			ancestor.findLowestCommonAncestor(node , n1 ,n2);
			System.out.println("Lowest Common Ancestor is "+ ancestorval);
			
	}

	private int findLowestCommonAncestor(Node node, Node n1, Node n2) 
	{
		
		if(node.getData() > Math.max(n1.getData(), n2.getData())) 
		{
			return findLowestCommonAncestor(node.left, n1, n2);
		}
		else if(node.getData() < Math.min(n1.getData(), n2.getData()))
		{
			return findLowestCommonAncestor(node.right, n1, n2);
		}
		else 
		{
			return node.getData();
		}
		
	}

	

}
