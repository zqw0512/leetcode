class Solution {
        int result = 0;
        int height = 0;
        
        public int findBottomLeftValue(TreeNode root) {
                if (root == null) return -1;
                helper(root, 1);
                return result;
        }
        
        public void helper(TreeNode root, int depth) {
                if (root == null) return;
                if (height < depth) {
                        result = root.val;
                        height = depth;
                }
                
                helper(root.left, depth + 1);
                helper(root.right, depth + 1);
        }
}
