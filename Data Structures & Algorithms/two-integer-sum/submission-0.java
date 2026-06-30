class Solution {
    public int[] twoSum(int[] nums, int target) {
        for (int k = 0; k < nums.length; k++){
            for (int l = k + 1; l < nums.length; l++){
                if (nums[k] + nums[l] == target){
                    return new int[]{k, l};
                }
            }
        }
        return new int[]{};
    }
}
