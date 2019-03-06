package com.pathpartnertech.binarytreeTest;

import java.util.Scanner;

public class SameTree {

	public boolean sameTree(Node root1 , Node root2) 
	{
		if((root1 == null) && (root2 == null) ) {
			return true;
		}
		if((root1 == null) || (root2 ==null)) {
			return false;
		}
		
		return (root1.getData() == root2.getData()) 
				&& sameTree(root1.left, root2.left)
			&& sameTree(root1.right, root2.right);// and comparition results true only when both sides are true.
		
	}
	
	public static void main(String[] args) 
	{
		System.out.println("Welcome to Same Tree Comparition ");
		System.out.println("Please Enter the Nodes for Tree1");
		Scanner sc = new Scanner(System.in);
		System.out.println(" Please Enter the Number of nodes, or Size of the Tree ");
		int numberOfElements = sc.nextInt();
		int[] treeArray = new int[numberOfElements];
		
		for(int i=0;i < numberOfElements ;i++) 
		{
			System.out.println("The Number at the Index "+ i);
			treeArray[i] = sc.nextInt();
		}
		
		InOrderTraverse traverse = new InOrderTraverse();
		Node node1 =    traverse.insertNode(treeArray, null, 0);
		
		System.out.println("Please enter the Nodes to Tree 2");
		System.out.println("Please Enter the Size of Tree2");
		int numberofElementsForTree2 = sc.nextInt();
		int[] treeArray2 = new int[numberofElementsForTree2];
		
		for(int i=0;i<numberofElementsForTree2 ;i++ ) {
			
			System.out.println("The number at Index "+ i);
			treeArray2[i] = sc.nextInt();
		}
		
		Node node2 = traverse.insertNode(treeArray2, null, 0);
		
		sc.close();
		
		boolean sameTree =
				 new SameTree().sameTree(node1, node2);
		
		System.out.println("Is this a Same Tree ? " + sameTree);
		
		
		
		
		
	}
	
	
	
}
