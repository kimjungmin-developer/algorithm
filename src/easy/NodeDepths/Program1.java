package easy.NodeDepths;

import java.util.*;

class Program1 {

    public static int nodeDepths(BinaryTree root) {
        // Write your code here.
        return calculateNodeDepths(root, 0);
    }

    private static int calculateNodeDepths(BinaryTree root, int result) {
        if (root == null) return 0;
        return result + calculateNodeDepths(root.left, result + 1) + calculateNodeDepths(root.right, result + 1);
    }

    static class BinaryTree {
        int value;
        BinaryTree left;
        BinaryTree right;

        public BinaryTree(int value) {
            this.value = value;
            left = null;
            right = null;
        }
    }
}