class Solution {
    public boolean isPalindrome(int x) {
        if(x < 0) return false;
        int temp = x;
        int palindrome = 0;
        while(temp!=0){
            int remainder = temp%10;
            palindrome = palindrome * 10 + remainder;
            temp = temp/10;
        }

        return (palindrome == x) ? true : false;
    }
}