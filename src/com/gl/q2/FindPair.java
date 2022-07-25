package com.gl.q2;
//Find Pair task in Lab 3
import java.util.HashSet;
public class FindPair {
    static class Node {
		int nodedata;
		Node leftNode, rightNode;
	} 
	static Node newNode (int nodeData)
	{
		Node temp = new Node () ;
		temp.nodedata = nodeData;
		temp.leftNode = null;
		temp.rightNode = null;
		return temp;
	}	
	public Node insert(Node root, int key)
	{
		if (root == null)  
			return newNode (key) ;	
		if (key<root.nodedata)	
			root.leftNode = insert (root.leftNode,key) ;
		else root.rightNode = insert (root.rightNode,key) ;
			return root;
	}
	public boolean findPairUtil (Node root, int sum, HashSet<Integer> set ) {
	
		if (root == null)
			return false;
		if (findPairUtil(root.leftNode,sum,set))
			return true;
		if (set.contains(sum-root.nodedata)) {
			System.out.println("Sameer's cool Java Program found this pair for you... (" + (sum-root.nodedata) + "," + root.nodedata + ")"); //Message when a pair is found
			return true;
	}
		else
			set.add(root.nodedata) ;
		return findPairUtil(root.rightNode,sum,set) ;
	}
	public void findPairwiththingivensum (Node root, int sum)
	{
	HashSet<Integer> set = new HashSet <Integer> () ;
	
	if (!findPairUtil(root, sum, set))	
		System.out.println("Oops! The pair for this number does not exist." + "\n") ; //Message if the pair does not exist for this number
   }
	public static void main(String[] args) {
		Node root = null;
		FindPair fp = new FindPair () ;
		root = fp.insert (root, 40) ;
		root = fp.insert (root, 20) ;
		root = fp.insert (root, 60) ;
		root = fp.insert (root, 10) ;
		root = fp.insert (root, 30) ;
		root = fp.insert (root, 50) ;
		root = fp.insert (root, 70) ;
	int sum = 130 ; // This is the key number for input/change. For example, if 130 changed to 300, then it is return the message that the pair for this number does not exist
	fp.findPairwiththingivensum (root,sum) ;
	}
}