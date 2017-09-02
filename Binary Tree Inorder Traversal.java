class Solution {
        public List<Integer> inorderTraversal(TreeNode root) {
                List<Integer> result = new LinkedList<>();
                Deque<TreeNode> stack = new LinkedList<>();
                TreeNode node = root;
                
                while (node != null || !stack.isEmpty()) {
                        while (node != null) {
                                stack.push(node);
                                node = node.left;
                        }
                        node = stack.pop();
                        result.add(node.val);
                        node = node.right;
                }
                return result;
        }
}
