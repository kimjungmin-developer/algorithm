package medium.ValidateBST;

import java.util.*;

class Program {
    public static boolean validateBst(BST tree) {
        return validateBST(tree, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    private static boolean validateBST(BST tree, int minValue, int maxValue) {
        if (tree.value < minValue || tree.value >= maxValue) {
            return false;
        }
        if (tree.left != null && !validateBST(tree.left, minValue, tree.value)) {
            return false;
        }
        if (tree.right != null && !validateBST(tree.right, tree.value, maxValue)) {
            return false;
        }
        return true;
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
