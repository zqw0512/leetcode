public class Solution {
        public int[] intersect(int[] nums1, int[] nums2) {
                HashMap<Integer, Integer> map = new HashMap<>();
                List<Integer> result = new ArrayList<>();
                for (int i = 0; i < nums1.length; i++) {
                        if (map.containsKey(nums1[i])) {
                                map.put(nums1[i], map.get(nums1[i]) + 1);
                        } else {
                                map.put(nums1[i], 1);
                        }
                }
                for (int i = 0; i < nums2.length; i++) {
                        if (map.containsKey(nums2[i])) {
                                if (map.get(nums2[i]) > 0) {
                                        result.add(nums2[i]);
                                        map.put(nums2[i], map.get(nums2[i]) - 1);
                                }
                        }
                }
                int[] res = new int[result.size()];
                int k = 0;
                for (Integer num : result) {
                        res[k++] = num;
                }
                return res;
        }
}
