package oran.practice.easy.dfs;

/**
 * 110. Balanced Binary Tree
 * Easy
 *
 * Given a binary tree, determine if it is height-balanced.
 *
 * Example 1:
 * Input: root = [3,9,20,null,null,15,7]
 * Output: true
 *
 * Example 2:
 * Input: root = [1,2,2,3,3,null,null,4,4]
 * Output: false
 *
 * Example 3:
 * Input: root = []
 * Output: true
 *
 * Constraints:
 *
 * The number of nodes in the tree is in the range [0, 5000].
 * -104 <= Node.val <= 104
 *
 * Binary Tree Overview
 * A binary tree is a hierarchical data structure where each node has at most two children, called the left child and right child.
 * The topmost node is called the root.
 *
 * Balanced Binary Tree
 * A binary tree is height-balanced if:
 *
 * The depths of the two subtrees of every node differ by at most 1
 * Both left and right subtrees are also balanced
 *
 * How to Check if Binary Tree is Balanced
 *  The algorithm uses DFS to compute heights and check balance simultaneously:
 *  Base case: Empty tree is balanced (height = 0)
 *  Recursive case: For each node, check if left and right subtrees are balanced
 *  Height difference: Ensure |leftHeight - rightHeight| ≤ 1
 *  Early termination: Return -1 if subtree is unbalanced
 */
public class BalancedBinaryTree {
    public boolean isBalanced(TreeNode root) {
        if(root==null){
            return true;
        }
        //Recursive DFS to check balance and compute height
        int leftTreeHeight = checkBalance(root.left);
        int rightTreeHeight = checkBalance(root.right);
        if(leftTreeHeight == -1 || rightTreeHeight == -1){
            return false;
        }
        return Math.abs(leftTreeHeight-rightTreeHeight) <=1;


    }
    int checkBalance(TreeNode node){
        if(node==null){
            return 0; //Height of empty tree is 0
        }
        int leftHeight=checkBalance(node.left);
        if(leftHeight==-1) return -1; //Left subtree is unbalanced
        int rightHeight=checkBalance(node.right);
        if(rightHeight==-1) return -1; //Right subtree is unbalanced
        if(Math.abs(leftHeight-rightHeight)>1){
            return -1; //Current node is unbalanced
        }
        return Math.max(leftHeight,rightHeight)+1; //Return height of subtree
    }

    public static void main(String[] args) {
        BalancedBinaryTree solution = new BalancedBinaryTree();

        // Example 1: Balanced tree
        TreeNode root1 = new TreeNode(3);
        root1.left = new TreeNode(9);
        root1.right = new TreeNode(20);
        root1.right.left = new TreeNode(15);
        root1.right.right = new TreeNode(7);
        boolean balanced = solution.isBalanced(root1);// Output: true
        System.out.println("Is the tree balanced? " + balanced);


    }
}
