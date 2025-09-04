package oran.practice.easy.dfs;

import com.sun.source.tree.Tree;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Given a binary tree, find its minimum depth.
 *
 * The minimum depth is the number of nodes along the shortest path from the root node down to the nearest leaf node.
 *
 * Note: A leaf is a node with no children.
 *
 * Example 1:
 *
 * Input: root = [3,9,20,null,null,15,7]
 * Output: 2
 * Example 2:
 *
 * Input: root = [2,null,3,null,4,null,5,null,6]
 * Output: 5
 *
 * Constraints:
 *
 * The number of nodes in the tree is in the range [0, 105].
 * -1000 <= Node.val <= 1000
 */
public class MinimumDepthOfBinaryTree {
    public int minDepth(TreeNode root) {
        if(root==null){
            return 0;
        }
        //Iterative Solution
        //===================
        int depth = 1;
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            int size = q.size();
            for(int i=0;i<size;i++){
                TreeNode current = q.poll();
                if(current.left==null && current.right==null){
                    return depth;
                }
                if(current.left!=null){
                    q.add(current.left);
                }
                if(current.right!=null){
                    q.add(current.right);
                }
            }
            depth++;
        }
        return depth;

        //Recursive Solution
        //==================

//        if(root==null){
//            return 0;
//        }
//        if(root.left==null && root.right==null){
//            return 1;
//        }
//        if(root.left == null){
//            return minDepth(root.right)+1;
//        }
//        if(root.right==null){
//            return minDepth(root.left)+1;
//        }
//        int leftDepth = minDepth(root.left);
//        int rightDepth = minDepth(root.right);
//        return Math.min(leftDepth, rightDepth)+1;

    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1,new TreeNode(2,new TreeNode(3),null),new TreeNode(4,null,new TreeNode(5)));
        System.out.println(new MinimumDepthOfBinaryTree().minDepth(root));
    }
}
