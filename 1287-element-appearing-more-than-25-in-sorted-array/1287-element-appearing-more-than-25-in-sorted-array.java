class Solution {
    public int findSpecialInteger(int[] arr) {
        int ans = -1;
        int size = arr.length;
        int qtr = size / 4;
        int count = 0;

        for (int i = 1; i < size; i++) {
            if (arr[i-1] == arr[i]) {
                count++;
            } else {
                count = 0;
            }
            if (count >= qtr) {
                ans = arr[i - 1];
            }
        }
        if (size == 1) {
            return arr[0];
        }
        return ans;
    }
}