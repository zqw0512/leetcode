class Solution {
        public List<List<Integer>> getFactors(int n) {
                List<List<Integer>> result = new ArrayList<>();
                backtrack(result, new ArrayList<>(), n, 2);
                return result;
        }
        public void backtrack(List<List<Integer>> result, List<Integer> temp, int n, int start) {
                if (n == 1) {
                        if (temp.size() > 1) {
                                result.add(new ArrayList<>(temp));
                                return;
                        }
                }
                for (int i = start; i <= n; i++) {
                        if (n % i == 0) {
                                temp.add(i);
                                backtrack(result, temp, n/i, i);
                                temp.remove(temp.size() - 1);
                        }
                }
        }
}
