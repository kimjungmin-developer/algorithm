package medium.BSTTraversal;

import java.util.*;

class Program {
    public static List<Integer> inOrderTraverse(BST tree, List<Integer> array) {
        inOrderTraverseHelper(tree, array);
        return array;
    }

    private static void inOrderTraverseHelper(BST tree, List<Integer> array) {
        if (tree == null) {
            return;
        }
        inOrderTraverseHelper(tree.left, array);
        array.add(tree.value);
        inOrderTraverseHelper(tree.right, array);
    }

    public static List<Integer> preOrderTraverse(BST tree, List<Integer> array) {
        preOrderTraverseHelper(tree, array);
        return array;
    }

    private static void preOrderTraverseHelper(BST tree, List<Integer> array) {
        if (tree == null) {
            return;
        }
        array.add(tree.value);
        preOrderTraverseHelper(tree.left, array);
        preOrderTraverseHelper(tree.right, array);
    }

    public static List<Integer> postOrderTraverse(BST tree, List<Integer> array) {
        // Write your code here.
        postOrderTraverseHelper(tree, array);
        return array;
    }

    private static void postOrderTraverseHelper(BST tree, List<Integer> array) {
        if (tree == null) {
            return;
        }
        postOrderTraverseHelper(tree.left, array);
        postOrderTraverseHelper(tree.right, array);
        array.add(tree.value);
    }

    static class BST {
        public int value;
        public BST left;
        public BST right;

        public BST(int value) {
            this.value = value;
        }
    }
}