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
        int sum;
        int count;

        Pair(int s,int c){
            this.sum=s;
            this.count=c;
        }
    }
    int count;
    public Pair solve(TreeNode node){
        if(node==null){
            return new Pair(0,0);
        }

        Pair left=solve(node.left);
        Pair right=solve(node.right);

        int sum=left.sum+right.sum+node.val;
        int cnt=left.count+right.count+1;

        int average=sum/cnt;

        if(average==node.val){
            count++;
        }

        return new Pair(sum,cnt);
    }

    public int averageOfSubtree(TreeNode root) {
        count=0;
        Pair p=solve(root);

        return count;
    }
}