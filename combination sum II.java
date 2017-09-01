class Solution {
        public List<List<Integer>> combinationSum2(int[] candidates, int target) {
                List<List<Integer>> result = new ArrayList<>();
                Arrays.sort(candidates);
                backtrack(result, new ArrayList<>(), candidates, 0, target);
                return result;
        }
        public void backtrack(List<List<Integer>> result, List<Integer> temp, int[] candidates, int start, int target){
                if(target < 0) return;
                if(target == 0){
                        result.add(new ArrayList<Integer>(temp));
                        return;
                }
                
                for(int i =start; i < candidates.length; i++){
                        if(i > start && candidates[i] == candidates[i-1] ) continue;
                        temp.add(candidates[i]);
                        backtrack(result, temp, candidates, i + 1, target - candidates[i]);
                        temp.remove(temp.size() - 1);
                        
                }
        }
}
