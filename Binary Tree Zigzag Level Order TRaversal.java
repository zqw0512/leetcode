class Solution {
        public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
                List<List<Integer>> result = new LinkedList<>();
                Queue<TreeNode> queue = new LinkedList<>();
                
                if (root == null) return result;
                queue.offer(root);
                boolean bool = true;
                
                while (!queue.isEmpty()) {
                        int level = queue.size();
                        List<Integer> temp = new LinkedList<>();
                        for (int i = 0; i < level; i++) {
                                TreeNode node = queue.poll();
                                if (bool) {
                                        temp.add(node.val);
                                } else {
                                        temp.add(0, node. val);
                                }
                                if (node.left != null) queue.offer(node.left);
                                if (node.right != null) queue.offer(node.right);
                        }
                        result.add(temp);
                        bool = bool ? false : true;
                }
                return result;
        }
}
