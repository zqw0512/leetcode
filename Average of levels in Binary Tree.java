class Solution {
        public List<Double> averageOfLevels(TreeNode root) {
                List<Double> result = new ArrayList<>();
                if (root == null) return result;
                Queue<TreeNode> queue = new LinkedList<>();
                queue.offer(root);
                
                while (!queue.isEmpty()) {
                        int size = queue.size();
                        double temp = 0;
                        for (int i = 0; i < size; i++) {
                                TreeNode node = queue.poll();
                                temp += node.val;
                                if (node.left != null) queue.offer(node.left);
                                if (node.right != null) queue.offer(node.right);
                        }
                        result.add(temp / size);
                }
                return result;
        }
}
