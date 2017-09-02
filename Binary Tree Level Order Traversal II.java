class Solution {
        public List<List<Integer>> levelOrderBottom(TreeNode root) {
                List<List<Integer>> result = new LinkedList<>();
                Queue<TreeNode> queue = new LinkedList<>();
                
                if (root == null) return result;
                queue.offer(root);
                
                while (!queue.isEmpty()) {
                        int level = queue.size();
                        List<Integer> temp = new LinkedList<>();
                        for (int i=0; i<level; i++) {
                                TreeNode node = queue.poll();
                                if (node.left != null) queue.offer(node.left);
                                if (node.right != null) queue.offer(node.right);
                                temp.add(node.val);
                        }
                        result.add(0,temp);
                }
                return result;
        }
}
