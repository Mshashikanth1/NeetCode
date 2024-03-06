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
       Iterative solution :
       Time : O(n)
       Space : O(n)
     */
        Queue<Integer> maxHeap;
        public int kthSmallest1(TreeNode root, int k) {
            maxHeap=new PriorityQueue<>((a,b)->b-a);
            Stack<TreeNode> stack=new Stack<>();
            stack.push(root);
            while(!stack.isEmpty()){
                TreeNode top=stack.pop();
                maxHeap.offer(top.val);
                if(maxHeap.size()>k) maxHeap.poll();
                if(top.left!=null) stack.push(top.left);
                if(top.right!=null) stack.push(top.right);
            }
            return maxHeap.poll();
    }

/**
recursive approach 
Time : O(n)
Space : O(n)
 */
    public int kthSmallest(TreeNode root, int k) {
           maxHeap=new PriorityQueue<>((a,b)->b-a);
           kthSmallestHepler(root,k,maxHeap);
           return maxHeap.poll();
    }
     public  void kthSmallestHepler(TreeNode root, int k, Queue<Integer> maxHeap) {
             if(root==null) return;
             maxHeap.offer(root.val);
             if(maxHeap.size()>k) maxHeap.poll();

             kthSmallestHepler(root.left,k,maxHeap);
             kthSmallestHepler(root.right,k,maxHeap);
     }

}

/**
230. Kth Smallest Element in a BST
Solved
Medium
Topics
Companies
Hint
Given the root of a binary search tree, and an integer k, return the kth smallest value (1-indexed) of all the values of the nodes in the tree.

 

Example 1:


Input: root = [3,1,4,null,2], k = 1
Output: 1
Example 2:


Input: root = [5,3,6,2,4,null,null,1], k = 3
Output: 3
 

Constraints:

The number of nodes in the tree is n.
1 <= k <= n <= 104
0 <= Node.val <= 104
 

Follow up: If the BST is modified often (i.e., we can do insert and delete operations) and you need to find the kth smallest frequently, how would you optimize?


 */
