package easy.BranchSums;

import java.util.*;

class Program1 {
    // This is the class of the input root. Do not edit it.
    public static class BinaryTree {
        int value;
        BinaryTree left;
        BinaryTree right;

        BinaryTree(int value) {
            this.value = value;
            this.left = null;
            this.right = null;
        }
    }

    public static List<Integer> branchSums(BinaryTree root) {
        List<Integer> result = new ArrayList<>();
        int accumulator = 0;
        return branchSums(root, result, accumulator);
    }

    private static List<Integer> branchSums(BinaryTree root, List<Integer> result, int accumulator) {
        boolean isLeftExist = root.left != null;
        boolean isRightExist = root.right != null;
        accumulator = accumulator + root.value;
        if (!isLeftExist && !isRightExist) {
            result.add(root.value);
        }
        if (isLeftExist) {
            branchSums(root.left, result, accumulator);
        }
        if (isRightExist) {
            branchSums(root.right, result, accumulator);
        }
        return result;

    }
}

