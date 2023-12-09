class Solution {
    public void reverseString(char[] s) {
        for (int i = 0, end = s.length - 1; i < s.length / 2; i++, end--) {
            char temp = s[i];
            s[i] = s[end];
            s[end] = temp;
        }
    }
}