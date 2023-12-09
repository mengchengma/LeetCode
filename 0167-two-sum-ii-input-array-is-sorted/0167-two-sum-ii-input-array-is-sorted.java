class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int[] ans = new int[2];
        int i = 0;
        int j = numbers.length - 1;

        while (numbers[i] + numbers[j] != target) {
            int curr = numbers[i] + numbers[j];
            if (curr > target) {
                j--;
            } else if (curr < target) {
                i++;
            }
        }
        ans[0] = i+1;
        ans[1] = j+1;
        return ans;
    }
}