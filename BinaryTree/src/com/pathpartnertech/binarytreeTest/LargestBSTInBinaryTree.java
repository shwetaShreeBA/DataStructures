package com.pathpartnertech.binarytreeTest;

import java.util.Scanner;

/**
 * Date 07/20/2014
 * @author swethashree
 * 
 * Video link - https://youtu.be/4fiDs7CCxkc
 * 
 * Given a binary tree, find size of largest binary search subtree in this
 * binary tree.
 * 
 * Traverse tree in post order fashion. Left and right nodes return 4 piece
 * of information to root which isBST, size of max BST, min and max in those
 * subtree. 
 * If both left and right subtree are BST and this node data is greater than max
 * of left and less than min of right then it returns to above level left size +
 * right size + 1 and new min will be min of left side and new max will be max of
 * right side.
 * 
 * References:
 * http://www.geeksforgeeks.org/find-the-largest-subtree-in-a-tree-that-is-also-a-bst/
 * https://leetcode.com/problems/largest-bst-subtree/
 */
public class LargestBSTInBinaryTree {

    public int largestBST(Node root)
    {
        MinMax m = largest(root);
        return m.size;
    }
    
    private MinMax largest(Node root)
    {
        //if root is null return min as Integer.MAX and max as Integer.MIN 
        if(root == null){
            return new MinMax();
        }
        
        //postorder traversal of tree. First visit left and right then
        //use information of left and right to calculate largest BST.
        MinMax leftMinMax = largest(root.left);
        MinMax rightMinMax =largest(root.right);
        
        MinMax m = new MinMax();
        
        //if either of left or right subtree says its not BST or the data
        //of this node is not greater/equal than max of left and less than min of right
        //then subtree with this node as root will not be BST. 
        //Return false and max size of left and right subtree to parent
       /* System.out.println(leftMinMax.max);
        System.out.println(rightMinMax.min);
        System.out.println(root.getData());
        */
        
        if(leftMinMax.isBST == false || rightMinMax.isBST == false || (leftMinMax.max > root.getData() || rightMinMax.min <= root.getData())){
            m.isBST = false;
            m.size = Math.max(leftMinMax.size, rightMinMax.size);
            return m;
        }
        
        //if we reach this point means subtree with this node as root is BST.
        //Set isBST as true. Then set size as size of left + size of right + 1.
        //Set min and max to be returned to parent.
        m.isBST = true;
        
        m.size = leftMinMax.size + rightMinMax.size + 1;
        
       // System.out.println(m.size);
        //if root.left is null then set root.data as min else
        //take min of left side as min
        m.min = root.left != null ? leftMinMax.min : root.getData();
        //System.out.println(m.min);
        
        //if root.right is null then set root.data as max else
        //take max of right side as max.
        m.max = root.right != null ? rightMinMax.max : root.getData();
        //System.out.println(m.max);
        
        return m;
    }
    
    public static void main(String args[]){
    	
    	System.out.println("Itterative Traversal");
		System.out.println("Enter the Number of Nodes");
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		System.out.println("Enter the Node values");
		int[] numberOfNodes = {-7,-6,-5,-4,-3,-2,1,2,3,16,6,10,11,12,14};
		/*for(int i=0;i<number;i++) 
		{
			System.out.println("Value in "+ i);
			numberOfNodes[i] = sc.nextInt();
		}*/
		sc.close();
		InOrderTraverse traverse = new InOrderTraverse();
		Node root =
		traverse.insertNode(numberOfNodes, null, 0);
    	
        LargestBSTInBinaryTree lbi = new LargestBSTInBinaryTree();
        int largestBSTSize = lbi.largestBST(root);
        System.out.println("Size of largest BST  is " + largestBSTSize);
        assert largestBSTSize == 8;
    }
}

/**
 * Object of this class holds information which child passes back
 * to parent node.
 */
class MinMax{
    int min;
    int max;
    boolean isBST;
    int size ;
    
    MinMax(){
        min = Integer.MAX_VALUE;
        
        max = Integer.MIN_VALUE;
        
        isBST = true;
        size = 0;
    }
}