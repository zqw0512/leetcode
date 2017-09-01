class Solution {
        
        public List<List<Integer>> combinationSum3(int k, int n) {
                List<List<Integer>> result = new ArrayList<>();
                backtrack(result, new ArrayList<>(), 1, k, n );
                return result;
        }
        public void backtrack(List<List<Integer>> result, List<Integer> temp, int start, int k , int target){
                if(target < 0 || k < 0) return;
                if(target == 0 && k == 0){
                        result.add(new ArrayList<>(temp));
                        return;
                }
                
                for(int i = start; i <= 9; i++){
                        temp.add(i);
                        backtrack(result, temp, i + 1, k - 1, target - i);
                        temp.remove(temp.size() - 1);
                }
        }
}
