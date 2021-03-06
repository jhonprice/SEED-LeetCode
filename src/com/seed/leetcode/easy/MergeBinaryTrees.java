package com.seed.leetcode.easy;

/**
 * Created by 若宇 on 2017/9/13.
 */

public class MergeBinaryTrees {
    private class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
    //do not use loop
    private TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
        if(t1==null&&t2==null) return null;

        if(t1==null){
            return t2;
        }else if(t2==null){
            return t1;
        }

        TreeNode result = new TreeNode(t1.val+t2.val);
        result.left = mergeTrees(t1.left,t2.left);
        result.right = mergeTrees(t1.right,t2.right);
        return result;
    }
}
