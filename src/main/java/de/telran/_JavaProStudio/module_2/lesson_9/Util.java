package de.telran._JavaProStudio.module_2.lesson_9;

/*
BinaryTree
 */


import de.telran.module_2.lesson_9.Node;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

class Util {
    public static void breadthFirstSearch(de.telran.module_2.lesson_9.Node node, int key) {
        Queue<de.telran.module_2.lesson_9.Node> queue = new LinkedList<>();
        queue.add(node);

        while (!queue.isEmpty()) {
            de.telran.module_2.lesson_9.Node tempNode = queue.poll();
            System.out.print(tempNode.getValue() + " ");
            if(tempNode.getKey() == key)
                return; // мы нашли этот ключ

            /*Enqueue left child */
            if (tempNode.getLeft() != null) {
                queue.add(tempNode.getLeft());
            }

            /*Enqueue right child */
            if (tempNode.getRight() != null) {
                queue.add(tempNode.getRight());
            }
        }
    }

    public static void depthPostorder(de.telran.module_2.lesson_9.Node node) {
        if (node == null)
            return;

        // first recur on left subtree
        depthPostorder(node.getLeft());

        // then recur on right subtree
        depthPostorder(node.getRight());

        // now deal with the node
        System.out.print(node.getValue() + " ");
    }

    /* Given a binary tree, print its nodes in inorder*/
    public static void depthInorder(de.telran.module_2.lesson_9.Node node) {
        if (node == null)
            return;

        /* first recur on left child */
        depthInorder(node.getLeft());

        /* then print the data of node */
        System.out.print(node.getValue() + " ");

        /* now recur on right child */
        depthInorder(node.getRight());
    }

    public static void depthInorderStack(de.telran.module_2.lesson_9.Node node) {
        if (node == null)
            return;


        Stack<de.telran.module_2.lesson_9.Node> s = new Stack<>();
        de.telran.module_2.lesson_9.Node current = node;

        // traverse the tree
        while (current != null || !s.isEmpty()) {

            /* Reach the left most Node of the
            curr Node */
            while (current != null) {
                /* place pointer to a tree node on
                   the stack before traversing
                  the node's left subtree */
                s.push(current);
                current = current.getLeft();
            }

            /* Current must be NULL at this point */
            current = s.pop();

            System.out.print(current.getValue() + " ");

            /* we have visited the node and its
               left subtree.  Now, it's right
               subtree's turn */
            current = current.getRight();
        }
    }

    /* Given a binary tree, print its nodes in preorder*/
    public static void depthPreorder(Node node) {
        if (node == null)
            return;

        /* first print data of node */
        System.out.print(node.getValue() + " ");

        /* then recur on left subtree */
        depthPreorder(node.getLeft());

        /* now recur on right subtree */
        depthPreorder(node.getRight());
    }
}