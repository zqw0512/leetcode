public class Solution {
        public TreeNode invertTree(TreeNode root) {
                if (root == null) return root;
                Queue<TreeNode> queue = new LinkedList<>();
                queue.offer(root);
                
                while (!queue.isEmpty()) {
                        int size = queue.size();
                        for(int i = 0; i < size; i++){
                                TreeNode node = queue.poll();
                                TreeNode temp = node.left;
                                node.left = node.right;
                                node.right = temp;
                                if (node.left != null) queue.offer(node.left);
                                if (node.right != null) queue.offer(node.right);
                        }
                }
                return root;
        }
}
