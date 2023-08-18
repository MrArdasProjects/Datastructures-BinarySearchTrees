/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bstexample;

/**
 *
 * @author ekuru
 */
public class BinaryNode {
    
    private int element; // The data in the node
	private BinaryNode left; // Left child
	private BinaryNode right; // Right child
	
	public BinaryNode(int element)
	{
		this.element = element;
		this.left = null;
		this.right = null;
	}
	
	public BinaryNode(int element, BinaryNode left, BinaryNode right) {
		this.element = element;
		this.left = left;
		this.right = right;
	}

    public int getElement() {
        return element;
    }

    public void setElement(int element) {
        this.element = element;
    }

    public BinaryNode getLeft() {
        return left;
    }

    public void setLeft(BinaryNode left) {
        this.left = left;
    }

    public BinaryNode getRight() {
        return right;
    }

    public void setRight(BinaryNode right) {
        this.right = right;
    }
        
    
}
