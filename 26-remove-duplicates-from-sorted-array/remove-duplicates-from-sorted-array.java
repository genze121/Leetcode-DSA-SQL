class Solution {
    public int removeDuplicates(int[] nums) {
        int leftPointer = 0;
        int rightPointer = 1;
        for(int i=1;i<nums.length;i++){
            if(nums[i] != nums[i-1]){
                nums[rightPointer] = nums[i];
                rightPointer++;
            }
        }

        return rightPointer;
    }
}