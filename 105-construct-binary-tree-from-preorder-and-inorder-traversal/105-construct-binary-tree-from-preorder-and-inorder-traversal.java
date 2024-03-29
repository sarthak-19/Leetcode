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
class Solution 
{
    Map<Integer,Integer> inorderIndexMap;
    int preorderIndex;
    public TreeNode buildTree(int[] preorder, int[] inorder) 
    {
        preorderIndex=0;
        
        inorderIndexMap=new HashMap<>();
        for(int x=0;x<inorder.length;x++)
        {
            inorderIndexMap.put(inorder[x],x);
        }
        
        return arrayToTree(preorder,0,preorder.length-1);
    }
    
    public TreeNode arrayToTree(int preorder[],int left,int right)
    {
        if(left>right)
        {
            return null;
        }
        int rootValue=preorder[preorderIndex++];
        
        TreeNode root=new TreeNode(rootValue);
        root.left=arrayToTree(preorder,left,inorderIndexMap.get(rootValue)-1);
        
        root.right=arrayToTree(preorder,inorderIndexMap.get(rootValue)+1,right);
        return root;
    }
}