package com.binarysearchtree;

public class BinarySearchTree<T extends Comparable<T>> {
    BinaryNode<T> root;

    /**
     * Method to insert a node in binary search tree
     */
    public void insert(T data) {
        BinaryNode<T> newNode = new BinaryNode<>();
        newNode.data = data;
        newNode.left = null;
        newNode.right = null;
        if (root == null) {
            root = newNode;
        } else {
            BinaryNode<T> tempNode = root;
            while (true) {
                if (data.compareTo(tempNode.data) > 0) {
                    if (tempNode.right == null) {
                        tempNode.right = newNode;
                        break;
                    } else {
                        tempNode = tempNode.right;
                    }
                } else if (data.compareTo(tempNode.data) < 0) {
                    if (tempNode.left == null) {
                        tempNode.left = newNode;
                        break;
                    } else {
                        tempNode = tempNode.left;
                    }
                } else {
                    System.out.println("Duplicate data not allowed in binary trees ");
                    break;
                }
            }
        }
    }
}
