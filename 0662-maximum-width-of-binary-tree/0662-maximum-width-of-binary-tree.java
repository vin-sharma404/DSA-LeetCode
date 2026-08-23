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
    class Pair{
        TreeNode node;
        int idx;   

        Pair(TreeNode node,int idx){
            this.node=node;
            this.idx=idx;
        }
    }
    public int widthOfBinaryTree(TreeNode root) { 
        if(root==null){
            return 0;
        }
        Queue<Pair> q= new LinkedList<>();
        q.offer(new Pair(root,0));

        int maxWidth=0;
        while(!q.isEmpty()){
            int size=q.size();

            int firstIdx=q.peek().idx;
            int lastIdx=firstIdx;

            for(int i=0;i<size;i++){
                Pair curr=q.poll();
                lastIdx=curr.idx;
                if(curr.node.left!=null){
                    q.offer(new Pair(curr.node.left,2*curr.idx));
                }
                if(curr.node.right!=null){
                    q.offer(new Pair(curr.node.right,2*curr.idx+1));
                }
            }
            maxWidth= Math.max(maxWidth,(int)(lastIdx-firstIdx+1));
        }
        return maxWidth;
    }
}