class Solution {
    public String reverseWords(String s) {
        String[] str = s.trim().split("\\s+");
        String ans = "";

        for (int i = 0; i < str.length; i++) {
            for (int j = str[i].length() - 1; j >= 0; j--) {
                ans += str[i].charAt(j);
            }
            str[i] = ans;
            ans = "";
        }
        
        for (int i = 0; i < str.length; i++) {
            ans += str[i] + " ";
            if (i == str.length - 1) {
                ans = ans.substring(0, ans.length() - 1);
            }
        }
        return ans;
    }
}