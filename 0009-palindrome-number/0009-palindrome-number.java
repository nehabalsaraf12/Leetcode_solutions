class Solution {
    public boolean isPalindrome(int x) {
    int rev=0;
    if (x < 0) return false;
    int original=x;
    while (x != 0) {
    rev = rev * 10 + x % 10; // Add last digit
    x = x / 10;            // Remove last digit
    }
    return(rev==original);
    }
}