public class Codec {
        
        // Encodes a tree to a single string.
        public String serialize(TreeNode root) {
                if (root == null) return "";
                StringBuilder result = new StringBuilder();
                Stack<TreeNode> stack = new Stack<>();
                stack.push(root);
                while (!stack.isEmpty()) {
                        TreeNode node = stack.pop();
                        result.append(node.val + " ");
                        if (node.right != null) stack.push(node.right);
                        if (node.left != null) stack.push(node.left);
                }
                return result.toString();
        }
        // Decodes your encoded data to tree.
        public TreeNode deserialize(String data) {
                if (data == "") return null;
                String[] str = data.split(" ");
                Queue<Integer> queue = new LinkedList<>();
                for (String s : str) {
                        queue.offer(Integer.parseInt(s));
                }
                return getNode(queue);
        }
        public TreeNode getNode(Queue<Integer> queue) {
                if (queue.isEmpty()) return null;
                TreeNode root = new TreeNode(queue.poll());
                Queue<Integer> smallerQ = new LinkedList<>();
                while (!queue.isEmpty() && queue.peek() < root.val) {
                        smallerQ.offer(queue.poll());
                }
                root.left = getNode(smallerQ);
                root.right = getNode(queue);
                return root;
        }
}
