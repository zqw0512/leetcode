class Solution {
        public List<List<Integer>> permute(int[] nums) {
                List<List<Integer>> result = new ArrayList<>();
                if (nums == null || nums.length == 0) {
                        return result;
                }
                backtrack(result, new ArrayList<>(), nums);
                return result;
        }
        
        public void backtrack(List<List<Integer>> result, List<Integer> temp, int[] nums) {
                if (temp.size() == nums.length) {
                        result.add(new ArrayList<>(temp));
                        return;
                }
                for (int i = 0; i < nums.length; i++) {
                        if (!temp.contains(nums[i])) {
                                temp.add(nums[i]);
                                backtrack(result, temp, nums);
                                temp.remove(temp.size() - 1);
                        }
                }
        }
}
