class Solution {
        public List<Integer> postorderTraversal(TreeNode root) {
                List<Integer> result = new ArrayList<>();
                if (root == null) return result;
                helper(result , root);
                return result;
        }
        public void helper(List<Integer> result, TreeNode root) {
                if (root == null) return;
                helper(result, root.left);
                helper(result, root.right);
                result.add(root.val);
        }
}
