class Solution {
    public int searchInsert(int[] nums, int target) {
        int left = 0, right = nums.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2; //gets the correct mid everytime it loops
            if (nums[mid] == target) return mid;
            if (nums[mid] > target) right = mid - 1; //change the bounds (binary)
            else left = mid + 1;
        }
        return left;
    }
}