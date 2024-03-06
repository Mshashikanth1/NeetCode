/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    /**
       dfs iterative approach
       Time :O(n)
       Space : O(n)

     */
    public TreeNode searchBST1(TreeNode root, int val) {
        Stack<TreeNode> stack=new Stack<>();
        stack.push(root);
        while(!stack.isEmpty()){
            TreeNode top=stack.pop();
            if(top.val==val) return top;
            else{
                if(top.left!=null)
                stack.push(top.left);
                if(top.right!=null)
                stack.push(top.right);
            }
        }
        return null;
    }

    /**
    recursive approach (optimal)
    Time : O(nlog(n))
    Space : O(1)
     */
    public TreeNode searchBST2(TreeNode root, int val) {
            if(root==null) return null;   
            else if(root.val==val) return root;   //base case 
            else if(root.val > val) return searchBST(root.left,val); //do smallest amout of work possible
            return searchBST(root.right,val);
 
        }
    /**
    BFS  approach
    Time : O(n)
    Space  O(n) 
     */

        public TreeNode searchBST(TreeNode root, int val) {
                Queue<TreeNode> queue=new LinkedList<>();
                queue.offer(root);
                while(!queue.isEmpty()){
                    TreeNode first=queue.poll();
                    if(first.val==val) return first;
                    else if (first.left!=null) queue.offer(first.left);
                    else if(first.right!=null) queue.offer(first.right);

                }  
                return null;
        }

}

/*
700. Search in a Binary Search Tree
Solved
Easy
Topics
Companies
You are given the root of a binary search tree (BST) and an integer val.

Find the node in the BST that the node's value equals val and return the subtree rooted with that node. If such a node does not exist, return null.

 

Example 1:


Input: root = [4,2,7,1,3], val = 2
Output: [2,1,3]
Example 2:


Input: root = [4,2,7,1,3], val = 5
Output: []
 

Constraints:

The number of nodes in the tree is in the range [1, 5000].
1 <= Node.val <= 107
root is a binary search tree.
1 <= val <= 107


 */
