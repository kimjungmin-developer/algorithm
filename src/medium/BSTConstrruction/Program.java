package medium.BSTConstrruction;

import java.util.*;

class Program {
    static class BST {
        public int value;
        public BST left;
        public BST right;

        public BST(int value) {
            this.value = value;
        }

        public BST insert(int value) {
            if (value < this.value) {
                if (this.left == null) {
                    this.left = new BST(value);
                }
                else {
                    this.left.insert(value);
                }
            }
            else if (value > this.value) {
                if (this.right == null) {
                    this.right = new BST(value);
                }
                else {
                    this.right.insert(value);
                }
            }
            return this;
        }

        public BST insert2(int value) {
            // Write your code here.
            // Do not edit the return statement of this method.
            if (value > this.value) {
                if (this.right == null) {
                    this.right = new BST(value);
                }
                else {
                    this.right.insert2(value);
                }
            }
            else if (value < this.value) {
                if (this.left == null) {
                    this.left = new BST(value);
                }
                else {
                    this.left.insert2(value);
                }
            }
            return this;
        }
        public boolean contains(int value) {
            if (value < this.value) {
                if (left == null) {
                    return false;
                }
                else {
                    return this.left.contains(value);
                }
            }
            else if (value > this.value) {
                if (right == null) {
                    return false;
                }
                else {
                    return this.right.contains(value);
                }
            }
            else {
                return true;
            }
        }

        public boolean contains2(int value) {
            if (value > this.value) {
                if (this.right == null) {
                    return false;
                }
                else {
                    return this.right.contains2(value);
                }
            }
            else if (value < this.value) {
                if (this.left == null) {
                    return false;
                }
                else {
                    return this.left.contains2(value);
                }
            }
            else {
                return true;
            }
        }

        public BST remove(int value) {
            remove(value, null);
            return this;
        }

        private void remove(int value, BST parent) {
            if (value < this.value) {
                if (left != null) {
                    left.remove(value, this);
                }
            }
            else if (value > this.value) {
                if (right != null) {
                    right.remove(value, this);
                }
            }
            else {
                if (left != null && right != null) {
                    this.value = right.getMinValue();
                    this.right.remove(this.value, this);
                }
                else if (parent == null) {
                    if (left != null) {
                        this.value = left.value;
                        this.left = left.left;
                        this.right = left.right;
                    }
                    else if (right != null) {
                        this.value = right.value;
                        this.left = right.left;
                        this.right = right.right;
                    } else {

                    }
                }
                else if (parent.left == this) {
                    parent.left = left != null ? left : right;
                }
                else if (parent.right == this) {
                    parent.right = left != null ? left : right;
                }

            }
        }

        private int getMinValue() {
            if (this.left == null) {
                return this.value;
            }
            else {
                return left.getMinValue();
            }
        }
    }
}
