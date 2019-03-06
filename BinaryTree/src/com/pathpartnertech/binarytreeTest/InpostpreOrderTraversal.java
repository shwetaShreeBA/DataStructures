package com.pathpartnertech.binarytreeTest;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;




public class InpostpreOrderTraversal {
	
	public static void main(String[] args)
	{
		
		
		System.out.println("Enter how many elements you need to enter inorder to create the Bainary Tree");
		Scanner sc = new Scanner(System.in);
		int numberOfElements = sc.nextInt();
		int[] numbersAsNodes = new int[numberOfElements];
		System.out.println("Please Enter the Number of Elements");
		for(int i=0;i < numberOfElements;i++)
		{
			System.out.println("Please Enter the Element inside the Tree "+ i );
			
			numbersAsNodes[i] = sc.nextInt();
		}
		System.out.println(" Creating the Binary Tree ");
		//createTreeUsingPreOrder(numbersAsNodes);
		InOrderTraverse terverse = new InOrderTraverse();
		Node node =	terverse.insertNode(numbersAsNodes, null, 0);
		System.out.println(" PreOrder Traversal we are going to do ");
		terverse.preOrderTraverse(node);
		System.out.println(" InOrder traverse we are going to do ");
		terverse.doInOrderTraversal(node);
		System.out.println(" PostOrder Traversewe are going to do ");
		terverse.doPostOderTraversal(node);
		
		BinarySearch binarySearch = new BinarySearch();
		System.out.println("Enter the Key , you needs to Search ");
		int key = sc.nextInt();
		Node value =	binarySearch.search(node,key);
		if (value == null) {
			System.out.println("Element not Found");
		}else {
			System.out.println("Element Found that is Key and Element values are same "+ value.getData());
		}
		
		System.out.println("Please Enter the Element , you need to insert into Binary Search Tree ");
		int insertingNode = sc.nextInt();
		Node newNode = new Node(insertingNode);
		InsertIntoBinarySearchTree tree = new InsertIntoBinarySearchTree();
		Node nodeInserted =  tree.insertIntoBST(node,newNode);
		terverse.doInOrderTraversal(node);
	
	
	
		
		
	}

		

	

}
