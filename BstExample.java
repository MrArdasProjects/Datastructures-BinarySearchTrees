/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bstexample;

/**
 *
 */
public class BstExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        BST bst = new BST();
        bst.insertIteratively(7);
        bst.insertRecursively(8, bst.getRoot());
        bst.insertRecursively(3, bst.getRoot());
        
        bst.insertRecursively(1, bst.getRoot());
        bst.insertRecursively(4, bst.getRoot());
        bst.insertRecursively(5, bst.getRoot());
        bst.insertRecursively(6, bst.getRoot());
        
        bst.deleteNode(bst.getRoot(), 8);
        bst.deleteNode(bst.getRoot(), 9);
        System.out.println(bst.minValue(bst.getRoot()));
        System.out.println(bst.maxValue(bst.getRoot()));
        bst.printInOrder(bst.getRoot());
        
    }
    
}
