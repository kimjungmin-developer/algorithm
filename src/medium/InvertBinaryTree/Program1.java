package medium.InvertBinaryTree;

import java.util.*;

class Program {
    public static void invertBinaryTree(BinaryTree tree) {
        if (tree == null) {
            return;
        }
        swapLeftANdRight(tree);
        invertBinaryTree(tree.left);
        invertBinaryTree(tree.right);
    }

    private static void swapLeftANdRight(BinaryTree tree) {
        BinaryTree left = tree.left;
        tree.left = tree.right;
        tree.right = left;
    }

    static class BinaryTree {
        public int value;
        public BinaryTree left;
        public BinaryTree right;

        public BinaryTree(int value) {
            this.value = value;
        }
    }
}
