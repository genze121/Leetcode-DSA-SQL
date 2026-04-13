class Solution {
    public int findDuplicate(int[] nums) {
        //  int duplicateData = 0;
        // Arrays.sort(nums);
        // for(int i=0;i<nums.length-1;i++){
        //     if(nums[i] == nums[i+1]){
        //         duplicateData = nums[i];
        //     }
        // }

        // return duplicateData;

        Map<Integer,Integer> mapData = new HashMap<>();
        for(int i=0;i< nums.length;i++){
            if(mapData.containsKey(nums[i])){
                return nums[i];
            }else{
                mapData.put(nums[i],i);
            }
        }

        return -1;
    }
}