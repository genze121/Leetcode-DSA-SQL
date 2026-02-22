class Solution {
    public String largestNumber(int[] nums) {
       String[] maxElement = new String[nums.length];
       for(int i=0;i<nums.length;i++){
            maxElement[i] = Integer.toString(nums[i]);
       }

       Arrays.sort(maxElement, (a,b)-> (b+a).compareTo(a+b));

       if(maxElement[0].equals("0")){
            return "0";
       }

       StringBuilder sb = new StringBuilder();
       for(String str : maxElement){
            sb.append(str);
       }

       return sb.toString();
    }
}