public class Solution {
        public List<List<Integer>> combinationSum(int[] candidates, int target) {
                List<List<Integer>> result = new ArrayList<>();
                if(candidates == null || candidates.length == 0) return result;
                backtrack(result, new ArrayList<Integer>(), candidates, 0, target);
                return result;
        }
        public void backtrack(List<List<Integer>> result, List<Integer> temp, int[] candidates, int start, int target){
                if (target < 0) return;
                if (target == 0) {
                        result.add(new ArrayList<>(temp));
                        return;
                }
                
                for (int i = start; i < candidates.length; i++) {
                        temp.add(candidates[i]);
                        backtrack(result, temp, candidates, i, target - candidates[i]);
                        temp.remove(temp.size() - 1);
                }
        }
}
