class Solution {
    public int[] sortByBits(int[] arr) {
        Integer temp[] = new Integer[arr.length];

        for(int i=0;i<arr.length;i++){
            temp[i] = arr[i];
        }

        Arrays.sort(temp,(a,b)->{
            int bitA = Integer.bitCount(a);
            int bitB = Integer.bitCount(b);

            if(bitA == bitB) return a - b;
            return bitA - bitB;
        });

        for(int i=0;i<arr.length;i++){
            arr[i] = temp[i];
        }
        

        return arr;
    }
}