package com.pathpartnertech.binarytreeTest;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LeafToRootBinaryTree {

	private static List<Integer> listOfValues = new ArrayList<Integer>(); 
	
	public boolean leafToRootdata(Node node , int sum , List<Integer> listOfValues) {
		
		if(node == null) {
			return false;
		}else if(node.left == null && node.right == null) {
			if(node.getData()== sum) {
				listOfValues.add(node.getData());
				return true;
			}else {
				return false;
			}
		}
		
		else if( leafToRootdata(node.left, sum-node.getData(),listOfValues )){
			listOfValues.add(node.getData());
			return true;
		}else if(leafToRootdata(node.right, sum-node.getData(), listOfValues)) {
			 listOfValues.add(node.getData());
			 return true;
		}
		return false;
	}
	
	
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number of Nodes");
		int num = sc.nextInt();
		System.out.println("Enter the Sum");
		int sum = sc.nextInt();
		System.out.println("Enter the Number of Nodes");
		int[] array = new int[num];
		for(int i=0;i< num; i++) {
			System.out.println("Enter node at "+ i);
			array[i] = sc.nextInt();
		}
		InOrderTraverse traverse = new InOrderTraverse();
		 Node node = traverse.insertNode(array, null, 0);
		LeafToRootBinaryTree leaf = new LeafToRootBinaryTree();
		boolean value = leaf.leafToRootdata(node, sum, listOfValues);
		if(value) {
			System.out.println("Sum of the values are "+ listOfValues);
		}
		
	}
	
}
