class Solution {
    public int trailingZeroes(int n) {
       int counter = 0;
       for(int i=5;i<=n;i=i*5){
            counter = counter +  n/i;
       }

       return counter;
        
    }
}