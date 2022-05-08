package com.gl.dsaproject.service;

import com.gl.dsaproject.model.BSTToSkewed;
import com.gl.dsaproject.model.BSTToSkewed.Node;

public class ManageTransactionDriver {

	public static void main(String[] args) {

			BSTToSkewed tree = new BSTToSkewed();
			tree.node = new Node(50);
			tree.node.left = new Node(30);
			tree.node.right = new Node(60);
			tree.node.left.left = new Node(10);
			tree.node.right.left = new Node(55);
			tree.BTToSkewed(tree.node);
			tree.printRightSkewed(tree.getRootNode());
		}
	}
