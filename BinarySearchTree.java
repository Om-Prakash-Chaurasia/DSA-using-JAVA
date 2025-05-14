/*
 * Binary Search Tree :- It is the evolved version of Binary Tree i.e. It has
 * properties of Binary Tree as well as it has its own additional properties
 * too.
 * 
 * It is more preferred because where Binary Tree has TC = O(n), Binary Search
 * Tree has TC = O(H) where H = Height ~ logn if the tree is perfectly balanced.
 * 
 * Binary Search Tree (BST) Properties :-
 * 1. Left Subtree Nodes < Root.
 * 2. Right Subtree Nodes > Root.
 * 3. Left and Right Subtree are also BST with no duplicates.
 * 
 * NOTE :- In BST duplicates can exists but under that condition we have
 * different rules and it is explicitly mention that duplicates exists
 * and you will have to modify your code accordingly.
 * For our studies we won't take duplicates.
 * 
 * Special Property of a BST :-
 * In-order Traversal of BST gives a sorted sequence i.e. Left Subtree, Root and
 * Right Subtree arrangement will result in ascending order sequence.
 * 
 * BST Search :- BST makes Search efficient. In case of Skewed Tree the TC =
 * O(n)
 * 
 * 90% of the problems of BST is solved using Recursion i.e. by dividing into
 * sub-problems and making recursive calls on Subtrees.
 */

// Qs. How to Build a Binary Search Tree?

// public class BinarySearchTree {
// static class Node {
// int data;
// Node left;
// Node right;

// Node(int data) {
// this.data = data;
// }
// }

// public static Node insert(Node root, int val) {
// if (root == null) {
// root = new Node(val);
// return root;
// }

// if (root.data > val) {
// // Left Subtree
// root.left = insert(root.left, val);
// } else {
// root.right = insert(root.right, val);
// }

// return root;
// }

// public static void inorder(Node root) {
// if (root == null) {
// return;
// }

// inorder(root.left);
// System.out.print(root.data + " ");
// inorder(root.right);
// }

// public static void main(String[] args) {
// int values[] = { 5, 1, 3, 4, 2, 7 };
// Node root = null;

// for (int i = 0; i < values.length; i++) {
// root = insert(root, values[i]);
// }

// inorder(root);
// System.out.println();
// }
// }
/*---------------------------------------------------------------- */

// Qs. Search in a BST. TC = O(H)
// Level Easy
// This problem is from LeetCode Search in a Binary Search Tree.

// public class BinarySearchTree {
// static class Node {
// int data;
// Node left;
// Node right;

// Node(int data) {
// this.data = data;
// }
// }

// public static Node insert(Node root, int val) {
// if (root == null) {
// root = new Node(val);
// return root;
// }

// if (root.data > val) {
// // Left Subtree
// root.left = insert(root.left, val);
// } else {
// root.right = insert(root.right, val);
// }

// return root;
// }

// public static void inorder(Node root) {
// if (root == null) {
// return;
// }

// inorder(root.left);
// System.out.print(root.data + " ");
// inorder(root.right);
// }

// // Search in BFS.
// public static boolean search(Node root, int key) {
// if (root == null) {
// return false;
// }
// if (root.data > key) {
// // Search in Left Subtree
// return search(root.left, key);
// } else if (root.data < key) {
// // Search in Right Subtree
// return search(root.right, key);
// } else {
// // root.data == val;
// return true;
// }
// }

// public static void main(String[] args) {
// int values[] = { 8, 5, 3, 1, 4, 6, 10, 11, 14 };
// Node root = null;

// for (int i = 0; i < values.length; i++) {
// root = insert(root, values[i]);
// }

// inorder(root);
// System.out.println();

// if (search(root, 5)) {
// System.out.println("Found");
// } else {
// System.out.println("Not found");
// }
// }
// }
/*---------------------------------------------------------------- */

// VVI Qs. Delete a Node. (Adobe)
// Level Medium
// This problem is from LeetCode Delete Node in a BST.

// Solution :-

/*
 * Here, three cases can happen; 1. Leaf Node, 2. One Child, 3. Two Children
 * 
 * Case 1 :- Leaf Node (No Child) :- Here we will delete the Child and attach
 * null to the parent.
 * 
 * Case 2 :- One Child :- Here we will delete the Node and attach its Child to
 * parent.
 * 
 * Case 3 :- Two Children :- Here we will replace value with in-order successor,
 * and then Delete the node for in-order successor. In-order successor will
 * either have No Child or have only one Child and it will always be the
 * left-most Node in Right Subtree.
 */

// public class BinarySearchTree {
// static class Node {
// int data;
// Node left;
// Node right;

// Node(int data) {
// this.data = data;
// }
// }

// public static Node insert(Node root, int val) {
// if (root == null) {
// root = new Node(val);
// return root;
// }

// if (root.data > val) {
// // Left Subtree
// root.left = insert(root.left, val);
// } else {
// root.right = insert(root.right, val);
// }

// return root;
// }

// public static void inorder(Node root) {
// if (root == null) {
// return;
// }

// inorder(root.left);
// System.out.print(root.data + " ");
// inorder(root.right);
// }

// // Search and Delete in BFS.
// public static Node delete(Node root, int val) {
// if (root.data > val) {
// root.left = delete(root.left, val);
// } else if (root.data < val) {
// root.right = delete(root.right, val);
// } else {
// // root.data == val;

// // Case 1 :-
// if (root.left == null && root.right == null) {
// return null;
// }

// // Case 2 :-
// if (root.left == null) {
// return root.right;
// } else if (root.right == null) {
// return root.left;
// }

// // Case 3 :-
// Node IS = inorderSuccessor(root.right);
// root.data = IS.data;
// root.right = delete(root.right, IS.data);
// }

// return root;
// }

// public static Node inorderSuccessor(Node root) {
// while (root.left != null) {
// root = root.left;
// }

// return root;
// }

// public static void main(String[] args) {
// int values[] = { 8, 5, 3, 1, 4, 6, 10, 11, 14 };
// Node root = null;

// for (int i = 0; i < values.length; i++) {
// root = insert(root, values[i]);
// }

// inorder(root);
// System.out.println();

// delete(root, 1);
// inorder(root);
// }
// }
/*---------------------------------------------------------------- */

// VVI Qs. Print in Range where X = 6 and Y = 10.

// public class BinarySearchTree {
// static class Node {
// int data;
// Node left;
// Node right;

// Node(int data) {
// this.data = data;
// }
// }

// public static Node insert(Node root, int val) {
// if (root == null) {
// root = new Node(val);
// return root;
// }

// if (root.data > val) {
// // Left Subtree
// root.left = insert(root.left, val);
// } else {
// root.right = insert(root.right, val);
// }

// return root;
// }

// public static void inorder(Node root) {
// if (root == null) {
// return;
// }

// inorder(root.left);
// System.out.print(root.data + " ");
// inorder(root.right);
// }

// // Print in Range.
// public static void printInRange(Node root, int X, int Y) {
// if (root == null) {
// return;
// }

// if (root.data >= X && root.data <= Y) {
// printInRange(root.left, X, Y);
// System.out.println(root.data + " ");
// printInRange(root.right, X, Y);
// } else if (root.data >= Y) {
// printInRange(root.left, X, Y);
// } else {
// printInRange(root.right, X, Y);
// }
// }

// public static void main(String[] args) {
// int values[] = { 8, 5, 3, 1, 4, 6, 10, 11, 14 };
// Node root = null;

// for (int i = 0; i < values.length; i++) {
// root = insert(root, values[i]);
// }

// inorder(root);
// System.out.println();

// printInRange(root, 6, 10);
// }
// }
/*---------------------------------------------------------------- */

// Qs. Root to Leaf Paths.

// Solution :-
// For this is we need a data structure which can add multiple items i.e. 
// we will use ArrayList to add the paths here since ArrayList doesn't 
// have any fixed size.

import java.util.ArrayList;

public class BinarySearchTree {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
        }
    }

    public static Node insert(Node root, int val) {
        if (root == null) {
            root = new Node(val);
            return root;
        }

        if (root.data > val) {
            // Left Subtree
            root.left = insert(root.left, val);
        } else {
            root.right = insert(root.right, val);
        }

        return root;
    }

    public static void inorder(Node root) {
        if (root == null) {
            return;
        }

        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    // Root to Leaf Path
    public static void printRoot2Leaf(Node root, ArrayList<Integer> path) {
        if (root == null) {
            return;
        }

        path.add(root.data);

        // Leaf Node Condition
        if (root.left == null && root.right == null) {
            printPath(path);
        } else {
            // Non-Leaf Nodes Condition
            printRoot2Leaf(root.left, path);
            printRoot2Leaf(root.right, path);
        }

        path.remove(path.size() - 1);
    }

    public static void printPath(ArrayList<Integer> path) {
        for (int i = 0; i < path.size(); i++) {
            System.out.print(path.get(i) + "->");
        }

        System.out.println();
    }

    public static void main(String[] args) {
        int values[] = { 8, 5, 3, 1, 4, 6, 10, 11, 14 };
        Node root = null;

        for (int i = 0; i < values.length; i++) {
            root = insert(root, values[i]);
        }

        inorder(root);
        System.out.println();

        printRoot2Leaf(root, new ArrayList<>());
    }
}
/*---------------------------------------------------------------- */