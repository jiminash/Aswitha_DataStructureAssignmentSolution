package com.gl.dsaproject.model;

public class BSTToSkewed {
	public Node node;
	private Node prevNode = null;
	private Node rootNode = null;

	public Node getRootNode() {
		return rootNode;
	}
	 public static class Node{
		int key;
		public Node left;
		public Node right;

		public Node(int key){
			this.key = key;
			left = null;
			right = null;
		}

	}
	public void BTToSkewed(Node root) {

		if(root == null) {
			return;
		}

		BTToSkewed(root.left);
		Node rightNode = root.right;
		if(rootNode == null)
		{
			rootNode = root;
			root.left = null;
			prevNode = root;
		}
		else
		{
			prevNode.right = root;
			root.left = null;
			prevNode = root;
		}
		BTToSkewed(rightNode);

	}

	public  void printRightSkewed(Node root)
	{
		if(root == null)
		{
			return;
		}
		System.out.print(root.key + " ");
		printRightSkewed(root.right);	
	}



	


}
