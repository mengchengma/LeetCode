class Solution {
    public int maxLengthBetweenEqualCharacters(String s) {
        int maxDistance = -1;
        for (int i = 0; i < s.length() - 1; i++) {
            for (int j = i + 1; j < s.length(); j++) {
                if (s.charAt(i) == s.charAt(j)) {
                    int distance = j - i - 1;
                    maxDistance = Math.max(maxDistance, distance);
                }
            }
        }
        return maxDistance;
    }
}