package oran.practice.easy.dfs;

import java.util.LinkedList;
import java.util.List;

/**
 * Given the root of a binary tree, return the inorder traversal of its nodes' values.
 *
 * Example 1:
 *
 * Input: root = [1,null,2,3]
 *
 * Output: [1,3,2]
 *
 * Explanation:
 *
 * 1 2/\3 4 / \5 \8 6/\7 9/
 *
 *
 *
 * Example 2:
 *
 * Input: root = [1,2,3,4,5,null,8,null,null,6,7,9] Output: [4,2,6,5,7,1,3,9,8]
 *
 * Explanation:
 *
 * Example 3:
 *
 * Input: root = []
 *
 * Output: []
 *
 * Example 4:
 *
 * Input: root = [1]
 *
 * Output: [1]
 *
 * Constraints:
 *
 * The number of nodes in the tree is in the range [0, 100]. -100 <= Node.val <= 100
 *
 *
 * Follow up: Recursive solution is trivial, could you do it iteratively?
 *
 * Let's break down the problem and the expected output for the given input:
 * 
 * Problem Explanation
 * 
 * You are given the root of a binary tree. The task is to return the inorder traversal of its
 * nodes' values.
 *
 * Inorder Traversal means:
 *  1) Traverse the left subtree.
 *  2) Visit the root node.
 *  3) Traverse the right subtree.
 * 
 * Input Tree The input is given as a level-order array: [1,2,3,4,5,null,8,null,null,6,7,9] This
 * represents the following binary tree: 1 / \ 2 3 / \ \ 4 5 8 / \ / 6 7 9 1 is the root. 2 is the
 * left child of 1. 3 is the right child of 1. 4 is the left child of 2. 5 is the right child of 2.
 * 8 is the right child of 3. 6 is the left child of 5. 7 is the right child of 5. 9 is the left
 * child of 8.
 * 
 * Inorder Traversal Steps Let's perform the inorder traversal step by step: Start at root (1), go
 * to left subtree (2). At 2, go to left subtree (4). At 4, no left child, visit 4. Back to 2, visit
 * 2. Go to right subtree of 2 (5). At 5, go to left subtree (6). At 6, no left child, visit 6. Back
 * to 5, visit 5. Go to right subtree of 5 (7). At 7, no left child, visit 7. Back to root (1),
 * visit 1. Go to right subtree of 1 (3). At 3, no left child, visit 3. Go to right subtree of 3
 * (8). At 8, go to left subtree (9). At 9, no left child, visit 9. Back to 8, visit 8.
 *
 * Final Inorder Traversal Sequence The nodes are visited in this order: [4, 2, 6, 5, 7, 1, 3, 9, 8]
 * 
 * Expected Output For the input: root = [1,2,3,4,5,null,8,null,null,6,7,9] root =
 * [1,2,3,4,5,null,8,null,null,6,7,9] The expected output is: [4,2,6,5,7,1,3,9,8]
 */
public class BinaryTreeInorderTraversal {
    public List<Integer> inorderTraversal (TreeNode root) {
        List<Integer> inorderTraversalTree = new LinkedList<>();
        if (root == null) {
            return inorderTraversalTree;
        }
        //Recursive case
//        if(root.left == null && root.right == null) {
//            inorderTraversalTree.add(0, root.val );
//            return inorderTraversalTree;
//        }
//        if(root.left == null) {
//            inorderTraversalTree.add(root.val);
//            inorderTraversalTree.addAll(inorderTraversal(root.right));
//            return inorderTraversalTree;
//        }
//        if(root.right == null) {
//            inorderTraversalTree.addAll(inorderTraversal(root.left));
//            inorderTraversalTree.add(root.val);
//            return inorderTraversalTree;
//        }
//        else{
//            inorderTraversalTree.addAll(inorderTraversal(root.left));
//            inorderTraversalTree.add(root.val);
//            inorderTraversalTree.addAll(inorderTraversal(root.right));
//            return inorderTraversalTree;
//        }
        //Iterative case
        /*
            To implement an iterative solution for binary tree inorder traversal,
            you use a stack to simulate the recursive call stack. The main idea is:
                1) Start from the root node.
                2) Go as left as possible, pushing nodes onto the stack.
                3) When you reach a null, pop from the stack, visit the node, and move to its right child.
                4) Repeat until both the stack is empty and the current node is null.
            Let's check your current code and add a correct iterative implementation for the inorder traversal. I will also ensure the main method builds the tree from [1,2,3,4,5,null,8,null,null,6,7,9] and prints the output.
         */
        LinkedList<TreeNode> stack = new LinkedList<>();
        TreeNode current = root;
        while (current != null || !stack.isEmpty()) {
            while (current != null) {
                stack.push(current);
                current = current.left;
            }
            //if we reached here, it means the current is null, so we pop from stack
            current = stack.pop();
            //visit the node
            inorderTraversalTree.add(current.val);
            //move to the right subtree
            current = current.right;
        }
        return inorderTraversalTree;
    }

    public static void main(String[] args) {
        // Build tree from [1,2,3,4,5,null,8,null,null,6,7,9]
        TreeNode root = new TreeNode(1,
            new TreeNode(2,
                new TreeNode(4),
                new TreeNode(5,
                    new TreeNode(6),
                    new TreeNode(7)
                )
            ),
            new TreeNode(3,
                null,
                new TreeNode(8,
                    new TreeNode(9),
                    null
                )
            )
        );
        System.out.println(new BinaryTreeInorderTraversal().inorderTraversal(root));
    }
}
