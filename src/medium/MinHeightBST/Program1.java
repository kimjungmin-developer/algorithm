package medium.MinHeightBST;

import java.util.*;

class Program {
    public static BST minHeightBst(List<Integer> array) {
        // Write your code here.
        return constructMinHeightBst(array, 0, array.size() -1);
    }

    private static BST constructMinHeightBst(List<Integer> array, int start, int end) {
        if (start > end) return null;
        int middle = (start + end) / 2;
        BST newNode = new BST(array.get(middle));
        newNode.left = constructMinHeightBst(array, start, middle - 1);
        newNode.right = constructMinHeightBst(array, middle + 1,end);
        return newNode;
    }

    static class BST {
        public int value;
        public BST left;
        public BST right;

        public BST(int value) {
            this.value = value;
            left = null;
            right = null;
        }

        public void insert(int value) {
            if (value < this.value) {
                if (left == null) {
                    left = new BST(value);
                } else {
                    left.insert(value);
                }
            } else {
                if (right == null) {
                    right = new BST(value);
                } else {
                    right.insert(value);
                }
            }
        }
    }
}

