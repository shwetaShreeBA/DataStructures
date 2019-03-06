package com.pathpartnertech.binarytreeTest;

import java.util.Scanner;

public class FindSizeOFBinaryTree {

	

	private static int findSizeOfTree(Node node) {
		
		if(node==null) {
			return 0;
		}
		
		int sizeOfLeft = findSizeOfTree(node.left);
		int sizeOfRight = findSizeOfTree(node.right);
		return sizeOfLeft + sizeOfRight + 1;
		
	}
	
public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Finding the Size of the Binary Tree");
		int sizeOfTheTree = sc.nextInt();
		System.out.println("Enter the Nodes in the Tree ");
		int[] tree = new int[sizeOfTheTree];
		for(int i=0;i<sizeOfTheTree ;i++) {
			System.out.println("Enter the Element at Node "+i);
			tree[i] =sc.nextInt();
		}
		sc.close();
		InOrderTraverse traverse = new InOrderTraverse();
		Node node =traverse.insertNode(tree, null, 0);
		
		System.out.println("The Size of the Tree is "+findSizeOfTree(node));
		
		

	}
	
	

	

}
