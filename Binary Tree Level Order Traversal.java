public class Solution {
        public List<List<Integer>> levelOrder(TreeNode root) {
                Queue<TreeNode> queue = new LinkedList<TreeNode>();
                List<List<Integer>> wrapList = new LinkedList<List<Integer>>();
                
                if (root == null) {
                        return wrapList;
                }
                queue.offer(root);
                
                while (!queue.isEmpty()) {
                        int levelNum = queue.size();
                        List<Integer> subList = new LinkedList<Integer>();
                        for (int i = 0; i < levelNum; i++) {
                                if (queue.peek().left != null)  queue.offer(queue.peek().left);
                                if (queue.peek().right != null) queue.offer(queue.peek().right);
                                subList.add(queue.poll().val);
                        }
                        wrapList.add(subList);
                }
                return wrapList;
        }
}
public class Solution{
        public List<List<Integer>> levelOrder(TreeNode root){
                List<List<Integer>> result= new LinkedList<>();
                Queue<TreeNode> queue = new LinkedList<TreeNode>();
                
                if (root == null) {
                        return result;
                }
                queue.offer(root);
                
                while (!queue.isEmpty()) {
                        int level = queue.size();
                        List<Integer> temp = new LinkedList<Integer>();
                        
                        for (int i = 0; i < level; i++) {
                                TreeNode node = queue.poll();
                                if (node.left != null) queue.offer(node.left);
                                if (node.right !=null) queue.offer(node.right);
                                temp.add(node.val);
                        }
                        result.add(temp);
                }
                return result;
        }
}
