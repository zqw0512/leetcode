/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
        public List<TreeNode> generateTrees(int n) {
                if (n == 0) return new ArrayList<>();
                return genTreeList(1, n);
        }
        public List<TreeNode> genTreeList(int start, int end) {
                List<TreeNode> list = new ArrayList<>();
                if (start < end) {
                        list.add(null);
                }
                for (int i = start - 1; i <= end; i++) {
                        List<TreeNode> leftList = genTreeList(start, i - 1);
                        List<TreeNode> rightList = genTreeList(i + 1, end);
                        for (TreeNode left : leftList) {
                                for (TreeNode right : rightList) {
                                        TreeNode root = new TreeNode(i);
                                        root.left = left;
                                        root.right = right;
                                        List.add(root);
                                }
                        }
                }
                return list;
        }
}
