class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int res = 0;
        int gIndex = g.length-1;
        int sIndex = s.length-1;

        while (gIndex >= 0 && sIndex >= 0) {
            if (s[sIndex] >= g[gIndex]) {
                res++;
                gIndex--;
                sIndex--;
            } else {
                gIndex--;
            }
        }
        return res;
    }
}