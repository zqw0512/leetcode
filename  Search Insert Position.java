class Solution {
        public int searchInsert(int[] nums, int target) {
                int start = 0;
                int end = nums.length - 1;
                while (start + 1 < end) {
                        int mid = (end - start) / 2 + start;
                        if (nums[mid] == target) return mid;
                        else if (target < nums[mid]) end = mid;
                        else start = mid;
                }
                if (target <= nums[start]) {
                        return start;
                }
                else if (target <= nums[end]) {
                        return end;
                }
                else {
                        return end + 1;
                }
        }
}
