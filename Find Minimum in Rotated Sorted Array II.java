class Solution {
        public int findMin(int[] nums) {
                if (nums == null || nums.length == 0) return -1;
                int start = 0;
                int end = nums.length - 1;
                while (start + 1 < end) {
                        int mid = (end - start) / 2 + start;
                        if (nums[mid] < nums[end]) {
                                end = mid;
                        } else if (nums[mid] > nums[end]) {
                                start = mid + 1;
                        } else {
                                end--;
                        }
                }
                if (nums[start] < nums[end]) return nums[start];
                else return nums[end];
        }
}
