/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bstexample;

/**
 *
 */
public class BST {
    /** Fields **/
	private BinaryNode root;
	
	/** Constructors **/
	public BST()
	{ 
		setRoot(null); 
	}
	
	/** Getters and Setters **/
	public BinaryNode getRoot() {
		return root;
	}

	public void setRoot(BinaryNode root) {
		this.root = root;
	}
        
	
	
	public BinaryNode insertRecursively(int newData, BinaryNode root){   
        if(root == null){
            root = new BinaryNode(newData);
            return root;
        }    
        if(root.getElement() > newData)   
            root.setLeft(insertRecursively(newData, root.getLeft()));
        else
            root.setRight(insertRecursively(newData, root.getRight()));        
        return root;
    }
    
	 public void insertIteratively(int newData){   
        
        BinaryNode current = this.getRoot();
        if(root == null){
            this.setRoot(new BinaryNode(newData));
        }
        else{
            
            while(true){
                if(current.getElement() > newData){
                    if(current.getLeft() == null){
                        current.setLeft(new BinaryNode(newData));
                        break;
                    }
                    current = current.getLeft();
                }else{
                    if(current.getRight() == null){
                        current.setRight(new BinaryNode(newData));
                        break;
                    }
                    current = current.getRight();
                }
            }     
        }
         }
         
          public int minValue(BinaryNode root){
        int min = root.getElement();
        
        while(root.getLeft() != null){
            min     = root.getLeft().getElement();
            root    = root.getLeft();
        }
        return min;
    }
          public int maxValue(BinaryNode root){
              int max=root.getElement();
              while(root.getRight() != null){
                  max=root.getRight().getElement();
                  root= root.getRight();
              
              }
              return max;
          
          }
          
          public BinaryNode deleteNode(BinaryNode root, int key){
        
        //If tree is empty...
        if(root == null)
            return null;
        
        //Otherwise go left or right subtree...
        if(key < root.getElement())
            root.setLeft(deleteNode(root.getLeft(),key));
        else if(key > root.getElement())
            root.setRight(deleteNode(root.getRight(),key));
        
        //if key is same as root's key then This is the node to be deleted...
            else{
                //if with only one child or no child...
                if(root.getLeft() == null)
                    return root.getRight();
                else if(root.getRight() == null)
                    return root.getLeft();
                
                //node with two childeren:Get the inorder succesor(smallest in the right subtree)
                root.setElement(minValue(root.getRight()));
                root.setRight(deleteNode(root.getRight(),root.getElement()));
            }
            return root;
    }
          
          public void printInOrder(BinaryNode current){
        
        if(current == null)
            return;    
        
        printInOrder(current.getLeft());
        System.out.print(current.getElement() + " ");
        printInOrder(current.getRight());
        
    }
          
          
}
    



