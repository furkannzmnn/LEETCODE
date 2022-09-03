package org.example;


import java.util.List;

public class TreeNode {

    private int val;
    private TreeNode right;
    private TreeNode left;

    public TreeNode(int val) {
        this.val = val;
    }

    public TreeNode(int val, TreeNode right, TreeNode left) {
        this.val = val;
        this.right = right;
        this.left = left;
    }

    public TreeNode() {
    }

    public List<String> binaryTreePaths(TreeNode root) {
        final TreeNode left = root.left;
        final TreeNode right = root.right;
        String output = "";


        output += root.val + "->";
        if (left != null) {
            output += left.val +  "->";
            while (left.left  != null) {
                output = output +  left.val + "->";
            }
        }
        while (left.right != null) {
            output = output + left.right.val + "->";
        }

        final List<String> list = binaryTreePaths(root);


        output = output.substring(0, output.length() -1);
        return List.of(output);


    }


    public int getVal() {
        return val;
    }



    public static void main(String[] args) {
        TreeNode node = new TreeNode(1, new TreeNode(2,   new TreeNode(5), null), new TreeNode(3));
        node.binaryTreePaths(node);
    }
}
