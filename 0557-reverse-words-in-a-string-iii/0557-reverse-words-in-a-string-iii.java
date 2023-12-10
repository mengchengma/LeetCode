class Solution {
    public String reverseWords(String s) {
        String[] str = s.split("\\s+"); 
        StringBuilder sb = new StringBuilder();

        for (String estr : str) {
            StringBuilder sbr = new StringBuilder(estr);
            sb.append(sbr.reverse()).append(" ");
        }
        return sb.toString().trim();
    }
}