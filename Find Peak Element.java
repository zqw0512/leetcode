public class Solution {
        public int findPeakElement(int[] nums) {
                int start = 0;
                int end = nums.length - 1;
                while (start + 1 < end) {
                        int mid = (end - start) / 2 + start;
                        if (nums[mid] < nums[mid + 1]) {
                                start = mid + 1;
                        } else {
                                end = mid;
                        }
                }
                if (nums[start] > nums[end]) return start;
                return end;
        }
}
