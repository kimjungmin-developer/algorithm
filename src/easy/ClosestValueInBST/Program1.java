package easy.ClosestValueInBST;

class Program1 {
    public static int findClosestValueInBst(BST tree, int target) {
        // Write your code here.
        return findClosestValueInBst(tree, target, tree.value);
    }

    private static int findClosestValueInBst(BST tree, int target, int closest) {
        int newDifference = Math.abs(target - tree.value);
        int originalDifference = Math.abs(target - closest);
        if (newDifference < originalDifference) {
            closest = tree.value;
        }
        if (closest > target && tree.right != null) {
            return findClosestValueInBst(tree.right, target, closest);
        }
        if (closest < target && tree.left != null) {
            return findClosestValueInBst(tree.left, target, closest);
        }
        return closest;
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