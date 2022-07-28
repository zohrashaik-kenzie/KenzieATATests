package com.kenzie.examples.week26.trees;

import java.util.ArrayDeque;
import java.util.Queue;

public class BreadthFirstSearch {
    public static boolean traverseBFS(TreeNode root, String searchFor) {
        // Store nodes in a queue
        Queue<TreeNode> queue = new ArrayDeque<>();
        // Keep track of which node you're current searching
        TreeNode current = root;
        queue.add(root);
        while(!queue.isEmpty()) {
            // Investigate next node on the queue
            current = queue.poll();
            // Check for match
            if (current.getData().equals(searchFor)) {
                return true;
            }
            // Add the children
            if(current.getChildren() != null) {
                queue.addAll(current.getChildren());
            }
        }
        // Queue is empty... no match found
        return false;
    }

    public static void main(String[] args) {

    }


}
