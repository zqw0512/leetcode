class Solution {
        public List<String> binaryTreePaths(TreeNode root) {
                List<String> result = new ArrayList<>();
                if(root == null) return result;
                helper(result, "", root);
                return result;
        }
        public static void helper(List<String> result, String s, TreeNode root) {
                if (root.left == null && root.right == null) {
                        result.add(s+root.val);
                }
                if (root.left != null) {
                        helper(result, s + root.val + "->", root.left);
                }
                if (root.right != null) {
                        helper(result, s + root.val + "->", root.right);
                }
        }
}
