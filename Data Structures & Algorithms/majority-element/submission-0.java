class Solution {
    public int majorityElement(int[] nums) {
        int n = nums.length, count = 0, majElem = 0;
        
        for (int i = 0; i < n; i ++){
            for (int j = 0; j < n; j++){
                if (nums[i] == nums[j]){
                    count++;
                }
            }
            if (count > n/2) majElem = nums[i];
            count = 0;
        }
        return majElem;
    }
}