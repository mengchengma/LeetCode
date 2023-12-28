class Solution {
    public int minCost(String colors, int[] neededTime) {
        int totalTime = 0;
        int i = 0, j = 0;

        while (i < neededTime.length && j < neededTime.length) {
            int groupTotal = 0, groupMax = 0;
            while (j < neededTime.length && colors.charAt(i) == colors.charAt(j)) {
                groupTotal += neededTime[j];
                groupMax = Math.max(groupMax, neededTime[j]);
                j++;
            }
            totalTime += groupTotal - groupMax;
            i = j;
        }
        return totalTime;
    }
}