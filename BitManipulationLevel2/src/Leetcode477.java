public class Leetcode477 {
    class Solution {
        public int hammingDistance(int a, int b){
            return Integer.bitCount(a ^ b);
        }
        public int totalHammingDistance(int[] nums) {
            int ans = 0;
            for(int i = 0 ; i < 32 ;i++){
                int count = 0;
                for(int j = 0 ; j < nums.length ;j++){
                    count += nums[j] >> i & 1;
                }
                ans += count *(nums.length - count );
            }
            return ans;
        }


    }
}