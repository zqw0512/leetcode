public class Solution {
        public int[] intersection(int[] nums1, int[] nums2) {
                if (nums1 == null || nums1.length == 0 || nums2 == null || nums2.length ==0) {
                        return new int[]{};
                }
                HashSet<Integer> set = new HashSet<>();
                Arrays.sort(nums2);
                for (Integer num : nums1) {
                        if (binarySearch(nums2, num)) {
                                set.add(num);
                        }
                }
                int k = 0;
                int[] result = new int[set.size()];
                for (Integer num : set) {
                        result[k++] = num;
                }
                return result;
        }
        public boolean binarySearch(int[] nums, int target) {
                int start = 0;
                int end = nums.length - 1;
                while (start + 1 < end) {
                        int mid = (end - start) / 2 + start;
                        if (nums[mid] == target) {
                                return true;
                        } else if (nums[mid] > target) {
                                end = mid;
                        } else {
                                start = mid;
                        }
                }
                if (nums[start] == target || nums[end] == target) return true;
                return false;
        }
}
